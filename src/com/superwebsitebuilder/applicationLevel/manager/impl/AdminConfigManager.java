/**
 * Copyright (C) 2016 - 2017 GB Studio. All rights reserved.
 * Filename:  AdminConfigManager.java
 * Purpose:   SWSB AdminConfig Manager implement to implement the SWSB application level business functions.
 * Classes:   AdminConfigManager
 */
package com.superwebsitebuilder.applicationLevel.manager.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.superwebsitebuilder.applicationLevel.data.websitefunction.HostConfigPropertyData;
import com.superwebsitebuilder.applicationLevel.data.websitefunction.SensitiveWordData;
import com.superwebsitebuilder.applicationLevel.manager.AdminConfigManagerIfc;
import com.superwebsitebuilder.espider.constant.Constants;
import com.superwebsitebuilder.espider.util.Utils;

/**
 * SWSB AdminConfig Manager implement to implement the SWSB application level business functions. <BR>
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

public class AdminConfigManager implements AdminConfigManagerIfc {
	
	/** Represents the logger field */
	private static Log logger = LogFactory.getLog(AdminConfigManager.class);
	
	/** Represents the sensitiveWords field */
	private String[] sensitiveWords;
	
	/** Represents the hostData field */
	private HostConfigPropertyData hostData;

	/**
	 * @see com.superwebsitebuilder.applicationLevel.manager.AdminConfigManagerIfc#getSensitiveWords()
	 *
	 */
	public String[] getSensitiveWords() {
		logger.debug("AdminConfigManager --> getSensitiveWords()");
		
		return sensitiveWords;
	}

	/**
	 * @see com.superwebsitebuilder.applicationLevel.manager.AdminConfigManagerIfc#setSensitiveWords(java.util.List)
	 *
	 */
	@Override
	public void setSensitiveWords(List<SensitiveWordData> swList) {
		logger.debug("AdminConfigManager --> setSensitiveWords()");
		
		sensitiveWords = new String[swList.size()];
		
		for (int i = 0; i < swList.size(); i++) {
			sensitiveWords[i] = swList.get(i).getName();
		}
	}
	
	/**
	 * Real method of check has sensitive words or not. 
	 *
	 * @param queryWords
	 * @return
	 */
	private boolean checkHasSensitiveWord(String queryWords) {
		logger.debug("AdminConfigManager --> checkHasSensitiveWord()");
		
		if (StringUtils.indexOfAny(Utils.getWords(queryWords.toLowerCase()), sensitiveWords) >= 0) {
			return Constants.TRUE;
		}
		
		return Constants.FALASE;
	}
	
	/**
	 * @see com.superwebsitebuilder.applicationLevel.manager.AdminConfigManagerIfc#hasSensitiveWords(java.lang.String)
	 *
	 */
	public boolean hasSensitiveWords(String queryWords) {
		logger.debug("AdminConfigManager --> hasSensitiveWords()");
		
		boolean has = Constants.FALASE;
		
		if (checkHasSensitiveWord(queryWords)) {
			has = Constants.TRUE;
		}
		
		return has;
	}

	/**
	 * @see com.superwebsitebuilder.applicationLevel.manager.AdminConfigManagerIfc#getHostAndApplicationProperty()
	 */
	@Override
	public HostConfigPropertyData getHostAndApplicationProperty() {
		return hostData;
	}

	/**
	 * @see com.superwebsitebuilder.applicationLevel.manager.AdminConfigManagerIfc#setHostAndApplicationProperties(com.superwebsitebuilder.applicationLevel.data.websitefunction.HostConfigPropertyData)
	 */
	@Override
	public void setHostAndApplicationProperties(HostConfigPropertyData hostConfigData) {
		hostData = hostConfigData;
	}

}
