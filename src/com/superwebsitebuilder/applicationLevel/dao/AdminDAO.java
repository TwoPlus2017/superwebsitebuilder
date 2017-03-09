/**
 * Copyright (C) 2016 - 2017 GB Studio. All rights reserved.
 * Filename:  AdminDAO.java
 * Purpose:   SWSB 'AdminConfig' business DAO function interface.
 * Classes:   AdminDAO
 */
package com.superwebsitebuilder.applicationLevel.dao;

import java.util.List;

import com.superwebsitebuilder.applicationLevel.data.websitefunction.SensitiveWordData;


/**
 * SWSB 'AdminConfig' business DAO function interface. <BR>
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

public interface AdminDAO {
	
	/**
	 * Get all sensitive words from DB.  
	 *
	 * @return
	 * @throws Exception
	 */
	public List<SensitiveWordData> getAllSensitiveWords() throws Exception;

}
