/**
 * Copyright (C) 2016 - 2017 GB Studio. All rights reserved.
 * Filename:  BasicDirectlyCoverController.java
 * Purpose:   This controller is used for 'Basic Directly Cover' of business type.
 * Classes:   BasicDirectlyCoverController
 */
package com.superwebsitebuilder.hatcover.controller;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.superwebsitebuilder.espider.constant.MVCConstants;
import com.superwebsitebuilder.espider.constant.WebSiteLevelConstants;
import com.superwebsitebuilder.hatcover.service.BasicDirectlyCoverSvcIfc;
import com.superwebsitebuilder.websitelevel.data.websitefunction.FrontEndData;

/**
 * This controller is used for 'Basic Directly Cover' of business type. <BR>
 * 
 * 'Basic Directly Cover' means: To directly display the web page data of eSpider gathered. <BR>
 *
 * <PRE>
 *
 * <B>History:</B>
 * Developer            Date                 Change Reason        Change
 * ----------------     ----------------     ----------------     ----------------
 * Gavin.Zhang          Nov 11, 2016         Initial version      0.1
 *
 * </PRE>
 *
 * @author Gavin.Zhang - GB Studio
 *
 * @version 01.00.00
 *
 */

@Controller
@RequestMapping(MVCConstants.URL_HATCOVER + MVCConstants.SLASH + MVCConstants.URL_BASIC_COVER)
public class BasicDirectlyCoverController {
	
	/** Represents the logger field */
	private static Log logger = LogFactory.getLog(BasicDirectlyCoverController.class);
	@Resource
	BasicDirectlyCoverSvcIfc basicDirectlyCoverSvc;
	
	/**
	 * To display web site home page.
	 *
	 * @param feData
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value=MVCConstants.URL_SHOW_INDEX, method=RequestMethod.GET)
    public String getIndexPage(@ModelAttribute("feData")FrontEndData feData) throws Exception {
		logger.debug(MVCConstants.URL_HATCOVER + MVCConstants.SLASH + MVCConstants.URL_BASIC_COVER + MVCConstants.SLASH + MVCConstants.URL_SHOW_INDEX);
		
		if (WebSiteLevelConstants.INDEX_PAGE_QUERY.equals(feData.getQueryType())) {
			basicDirectlyCoverSvc.getIndex(feData);
		}
		
        return MVCConstants.PAGE_HATCOVER_ROOT + feData.getReturnPage();
    }
	
	/**
	 * To display web site article page.
	 *
	 * @param feData
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value=MVCConstants.URL_SHOW_ARTICLE, method=RequestMethod.GET)
    public String getArticlePage(@ModelAttribute("feData")FrontEndData feData) throws Exception {
		logger.debug(MVCConstants.URL_HATCOVER + MVCConstants.SLASH + MVCConstants.URL_BASIC_COVER + MVCConstants.SLASH + MVCConstants.URL_SHOW_ARTICLE);
		
		if (WebSiteLevelConstants.KEY_WORD_QUERY.equals(feData.getQueryType())) {
			basicDirectlyCoverSvc.getOneArticle(feData);
		}
		
		return MVCConstants.PAGE_HATCOVER_ROOT + feData.getReturnPage();
    }
	
	/**
	 * To display web site post page.
	 *
	 * @param feData
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value=MVCConstants.URL_SHOW_POST, method=RequestMethod.GET)
    public String getPostPage(@ModelAttribute("feData")FrontEndData feData) throws Exception {
		logger.debug(MVCConstants.URL_HATCOVER + MVCConstants.SLASH + MVCConstants.URL_BASIC_COVER + MVCConstants.SLASH + MVCConstants.URL_SHOW_POST);
		
		if (WebSiteLevelConstants.CONTENT_QUERY.equals(feData.getQueryType())) {
			basicDirectlyCoverSvc.getOnePost(feData);
		}
		
		return MVCConstants.PAGE_HATCOVER_ROOT + feData.getReturnPage();
    }
	
	/**
	 * To display web site search page. 
	 *
	 * @param feData
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value=MVCConstants.URL_SHOW_SEARCH, method=RequestMethod.GET)
    public String getSearchResult(@ModelAttribute("feData")FrontEndData feData) throws Exception {
		logger.debug(MVCConstants.URL_HATCOVER + MVCConstants.SLASH + MVCConstants.URL_BASIC_COVER + MVCConstants.SLASH + MVCConstants.URL_SHOW_SEARCH);
		
		if (WebSiteLevelConstants.SEARCH_QUERY.equals(feData.getQueryType())) {
			basicDirectlyCoverSvc.getArticleSearchResult(feData);
		}
		
		return MVCConstants.PAGE_HATCOVER_ROOT + feData.getReturnPage();
    }

}
