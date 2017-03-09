/**
 * Copyright (C) 2016 - 2017 GB Studio. All rights reserved.
 * Filename:  HatCoverSiteEntaryFilter.java
 * Purpose:   'Hat Cover' business type filter.
 * Classes:   HatCoverSiteEntaryFilter
 */
package com.superwebsitebuilder.platform.filter;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.filter.OncePerRequestFilter;

import com.superwebsitebuilder.espider.constant.Constants;
import com.superwebsitebuilder.espider.constant.WebSiteLevelConstants;
import com.superwebsitebuilder.espider.util.Utils;


/**
 * 'Hat Cover' business type filter. <BR>
 *
 * <PRE>
 *
 * <B>History:</B>
 * Developer            Date                 Change Reason        Change
 * ----------------     ----------------     ----------------     ----------------
 * Gavin.Zhang          Nov 8, 2016          Initial version      0.1
 *
 * </PRE>
 *
 * @author Gavin.Zhang - GB Studio
 *
 * @version 01.00.00
 *
 */
public class HatCoverSiteEntaryFilter extends OncePerRequestFilter {
	
	/** Represents the logger field */
	private static Log logger = LogFactory.getLog(HatCoverSiteEntaryFilter.class);
	
	/** Represents the character field */
	private String character = null;
	
	/** Represents the forwardPath field */
	private String forwardPath = null;

	/**
	 * Set the characters. 
	 *
	 * @param character
	 */
	public void setcharacter(String character) {
		logger.debug("HatCoverSiteEntaryFilter --> setcharacter()");
		
		this.character = character;
	}

	/**
	 * Set the forward path.  
	 *
	 * @param forwardPath
	 */
	public void setForwardPath(String forwardPath) {
		logger.debug("HatCoverSiteEntaryFilter --> setForwardPath()");
		
		this.forwardPath = forwardPath;
	}

	/**
	 * @see org.springframework.web.filter.OncePerRequestFilter#doFilterInternal(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, javax.servlet.FilterChain)
	 *
	 */
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
		logger.debug("HatCoverSiteEntaryFilter --> doFilterInternal()");
		
		String webSiteName = request.getParameter("webSite");
		String keyWord = Utils.onlyAllowCharacter(character, request.getParameter("keyWord")).replace("-", " ");
		String queryType = request.getParameter("queryType");
		String returnDirect = Constants.NO;
		
		if (WebSiteLevelConstants.KEY_WORD_QUERY.equals(queryType)) {
			if (!Utils.isKeyWord(keyWord)) {
				returnDirect = Constants.YES;
			} else if(Utils.hasSensitiveWords(keyWord)) {
				returnDirect = Constants.YES;
			}
		}
		
		Map<String,String[]> map = new HashMap<String,String[]>(request.getParameterMap());
		
		map.put("keyWord", new String[]{request.getParameter("keyWord")});
		map.put("webSiteShowName", new String[]{webSiteName});
		map.put("osDomainUrl", new String[]{Constants.DOMAIN_PREFIX_NAME + webSiteName + Constants.DOMAIN_SUFFIX_NAME_COM});
		map.put("returnPage", new String[]{WebSiteLevelConstants.HATCOVER_404_PAGE});
		map.put("returnDirect", new String[]{returnDirect});
		
		request = new ParameterRequestWrapper(request, map);
		
		filterChain.doFilter(request, response);
	}
}
