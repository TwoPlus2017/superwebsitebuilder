/**
 * Copyright (C) 2016 - 2017 YG Studio. All rights reserved.
 * Filename:  ElasticSearchManagerIfc.java
 * Purpose:   ES Manager interface to provide ES search business functions.
 * Classes:   ElasticSearchManagerIfc
 */
package com.superwebsitebuilder.websitelevel.manager;

import java.util.List;

import com.superwebsitebuilder.applicationLevel.manager.ManagerIfc;
import com.superwebsitebuilder.websitelevel.data.businesslogic.ArticleData;
import com.superwebsitebuilder.websitelevel.data.businesslogic.PostData;
import com.superwebsitebuilder.websitelevel.data.websitefunction.ElasticSearchData;

/**
 * ES Manager interface to provide ES search business functions. <BR>
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

public interface ElasticSearchManagerIfc extends ManagerIfc {
	
	/**
	 * Get one ES data for Article function.
	 *
	 * @return
	 */
	public ElasticSearchData getESGlobalKWData();
	
	/**
	 * Get one ES data for Post function.
	 *
	 * @return
	 */
	public ElasticSearchData getESGlobalCNData();
	
	/**
	 * Get related Post list base on request keyword in random process.
	 *
	 * @param esData
	 * @param keyWord
	 * @param searchCounter
	 * @return
	 * @throws Exception
	 */
	public List<PostData> getContentsListByKeyWordBaseESResultRandom(ElasticSearchData esData, String keyWord, int searchCounter) throws Exception;
	
	/**
	 * Get related Article list base on request keyword in random process.
	 *
	 * @param esData
	 * @param keyWord
	 * @param searchCounter
	 * @return
	 * @throws Exception
	 */
	public List<ArticleData> getRelatedArticleListByKeyWordBaseESResultRandom(ElasticSearchData esData, String keyWord, int searchCounter) throws Exception;
	
	/**
	 * Can get the details of one content type from ES end and base on request by one content type.
	 *
	 * @param esData
	 * @param selectField
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public PostData getContentById(ElasticSearchData esData, String selectField, String id) throws Exception;
	
	/**
	 * Can get the details of one key word from ES end and base on request by key word. 
	 *
	 * @param esData
	 * @param selectField
	 * @param keyWord
	 * @return
	 * @throws Exception
	 */
	public ArticleData getKeyWordById(ElasticSearchData esData, String selectField, String keyWord) throws Exception;

}
