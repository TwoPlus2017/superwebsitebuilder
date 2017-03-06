/**
 * Copyright (C) 2016 - 2017 YG Studio. All rights reserved.
 * Filename:  PostManager.java
 * Purpose:   Post Manager implement to implement the post page business functions.
 * Classes:   PostManager
 */
package com.superwebsitebuilder.websitelevel.manager.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.superwebsitebuilder.applicationLevel.manager.impl.Manager;
import com.superwebsitebuilder.espider.constant.Constants;
import com.superwebsitebuilder.espider.constant.WebSiteLevelConstants;
import com.superwebsitebuilder.espider.util.Utils;
import com.superwebsitebuilder.websitelevel.data.businesslogic.PostData;
import com.superwebsitebuilder.websitelevel.manager.PostManagerIfc;

/**
 * Post Manager implement to implement the post page business functions. <BR>
 * 
 * 'ContentPostManager' or other 'xxxPostManager' will implements the detail business functions. <BR>
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
 * @author Gavin.Zhang - YG Studio
 *
 * @version 01.00.00
 *
 */

public abstract class PostManager extends Manager implements PostManagerIfc {
	
	/** Represents the logger field */
	private static Log logger = LogFactory.getLog(PostManager.class);

	/**
	 * To proved the order number to display base on DB(cache or DB) data.  
	 *
	 * @param postList
	 */
	protected void setPostOrderNum(List<PostData> postList) {
		logger.debug("PostManager --> setPostOrderNum()");
		
		if (Utils.checkNotNull(postList)) {
			for (int i = 0; i < postList.size(); i++) {
				if (i < 9) {
					postList.get(i).setOrderNum(Constants.ZERO + String.valueOf(i + 1));
				} else {
					postList.get(i).setOrderNum(String.valueOf(i + 1));
				}
			}
		}
	}
	
	/**
	 * To format the ES data's URL to display. 
	 *
	 * @param postList
	 */
	protected void setESDataSelfUrl(List<PostData> postList) {
		logger.debug("PostManager --> setESDataSelfUrl()");
		
		for (int i = 0; i < postList.size(); i++) {
			// for 'content' post
			if (postList.get(i).getSelfType().equalsIgnoreCase(WebSiteLevelConstants.TYPE_NAME_CONTENT)) {
				postList.get(i).setSelfUrl(postList.get(i).getSelfUrl() + WebSiteLevelConstants.CONTENT_QUERY_URL);
			}
		}
	}
	
	/**
	 * To format the data's looking to display. 
	 *
	 * @param postList
	 */
	protected void formatPostList(List<PostData> postList) {
		logger.debug("PostManager --> formatPostList()");
		
		// 1. order number
		setPostOrderNum(postList);
	}

}
