/**
 * Copyright (C) 2016 - 2017 GB Studio. All rights reserved.
 * Filename:  InitSuperWebSiteApplicatLevelListener.java
 * Purpose:   One listener to init SWSB application.
 * Classes:   InitSuperWebSiteApplicatLevelListener
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

import com.superwebsitebuilder.applicationLevel.data.websitefunction.HostConfigPropertyData;
import com.superwebsitebuilder.applicationLevel.data.websitefunction.SensitiveWordData;
import com.superwebsitebuilder.applicationLevel.manager.AdminConfigManagerIfc;
import com.superwebsitebuilder.espider.util.Utils;
import com.superwebsitebuilder.platform.factory.CacheFactory;
import com.superwebsitebuilder.websitelevel.dao.DAOFacade;

/**
 * One listener to init SWSB application. <BR>
 *
 * <PRE>
 *
 * <B>History:</B>
 * Developer            Date                 Change Reason        Change
 * ----------------     ----------------     ----------------     ----------------
 * Gavin.Zhang          Jan 16, 2017         Initial version      0.1
 *
 * </PRE>
 *
 * @author Gavin.Zhang - GB Studio
 *
 * @version 01.00.00
 *
 */

public class InitSuperWebSiteApplicatLevelListener implements InitializingBean, ServletContextAware {
	
	/** Represents the logger field */
	private static Log logger = LogFactory.getLog(InitSuperWebSiteApplicatLevelListener.class);
	
	@Resource
	private CacheFactory cacheFactory;
	@Resource
	private AdminConfigManagerIfc acManager;
	@Resource
	private DAOFacade daoFacade;
	@Resource
	private HostConfigPropertyData hostConfigData;

	/**
	 * @see org.springframework.web.context.ServletContextAware#setServletContext(javax.servlet.ServletContext)
	 *
	 */
	@Override
	public void setServletContext(ServletContext sc) {
		logger.debug("InitSuperWebSiteApplicatLevelListener --> setServletContext()");
		
		try {
			cacheFactory.createCache(CacheFactory.ADMIN_CONFIG_MAP);
			
			preparingAdminConfigCache();
			
			preparingHostConfigInfo();
			
		} catch (Exception e) {
			logger.debug("InitSuperWebSiteApplicatLevelListener --> setServletContext() --> " + e.getMessage());
		}
	}
	
	/**
	 * Init SWSB application level's admin config.  
	 *
	 * @throws Exception
	 */
	private void preparingAdminConfigCache() throws Exception {
		logger.debug("InitSuperWebSiteApplicatLevelListener --> preparingAdminConfigCache()");
		
		Map<String,Object> adminConfigMap = cacheFactory.getMapByKey(CacheFactory.ADMIN_CONFIG_MAP);
		
		// Sensitive Words
		List<SensitiveWordData> allSWData = daoFacade.getAllSensitiveWordsList();
		if (Utils.checkNotNull(adminConfigMap) && Utils.checkNotNull(allSWData)) {
			acManager.setSensitiveWords(allSWData);
			
			adminConfigMap.put(CacheFactory.ADMIN_CONFIG_SERVER_MAP, acManager);
		}
	}
	
	/**
	 * Init PROD host and application level's config Info.  
	 *
	 * @throws Exception
	 */
	private void preparingHostConfigInfo() throws Exception {
		
		acManager.setHostAndApplicationProperties(hostConfigData);
	}
	
	/**
	 * @see org.springframework.beans.factory.InitializingBean#afterPropertiesSet()
	 *
	 */
	@Override
	public void afterPropertiesSet() throws Exception {
		logger.debug("InitSuperWebSiteApplicatLevelListener --> afterPropertiesSet()");
	}

}
