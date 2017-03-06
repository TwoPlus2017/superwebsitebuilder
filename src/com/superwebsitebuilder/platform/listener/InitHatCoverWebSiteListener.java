/**
 * Copyright (C) 2016 - 2017 YG Studio. All rights reserved.
 * Filename:  InitHatCoverWebSiteListener.java
 * Purpose:   One listener to init 'Hat Cover' business type WebSite.
 * Classes:   InitHatCoverWebSiteListener
 */
package com.superwebsitebuilder.platform.listener;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.ServletContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.web.context.ServletContextAware;

import com.superwebsitebuilder.applicationLevel.manager.ManagerIfc;
import com.superwebsitebuilder.espider.util.Utils;
import com.superwebsitebuilder.platform.factory.CacheFactory;
import com.superwebsitebuilder.websitelevel.dao.DAOFacade;
import com.superwebsitebuilder.websitelevel.data.businesslogic.ArticleData;
import com.superwebsitebuilder.websitelevel.data.businesslogic.PostData;
import com.superwebsitebuilder.websitelevel.data.websitefunction.FrontEndData;
import com.superwebsitebuilder.websitelevel.data.websitefunction.WebSiteData;
import com.superwebsitebuilder.websitelevel.manager.ArticleManagerIfc;
import com.superwebsitebuilder.websitelevel.manager.impl.PostManager;

/**
 * One listener to init 'Hat Cover' business type WebSite. <BR>
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

public class InitHatCoverWebSiteListener implements InitializingBean, ServletContextAware {
	
	/** Represents the logger field */
	private static Log logger = LogFactory.getLog(InitHatCoverWebSiteListener.class);
	@Resource
	private CacheFactory cacheFactory;
	@Resource
	private ArticleManagerIfc hatCoverArticleManager;
	@Resource
	protected PostManager postManagerProxy;
	@Resource
	private DAOFacade daoFacade;

	/**
	 * @see org.springframework.web.context.ServletContextAware#setServletContext(javax.servlet.ServletContext)
	 *
	 */
	@Override
	public void setServletContext(ServletContext sc) {
		logger.debug("InitHatCoverWebSiteListener --> setServletContext()");
		
		try {

			preparingRandomKeyWordCache();
			
		} catch (Exception e) {
			logger.debug("InitHatCoverWebSiteListener --> setServletContext() --> " + e.getMessage());
		}
	}
	
	/**
	 * Get Article list for 'Hat Cover' business type WebSite in random process. 
	 * 
	 * @throws Exception 
	 *
	 */
	private void preparingRandomKeyWordCache() throws Exception {
		logger.debug("InitHatCoverWebSiteListener --> preparingRandomKeyWordCache()");
		
		Map<String, Object> hatWebSiteMap = cacheFactory.getMapByKey(CacheFactory.HAT_COVER_WEBSITE_MAP);
		
		if (hatWebSiteMap.size() > 0) {
			for (String webSiteFlag : hatWebSiteMap.keySet()) {
				WebSiteData webSite = (WebSiteData)hatWebSiteMap.get(webSiteFlag);
				List<ArticleData> kwList = hatCoverArticleManager.getRandomArticlesObj(ManagerIfc.RANDOM_COUNTER_60);
				
				if (Utils.checkNotNull(kwList)) {
					webSite.setRandomWSLevelArticlesList(kwList);
					
					try {
						List<PostData> postList = getPostList(webSite, kwList.get(0));
						
						if (Utils.checkNotNull(postList)) {
							webSite.setRandomWSLevelPostList(postList);
						}
					} catch (Exception e) {
						continue;
					}
				}
			}
		}
	}
	
	/**
	 * Get Post List base on request keyword.  
	 *
	 * @param webSite
	 * @param articleData
	 * @return
	 * @throws Exception
	 */
	private List<PostData> getPostList(WebSiteData webSite, ArticleData articleData) throws Exception {
		FrontEndData feData = new FrontEndData();
		List<PostData> postList = null;
		
		feData.setKeyWord(Utils.getURL(articleData.getTitle()));
		feData.setWebSiteData(webSite);
		
		postList = postManagerProxy.getOneArticlePageMainContents(feData);
		
		return postList;
	}

	/**
	 * @see org.springframework.beans.factory.InitializingBean#afterPropertiesSet()
	 *
	 */
	@Override
	public void afterPropertiesSet() throws Exception {
		logger.debug("InitHatCoverWebSiteListener --> afterPropertiesSet()");
	}

}
