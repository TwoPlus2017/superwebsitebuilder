/**
 * Copyright (C) 2016 - 2017 GB Studio. All rights reserved.
 * Filename:  ArticleData.java
 * Purpose:   Data transfer object of 'Article' function.
 * Classes:   ArticleData
 */
package com.superwebsitebuilder.websitelevel.data.businesslogic;

import com.superwebsitebuilder.espider.constant.Constants;

/**
 * Data transfer object of 'Article' function. <BR>
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

public class ArticleData {
	
	/** Represents the id field */
	private String id;
	
	/** Represents the name field */
	private String name;
	
	/** Represents the title field */
	private String title;
	
	/** Represents the selfUrl field */
	private String selfUrl;
	
	/** Represents the volume field */
	private String volume;
	
	/** Represents the cpc field */
	private String cpc;
	
	/** Represents the competitive field */
	private String competitive;
	
	/** Represents the level field */
	private String level;
	
	/** Represents the keyWord field */
	private String keyWord;
	
	/** Represents the relatedKeyWordsStr field */
	private String relatedKeyWordsStr;
	
	/** Represents the searched field */
	private String searched;
	
	/** Represents the createDate field */
	private String createDate;
	
	/** Represents the createdDate field */
	private String createdDate;
	
	/** Represents the lastUpdateDate field */
	private String lastUpdateDate;
	
	/** Represents the enabled field */
	private String enabled;
	//^|---------------------------------------------------------------- DB Mapping --------------------------------------------------------------^|

	/**
	* Creates a new ArticleData object.
	*/
	public ArticleData() {
		id = Constants.EMPTY_STRING;
		name = Constants.EMPTY_STRING;
		title = Constants.EMPTY_STRING;
		volume = Constants.EMPTY_STRING;
		cpc = Constants.EMPTY_STRING;
		competitive = Constants.EMPTY_STRING;
		level = Constants.EMPTY_STRING;
		keyWord = Constants.EMPTY_STRING;
		relatedKeyWordsStr = Constants.EMPTY_STRING;
		searched = Constants.EMPTY_STRING;
		createdDate = Constants.EMPTY_STRING;
		createDate = Constants.EMPTY_STRING;
		lastUpdateDate = Constants.EMPTY_STRING;
		enabled = Constants.EMPTY_STRING;
		selfUrl = Constants.EMPTY_STRING;
	}

	/**
	 * Getter for the property createDate.
	 * 
	 * @return The value for the createDate.
	 */
	public String getCreateDate() {
		return createDate;
	}

	/**
	 * Setter for property createDate.
	 *
	 * @param createDate new value of property createDate.
	 */
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	/**
	 * Getter for the property name.
	 * 
	 * @return The value for the name.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter for property name.
	 *
	 * @param name new value of property name.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Getter for the property title.
	 * 
	 * @return The value for the title.
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Setter for property title.
	 *
	 * @param title new value of property title.
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Getter for the property volume.
	 * 
	 * @return The value for the volume.
	 */
	public String getVolume() {
		return volume;
	}

	/**
	 * Setter for property volume.
	 *
	 * @param volume new value of property volume.
	 */
	public void setVolume(String volume) {
		this.volume = volume;
	}

	/**
	 * Getter for the property cpc.
	 * 
	 * @return The value for the cpc.
	 */
	public String getCpc() {
		return cpc;
	}

	/**
	 * Setter for property cpc.
	 *
	 * @param cpc new value of property cpc.
	 */
	public void setCpc(String cpc) {
		this.cpc = cpc;
	}

	/**
	 * Getter for the property competitive.
	 * 
	 * @return The value for the competitive.
	 */
	public String getCompetitive() {
		return competitive;
	}

	/**
	 * Setter for property competitive.
	 *
	 * @param competitive new value of property competitive.
	 */
	public void setCompetitive(String competitive) {
		this.competitive = competitive;
	}

	/**
	 * Getter for the property level.
	 * 
	 * @return The value for the level.
	 */
	public String getLevel() {
		return level;
	}

	/**
	 * Setter for property level.
	 *
	 * @param level new value of property level.
	 */
	public void setLevel(String level) {
		this.level = level;
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
	 * Getter for the property selfUrl.
	 * 
	 * @return The value for the selfUrl.
	 */
	public String getSelfUrl() {
		return selfUrl;
	}

	/**
	 * Setter for property selfUrl.
	 *
	 * @param selfUrl new value of property selfUrl.
	 */
	public void setSelfUrl(String selfUrl) {
		this.selfUrl = selfUrl;
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
	 * Getter for the property keyWord.
	 * 
	 * @return The value for the keyWord.
	 */
	public String getKeyWord() {
		return keyWord;
	}

	/**
	 * Setter for property keyWord.
	 *
	 * @param keyWord new value of property keyWord.
	 */
	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
	}

	/**
	 * Getter for the property relatedKeyWordsStr.
	 * 
	 * @return The value for the relatedKeyWordsStr.
	 */
	public String getRelatedKeyWordsStr() {
		return relatedKeyWordsStr;
	}

	/**
	 * Setter for property relatedKeyWordsStr.
	 *
	 * @param relatedKeyWordsStr new value of property relatedKeyWordsStr.
	 */
	public void setRelatedKeyWordsStr(String relatedKeyWordsStr) {
		this.relatedKeyWordsStr = relatedKeyWordsStr;
	}

	/**
	 * Getter for the property searched.
	 * 
	 * @return The value for the searched.
	 */
	public String getSearched() {
		return searched;
	}

	/**
	 * Setter for property searched.
	 *
	 * @param searched new value of property searched.
	 */
	public void setSearched(String searched) {
		this.searched = searched;
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
