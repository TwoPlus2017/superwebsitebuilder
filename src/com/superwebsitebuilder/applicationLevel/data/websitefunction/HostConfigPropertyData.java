/**
 * Copyright (C) 2016 - 2017 GB Studio. All rights reserved.
 * Filename:  HostConfigPropertyData.java
 * Purpose:   Data transfer object of 'Host Config' function.
 * Classes:   HostConfigPropertyData
 */

package com.superwebsitebuilder.applicationLevel.data.websitefunction;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Value;

/**
 * Data transfer object of 'Host Config' function. <BR>
 *
 * <PRE>
 *
 * <B>History:</B>
 * Developer            Date                 Change Reason        Change
 * ----------------     ----------------     ----------------     ----------------
 * Gavin.Zhang          Mar 09, 2017         Initial version      0.1
 *
 * </PRE>
 *
 * @author Gavin.Zhang - GB Studio
 *
 * @version 01.00.00
 *
 */

public class HostConfigPropertyData {
	
	@Value("#{propertiesSetting}")
	private Properties allProps;
	
	/** Represents the hostName field */
	@Value("#{propertiesSetting[host_name]}")
	private String hostName;
	
	/** Represents the hostIP field */
	@Value("#{propertiesSetting[host_ip]}")
	private String hostIP;

	/**
	 * Get property
	 * @param key
	 * @return
	 */
	public String getProperty(String key) {
		return allProps.getProperty(key);
	}
	
	/**
	 * Set property value and return the previous value.
	 * @param key
	 * @param value
	 * @return
	 */
	public Object setProperty(String key, String value) {
        return allProps.setProperty(key, value);
    }
	
	/**
	 * Get property
	 * @param key
	 * @param defaultValue
	 * @return
	 */
	public String getProperty(String key, String defaultValue) {
		return allProps.getProperty(key, defaultValue);
	}
	
	/**
	 * @return the hostName
	 */
	public String getHostName() {
		return hostName;
	}

	/**
	 * @param hostName the hostName to set
	 */
	public void setHostName(String hostName) {
		this.hostName = hostName;
	}

	/**
	 * @return the hostIP
	 */
	public String getHostIP() {
		return hostIP;
	}

	/**
	 * @param hostIP the hostIP to set
	 */
	public void setHostIP(String hostIP) {
		this.hostIP = hostIP;
	}

}
