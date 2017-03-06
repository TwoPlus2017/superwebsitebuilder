/**
 * Copyright (C) 2016 - 2017 YG Studio. All rights reserved.
 * Filename:  ElasticSearchHandler.java
 * Purpose:   One handler of ElasticSearch functions.
 * Classes:   ElasticSearchHandler
 */
package com.superwebsitebuilder.espider.elasticsearch;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.Client;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;

import com.superwebsitebuilder.espider.util.Utils;
import com.superwebsitebuilder.platform.factory.ESClientFactory;


/**
 * One handler of ElasticSearch functions. <BR>
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

public class ElasticSearchHandler {
	
	/** Represents the logger field */
	private static Log logger = LogFactory.getLog(ElasticSearchHandler.class);
	@Resource
	private ESClientFactory esFactory;
	
	/**
	 * Get one post details from ES.  
	 *
	 * @param indexName
	 * @param typeName
	 * @param selectField
	 * @param id
	 * @return
	 */
	public String getContentBySelectField(String indexName, String typeName, String selectField, String id) {
		logger.debug("ElasticSearchHandler --> getContentBySelectField()");
		
		String dataStr = null;
		Client esClient = esFactory.getTSClientInstance();
		
		if (Utils.checkNotNull(esClient)) {
			QueryBuilder qb = QueryBuilders.boolQuery().must(QueryBuilders.matchPhraseQuery(selectField, id));
			
			//QueryBuilder qb = QueryBuilders.matchQuery("catId", catId);
			
			SearchResponse response = esClient.prepareSearch(indexName)
					.setTypes(typeName)
					.setQuery(qb)//.addSort("id", SortOrder.ASC)
					.execute().actionGet();
			
			SearchHits hits = response.getHits();
			
			if (hits.totalHits() > 0) {
                for (SearchHit hit : hits) {
                	dataStr = hit.getSourceAsString();
                }
            } else {
            	logger.debug("ElasticSearchHandler ----> getContentBySelectField() : 0 record find...");
            }
		}
				
		return dataStr;
	}
	
	/**
	 * Get related Post list by request keyword. 
	 *
	 * @param indexName
	 * @param typeName
	 * @param keyWord
	 * @param searchCounter
	 * @return
	 */
	public List<String> getContentsListByKeyWord(String indexName, String typeName, String keyWord, int searchCounter) {
		logger.debug("ElasticSearchHandler --> getContentsListByKeyWord()");
		
		List<String> postList = new ArrayList<String>();
		Client esClient = esFactory.getTSClientInstance();
		
		if (Utils.checkNotNull(esClient)) {
			QueryBuilder qb = QueryBuilders.multiMatchQuery(keyWord, "title");
			
			SearchResponse response = esClient.prepareSearch(indexName)
					.setTypes(typeName)
					.setQuery(qb).setFrom(0).setSize(searchCounter)
					.execute().actionGet();
			
			SearchHits hits = response.getHits();
			if (hits.totalHits() > 0) {
                for (SearchHit hit : hits) {
                    postList.add(hit.getSourceAsString());
                }
            } else {
            	logger.debug("ElasticSearchHandler ----> getContentsListByKeyWord() : 0 record find...");
            }
		}
			
		return postList;
	}
	
	/**
	 * Get related Article list by request keyword.  
	 *
	 * @param indexName
	 * @param typeName
	 * @param keyWord
	 * @param searchCounter
	 * @return
	 */
	public List<String> getKeyWordListByKeyWord(String indexName, String typeName, String keyWord, int searchCounter) {
		logger.debug("ElasticSearchHandler --> getKeyWordListByKeyWord()");
		
		List<String> keyWordList = new ArrayList<String>();
		Client esClient = esFactory.getTSClientInstance();
		
		if (Utils.checkNotNull(esClient)) {
			QueryBuilder qb = QueryBuilders.multiMatchQuery(keyWord, "name");
			
			SearchResponse response = esClient.prepareSearch(indexName)
					.setTypes(typeName)
					.setQuery(qb).setFrom(0).setSize(searchCounter)
					.execute().actionGet();
			
			SearchHits hits = response.getHits();
			if (hits.totalHits() > 0) {
	            for (SearchHit hit : hits) {
	            	keyWordList.add(hit.getSourceAsString());
	            }
	        } else {
	        	logger.debug("ElasticSearchHandler ----> getKeyWordListByKeyWord() : 0 record find...");
	        }
		}
			
		return keyWordList;
	}
}
