/**
 * Copyright (C) 2016 - 2017 YG Studio. All rights reserved.
 * Filename:  ElasticSearchData.java
 * Purpose:   Data transfer object of 'ElasticSearch' function.
 * Classes:   ElasticSearchData
 */
package com.superwebsitebuilder.websitelevel.data.websitefunction;

import com.superwebsitebuilder.espider.constant.Constants;

/**
 * Data transfer object of 'ElasticSearch' function. <BR>
 *
 * <PRE>
 *
 * <B>History:</B>
 * Developer            Date                 Change Reason        Change
 * ----------------     ----------------     ----------------     ----------------
 * Gavin.Zhang          Dec 22, 2016         Initial version      0.1
 *
 * </PRE>
 *
 * @author Gavin.Zhang - YG Studio
 *
 * @version 01.00.00
 *
 */

public class ElasticSearchData {
	
	/** Represents the indexName field */
	private String indexName;
	
	/** Represents the typeName field */
	private String typeName;
	
	/**
	* Creates a new ElasticSearchData object.
	*/
	public ElasticSearchData() {
		indexName = Constants.EMPTY_STRING;
		typeName = Constants.EMPTY_STRING;
	}
	
	/**
	* Creates a new ElasticSearchData object.
	*/
	public ElasticSearchData(String index, String type) {
		indexName = index;
		typeName = type;
	}

	/**
	 * Getter for the property indexName.
	 * 
	 * @return The value for the indexName.
	 */
	public String getIndexName() {
		return indexName;
	}

	/**
	 * Setter for property indexName.
	 *
	 * @param indexName new value of property indexName.
	 */
	public void setIndexName(String indexName) {
		this.indexName = indexName;
	}

	/**
	 * Getter for the property typeName.
	 * 
	 * @return The value for the typeName.
	 */
	public String getTypeName() {
		return typeName;
	}

	/**
	 * Setter for property typeName.
	 *
	 * @param typeName new value of property typeName.
	 */
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

}
