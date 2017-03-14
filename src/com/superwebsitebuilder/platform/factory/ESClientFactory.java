/**
 * Copyright (C) 2016 - 2017 GB Studio. All rights reserved.
 * Filename:  ESTransportClientFactory.java
 * Purpose:   SWSB application object factory of ElasticSearch object.
 * Classes:   ESTransportClientFactory
 */
package com.superwebsitebuilder.platform.factory;

import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.annotation.PreDestroy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.springframework.beans.factory.annotation.Value;

/**
 * SWSB application object factory of ElasticSearch object. <BR>
 * 
 * Scope: 
 * 	ElasticSearch object only
 *
 * <PRE>
 *
 * <B>History:</B>
 * Developer            Date                 Change Reason        Change
 * ----------------     ----------------     ----------------     ----------------
 * Gavin.Zhang          Jan 9, 2017          Initial version      0.1
 *
 * </PRE>
 *
 * @author Gavin.Zhang - GB Studio
 *
 * @version 01.00.00
 *
 */

public class ESClientFactory {
	
	/** Represents the logger field */
	private static Log logger = LogFactory.getLog(ESClientFactory.class);
	
	/** Represents the tsClient field */
	private Client tsClient;
	
	/** Represents the serverIP field */
	@Value("#{esProps[serverIP]}")
	private String serverIP;
	
	/** Represents the serverPort field */
	@Value("#{esProps[serverPort]}")
	private int serverPort;
	
	/**
	 * Init method when this factory created. 
	 *
	 */
	private void init() {
		logger.debug("ESClientFactory --> init()");
		try {
			tsClient = TransportClient.builder().build().addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName(serverIP), serverPort));
		} catch (UnknownHostException e) {
			logger.debug(e.getMessage());
		}
	}
	
	/**
	 * Get ES transection client object instance.  
	 *
	 * @return
	 */
	public Client getTSClientInstance() {
		logger.debug("ESClientFactory --> getTSClientInstance()");
		if (tsClient == null) {
			init();
		}
		return tsClient;
	}
	
	@PreDestroy
	public void destroy() {
		logger.debug("ESClientFactory --> destroy() start");
		try {
			if (tsClient != null) {
				tsClient.close();
			}
		} catch (Exception e) {
			logger.error(e);
		}
		logger.debug("ESClientFactory --> destroy() end");
	}

	/**
	 * @return the serverIP
	 */
	public String getServerIP() {
		return serverIP;
	}

	/**
	 * @param serverIP the serverIP to set
	 */
	public void setServerIP(String serverIP) {
		this.serverIP = serverIP;
	}

	/**
	 * @return the serverPort
	 */
	public int getServerPort() {
		return serverPort;
	}

	/**
	 * @param serverPort the serverPort to set
	 */
	public void setServerPort(int serverPort) {
		this.serverPort = serverPort;
	}
}
