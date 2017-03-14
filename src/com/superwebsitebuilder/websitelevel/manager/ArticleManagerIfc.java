/**
 * Copyright (C) 2016 - 2017 GB Studio. All rights reserved.
 * Filename:  KeyWordManagerIfc.java
 * Purpose:   Article Manager interface to provide article page business functions.
 * Classes:   KeyWordManagerIfc
 */
package com.superwebsitebuilder.websitelevel.manager;

import java.util.List;

import com.superwebsitebuilder.applicationLevel.manager.ManagerIfc;
import com.superwebsitebuilder.websitelevel.data.businesslogic.ArticleData;
import com.superwebsitebuilder.websitelevel.data.websitefunction.FrontEndData;

/**
 * Article Manager interface to provide article page business functions. <BR>
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

public interface ArticleManagerIfc extends ManagerIfc {
	
	/**
	 * Can get one random article list base on request counter. 
	 *
	 * @param counter
	 * @return
	 * @throws Exception 
	 */
	public List<ArticleData> getRandomArticlesObj(int counter) throws Exception;
	
	public List<ArticleData> getRandomHotArticlesObj(int counter) throws Exception;
	
	/**
	 * Can get one related article list of one request article.  
	 *
	 * @param feData
	 * @return
	 * @throws Exception
	 */
	public List<ArticleData> getOneArticlePageRelatedArticles(FrontEndData feData) throws Exception;
	
}
