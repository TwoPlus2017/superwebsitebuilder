/**
 * Copyright (C) 2016 - 2017 GB Studio. All rights reserved.
 * Filename:  PostManagerProxy.java
 * Purpose:   Post Manager Proxy to implement the post manager business functions.
 * Classes:   PostManagerProxy
 */
package com.superwebsitebuilder.websitelevel.managerproxy;

import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.superwebsitebuilder.espider.util.Utils;
import com.superwebsitebuilder.platform.factory.ManagerFactory;
import com.superwebsitebuilder.websitelevel.data.businesslogic.PostData;
import com.superwebsitebuilder.websitelevel.data.websitefunction.FrontEndData;
import com.superwebsitebuilder.websitelevel.manager.impl.PostManager;

/**
 * Post Manager Proxy to implement the post manager business functions. <BR>
 *
 * <PRE>
 *
 * <B>History:</B>
 * Developer            Date                 Change Reason        Change
 * ----------------     ----------------     ----------------     ----------------
 * Gavin.Zhang          Jan 6, 2017          Initial version      0.1
 *
 * </PRE>
 *
 * @author Gavin.Zhang - GB Studio
 *
 * @version 01.00.00
 *
 */

public class PostManagerProxy extends PostManager {
	
	/** Represents the logger field */
	private static Log logger = LogFactory.getLog(PostManagerProxy.class);
	
	@Resource
	protected ManagerFactory managerFactory;

	/**
	 * @see com.superwebsitebuilder.websitelevel.manager.PostManagerIfc#getOnePostPageMainContents(com.superwebsitebuilder.websitelevel.data.websitefunction.FrontEndData)
	 *
	 */
	@Override
	public PostData getOnePostPageMainContents(FrontEndData feData) throws Exception {
		logger.debug("PostManagerProxy --> getOnePostPageMainContents()");
		
		PostManager postManager = null;
		PostData postData = null;
		
		// TODO: need loop for each type post manager
		
		postManager = (PostManager)managerFactory.getInstanceOfPostType("CN");
		
		if (Utils.checkNotNull(postManager)) {
			postData = postManager.getOnePostPageMainContents(feData);
		}

		return postData;
	}
	
	/**
	 * @see com.superwebsitebuilder.websitelevel.manager.PostManagerIfc#getOnePostPageMainContentsFromES(com.superwebsitebuilder.websitelevel.data.websitefunction.FrontEndData)
	 *
	 */
	@Override
	public PostData getOnePostPageMainContentsFromES(FrontEndData feData) throws Exception {
		logger.debug("PostManagerProxy --> getOnePostPageMainContentsFromES()");
		
		PostManager postManager = null;
		PostData postData = null;
		
		// TODO: need loop for each type post manager
		
		postManager = (PostManager)managerFactory.getInstanceOfPostType("CN");
		
		if (Utils.checkNotNull(postManager)) {
			postData = postManager.getOnePostPageMainContentsFromES(feData);
		}

		return postData;
	}

	/**
	 * @see com.superwebsitebuilder.websitelevel.manager.PostManagerIfc#getOneArticlePageMainContents(com.superwebsitebuilder.websitelevel.data.websitefunction.FrontEndData)
	 *
	 */
	@Override
	public List<PostData> getOneArticlePageMainContents(FrontEndData feData) throws Exception {
		logger.debug("PostManagerProxy --> getOneArticlePageMainContents()");
		
		PostManager postManager = null;
		List<PostData> postList = null;
		
		// TODO: need loop for each type post manager
		
		postManager = (PostManager)managerFactory.getInstanceOfPostType("CN");
		
		if (Utils.checkNotNull(postManager)) {
			postList = postManager.getOneArticlePageMainContents(feData);
		}

		return postList;
	}

	/**
	 * @see com.superwebsitebuilder.websitelevel.manager.PostManagerIfc#getSearchPageMainContents(com.superwebsitebuilder.websitelevel.data.websitefunction.FrontEndData)
	 *
	 */
	@Override
	public List<PostData> getSearchPageMainContents(FrontEndData feData) throws Exception {
		logger.debug("PostManagerProxy --> getSearchPageMainContents()");
		
		PostManager postManager = null;
		List<PostData> postList = null;
		
		postManager = (PostManager)managerFactory.getInstanceOfPostType("CN");
		
		if (Utils.checkNotNull(postManager)) {
			postList = postManager.getSearchPageMainContents(feData);
		}

		return postList;
	}

}
