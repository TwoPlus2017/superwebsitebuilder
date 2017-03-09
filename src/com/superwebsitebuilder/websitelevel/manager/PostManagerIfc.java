/**
 * Copyright (C) 2016 - 2017 GB Studio. All rights reserved.
 * Filename:  PostManagerifc.java
 * Purpose:   Post Manager interface to provide post page business functions.
 * Classes:   PostManagerifc
 */
package com.superwebsitebuilder.websitelevel.manager;

import java.util.List;

import com.superwebsitebuilder.applicationLevel.manager.ManagerIfc;
import com.superwebsitebuilder.websitelevel.data.businesslogic.PostData;
import com.superwebsitebuilder.websitelevel.data.websitefunction.FrontEndData;

/**
 * Post Manager interface to provide post page business functions. <BR>
 *
 * <PRE>
 *
 * <B>History:</B>
 * Developer            Date                 Change Reason        Change
 * ----------------     ----------------     ----------------     ----------------
 * Gavin.Zhang          Jan 5, 2017          Initial version      0.1
 *
 * </PRE>
 *
 * @author Gavin.Zhang - GB Studio
 *
 * @version 01.00.00
 *
 */

public interface PostManagerIfc extends ManagerIfc {
	
	/**
	 * Can get the details of one post from DB. 
	 *
	 * @param feData
	 * @return
	 * @throws Exception
	 */
	public PostData getOnePostPageMainContents(FrontEndData feData) throws Exception;
	
	/**
	 * Can get the details of one post from ES.  
	 *
	 * @param feData
	 * @return
	 * @throws Exception
	 */
	public PostData getOnePostPageMainContentsFromES(FrontEndData feData) throws Exception;
	
	/**
	 * Can get one post list base on article page request and all post come from DB or ES. 
	 *
	 * @param feData
	 * @return
	 * @throws Exception
	 */
	public List<PostData> getOneArticlePageMainContents(FrontEndData feData) throws Exception;
	
	/**
	 * Can get one post list base on search page request and all post come from ES.  
	 *
	 * @param feData
	 * @return
	 * @throws Exception
	 */
	public List<PostData> getSearchPageMainContents(FrontEndData feData) throws Exception;

}
