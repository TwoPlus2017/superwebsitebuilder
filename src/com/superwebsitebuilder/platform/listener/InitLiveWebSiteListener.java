/**
 * Copyright (C) 2016 - 2017 YG Studio. All rights reserved.
 * Filename:  InitLiveWebSiteListener.java
 * Purpose:   One listener to init all business type WebSite.
 * Classes:   InitLiveWebSiteListener
 */
package com.superwebsitebuilder.platform.listener;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.ServletContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.web.context.ServletContextAware;

import com.superwebsitebuilder.espider.constant.Constants;
import com.superwebsitebuilder.espider.constant.WebSiteLevelConstants;
import com.superwebsitebuilder.espider.util.Utils;
import com.superwebsitebuilder.platform.factory.CacheFactory;
import com.superwebsitebuilder.websitelevel.dao.DAOFacade;
import com.superwebsitebuilder.websitelevel.data.websitefunction.WebSiteData;


/**
 * One listener to init all business type WebSite. <BR>
 *
 * <PRE>
 *
 * <B>History:</B>
 * Developer            Date                 Change Reason        Change
 * ----------------     ----------------     ----------------     ----------------
 * Gavin.Zhang          Nov 9, 2016          Initial version      0.1
 *
 * </PRE>
 *
 * @author Gavin.Zhang - YG Studio
 *
 * @version 01.00.00
 *
 */

public class InitLiveWebSiteListener implements InitializingBean, ServletContextAware {
	
	/** Represents the logger field */
	private static Log logger = LogFactory.getLog(InitLiveWebSiteListener.class);
	@Resource
	private CacheFactory cacheFactory;
	@Resource
	private DAOFacade daoFacade;
	
	/** Represents the allWebSiteList field */
	private List<WebSiteData> allWebSiteList = new ArrayList<WebSiteData>();
	
	/** Represents the hatWebSiteList field */
	private List<WebSiteData> hatWebSiteList = new ArrayList<WebSiteData>();
	
	/** Represents the nicheWebSiteList field */
	private List<WebSiteData> nicheWebSiteList = new ArrayList<WebSiteData>();

	/**
	 * @see org.springframework.web.context.ServletContextAware#setServletContext(javax.servlet.ServletContext)
	 *
	 */
	@Override
	public void setServletContext(ServletContext servletContext) {
		logger.debug("InitLiveWebSiteListener --> setServletContext()");
		
		try {
			
			buildHatCoverWebSitesData();
			
		} catch (Exception e) {
			logger.debug("InitLiveWebSiteListener --> setServletContext() --> " + e.getMessage());
		}
		
		// to build all website map
		if (allWebSiteList.size() > 0) {
			Map<String, Object> webSiteMap = cacheFactory.createCache(CacheFactory.WEBSITE_MAP);
			
			for (WebSiteData wsData : allWebSiteList) {
				webSiteMap.put(wsData.getShowName(), wsData);
			}
		}
		
		// to build hat cover business type map
		if (hatWebSiteList.size() > 0) {
			Map<String, Object> hatWebSiteMap = cacheFactory.createCache(CacheFactory.HAT_COVER_WEBSITE_MAP);
			
			for (WebSiteData wsData : hatWebSiteList) {
				hatWebSiteMap.put(wsData.getShowName(), wsData);
			}
		}
		
		// to build niche business type map
		if (nicheWebSiteList.size() > 0) {
			Map<String, Object> nicheWebSiteMapById = cacheFactory.createCache(CacheFactory.NICHE_WEBSITE_MAP_BY_ID);
			Map<String, Object> nicheWebSiteMapByShowName = cacheFactory.createCache(CacheFactory.NICHE_WEBSITE_MAP_BY_SHOW_NAME);
			
			for (WebSiteData wsData : nicheWebSiteList) {
				nicheWebSiteMapById.put(wsData.getId(), wsData);
				nicheWebSiteMapByShowName.put(wsData.getShowName(), wsData);
			}
		}
	}
	
	/**
	 * Init all 'Hat Cover' business type WebSite.  
	 *
	 * @throws Exception
	 */
	private void buildHatCoverWebSitesData() throws Exception {
		logger.debug("InitLiveWebSiteListener --> buildHatCoverWebSitesData()");
		
		List<WebSiteData> webSiteList = daoFacade.getAllWebSite();
		
		if (Utils.checkNotNull(webSiteList)) {
			for (WebSiteData ws : webSiteList) {
				if (Constants.YES.equals(ws.getEnabled())) {
					ws.setTableKeyWordName((WebSiteLevelConstants.DB_HATCOVER_TABLE_PREFIX + ws.getCode() + WebSiteLevelConstants.DB_ARTICLE_SUFIX));
					//ws.setTablePostName((ws.getCode() + WebSiteLevelConstants.DB_POST_SUFIX));
					//ws.setTableCommentsName((ws.getCode() + WebSiteLevelConstants.DB_COMMENTS_SUFIX));
					//ws.setTableCatName((ws.getCode() + WebSiteLevelConstants.DB_CAT_SUFIX));
					
					// for init WebSite info.
					ws.setDomainUrl(Utils.getDomainUrlByHostName(ws));
					ws.setIndexImage(Utils.getIndexImage(ws.getCode()));
					ws.setThisYear(Utils.getThisYearStr());
					ws.setIndexCreateDate(Utils.getNiceFormatTodayStr());
					
					// for init return page.
					initWSRequestReturnPage(ws);
					
					// to split into each website map
					splitWebSiteByBusinessType(ws);
					
					logger.info("InitLiveWebSiteListener ----> buildHatCoverWebSitesData: WebSite_Name: " + ws.getId() + "     lived \t" + ws.getName());
				} else {
					logger.info("InitLiveWebSiteListener ----> buildHatCoverWebSitesData: WebSite_Name: " + ws.getId() + "     disabled \t" + ws.getName());
				}
			}
		}
	}
	
	/**
	 * Split each WebSite into SWSB application cache base on WebSite business type.  
	 *
	 * @param wsData
	 */
	private void splitWebSiteByBusinessType(WebSiteData wsData) {
		logger.debug("InitLiveWebSiteListener --> splitWebSiteByBusinessType()");
		
		allWebSiteList.add(wsData);
		
		if (WebSiteLevelConstants.BZ_TYPE_HAT_COVER.equalsIgnoreCase(wsData.getBusinessType())) {
			hatWebSiteList.add(wsData);
		} else if (WebSiteLevelConstants.BZ_TYPE_NICHE.equalsIgnoreCase(wsData.getBusinessType())) {
			nicheWebSiteList.add(wsData);
		}
	}
	
	/**
	 * Init all WebSite after process function return page.  
	 *
	 * @param wsData
	 */
	private void initWSRequestReturnPage(WebSiteData wsData) {
		logger.debug("InitLiveWebSiteListener --> initWSRequestReturnPage()");
		
		String preFix = wsData.getOrderNum() + Constants.DASH + wsData.getShowName() + Constants.SLASH;
		
		if (WebSiteLevelConstants.BZ_TYPE_HAT_COVER.equalsIgnoreCase(wsData.getBusinessType())) {
			wsData.setReturnToIndexPage(preFix + WebSiteLevelConstants.HATCOVER_LANDING_PAGE_INDEX);
			wsData.setReturnToCatPage(preFix + WebSiteLevelConstants.HATCOVER_LANDING_PAGE_LIST_BY_CAT);
			wsData.setReturnToArticlePage(preFix + WebSiteLevelConstants.HATCOVER_LANDING_PAGE_LIST_BY_KEYWORD);
			wsData.setReturnToPostPage(preFix + WebSiteLevelConstants.HATCOVER_LANDING_PAGE_POST);
			wsData.setReturnToSearchResultPage(preFix + WebSiteLevelConstants.SEARCH_RESULT);
			wsData.setReturnToNotFindPage(preFix + WebSiteLevelConstants.HATCOVER_LANDING_PAGE_404);
		} else if (WebSiteLevelConstants.BZ_TYPE_NICHE.equalsIgnoreCase(wsData.getBusinessType())) {
			wsData.setReturnToIndexPage(preFix + WebSiteLevelConstants.NICHE_LANDING_PAGE_INDEX);
			wsData.setReturnToCatPage(preFix + WebSiteLevelConstants.NICHE_LANDING_PAGE_LIST_BY_CAT);
			wsData.setReturnToArticlePage(preFix + WebSiteLevelConstants.NICHE_LANDING_PAGE_LIST_BY_KEYWORD);
			wsData.setReturnToPostPage(preFix + WebSiteLevelConstants.NICHE_LANDING_PAGE_POST);
			wsData.setReturnToSearchResultPage(preFix + WebSiteLevelConstants.SEARCH_RESULT);
			wsData.setReturnToNotFindPage(preFix + WebSiteLevelConstants.NICHE_LANDING_PAGE_404);
		}
		
	}

	/**
	 * @see org.springframework.beans.factory.InitializingBean#afterPropertiesSet()
	 *
	 */
	@Override
	public void afterPropertiesSet() throws Exception {
		logger.debug("InitLiveWebSiteListener --> afterPropertiesSet()");
	}

}
