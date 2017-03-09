/**
 * Copyright (C) 2016 - 2017 GB Studio. All rights reserved.
 * Filename:  Manager.java
 * Purpose:   The top Manager implement to provided some useful init data object for SWSB application running.
 * Classes:   Manager
 */
package com.superwebsitebuilder.applicationLevel.manager.impl;

import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.superwebsitebuilder.applicationLevel.manager.ManagerIfc;
import com.superwebsitebuilder.platform.factory.CacheFactory;
import com.superwebsitebuilder.websitelevel.dao.DAOFacade;
import com.superwebsitebuilder.websitelevel.manager.ElasticSearchManagerIfc;


/**
 * The top Manager implement to provided some useful init data object for SWSB application running. <BR>
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
 * @author Gavin.Zhang - GB Studio
 *
 * @version 01.00.00
 *
 */

public abstract class Manager implements ManagerIfc {
	
	/** Represents the logger field */
	private static Log logger = LogFactory.getLog(Manager.class);
	
	@Resource
	protected CacheFactory cacheFactory;
	@Resource
	protected DAOFacade daoFacade;
	@Resource
	protected ElasticSearchManagerIfc esManager;
	
	/**
	 * Get SWSB application internal cached object.  
	 *
	 * @param mapName
	 * @return
	 */
	public Map<String, Object> getCahcedMap(String mapName) {
		logger.debug("Manager --> getCahcedMap()");
		
		if (cacheFactory.isExist(mapName)) {
			return cacheFactory.getMapByKey(mapName);
		}
		
		return null;
	}
}
