/**
 * Copyright (C) 2016 - 2017 GB Studio. All rights reserved.
 * Filename:  KeyWordDAO.java
 * Purpose:   Article related business type DAO function interface.
 * Classes:   KeyWordDAO
 */
package com.superwebsitebuilder.websitelevel.dao;

import java.util.List;

import com.superwebsitebuilder.websitelevel.data.businesslogic.ArticleData;

/**
 * Article related business type DAO function interface. <BR>
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

public interface ArticleDAO {
	
	/**
	 * Get one article list base on DB 26 KeyWords tables in random process.  
	 *
	 * @return
	 */
	public List<ArticleData> getRandomKeyWordsList() throws Exception;

}
