/**
 * Copyright (C) 2016 - 2017 YG Studio. All rights reserved.
 * Filename:  KeyWordManager.java
 * Purpose:   Article Manager implement to implement the article page business functions.
 * Classes:   KeyWordManager
 */
package com.superwebsitebuilder.websitelevel.manager.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.superwebsitebuilder.applicationLevel.manager.impl.Manager;
import com.superwebsitebuilder.espider.constant.WebSiteLevelConstants;
import com.superwebsitebuilder.websitelevel.data.businesslogic.ArticleData;
import com.superwebsitebuilder.websitelevel.manager.ArticleManagerIfc;

/**
 * Article Manager implement to implement the article page business functions. <BR>
 *
 * <PRE>
 *
 * <B>History:</B>
 * Developer            Date                 Change Reason        Change
 * ----------------     ----------------     ----------------     ----------------
 * Gavin.Zhang          Nov 10, 2016         Initial version      0.1
 *
 * </PRE>
 *
 * @author Gavin.Zhang - YG Studio
 *
 * @version 01.00.00
 *
 */

public abstract class ArticleManager extends Manager implements ArticleManagerIfc {
	
	/** Represents the logger field */
	private static Log logger = LogFactory.getLog(ArticleManager.class);
	
	/**
	 * Get random article page list.  
	 *
	 * @param counter
	 * @return
	 * @throws Exception 
	 */
	protected List<ArticleData> getRandomArticlesList(int counter) throws Exception {
		logger.debug("ArticleManager --> getRandomArticlesList()");
		
		List<ArticleData> kwList = new ArrayList<ArticleData>();
		List<ArticleData> tempList = daoFacade.getRandomArticlesList();
		
		int pickupCounter = counter < tempList.size() ? counter : tempList.size();
		
		for (int i = 0; i < pickupCounter; i++) {
			kwList.add(tempList.get(i));
		}
		
		return kwList;
	}
	
	/**
	 * To format the data's looking to display. 
	 *
	 * @param articleList
	 */
	protected void formatArticleList(List<ArticleData> articleList) {
		logger.debug("ArticleManager --> formatArticleList()");
		
		for (int i = 0; i < articleList.size(); i++) {
			articleList.get(i).setSelfUrl(articleList.get(i).getSelfUrl() + WebSiteLevelConstants.KEY_WORD_QUERY_URL);
		}
	}
	
}
