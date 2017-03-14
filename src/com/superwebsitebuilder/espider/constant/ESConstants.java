/**
 * Copyright (C) 2016 - 2017 GB Studio. All rights reserved.
 * Filename:  ESConstants.java
 * Purpose:   ElasticSearch constants of SWSB application.
 * Classes:   ESConstants
 */
package com.superwebsitebuilder.espider.constant;

/**
 * ElasticSearch constants of SWSB application. <BR>
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
 * @author Gavin.Zhang - GB Studio
 *
 * @version 01.00.00
 *
 */

public class ESConstants {
	
	/** Represents the ServerIP field */
	//public static final String ServerIP = "127.0.0.1"; // ElasticSearch server IP
	public static final String ServerIP = "9.119.102.76"; // ElasticSearch server IP
	
	/** Represents the ServerPort field */
	public static final int ServerPort = 9300; // port
	
	/** Represents the INDEX_NAME_SWSB field */
	public static final String INDEX_NAME_SWSB = "swsb";
	
	/** Represents the TYPE_NAME_KEYWORD field */
	public static final String TYPE_NAME_KEYWORD = "keyword";
	
	/** Represents the TYPE_NAME_CONTENT field */
	public static final String TYPE_NAME_CONTENT = "content";
	
	/** Represents the TYPE_NAME_COMPANY field */
	public static final String TYPE_NAME_COMPANY = "company";
	
	/** Represents the TYPE_NAME_PERSONA_NAME field */
	public static final String TYPE_NAME_PERSONA_NAME = "personalname";
	
	/** Represents the TYPE_NAME_PICTURE field */
	public static final String TYPE_NAME_PICTURE = "picture";
	
	/** Represents the TYPE_NAME_PRODUCT field */
	public static final String TYPE_NAME_PRODUCT = "product";
	
	/** Represents the TYPE_NAME_NEWS field */
	public static final String TYPE_NAME_NEWS = "news";
	
	/** Represents the TYPE_NAME_TREND field */
	public static final String TYPE_NAME_TREND = "trend";
	
	/** Represents the TYPE_NAME_TOPIC field */
	public static final String TYPE_NAME_TOPIC = "topic";
	
	/** Represents the TYPE_NAME_CAT field */
	public static final String TYPE_NAME_CAT = "cat";
	
	/** Represents the TYPE_NAME_TRANSLATION field */
	public static final String TYPE_NAME_TRANSLATION = "translation";
	
	/** Represents the TYPE_NAME_QUESTION field */
	public static final String TYPE_NAME_QUESTION = "question";
	
	/** Represents the TYPE_NAME_ANSWER field */
	public static final String TYPE_NAME_ANSWER = "answer";
	
	/** Represents the COUNTER_100 field */
	public static final int COUNTER_100 = 100;

}
