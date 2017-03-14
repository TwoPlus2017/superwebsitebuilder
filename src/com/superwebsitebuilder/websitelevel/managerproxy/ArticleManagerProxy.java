/**
 * Copyright (C) 2016 - 2017 GB Studio. All rights reserved.
 * Filename:  ArticleManagerProxy.java
 * Purpose:   Article Manager Proxy to implement the article manager business functions.
 * Classes:   ArticleManagerProxy
 */
package com.superwebsitebuilder.websitelevel.managerproxy;

import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.superwebsitebuilder.espider.util.Utils;
import com.superwebsitebuilder.platform.factory.ManagerFactory;
import com.superwebsitebuilder.websitelevel.data.businesslogic.ArticleData;
import com.superwebsitebuilder.websitelevel.data.websitefunction.FrontEndData;
import com.superwebsitebuilder.websitelevel.manager.impl.ArticleManager;

/**
 * Article Manager Proxy to implement the article manager business functions. <BR>
 *
 * <PRE>
 *
 * <B>History:</B>
 * Developer            Date                 Change Reason        Change
 * ----------------     ----------------     ----------------     ----------------
 * Gavin.Zhang          Jan 6, 2017          Initial version      0.1
 *
 * </PRE>
 *
 * @author Gavin.Zhang - GB Studio
 *
 * @version 01.00.00
 *
 */

public class ArticleManagerProxy extends ArticleManager {
	
	/** Represents the logger field */
	private static Log logger = LogFactory.getLog(ArticleManagerProxy.class);
	
	@Resource
	protected ManagerFactory managerFactory;

	/**
	 * @throws Exception 
	 * @see com.superwebsitebuilder.websitelevel.manager.ArticleManagerIfc#getRandomArticlesObj(int)
	 *
	 */
	@Override
	public List<ArticleData> getRandomArticlesObj(int counter) throws Exception {
		logger.debug("ArticleManagerProxy --> getRandomArticlesObj()");
		
		ArticleManager articleManager = null;
		List<ArticleData> relatedArticleList = null;
		
		articleManager = (ArticleManager)managerFactory.getInstanceOfArticleType("HatCover");
		
		if (Utils.checkNotNull(articleManager)) {
			relatedArticleList = articleManager.getRandomArticlesObj(counter);
		}
		
		return relatedArticleList;
	}

	/**
	 * @see com.superwebsitebuilder.websitelevel.manager.ArticleManagerIfc#getOneArticlePageRelatedArticles(com.superwebsitebuilder.websitelevel.data.websitefunction.FrontEndData)
	 *
	 */
	@Override
	public List<ArticleData> getOneArticlePageRelatedArticles(FrontEndData feData) throws Exception {
		logger.debug("ArticleManagerProxy --> getOneArticlePageRelatedArticles()");
		
		ArticleManager articleManager = null;
		List<ArticleData> relatedArticleList = null;
		
		articleManager = (ArticleManager)managerFactory.getInstanceOfArticleType("HatCover");
		
		if (Utils.checkNotNull(articleManager)) {
			relatedArticleList = articleManager.getOneArticlePageRelatedArticles(feData);
		}
		
		return relatedArticleList;
	}

	@Override
	public List<ArticleData> getRandomHotArticlesObj(int counter) throws Exception {
		logger.debug("HatCoverArticleManager --> getRandomHotArticlesObj()");

		List<ArticleData> hotKWList = getRandomHotArticlesList(counter);
		
		if (Utils.checkNotNull(hotKWList) && hotKWList.size() > 0) {
			formatArticleList(hotKWList);
		}
		
		return hotKWList;
	}

}
