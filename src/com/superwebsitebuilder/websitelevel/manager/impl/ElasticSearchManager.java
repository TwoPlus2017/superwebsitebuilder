/**
 * Copyright (C) 2016 - 2017 YG Studio. All rights reserved.
 * Filename:  ElasticSearchManager.java
 * Purpose:   ES Manager implement to implement the ES search business functions.
 * Classes:   ElasticSearchManager
 */
package com.superwebsitebuilder.websitelevel.manager.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import net.sf.json.JSONObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.superwebsitebuilder.espider.constant.ESConstants;
import com.superwebsitebuilder.espider.elasticsearch.ElasticSearchHandler;
import com.superwebsitebuilder.espider.util.Utils;
import com.superwebsitebuilder.websitelevel.data.businesslogic.ArticleData;
import com.superwebsitebuilder.websitelevel.data.businesslogic.PostData;
import com.superwebsitebuilder.websitelevel.data.websitefunction.ElasticSearchData;
import com.superwebsitebuilder.websitelevel.manager.ElasticSearchManagerIfc;

/**
 * ES Manager implement to implement the ES search business functions. <BR>
 *
 * <PRE>
 *
 * <B>History:</B>
 * Developer            Date                 Change Reason        Change
 * ----------------     ----------------     ----------------     ----------------
 * Gavin.Zhang          Dec 22, 2016         Initial version      0.1
 *
 * </PRE>
 *
 * @author Gavin.Zhang - YG Studio
 *
 * @version 01.00.00
 *
 */

public class ElasticSearchManager implements ElasticSearchManagerIfc {
	
	/** Represents the logger field */
	private static Log logger = LogFactory.getLog(ElasticSearchManager.class);
	
	@Resource
	public ElasticSearchHandler esHandler;
	
	
	/**
	 * @see com.superwebsitebuilder.websitelevel.manager.ElasticSearchManagerIfc#getESGlobalKWData()
	 *
	 */
	public ElasticSearchData getESGlobalKWData() {
		logger.debug("ElasticSearchManager --> getESGlobalKWData()");
		
		return new ElasticSearchData(ESConstants.INDEX_NAME_SWSB, ESConstants.TYPE_NAME_KEYWORD);
	}
	
	/**
	 * @see com.superwebsitebuilder.websitelevel.manager.ElasticSearchManagerIfc#getESGlobalCNData()
	 *
	 */
	public ElasticSearchData getESGlobalCNData() {
		logger.debug("ElasticSearchManager --> getESGlobalCNData()");
		
		return new ElasticSearchData(ESConstants.INDEX_NAME_SWSB, ESConstants.TYPE_NAME_CONTENT);
	}
	
	/**
	 * @see com.superwebsitebuilder.websitelevel.manager.ElasticSearchManagerIfc#getRelatedArticleListByKeyWordBaseESResultRandom(com.superwebsitebuilder.websitelevel.data.websitefunction.ElasticSearchData, java.lang.String, int)
	 *
	 */
	@Override
	public List<ArticleData> getRelatedArticleListByKeyWordBaseESResultRandom(ElasticSearchData esData, String keyWord, int searchCounter) throws Exception {
		logger.debug("ElasticSearchManager --> getRelatedArticleListByKeyWordBaseESResultRandom()");
		
		List<String> articleList = esHandler.getKeyWordListByKeyWord(esData.getIndexName(), esData.getTypeName(), keyWord, COUNTER_50);
		List<ArticleData> articleDataList = new ArrayList<ArticleData>();
		
		if (articleList.size() <= searchCounter * MULTIPLE_2) {
			
			
		} else {
			List<Integer> randomNumList = Utils.getRandomNumList(searchCounter, NUMBER_0, articleList.size() - NUMBER_1);
			
			for (int indexNum : randomNumList) {
				ArticleData data = (ArticleData)JSONObject.toBean(JSONObject.fromObject(articleList.get(indexNum)), ArticleData.class);
			
				articleDataList.add(data);
			}
		}
		
		return articleDataList;
	}
	
	/**
	 * @see com.superwebsitebuilder.websitelevel.manager.ElasticSearchManagerIfc#getContentById(com.superwebsitebuilder.websitelevel.data.websitefunction.ElasticSearchData, java.lang.String, java.lang.String)
	 *
	 */
	@Override
	public PostData getContentById(ElasticSearchData esData, String selectField, String id) throws Exception {
		logger.debug("ElasticSearchManager --> getContentById()");
		
		PostData postData = null;
		
		String postStr = esHandler.getContentBySelectField(esData.getIndexName(), esData.getTypeName(), selectField, id);
		
		if (Utils.checkNotNull(postStr)) {
			postData = (PostData)JSONObject.toBean(JSONObject.fromObject(postStr), PostData.class);
		}
		
		return postData;
	}
	
	/**
	 * @see com.superwebsitebuilder.websitelevel.manager.ElasticSearchManagerIfc#getKeyWordById(com.superwebsitebuilder.websitelevel.data.websitefunction.ElasticSearchData, java.lang.String, java.lang.String)
	 *
	 */
	@Override
	public ArticleData getKeyWordById(ElasticSearchData esData,	String selectField, String keyWord) throws Exception {
		logger.debug("ElasticSearchManager --> getKeyWordById()");
		
		ArticleData articleData = null;
		
		String articleStr = esHandler.getContentBySelectField(esData.getIndexName(), esData.getTypeName(), selectField, keyWord);
		
		if (Utils.checkNotNull(articleStr)) {
			articleData = (ArticleData)JSONObject.toBean(JSONObject.fromObject(articleStr), ArticleData.class);
		}
		
		return articleData;
	}

	/**
	 * @see com.superwebsitebuilder.websitelevel.manager.ElasticSearchManagerIfc#getContentsListByKeyWordBaseESResultRandom(com.superwebsitebuilder.websitelevel.data.websitefunction.ElasticSearchData, java.lang.String, int)
	 *
	 */
	@Override
	public List<PostData> getContentsListByKeyWordBaseESResultRandom(ElasticSearchData esData, String keyWord, int searchCounter) throws Exception {
		logger.debug("ElasticSearchManager --> getContentsListByKeyWordBaseESResultRandom()");
		
		List<String> postList = esHandler.getContentsListByKeyWord(esData.getIndexName(), esData.getTypeName(), keyWord, COUNTER_100);
		List<PostData> postDataList = new ArrayList<PostData>();
		
		if (postList.size() <= searchCounter * MULTIPLE_2) {
			
		
		} else {
			List<Integer> randomNumList = Utils.getRandomNumList(searchCounter, NUMBER_0, postList.size() - NUMBER_1);
			
			for (int indexNum : randomNumList) {
				PostData data = (PostData)JSONObject.toBean(JSONObject.fromObject(postList.get(indexNum)), PostData.class);
				
				postDataList.add(data);
			}
			
		}
		
		return postDataList;
	}

}
