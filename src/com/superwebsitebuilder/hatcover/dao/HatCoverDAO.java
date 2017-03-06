/**
 * Copyright (C) 2016 - 2017 YG Studio. All rights reserved.
 * Filename:  HatCoverDAO.java
 * Purpose:   'Hat Cover' business type DAO function interface.
 * Classes:   HatCoverDAO
 */
package com.superwebsitebuilder.hatcover.dao;

import java.util.List;

import com.superwebsitebuilder.websitelevel.data.businesslogic.DBTransferData;
import com.superwebsitebuilder.websitelevel.data.businesslogic.PostData;


/**
 * 'Hat Cover' business type DAO function interface. <BR>
 *
 * <PRE>
 *
 * <B>History:</B>
 * Developer            Date                 Change Reason        Change
 * ----------------     ----------------     ----------------     ----------------
 * Gavin.Zhang          Dec 21, 2016              Initial version      0.1
 *
 * </PRE>
 *
 * @author Gavin.Zhang - YG Studio
 *
 * @version 01.00.00
 *
 */

public interface HatCoverDAO {

	/**
	 * Get Post using itself URL from DB.  
	 *
	 * @param dbtData
	 * @return
	 * @throws Exception
	 */
	public PostData getOnePostByPostSelfUrl(DBTransferData dbtData) throws Exception;
	
	/**
	 * Get Post list for article page.  
	 *
	 * @param dbtData
	 * @return
	 * @throws Exception
	 */
	public List<PostData> getArticlePagePostListByKeyWord(DBTransferData dbtData) throws Exception;
	
	/**
	 * Insert Post list into DB.   
	 *
	 * @param dbtData
	 * @throws Exception
	 */
	public void insertHatCoverPostListForArticlePage(DBTransferData dbtData) throws Exception;

}
