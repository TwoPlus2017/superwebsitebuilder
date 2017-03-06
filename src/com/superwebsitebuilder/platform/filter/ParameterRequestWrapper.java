/**
 * Copyright (C) 2016 - 2017 YG Studio. All rights reserved.
 * Filename:  ParameterRequestWrapper.java
 * Purpose:   One wrapper for application's filter. 
 * Classes:   ParameterRequestWrapper
 */
package com.superwebsitebuilder.platform.filter;

import java.util.Enumeration;
import java.util.Map;
import java.util.Vector;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.superwebsitebuilder.espider.constant.Constants;

/**
 * One wrapper for application's filter.  <BR>
 *
 * <PRE>
 *
 * <B>History:</B>
 * Developer            Date                 Change Reason        Change
 * ----------------     ----------------     ----------------     ----------------
 * Gavin.Zhang          Nov 9, 2016          Initial version      0.1
 *
 * </PRE>
 *
 * @author Gavin.Zhang - YG Studio
 *
 * @version 01.00.00
 *
 */
public class ParameterRequestWrapper extends HttpServletRequestWrapper {
	
	/** Represents the logger field */
	private static Log logger = LogFactory.getLog(ParameterRequestWrapper.class);
	
	/** Represents the params field */
	private Map<String, String[]> params;
	
    /**
    * Creates a new ParameterRequestWrapper object.
    */
    public ParameterRequestWrapper(HttpServletRequest request, Map<String, String[]> newParams) {
        super(request);
        
        logger.debug("ParameterRequestWrapper --> ParameterRequestWrapper()");
        
        this.params = newParams;
    }
    
	/**
	 * @see javax.servlet.ServletRequestWrapper#getParameter(java.lang.String)
	 *
	 */
	@Override
	public String getParameter(String name) {
		logger.debug("ParameterRequestWrapper --> getParameter()");
		
		String result = Constants.EMPTY_STRING;
		Object v = params.get(name);
		
		if (v == null) {
			result = null;
		} else if (v instanceof String[]) {
			String[] strArr = (String[]) v;
			if (strArr.length > 0) {
				result =  strArr[0];
			} else {
				result = null;
			}
		} else if (v instanceof String) {
			result = (String) v;
		} else {
			result =  v.toString();
		}
		
		return result;
	}
	
	/**
	 * @see javax.servlet.ServletRequestWrapper#getParameterMap()
	 *
	 */
	@Override
	public Map getParameterMap() {
		logger.debug("ParameterRequestWrapper --> getParameterMap()");
		
		return params;
	}
  
	/**
	 * @see javax.servlet.ServletRequestWrapper#getParameterNames()
	 *
	 */
	@Override
	public Enumeration getParameterNames() {
		logger.debug("ParameterRequestWrapper --> getParameterNames()");
		
		return new Vector(params.keySet()).elements();
	}
	
	/**
	 * @see javax.servlet.ServletRequestWrapper#getParameterValues(java.lang.String)
	 *
	 */
	@Override
	public String[] getParameterValues(String name) {
		logger.debug("ParameterRequestWrapper --> getParameterValues()");
		
		String[] result = null;
		Object v = params.get(name);
		if (v == null) {
			result =  null;
		} else if (v instanceof String[]) {
			result =  (String[]) v;
		} else if (v instanceof String) {
			result =  new String[] { (String) v };
		} else {
			result =  new String[] { v.toString() };
		}
	    
	    return result;
	}
}
