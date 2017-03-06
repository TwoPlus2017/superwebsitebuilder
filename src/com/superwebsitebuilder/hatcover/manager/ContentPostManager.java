/**
 * Copyright (C) 2016 - 2017 YG Studio. All rights reserved.
 * Filename:  ContentPostManager.java
 * Purpose:   Post Manager of 'Content' to implement the 'Content' business functions.
 * Classes:   ContentPostManager
 */
package com.superwebsitebuilder.hatcover.manager;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.superwebsitebuilder.espider.constant.Constants;
import com.superwebsitebuilder.espider.constant.WebSiteLevelConstants;
import com.superwebsitebuilder.espider.util.Utils;
import com.superwebsitebuilder.websitelevel.data.businesslogic.ArticleData;
import com.superwebsitebuilder.websitelevel.data.businesslogic.DBTransferData;
import com.superwebsitebuilder.websitelevel.data.businesslogic.PostData;
import com.superwebsitebuilder.websitelevel.data.websitefunction.FrontEndData;
import com.superwebsitebuilder.websitelevel.manager.impl.PostManager;

/**
 * Post Manager of 'Content' to implement the 'Content' business functions. <BR>
 * 
 * 'Content' means: eSpider gathered web page info from Internet. 
 *
 * <PRE>
 *
 * <B>History:</B>
 * Developer            Date                 Change Reason        Change
 * ----------------     ----------------     ----------------     ----------------
 * Gavin.Zhang          Jan 5, 2017          Initial version      0.1
 *
 * </PRE>
 *
 * @author Gavin.Zhang - YG Studio
 *
 * @version 01.00.00
 *
 */

public class ContentPostManager extends PostManager {
	
	/** Represents the logger field */
	private static Log logger = LogFactory.getLog(ContentPostManager.class);
	
	/**
	 * Format data between DB data and ES data. 
	 *
	 * @param postData
	 */
	private void convertDBDataToESData(PostData postData) {
		logger.debug("ContentPostManager --> convertDBDataToESData()");
		
		// for 'content' post
		if (postData.getPostType().equalsIgnoreCase(WebSiteLevelConstants.TYPE_NAME_CONTENT)) {
			postData.setSelfUrl(postData.getPostDefaultSelfUrl() + WebSiteLevelConstants.CONTENT_QUERY_URL);
			postData.setUrl(postData.getField1());
			postData.setTitle(postData.getField2());
			postData.setDescription(postData.getField3());
			postData.setDomainUrl(Utils.getDomainUrl(postData.getUrl()));
		}
	}
	
	/**
	 * Format data between DB data and ES data.
	 *
	 * @param postData
	 */
	private void convertRealESDataToViewESData(PostData postData) {
		logger.debug("ContentPostManager --> convertRealESDataToViewESData()");
		
		// for 'content' post
		if (postData.getSelfType().equalsIgnoreCase(WebSiteLevelConstants.TYPE_NAME_CONTENT)) {
			postData.setSelfUrl(postData.getSelfUrl() + WebSiteLevelConstants.CONTENT_QUERY_URL);
			postData.setDomainUrl(Utils.getDomainUrl(postData.getUrl()));
		}
	}
	
	/**
	 * Format data between DB data and ES data.
	 *
	 * @param postList
	 */
	private void convertDBDataToESData(List<PostData> postList) {
		logger.debug("ContentPostManager --> convertDBDataToESData()");
		
		for (int i = 0; i < postList.size(); i++) {
			convertDBDataToESData(postList.get(i));
		}
	}
	
	/**
	 * @see com.superwebsitebuilder.websitelevel.manager.PostManagerIfc#getOnePostPageMainContents(com.superwebsitebuilder.websitelevel.data.websitefunction.FrontEndData)
	 *
	 */
	@Override
	public PostData getOnePostPageMainContents(FrontEndData feData) throws Exception {
		logger.debug("ContentPostManager --> getOnePostPageMainContents()");
		
		DBTransferData dbtData = new DBTransferData();
		PostData postData = null;
		
		dbtData.setPostSelfUrl(feData.getPostSelfUrl());
		dbtData.setArticleTableName(feData.getWebSiteData().getTableKeyWordName());
		
		postData = daoFacade.getHatCoverCNPostDataByPostSelfUrl(dbtData);
		
		if (Utils.checkNotNull(postData)) {
			convertDBDataToESData(postData);
			feData.setArticleLastUpdateTime(Utils.formatDateTimeToView(postData.getLastUpdateDate()));
		} else {
			// try to get from ES
			postData = getOnePostPageMainContentsFromES(feData);
			
			if (Utils.checkNotNull(postData)) {
				feData.setArticleLastUpdateTime(Utils.formatDateTimeToView(postData.getCreatedDate()));
				convertRealESDataToViewESData(postData);
			}
		}
		
		return postData;
	}
	
	/**
	 * @see com.superwebsitebuilder.websitelevel.manager.PostManagerIfc#getOnePostPageMainContentsFromES(com.superwebsitebuilder.websitelevel.data.websitefunction.FrontEndData)
	 *
	 */
	@Override
	public PostData getOnePostPageMainContentsFromES(FrontEndData feData) throws Exception {
		logger.debug("ContentPostManager --> getOnePostPageMainContentsFromES()");
		
		PostData postData = null;
		
		// TODO: should update the hardcode 'selfUrl' and getPostSelfUrl
		postData = esManager.getContentById(esManager.getESGlobalCNData(), "selfUrl", feData.getPostSelfUrl());
		
		return postData;
	}

	/**
	 * @see com.superwebsitebuilder.websitelevel.manager.PostManagerIfc#getOneArticlePageMainContents(com.superwebsitebuilder.websitelevel.data.websitefunction.FrontEndData)
	 *
	 */
	@Override
	public List<PostData> getOneArticlePageMainContents(FrontEndData feData) throws Exception {
		logger.debug("ContentPostManager --> getOneArticlePageMainContents()");
		
		DBTransferData dbtData = new DBTransferData();
		List<PostData> postList = null;
		
		dbtData.setKeyWordUrl(feData.getKeyWord());
		dbtData.setArticleTableName(feData.getWebSiteData().getTableKeyWordName());
		
		postList = daoFacade.getHatCoverArticlePagePostListByKeyWord(dbtData);
		
		if (Utils.isNull(postList) || postList.size() == 0) {
			if (Constants.Y.equalsIgnoreCase(feData.getWebSiteData().getNeedArticleExtends())) {
				
				ArticleData articleData = esManager.getKeyWordById(esManager.getESGlobalKWData(), "selfUrl", dbtData.getKeyWordUrl());
				
				if (Utils.checkNotNull(articleData)) {
					// need get post list from ElasticSearch and write into DB
					postList = esManager.getContentsListByKeyWordBaseESResultRandom(esManager.getESGlobalCNData(), feData.getKeyWord(), Integer.valueOf(feData.getWebSiteData().getContentPostNum()));

					if (postList.size() > 0) {
						dbtData.setPostList(postList);
						
						//write into DB
						daoFacade.insertHatCoverPostListForArticlePage(dbtData);
						
						setESDataSelfUrl(postList);
					}
				}
			}
			
		} else {
			convertDBDataToESData(postList);
			feData.setArticleLastUpdateTime(Utils.formatDateTimeToView(postList.get(0).getCreatedDate()));
		}
		
		if (postList.size() > 0) {
			formatPostList(postList);
		}
		
		return postList;
	}

	/**
	 * @see com.superwebsitebuilder.websitelevel.manager.PostManagerIfc#getSearchPageMainContents(com.superwebsitebuilder.websitelevel.data.websitefunction.FrontEndData)
	 *
	 */
	@Override
	public List<PostData> getSearchPageMainContents(FrontEndData feData) throws Exception {
		logger.debug("ContentPostManager --> getSearchPageMainContents()");
		
		List<PostData> postList = null;
		
		// need get post list from ElasticSearch
		postList = esManager.getContentsListByKeyWordBaseESResultRandom(esManager.getESGlobalCNData(), feData.getKeyWord(), COUNTER_10);

		if (postList.size() > 0) {
			setESDataSelfUrl(postList);
			formatPostList(postList);
		}
		
		return postList;
	}
}
