/**
 * Copyright (C) 2016 - 2017 GB Studio. All rights reserved.
 * Filename:  PostManagerFactory.java
 * Purpose:   SWSB application object factory of Manager.
 * Classes:   PostManagerFactory
 */
package com.superwebsitebuilder.platform.factory;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.superwebsitebuilder.espider.constant.WebSiteLevelConstants;
import com.superwebsitebuilder.websitelevel.manager.impl.ArticleManager;
import com.superwebsitebuilder.websitelevel.manager.impl.PostManager;

/**
 * SWSB application object factory of Manager. <BR>
 * 
 * Scope: 
 * 	Article Manager
 * 	Post Manager
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

public class ManagerFactory {
	
	/** Represents the logger field */
	private static Log logger = LogFactory.getLog(ManagerFactory.class);
	
	@Resource
	protected ArticleManager hatCoverArticleManager;
	@Resource
	protected PostManager cnPostManager;
	
	/**
	 * Get one Post manager object instance; 
	 *
	 * @param managerType
	 * @return
	 */
	public Object getInstanceOfPostType(String managerType) {
		logger.debug("ManagerFactory --> getInstanceOfPostType()");
		
		Object postManager = null;
		
		switch (managerType) {
			case WebSiteLevelConstants.TYPE_NAME_CONTENT: // Contents
				postManager = cnPostManager;
				break;
				
			case WebSiteLevelConstants.TYPE_NAME_QUESTION: // Questions
				postManager = null;
				break;
				
			default:
				break;
		}
      
		return postManager;
	}
	
	/**
	 * Get one Article manager object instance;  
	 *
	 * @param businessType
	 * @return
	 */
	public Object getInstanceOfArticleType(String businessType) {
		logger.debug("ManagerFactory --> getInstanceOfArticleType()");
		
		Object articleManager = null;
		
		switch (businessType) {
			case WebSiteLevelConstants.BZ_TYPE_HAT_COVER: // Hat Cover
				articleManager = hatCoverArticleManager;
				break;
				
			case WebSiteLevelConstants.BZ_TYPE_NICHE: // Niche
				articleManager = null;
				break;
				
			default:
				break;
		}
      
		return articleManager;
	}

}
