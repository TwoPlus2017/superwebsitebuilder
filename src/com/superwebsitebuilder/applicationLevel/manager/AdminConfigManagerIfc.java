/**
 * Copyright (C) 2016 - 2017 YG Studio. All rights reserved.
 * Filename:  AdminConfigManagerIfc.java
 * Purpose:   SWSB AdminConfig Manager interface to provide SWSB application level business functions.
 * Classes:   AdminConfigManagerIfc
 */
package com.superwebsitebuilder.applicationLevel.manager;

import java.util.List;

import com.superwebsitebuilder.applicationLevel.data.websitefunction.SensitiveWordData;

/**
 * SWSB AdminConfig Manager interface to provide SWSB application level business functions. <BR>
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
 * @author Gavin.Zhang - YG Studio
 *
 * @version 01.00.00
 *
 */

public interface AdminConfigManagerIfc extends ManagerIfc {
	

	/**
	 * Get all sensitive words. 
	 *
	 * @return
	 */
	public String[] getSensitiveWords();
	
	/**
	 * Provide all sensitive word to manager. 
	 *
	 * @param swList
	 */
	public void setSensitiveWords(List<SensitiveWordData> swList);
	
	/**
	 * Check the request words include sensitive word or not. 
	 *
	 * @param queryWords
	 * @return
	 */
	public boolean hasSensitiveWords(String queryWords);
	
}
