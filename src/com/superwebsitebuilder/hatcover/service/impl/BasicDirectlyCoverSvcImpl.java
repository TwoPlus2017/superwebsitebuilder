/**
 * Copyright (C) 2016 - 2017 YG Studio. All rights reserved.
 * Filename:  BasicDirectlyCoverSvcImpl.java
 * Purpose:   'Basic Directly Cover' business type function implement.
 * Classes:   BasicDirectlyCoverSvcImpl
 */
package com.superwebsitebuilder.hatcover.service.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import com.superwebsitebuilder.espider.util.Utils;
import com.superwebsitebuilder.hatcover.service.BasicDirectlyCoverSvcIfc;
import com.superwebsitebuilder.websitelevel.data.businesslogic.ArticleData;
import com.superwebsitebuilder.websitelevel.data.businesslogic.PostData;
import com.superwebsitebuilder.websitelevel.data.websitefunction.FrontEndData;
import com.superwebsitebuilder.websitelevel.data.websitefunction.WebSiteData;

/**
 * 'Basic Directly Cover' business type function implement. <BR>
 *
 * <PRE>
 *
 * <B>History:</B>
 * Developer            Date                 Change Reason        Change
 * ----------------     ----------------     ----------------     ----------------
 * Gavin.Zhang          Nov 11, 2016         Initial version      0.1
 *
 * </PRE>
 *
 * @author Gavin.Zhang - YG Studio
 *
 * @version 01.00.00
 *
 */

@Service("basicDirectlyCoverSvc")
public class BasicDirectlyCoverSvcImpl extends HatCoverTopService implements BasicDirectlyCoverSvcIfc {
	
	/** Represents the logger field */
	private static Log logger = LogFactory.getLog(BasicDirectlyCoverSvcImpl.class);

	/**
	 * @see com.superwebsitebuilder.hatcover.service.BasicDirectlyCoverSvcIfc#getIndex(com.superwebsitebuilder.websitelevel.data.websitefunction.FrontEndData)
	 *
	 */
	@Override
	public void getIndex(FrontEndData feData) throws Exception {
		logger.debug("BasicDirectlyCoverSvcImpl --> getIndex() --> " + feData.getWebSiteShowName());
		
		WebSiteData webSite = getWebSiteObjectByShowName(feData.getWebSiteShowName());
		
		if (Utils.checkNotNull(webSite) && !needReturnDirect(feData)) {
			// setup all front and return data
			setupData(feData, webSite);
			
			feData.setReturnPage(webSite.getReturnToIndexPage());
		}
	}

	/**
	 * @see com.superwebsitebuilder.hatcover.service.BasicDirectlyCoverSvcIfc#getOneArticle(com.superwebsitebuilder.websitelevel.data.websitefunction.FrontEndData)
	 *
	 */
	@Override
	public void getOneArticle(FrontEndData feData) throws Exception {
		logger.debug("BasicDirectlyCoverSvcImpl --> getOneArticle() --> " + feData.getWebSiteShowName());
		
		WebSiteData webSite = getWebSiteObjectByShowName(feData.getWebSiteShowName());
		
		if (Utils.checkNotNull(webSite) && !needReturnDirect(feData)) {
			// setup all front and return data
			setupData(feData, webSite);
			
			// main functions to get data
			List<PostData> postList = postManagerProxy.getOneArticlePageMainContents(feData);
			
			if (Utils.checkNotNull(postList) && postList.size() > 0) {
				List<ArticleData> relatedArticleList = articleManagerProxy.getOneArticlePageRelatedArticles(feData);
				
				// boxing display data
				feData.setPostList(postList);
				feData.setRelatedArticleList(relatedArticleList);
				
				feData.setReturnPage(webSite.getReturnToArticlePage());
			} else {
				feData.setReturnPage(webSite.getReturnToNotFindPage());
			}
		}
	}

	/**
	 * @see com.superwebsitebuilder.hatcover.service.BasicDirectlyCoverSvcIfc#getOnePost(com.superwebsitebuilder.websitelevel.data.websitefunction.FrontEndData)
	 *
	 */
	@Override
	public void getOnePost(FrontEndData feData) throws Exception {
		logger.debug("BasicDirectlyCoverSvcImpl --> getOnePost() --> " + feData.getWebSiteShowName());
		
		WebSiteData webSite = getWebSiteObjectByShowName(feData.getWebSiteShowName());
		
		if (Utils.checkNotNull(webSite) && !needReturnDirect(feData)) {
			// setup all front and return data
			setupData(feData, webSite);
			
			PostData postData = postManagerProxy.getOnePostPageMainContents(feData);
			
			if (Utils.checkNotNull(postData)) {
				// boxing display data
				feData.setPostData(postData);
				feData.setKeyWord(postData.getTitle());
				
				List<ArticleData> relatedArticleList = articleManagerProxy.getOneArticlePageRelatedArticles(feData);
				feData.setRelatedArticleList(relatedArticleList);
				
				feData.setReturnPage(webSite.getReturnToPostPage());
			} else {
				feData.setReturnPage(webSite.getReturnToNotFindPage());
			}
		}
	}

	/**
	 * @see com.superwebsitebuilder.hatcover.service.BasicDirectlyCoverSvcIfc#getArticleSearchResult(com.superwebsitebuilder.websitelevel.data.websitefunction.FrontEndData)
	 *
	 */
	@Override
	public void getArticleSearchResult(FrontEndData feData) throws Exception {
		logger.debug("BasicDirectlyCoverSvcImpl --> getArticleSearchResult() --> " + feData.getWebSiteShowName());
		
		WebSiteData webSite = getWebSiteObjectByShowName(feData.getWebSiteShowName());
		
		if (Utils.checkNotNull(webSite) && !needReturnDirect(feData)) {
			// setup all front and return data
			setupData(feData, webSite);
			
			// main functions to get data
			List<PostData> postList = postManagerProxy.getSearchPageMainContents(feData);
			List<ArticleData> relatedArticleList = articleManagerProxy.getOneArticlePageRelatedArticles(feData);
			
			if (Utils.checkNotNull(postList) && postList.size() > 0) {
				// boxing display data
				feData.setPostList(postList);
				feData.setRelatedArticleList(relatedArticleList);
				
				feData.setReturnPage(webSite.getReturnToSearchResultPage());
			} else {
				feData.setRelatedArticleList(relatedArticleList);
				feData.setReturnPage(webSite.getReturnToNotFindPage());
			}
		}
	}

}
