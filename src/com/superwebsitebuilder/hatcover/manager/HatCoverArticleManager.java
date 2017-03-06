/**
 * Copyright (C) 2016 - 2017 YG Studio. All rights reserved.
 * Filename:  HatCoverKeyWordManager.java
 * Purpose:   Article Manager to implement the article page business functions.
 * Classes:   HatCoverKeyWordManager
 */
package com.superwebsitebuilder.hatcover.manager;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.superwebsitebuilder.espider.util.Utils;
import com.superwebsitebuilder.websitelevel.data.businesslogic.ArticleData;
import com.superwebsitebuilder.websitelevel.data.websitefunction.FrontEndData;
import com.superwebsitebuilder.websitelevel.manager.impl.ArticleManager;

/**
 * Article Manager to implement the article page business functions. <BR>
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

public class HatCoverArticleManager extends ArticleManager {
	
	/** Represents the logger field */
	private static Log logger = LogFactory.getLog(HatCoverArticleManager.class);

	/**
	 * @see com.superwebsitebuilder.websitelevel.manager.ArticleManagerIfc#getRandomArticlesObj(int)
	 *
	 */
	@Override
	public List<ArticleData> getRandomArticlesObj(int counter) throws Exception {
		logger.debug("HatCoverArticleManager --> getRandomArticlesObj()");
		
		List<ArticleData> kwList = getRandomArticlesList(counter);
		
		if (Utils.checkNotNull(kwList) && kwList.size() > 0) {
			formatArticleList(kwList);
		}
		
		return kwList;
	}
	
	/**
	 * @see com.superwebsitebuilder.websitelevel.manager.ArticleManagerIfc#getOneArticlePageRelatedArticles(com.superwebsitebuilder.websitelevel.data.websitefunction.FrontEndData)
	 *
	 */
	@Override
	public List<ArticleData> getOneArticlePageRelatedArticles(FrontEndData feData) throws Exception {
		logger.debug("HatCoverArticleManager --> getOneArticlePageRelatedArticles()");
		
		List<ArticleData> relatedArticleList = null;
		int counter = Integer.valueOf(feData.getWebSiteData().getRelatedArticleNum());
		
		relatedArticleList = esManager.getRelatedArticleListByKeyWordBaseESResultRandom(esManager.getESGlobalKWData(), feData.getKeyWord(), counter);
		
		if (relatedArticleList.size() > 0) {
			formatArticleList(relatedArticleList);
		}
		
		return relatedArticleList;
	}

}
