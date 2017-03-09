/**
 * Copyright (C) 2016 - 2017 GB Studio. All rights reserved.
 * Filename:  CacheFactory.java
 * Purpose:   SWSB application cache factory of SWSB application level.
 * Classes:   CacheFactory
 */
package com.superwebsitebuilder.platform.factory;

import java.util.HashMap;
import java.util.Map;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * SWSB application cache factory of SWSB application level. <BR>
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

public class CacheFactory {
	
	/** Represents the logger field */
	private static Log logger = LogFactory.getLog(CacheFactory.class);
	
	/** Represents the WEBSITE_MAP field */
	public static final String WEBSITE_MAP = "webSiteMap";
	
	/** Represents the HAT_COVER_WEBSITE_MAP field */
	public static final String HAT_COVER_WEBSITE_MAP = "hatWebSiteMap";
	
	/** Represents the HAT_COVER_RANDOM_KW_MAP field */
	public static final String HAT_COVER_RANDOM_KW_MAP = "randomKeyWordsMap";
	
	/** Represents the NICHE_WEBSITE_MAP_BY_ID field */
	public static final String NICHE_WEBSITE_MAP_BY_ID = "nicheWebSiteMapById";
	
	/** Represents the NICHE_WEBSITE_MAP_BY_SHOW_NAME field */
	public static final String NICHE_WEBSITE_MAP_BY_SHOW_NAME = "nicheWebSiteMapByShowName";
	
	/** Represents the SENSITIVE_WORD_MAP field */
	public static final String SENSITIVE_WORD_MAP = "sensitiveWordMap";
	
	/** Represents the ADMIN_CONFIG_MAP field */
	public static final String ADMIN_CONFIG_MAP	= "adminConfigMap";
	/*^------ Cache Level One -----------------------------------------------------------------------------------------------------------------^*/
	
	/** Represents the ADMIN_CONFIG_SERVER_MAP field */
	public static final String ADMIN_CONFIG_SERVER_MAP	= "adminConfigServerMap";
	/*^------ Cache Level Two -----------------------------------------------------------------------------------------------------------------^*/
	
	/** Represents the cacheMap field */
	private Map<String, Map<String, Object>> cacheMap = new HashMap<String, Map<String, Object>>();
	
	/**
	 * Create one type of cache.  
	 *
	 * @param cacheName
	 * @return
	 */
	public Map<String, Object> createCache(String cacheName) {
		logger.debug("CacheFactory --> createCache()");
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		cacheMap.put(cacheName, map);
		
		return map;
	}
	
	/**
	 * Check the cache exist or not.  
	 *
	 * @param cachName
	 * @return
	 */
	public boolean isExist(String cachName) {
		logger.debug("CacheFactory --> isExist()");
		
		if(cacheMap.containsKey(cachName)) {
			return true;
		}
		
		return false;
	}
	
	/**
	 * Get one cache by request. 
	 *
	 * @param cachName
	 * @return
	 */
	public Map<String,Object> getMapByKey(String cachName) {
		logger.debug("CacheFactory --> getMapByKey()");
		
		if(cacheMap.containsKey(cachName)) {
			return cacheMap.get(cachName);
		}
		
		return null;
	}
	
	/**
	 * Check the sub cache exist or not.  
	 *
	 * @param levelOneCacheName
	 * @param levelTwoCacheName
	 * @return
	 */
	public boolean hasSubCache(String levelOneCacheName, String levelTwoCacheName) {
		logger.debug("CacheFactory --> hasSubCache()");
		
		if (cacheMap.containsKey(levelOneCacheName)) {
			if (cacheMap.get(levelOneCacheName).containsKey(levelTwoCacheName)) {
				return true;
			}
		}
		
		return false;
	}

}
