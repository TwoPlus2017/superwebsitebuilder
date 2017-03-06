/**
 * Copyright (C) 2016 - 2017 YG Studio. All rights reserved.
 * Filename:  DAOFacade.java
 * Purpose:   The SWSB facade DAO object and include all SWSB application components DAO functions.
 * Classes:   DAOFacade
 */
package com.superwebsitebuilder.websitelevel.dao;

import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.superwebsitebuilder.applicationLevel.dao.AdminDAO;
import com.superwebsitebuilder.applicationLevel.data.websitefunction.SensitiveWordData;
import com.superwebsitebuilder.hatcover.dao.HatCoverDAO;
import com.superwebsitebuilder.websitelevel.data.businesslogic.ArticleData;
import com.superwebsitebuilder.websitelevel.data.businesslogic.DBTransferData;
import com.superwebsitebuilder.websitelevel.data.businesslogic.PostData;
import com.superwebsitebuilder.websitelevel.data.websitefunction.WebSiteData;


/**
 * The SWSB facade DAO object and include all SWSB application components DAO functions. <BR>
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

public class DAOFacade {
	
	/** Represents the logger field */
	private static Log logger = LogFactory.getLog(DAOFacade.class);
	
	@Resource
	private WebSiteDAO webSiteDAO;
	@Resource
	private ArticleDAO keyWordDAO;
	@Resource
	private HatCoverDAO hatCoverDAO;
	@Resource
	private AdminDAO adminDAO;
	
	/**
	 * Get all SWSB application level 'WebSite'. 
	 *
	 * @return
	 * @throws Exception
	 */
	public List<WebSiteData> getAllWebSite() throws Exception {
		logger.debug("DAOFacade --> getAllWebSite()");
		
		return webSiteDAO.getAllWebSite();
	}
	
	/**
	 * Get one article list base on DB 26 KeyWords tables in random process.  
	 *
	 * @return
	 * @throws Exception
	 */
	public List<ArticleData> getRandomArticlesList() throws Exception {
		logger.debug("DAOFacade --> getRandomArticlesList()");
		
		return keyWordDAO.getRandomKeyWordsList();
	}
	
	/**
	 * Get all sensitive words from DB.   
	 *
	 * @return
	 * @throws Exception
	 */
	public List<SensitiveWordData> getAllSensitiveWordsList() throws Exception {
		logger.debug("DAOFacade --> getAllSensitiveWordsList()");
		
		return adminDAO.getAllSensitiveWords();
		
	}
	/*^------ WebSite Level DAO -----------------------------------------------------------------------------------------------------------------^*/
	
	/**
	 * Get Post using itself URL from DB. 
	 *
	 * @param dbtData
	 * @return
	 * @throws Exception
	 */
	public PostData getHatCoverCNPostDataByPostSelfUrl(DBTransferData dbtData) throws Exception {
		logger.debug("DAOFacade --> getHatCoverCNPostDataByPostSelfUrl()");
		
		return hatCoverDAO.getOnePostByPostSelfUrl(dbtData);
	}
	
	/**
	 * Get Post list for article page. 
	 *
	 * @param dbtData
	 * @return
	 * @throws Exception
	 */
	public List<PostData> getHatCoverArticlePagePostListByKeyWord(DBTransferData dbtData) throws Exception {
		logger.debug("DAOFacade --> getHatCoverArticlePagePostListByKeyWord()");
		
		return hatCoverDAO.getArticlePagePostListByKeyWord(dbtData);
	}
	
	/**
	 * Insert Post list into DB.  
	 *
	 * @param dbtData
	 * @throws Exception
	 */
	public void insertHatCoverPostListForArticlePage(DBTransferData dbtData) throws Exception {
		logger.debug("DAOFacade --> insertHatCoverPostListForArticlePage()");
		
		hatCoverDAO.insertHatCoverPostListForArticlePage(dbtData);
	}
	/*^---- HatCover DAO -------------------------------------------------------------------------------------------------------------------^*/

}
