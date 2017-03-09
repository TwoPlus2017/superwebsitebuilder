/**
 * Copyright (C) 2016 - 2017 GB Studio. All rights reserved.
 * Filename:  PostData.java
 * Purpose:   Data transfer object of 'Post' function.
 * Classes:   PostData
 */
package com.superwebsitebuilder.websitelevel.data.businesslogic;

import com.superwebsitebuilder.espider.constant.Constants;

/**
 * Data transfer object of 'Post' function. <BR>
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
 * @author Gavin.Zhang - GB Studio
 *
 * @version 01.00.00
 *
 */

public class PostData {
	
	/** Represents the id field */
	private String id;
	
	/** Represents the enabled field */
	private String enabled;
	//^|-------------------------------------------------------------Common DB Mapping ----------------------------------------------------^|
	
	/** Represents the selfUrl field */
	private String selfUrl;
	
	/** Represents the selfType field */
	private String selfType;
	
	/** Represents the url field */
	private String url;
	
	/** Represents the title field */
	private String title;
	
	/** Represents the description field */
	private String description;
	
	/** Represents the wsLevelScreenShot field */
	private String wsLevelScreenShot;
	
	/** Represents the wsLevelInfo field */
	private String wsLevelInfo;
	
	/** Represents the pageLevelScreenShot field */
	private String pageLevelScreenShot;
	
	/** Represents the pageLevelInfo field */
	private String pageLevelInfo;
	
	/** Represents the createDate field */
	private String createDate;
	//^|------------------------------------------------------------Content DB Mapping ----------------------------------------------------^|
	
	/** Represents the kwId field */
	private String kwId;
	
	/** Represents the kwUrl field */
	private String kwUrl;
	
	/** Represents the postType field */
	private String postType;
	
	/** Represents the postId field */
	private String postId;
	
	/** Represents the postDefaultSelfUrl field */
	private String postDefaultSelfUrl;
	
	/** Represents the field1 field */
	private String field1;
	
	/** Represents the field2 field */
	private String field2;
	
	/** Represents the field3 field */
	private String field3;
	
	/** Represents the field4 field */
	private String field4;
	
	/** Represents the field5 field */
	private String field5;
	
	/** Represents the field6 field */
	private String field6;
	
	/** Represents the createdDate field */
	private String createdDate;
	
	/** Represents the lastUpdateDate field */
	private String lastUpdateDate;
	
	/** Represents the orderNum field */
	private String orderNum;
	
	/** Represents the domainUrl field */
	private String domainUrl;
	
	/**
	* Creates a new PostData object.
	*/
	public PostData() {
		id = Constants.EMPTY_STRING;
		kwId = Constants.EMPTY_STRING;
		kwUrl = Constants.EMPTY_STRING;
		postType = Constants.EMPTY_STRING;
		postId = Constants.EMPTY_STRING;
		postDefaultSelfUrl = Constants.EMPTY_STRING;
		field1 = Constants.EMPTY_STRING;
		field2 = Constants.EMPTY_STRING;
		field3 = Constants.EMPTY_STRING;
		field4 = Constants.EMPTY_STRING;
		field5 = Constants.EMPTY_STRING;
		field6 = Constants.EMPTY_STRING;
		createdDate = Constants.EMPTY_STRING;
		enabled = Constants.EMPTY_STRING;
		selfUrl = Constants.EMPTY_STRING;
		selfType = Constants.EMPTY_STRING;
		url = Constants.EMPTY_STRING;
		title = Constants.EMPTY_STRING;
		description = Constants.EMPTY_STRING;
		wsLevelScreenShot = Constants.EMPTY_STRING;
		wsLevelInfo = Constants.EMPTY_STRING;
		pageLevelScreenShot = Constants.EMPTY_STRING;
		pageLevelInfo = Constants.EMPTY_STRING;
		createDate = Constants.EMPTY_STRING;
		lastUpdateDate = Constants.EMPTY_STRING;
		orderNum = Constants.EMPTY_STRING;
		domainUrl = Constants.EMPTY_STRING;
	}

	/**
	 * Getter for the property domainUrl.
	 * 
	 * @return The value for the domainUrl.
	 */
	public String getDomainUrl() {
		return domainUrl;
	}

	/**
	 * Setter for property domainUrl.
	 *
	 * @param domainUrl new value of property domainUrl.
	 */
	public void setDomainUrl(String domainUrl) {
		this.domainUrl = domainUrl;
	}

	/**
	 * Getter for the property field6.
	 * 
	 * @return The value for the field6.
	 */
	public String getField6() {
		return field6;
	}

	/**
	 * Setter for property field6.
	 *
	 * @param field6 new value of property field6.
	 */
	public void setField6(String field6) {
		this.field6 = field6;
	}

	/**
	 * Getter for the property lastUpdateDate.
	 * 
	 * @return The value for the lastUpdateDate.
	 */
	public String getLastUpdateDate() {
		return lastUpdateDate;
	}

	/**
	 * Setter for property lastUpdateDate.
	 *
	 * @param lastUpdateDate new value of property lastUpdateDate.
	 */
	public void setLastUpdateDate(String lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	/**
	 * Getter for the property orderNum.
	 * 
	 * @return The value for the orderNum.
	 */
	public String getOrderNum() {
		return orderNum;
	}

	/**
	 * Setter for property orderNum.
	 *
	 * @param orderNum new value of property orderNum.
	 */
	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}

	public String getSelfUrl() {
		return selfUrl;
	}

	public void setSelfUrl(String selfUrl) {
		this.selfUrl = selfUrl;
	}

	public String getSelfType() {
		return selfType;
	}

	public void setSelfType(String selfType) {
		this.selfType = selfType;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getWsLevelScreenShot() {
		return wsLevelScreenShot;
	}

	public void setWsLevelScreenShot(String wsLevelScreenShot) {
		this.wsLevelScreenShot = wsLevelScreenShot;
	}

	public String getWsLevelInfo() {
		return wsLevelInfo;
	}

	public void setWsLevelInfo(String wsLevelInfo) {
		this.wsLevelInfo = wsLevelInfo;
	}

	public String getPageLevelScreenShot() {
		return pageLevelScreenShot;
	}

	public void setPageLevelScreenShot(String pageLevelScreenShot) {
		this.pageLevelScreenShot = pageLevelScreenShot;
	}

	public String getPageLevelInfo() {
		return pageLevelInfo;
	}

	public void setPageLevelInfo(String pageLevelInfo) {
		this.pageLevelInfo = pageLevelInfo;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	/**
	 * Getter for the property id.
	 * 
	 * @return The value for the id.
	 */
	public String getId() {
		return id;
	}

	/**
	 * Setter for property id.
	 *
	 * @param id new value of property id.
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Getter for the property kwId.
	 * 
	 * @return The value for the kwId.
	 */
	public String getKwId() {
		return kwId;
	}

	/**
	 * Setter for property kwId.
	 *
	 * @param kwId new value of property kwId.
	 */
	public void setKwId(String kwId) {
		this.kwId = kwId;
	}

	/**
	 * Getter for the property kwUrl.
	 * 
	 * @return The value for the kwUrl.
	 */
	public String getKwUrl() {
		return kwUrl;
	}

	/**
	 * Setter for property kwUrl.
	 *
	 * @param kwUrl new value of property kwUrl.
	 */
	public void setKwUrl(String kwUrl) {
		this.kwUrl = kwUrl;
	}

	/**
	 * Getter for the property postType.
	 * 
	 * @return The value for the postType.
	 */
	public String getPostType() {
		return postType;
	}

	/**
	 * Setter for property postType.
	 *
	 * @param postType new value of property postType.
	 */
	public void setPostType(String postType) {
		this.postType = postType;
	}

	/**
	 * Getter for the property postId.
	 * 
	 * @return The value for the postId.
	 */
	public String getPostId() {
		return postId;
	}

	/**
	 * Setter for property postId.
	 *
	 * @param postId new value of property postId.
	 */
	public void setPostId(String postId) {
		this.postId = postId;
	}

	/**
	 * Getter for the property postDefaultSelfUrl.
	 * 
	 * @return The value for the postDefaultSelfUrl.
	 */
	public String getPostDefaultSelfUrl() {
		return postDefaultSelfUrl;
	}

	/**
	 * Setter for property postDefaultSelfUrl.
	 *
	 * @param postDefaultSelfUrl new value of property postDefaultSelfUrl.
	 */
	public void setPostDefaultSelfUrl(String postDefaultSelfUrl) {
		this.postDefaultSelfUrl = postDefaultSelfUrl;
	}

	/**
	 * Getter for the property field1.
	 * 
	 * @return The value for the field1.
	 */
	public String getField1() {
		return field1;
	}

	/**
	 * Setter for property field1.
	 *
	 * @param field1 new value of property field1.
	 */
	public void setField1(String field1) {
		this.field1 = field1;
	}

	/**
	 * Getter for the property field2.
	 * 
	 * @return The value for the field2.
	 */
	public String getField2() {
		return field2;
	}

	/**
	 * Setter for property field2.
	 *
	 * @param field2 new value of property field2.
	 */
	public void setField2(String field2) {
		this.field2 = field2;
	}

	/**
	 * Getter for the property field3.
	 * 
	 * @return The value for the field3.
	 */
	public String getField3() {
		return field3;
	}

	/**
	 * Setter for property field3.
	 *
	 * @param field3 new value of property field3.
	 */
	public void setField3(String field3) {
		this.field3 = field3;
	}

	/**
	 * Getter for the property field4.
	 * 
	 * @return The value for the field4.
	 */
	public String getField4() {
		return field4;
	}

	/**
	 * Setter for property field4.
	 *
	 * @param field4 new value of property field4.
	 */
	public void setField4(String field4) {
		this.field4 = field4;
	}

	/**
	 * Getter for the property field5.
	 * 
	 * @return The value for the field5.
	 */
	public String getField5() {
		return field5;
	}

	/**
	 * Setter for property field5.
	 *
	 * @param field5 new value of property field5.
	 */
	public void setField5(String field5) {
		this.field5 = field5;
	}

	/**
	 * Getter for the property createdDate.
	 * 
	 * @return The value for the createdDate.
	 */
	public String getCreatedDate() {
		return createdDate;
	}

	/**
	 * Setter for property createdDate.
	 *
	 * @param createdDate new value of property createdDate.
	 */
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	/**
	 * Getter for the property enabled.
	 * 
	 * @return The value for the enabled.
	 */
	public String getEnabled() {
		return enabled;
	}

	/**
	 * Setter for property enabled.
	 *
	 * @param enabled new value of property enabled.
	 */
	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}
	
}
