/**
 * Copyright (C) 2016 - 2017 YG Studio. All rights reserved.
 * Filename:  DBTransferData.java
 * Purpose:   Data transfer object of 'DBTransfer' function.
 * Classes:   DBTransferData
 */
package com.superwebsitebuilder.websitelevel.data.businesslogic;

import java.util.List;

import com.superwebsitebuilder.espider.constant.Constants;

/**
 * Data transfer object of 'DBTransfer' function. <BR>
 *
 * <PRE>
 *
 * <B>History:</B>
 * Developer            Date                 Change Reason        Change
 * ----------------     ----------------     ----------------     ----------------
 * Gavin.Zhang          Dec 21, 2016         Initial version      0.1
 *
 * </PRE>
 *
 * @author Gavin.Zhang - YG Studio
 *
 * @version 01.00.00
 *
 */

public class DBTransferData {
	
	/** Represents the keyWordUrl field */
	private String keyWordUrl;
	
	/** Represents the postSelfUrl field */
	private String postSelfUrl;
	
	/** Represents the articleTableName field */
	private String articleTableName;
	
	/** Represents the postList field */
	private List<PostData> postList;
	//^|------------------------------------------------------------- Hat Cover Section ----------------------------------------------------^|
	
	/**
	* Creates a new DBTransferData object.
	*/
	public DBTransferData() {
		keyWordUrl = Constants.EMPTY_STRING;
		articleTableName = Constants.EMPTY_STRING;
		postSelfUrl = Constants.EMPTY_STRING;
		postList = null;
	}

	/**
	 * Getter for the property postSelfUrl.
	 * 
	 * @return The value for the postSelfUrl.
	 */
	public String getPostSelfUrl() {
		return postSelfUrl;
	}

	/**
	 * Setter for property postSelfUrl.
	 *
	 * @param postSelfUrl new value of property postSelfUrl.
	 */
	public void setPostSelfUrl(String postSelfUrl) {
		this.postSelfUrl = postSelfUrl;
	}

	/**
	 * Getter for the property postList.
	 * 
	 * @return The value for the postList.
	 */
	public List<PostData> getPostList() {
		return postList;
	}

	/**
	 * Setter for property postList.
	 *
	 * @param postList new value of property postList.
	 */
	public void setPostList(List<PostData> postList) {
		this.postList = postList;
	}

	/**
	 * Getter for the property articleTableName.
	 * 
	 * @return The value for the articleTableName.
	 */
	public String getArticleTableName() {
		return articleTableName;
	}

	/**
	 * Setter for property articleTableName.
	 *
	 * @param articleTableName new value of property articleTableName.
	 */
	public void setArticleTableName(String articleTableName) {
		this.articleTableName = articleTableName;
	}

	/**
	 * Getter for the property keyWordUrl.
	 * 
	 * @return The value for the keyWordUrl.
	 */
	public String getKeyWordUrl() {
		return keyWordUrl;
	}

	/**
	 * Setter for property keyWordUrl.
	 *
	 * @param keyWordUrl new value of property keyWordUrl.
	 */
	public void setKeyWordUrl(String keyWordUrl) {
		this.keyWordUrl = keyWordUrl;
	}

}
