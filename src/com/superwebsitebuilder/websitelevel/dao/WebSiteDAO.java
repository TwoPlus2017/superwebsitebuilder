/**
 * Copyright (C) 2016 - 2017 YG Studio. All rights reserved.
 * Filename:  WebSiteDAO.java
 * Purpose:   'WebSite' related business type DAO function interface.
 * Classes:   WebSiteDAO
 */
package com.superwebsitebuilder.websitelevel.dao;

import java.util.List;

import com.superwebsitebuilder.websitelevel.data.websitefunction.WebSiteData;

/**
 * 'WebSite' related business type DAO function interface. <BR>
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

public interface WebSiteDAO {
	
	/**
	 * Get all SWSB application level 'WebSite'.  
	 *
	 * @return
	 */
	public List<WebSiteData> getAllWebSite() throws Exception;

}
