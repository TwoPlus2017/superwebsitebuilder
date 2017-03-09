/**
 * Copyright (C) 2016 - 2017 GB Studio. All rights reserved.
 * Filename:  HatCoverTopService.java
 * Purpose:   'Hat Cover' business type top service and provide some function for service to use.
 * Classes:   HatCoverTopService
 */
package com.superwebsitebuilder.hatcover.service.impl;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.superwebsitebuilder.applicationLevel.manager.AdminConfigManagerIfc;
import com.superwebsitebuilder.espider.constant.Constants;
import com.superwebsitebuilder.espider.constant.WebSiteLevelConstants;
import com.superwebsitebuilder.espider.util.Utils;
import com.superwebsitebuilder.platform.factory.CacheFactory;
import com.superwebsitebuilder.websitelevel.data.websitefunction.FrontEndData;
import com.superwebsitebuilder.websitelevel.data.websitefunction.WebSiteData;
import com.superwebsitebuilder.websitelevel.manager.impl.ArticleManager;
import com.superwebsitebuilder.websitelevel.manager.impl.PostManager;


/**
 * 'Hat Cover' business type top service and provide some function for service to use. <BR>
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
 * @author Gavin.Zhang - GB Studio
 *
 * @version 01.00.00
 *
 */

public abstract class HatCoverTopService {
	
	/** Represents the logger field */
	private static Log logger = LogFactory.getLog(HatCoverTopService.class);
	
	@Resource
	protected CacheFactory cacheFactory;
	@Resource
	protected PostManager postManagerProxy;
	@Resource
	protected ArticleManager articleManagerProxy;
	
	/**
	 * Get one website object by website show name and this show name comes from DB. 
	 *
	 * @param webSiteShowName
	 * @return
	 */
	protected WebSiteData getWebSiteObjectByShowName(String webSiteShowName) {
		logger.debug("HatCoverTopService --> getWebSiteObjectByShowName()");
		
		if (cacheFactory.isExist(CacheFactory.HAT_COVER_WEBSITE_MAP)) {
			return (WebSiteData)cacheFactory.getMapByKey(CacheFactory.HAT_COVER_WEBSITE_MAP).get(webSiteShowName);
		}
		
		return null;
	}
	
	/**
	 * For website each function preparing init data.  
	 * 
	 * K: for article function page.
	 * C: for post function page.
	 * S: for search function page.
	 *
	 * @param feData
	 * @param webSite
	 */
	protected void setupData(FrontEndData feData, WebSiteData webSite) {
		logger.debug("HatCoverTopService --> setupData()");
		
		setupReturnToFrontData(feData, webSite);
		
		// K
		if (WebSiteLevelConstants.KEY_WORD_QUERY.equals(feData.getQueryType())) {
			initArticleSearchData(feData, webSite);
		
		// C
		} else if (WebSiteLevelConstants.CONTENT_QUERY.equals(feData.getQueryType())) {
			initPostSearchData(feData, webSite);
			
		// S
		} else if (WebSiteLevelConstants.SEARCH_QUERY.equals(feData.getQueryType())) {
			initArticleSearchData(feData, webSite);
		}
	}
	
	/**
	 * Init website return page datas.  
	 *
	 * @param feData
	 * @param webSite
	 */
	protected void setupReturnToFrontData(FrontEndData feData, WebSiteData webSite) {
		logger.debug("HatCoverTopService --> setupReturnToFrontData()");
		
		feData.setWebSiteData(webSite);
		feData.setOsDomainUrl(webSite.getDomainUrl());
	}
	
	/**
	 * Init website article function preparing data. 
	 *
	 * @param feData
	 * @param webSite
	 */
	protected void initArticleSearchData(FrontEndData feData, WebSiteData webSite) {
		logger.debug("HatCoverTopService --> initArticleSearchData()");
		
		feData.setArticleLastUpdateTime(Constants.NA);
		feData.setKwShowName(Utils.upperFirstLetter(feData.getKeyWord()));
		feData.setSearchKeyWord(Utils.getWords(feData.getKeyWord()));
		feData.setSearchKeyWordUrl(feData.getKeyWord() + WebSiteLevelConstants.KEY_WORD_QUERY_URL);
	}
	
	/**
	 * Init website post function preparing data.  
	 *
	 * @param feData
	 * @param webSite
	 */
	protected void initPostSearchData(FrontEndData feData, WebSiteData webSite) {
		logger.debug("HatCoverTopService --> initPostSearchData()");
		
		feData.setPostLastUpdateTime(Constants.NA);
	}
	
	/**
	 * Check each function need return to 404 page in directly or not.
	 * That's means, the query keywords include sensitive words and SWSB application no need to process any business logic and return to 404 page in directly. 
	 * The 'Sensitive Words' means: include huang, du, du and copyright words.
	 *
	 * @param feData
	 * @param webSite
	 * @return
	 */
	protected boolean needReturnDirect(FrontEndData feData) {
		logger.debug("HatCoverTopService --> needReturnDirect()");
		
		if (Constants.YES.equals(feData.getReturnDirect())) {
			return Constants.TRUE;
		}
		
		boolean returnDirect = Constants.FALASE;
		
		// K or S
		if (WebSiteLevelConstants.KEY_WORD_QUERY.equals(feData.getQueryType()) || WebSiteLevelConstants.SEARCH_QUERY.equals(feData.getQueryType())) {
			AdminConfigManagerIfc acManager = (AdminConfigManagerIfc)cacheFactory.getMapByKey(CacheFactory.ADMIN_CONFIG_MAP).get(CacheFactory.ADMIN_CONFIG_SERVER_MAP);
			returnDirect = acManager.hasSensitiveWords(feData.getKeyWord());
		}
		
		return returnDirect;
	};
	
}
