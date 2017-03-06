/**
 * Copyright (C) 2016 - 2017 YG Studio. All rights reserved.
 * Filename:  SensitiveWordData.java
 * Purpose:   Data transfer object of 'SensitiveWord' function.
 * Classes:   SensitiveWordData
 */
package com.superwebsitebuilder.applicationLevel.data.websitefunction;

import com.superwebsitebuilder.espider.constant.Constants;

/**
 * Data transfer object of 'SensitiveWord' function. <BR>
 *
 * <PRE>
 *
 * <B>History:</B>
 * Developer            Date                 Change Reason        Change
 * ----------------     ----------------     ----------------     ----------------
 * Gavin.Zhang          Jan 16, 2017         Initial version      0.1
 *
 * </PRE>
 *
 * @author Gavin.Zhang - YG Studio
 *
 * @version 01.00.00
 *
 */

public class SensitiveWordData {

	/** Represents the id field */
	private String id;
	
	/** Represents the name field */
	private String name;
	
	/** Represents the type field */
	private String type;
	
	/** Represents the createdDate field */
	private String createdDate;
	
	/** Represents the lastUpdateDate field */
	private String lastUpdateDate;
	
	/** Represents the enabled field */
	private String enabled;
	
	/**
	* Creates a new SensitiveWordData object.
	*/
	public SensitiveWordData() {
		id = Constants.EMPTY_STRING;
		name = Constants.EMPTY_STRING;
		type = Constants.EMPTY_STRING;
		createdDate = Constants.EMPTY_STRING;
		lastUpdateDate = Constants.EMPTY_STRING;
		enabled = Constants.EMPTY_STRING;
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
	 * Getter for the property type.
	 * 
	 * @return The value for the type.
	 */
	public String getType() {
		return type;
	}

	/**
	 * Setter for property type.
	 *
	 * @param type new value of property type.
	 */
	public void setType(String type) {
		this.type = type;
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
