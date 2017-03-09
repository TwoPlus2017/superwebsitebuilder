/**
 * Copyright (C) 2016 - 2017 GB Studio. All rights reserved.
 * Filename:  BasicDirectlyCoverSvcIfc.java
 * Purpose:   'Basic Directly Cover' business type Service function interface.
 * Classes:   BasicDirectlyCoverSvcIfc
 */
package com.superwebsitebuilder.hatcover.service;

import com.superwebsitebuilder.websitelevel.data.websitefunction.FrontEndData;

/**
 * 'Basic Directly Cover' business type Service function interface. <BR>
 *
 * <PRE>
 *
 * <B>History:</B>
 * Developer            Date                 Change Reason        Change
 * ----------------     ----------------     ----------------     ----------------
 * Gavin.Zhang          Nov 11, 2016         Initial version      0.1
 *
 * </PRE>
 *
 * @author Gavin.Zhang - GB Studio
 *
 * @version 01.00.00
 *
 */

public interface BasicDirectlyCoverSvcIfc {
	
	/**
	 * To handle web site home page function.
	 *
	 * @param feData
	 * @throws Exception
	 */
	public void getIndex(FrontEndData feData) throws Exception;
	
	/**
	 * To handle web site article page function. 
	 *
	 * @param feData
	 * @throws Exception
	 */
	public void getOneArticle(FrontEndData feData) throws Exception;
	
	/**
	 * To handle web site post page function. 
	 *
	 * @param feData
	 * @throws Exception
	 */
	public void getOnePost(FrontEndData feData) throws Exception;
	
	/**
	 * To handle web site search page function. 
	 *
	 * @param feData
	 * @throws Exception
	 */
	public void getArticleSearchResult(FrontEndData feData) throws Exception;

}
