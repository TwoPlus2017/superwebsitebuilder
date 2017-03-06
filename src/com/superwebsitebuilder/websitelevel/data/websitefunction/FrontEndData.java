/**
 * Copyright (C) 2016 - 2017 YG Studio. All rights reserved.
 * Filename:  FrontEndData.java
 * Purpose:   Data transfer object of 'FrontEnd' function.
 * Classes:   FrontEndData
 */
package com.superwebsitebuilder.websitelevel.data.websitefunction;

import java.util.List;

import com.superwebsitebuilder.espider.constant.Constants;
import com.superwebsitebuilder.websitelevel.data.businesslogic.ArticleData;
import com.superwebsitebuilder.websitelevel.data.businesslogic.PostData;

/**
 * Data transfer object of 'FrontEnd' function. <BR>
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
 * @author Gavin.Zhang - YG Studio
 *
 * @version 01.00.00
 *
 */

public class FrontEndData {
	
	/** Represents the keyWord field */
	private String keyWord;
	
	/** Represents the showName field */
	private String kwShowName;
	
	/** Represents the webSiteName field */
	private String webSiteName;
	
	/** Represents the webSiteShowName field */
	private String webSiteShowName;
	
	/** Represents the returnDirect field */
	private String returnDirect;
	
	/** Represents the returnPage field */
	private String returnPage;
	
	/** Represents the osDomainUrl field */
	private String osDomainUrl;
	
	/** Represents the keyWordTableName field */
	private String keyWordTableName;
	
	/** Represents the postTableName field */
	private String postTableName;
	
	/** Represents the commentsTableName field */
	private String commentsTableName;
	
	/** Represents the catTableName field */
	private String catTableName;
	
	/** Represents the queryType field */
	private String queryType;
	//^|------------------------------------------------ WebSite Level ---------------------------------------------------^|
	
	// ------------------------------------------------ Index Page Level ------------------------------------------------
	
	/** Represents the catPageNum field */
	private String catPageNum;
	
	/** Represents the catUrl field */
	private String catUrl;
	//^| ------------------------------------------------ Cat Page Level --------------------------------------------------^|
	
	/** Represents the articleUrl field */
	private String articleUrl;
	
	/** Represents the articleLastUpdateTime field */
	private String articleLastUpdateTime;
	
	/** Represents the searchKeyWordUrl field */
	private String searchKeyWordUrl;
	
	/** Represents the relatedArticleList field */
	private List<ArticleData> relatedArticleList;
	//^| ------------------------------------------------ Article Page Level ----------------------------------------------^|
	
	/** Represents the postId field */
	private String postId;
	
	/** Represents the postSelfUrl field */
	private String postSelfUrl;
	
	/** Represents the postLastUpdateTime field */
	private String postLastUpdateTime;
	
	/** Represents the postData field */
	private PostData postData;
	
	/** Represents the postList field */
	private List<PostData> postList;
	//^| ------------------------------------------------ Post Page Level -------------------------------------------------^|
	
	/** Represents the searchKeyWord field */
	private String searchKeyWord;
	//^| ------------------------------------------------ Search Page Level -----------------------------------------------^|
	
	/** Represents the webSiteData field */
	private WebSiteData webSiteData;
	//^| ------------------------------------------------ Common Data -----------------------------------------------------^|
	
	/**
	* Creates a new FrontEndData object.
	*/
	public FrontEndData() {
		webSiteShowName = Constants.EMPTY_STRING;
		returnDirect = Constants.EMPTY_STRING;
		returnPage = Constants.EMPTY_STRING;
		osDomainUrl = Constants.EMPTY_STRING;
		articleUrl = Constants.EMPTY_STRING;
		keyWordTableName = Constants.EMPTY_STRING;
		postTableName = Constants.EMPTY_STRING;
		commentsTableName = Constants.EMPTY_STRING;
		catTableName = Constants.EMPTY_STRING;
		postId = Constants.EMPTY_STRING;
		postSelfUrl = Constants.EMPTY_STRING;
		catPageNum = Constants.EMPTY_STRING;
		catUrl = Constants.EMPTY_STRING;
		searchKeyWord = Constants.EMPTY_STRING;
		queryType = Constants.EMPTY_STRING;
		webSiteData = null;
		keyWord = Constants.EMPTY_STRING;
		searchKeyWordUrl = Constants.EMPTY_STRING;
		webSiteName = Constants.EMPTY_STRING;
		articleLastUpdateTime = Constants.EMPTY_STRING;
		postLastUpdateTime = Constants.EMPTY_STRING;
		relatedArticleList = null;
		postData = null;
		postList = null;
		kwShowName = Constants.EMPTY_STRING;
	}
	
	/**
	 * Getter for the property searchKeyWordUrl.
	 * 
	 * @return The value for the searchKeyWordUrl.
	 */
	public String getSearchKeyWordUrl() {
		return searchKeyWordUrl;
	}

	/**
	 * Setter for property searchKeyWordUrl.
	 *
	 * @param searchKeyWordUrl new value of property searchKeyWordUrl.
	 */
	public void setSearchKeyWordUrl(String searchKeyWordUrl) {
		this.searchKeyWordUrl = searchKeyWordUrl;
	}

	/**
	 * Getter for the property kwShowName.
	 * 
	 * @return The value for the kwShowName.
	 */
	public String getKwShowName() {
		return kwShowName;
	}

	/**
	 * Setter for property kwShowName.
	 *
	 * @param kwShowName new value of property kwShowName.
	 */
	public void setKwShowName(String kwShowName) {
		this.kwShowName = kwShowName;
	}

	/**
	 * Getter for the property relatedArticleList.
	 * 
	 * @return The value for the relatedArticleList.
	 */
	public List<ArticleData> getRelatedArticleList() {
		return relatedArticleList;
	}

	/**
	 * Setter for property relatedArticleList.
	 *
	 * @param relatedArticleList new value of property relatedArticleList.
	 */
	public void setRelatedArticleList(List<ArticleData> relatedArticleList) {
		this.relatedArticleList = relatedArticleList;
	}

	/**
	 * Getter for the property postData.
	 * 
	 * @return The value for the postData.
	 */
	public PostData getPostData() {
		return postData;
	}

	/**
	 * Setter for property postData.
	 *
	 * @param postData new value of property postData.
	 */
	public void setPostData(PostData postData) {
		this.postData = postData;
	}

	/**
	 * Getter for the property postList.
	 * 
	 * @return The value for the postList.
	 */
	public List<PostData> getPostList() {
		return postList;
	}

	/**
	 * Setter for property postList.
	 *
	 * @param postList new value of property postList.
	 */
	public void setPostList(List<PostData> postList) {
		this.postList = postList;
	}

	/**
	 * Getter for the property postLastUpdateTime.
	 * 
	 * @return The value for the postLastUpdateTime.
	 */
	public String getPostLastUpdateTime() {
		return postLastUpdateTime;
	}

	/**
	 * Setter for property postLastUpdateTime.
	 *
	 * @param postLastUpdateTime new value of property postLastUpdateTime.
	 */
	public void setPostLastUpdateTime(String postLastUpdateTime) {
		this.postLastUpdateTime = postLastUpdateTime;
	}

	/**
	 * Getter for the property postSelfUrl.
	 * 
	 * @return The value for the postSelfUrl.
	 */
	public String getPostSelfUrl() {
		return postSelfUrl;
	}

	/**
	 * Setter for property postSelfUrl.
	 *
	 * @param postSelfUrl new value of property postSelfUrl.
	 */
	public void setPostSelfUrl(String postSelfUrl) {
		this.postSelfUrl = postSelfUrl;
	}

	/**
	 * Getter for the property articleLastUpdateTime.
	 * 
	 * @return The value for the articleLastUpdateTime.
	 */
	public String getArticleLastUpdateTime() {
		return articleLastUpdateTime;
	}


	/**
	 * Setter for property articleLastUpdateTime.
	 *
	 * @param articleLastUpdateTime new value of property articleLastUpdateTime.
	 */
	public void setArticleLastUpdateTime(String articleLastUpdateTime) {
		this.articleLastUpdateTime = articleLastUpdateTime;
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
	 * Getter for the property webSiteName.
	 * 
	 * @return The value for the webSiteName.
	 */
	public String getWebSiteName() {
		return webSiteName;
	}

	/**
	 * Setter for property webSiteName.
	 *
	 * @param webSiteName new value of property webSiteName.
	 */
	public void setWebSiteName(String webSiteName) {
		this.webSiteName = webSiteName;
	}

	/**
	 * Getter for the property webSiteShowName.
	 * 
	 * @return The value for the webSiteShowName.
	 */
	public String getWebSiteShowName() {
		return webSiteShowName;
	}

	/**
	 * Setter for property webSiteShowName.
	 *
	 * @param webSiteShowName new value of property webSiteShowName.
	 */
	public void setWebSiteShowName(String webSiteShowName) {
		this.webSiteShowName = webSiteShowName;
	}

	/**
	 * Getter for the property returnDirect.
	 * 
	 * @return The value for the returnDirect.
	 */
	public String getReturnDirect() {
		return returnDirect;
	}

	/**
	 * Setter for property returnDirect.
	 *
	 * @param returnDirect new value of property returnDirect.
	 */
	public void setReturnDirect(String returnDirect) {
		this.returnDirect = returnDirect;
	}

	/**
	 * Getter for the property returnPage.
	 * 
	 * @return The value for the returnPage.
	 */
	public String getReturnPage() {
		return returnPage;
	}

	/**
	 * Setter for property returnPage.
	 *
	 * @param returnPage new value of property returnPage.
	 */
	public void setReturnPage(String returnPage) {
		this.returnPage = returnPage;
	}

	/**
	 * Getter for the property osDomainUrl.
	 * 
	 * @return The value for the osDomainUrl.
	 */
	public String getOsDomainUrl() {
		return osDomainUrl;
	}

	/**
	 * Setter for property osDomainUrl.
	 *
	 * @param osDomainUrl new value of property osDomainUrl.
	 */
	public void setOsDomainUrl(String osDomainUrl) {
		this.osDomainUrl = osDomainUrl;
	}

	/**
	 * Getter for the property keyWordTableName.
	 * 
	 * @return The value for the keyWordTableName.
	 */
	public String getKeyWordTableName() {
		return keyWordTableName;
	}

	/**
	 * Setter for property keyWordTableName.
	 *
	 * @param keyWordTableName new value of property keyWordTableName.
	 */
	public void setKeyWordTableName(String keyWordTableName) {
		this.keyWordTableName = keyWordTableName;
	}

	/**
	 * Getter for the property postTableName.
	 * 
	 * @return The value for the postTableName.
	 */
	public String getPostTableName() {
		return postTableName;
	}

	/**
	 * Setter for property postTableName.
	 *
	 * @param postTableName new value of property postTableName.
	 */
	public void setPostTableName(String postTableName) {
		this.postTableName = postTableName;
	}

	/**
	 * Getter for the property commentsTableName.
	 * 
	 * @return The value for the commentsTableName.
	 */
	public String getCommentsTableName() {
		return commentsTableName;
	}

	/**
	 * Setter for property commentsTableName.
	 *
	 * @param commentsTableName new value of property commentsTableName.
	 */
	public void setCommentsTableName(String commentsTableName) {
		this.commentsTableName = commentsTableName;
	}

	/**
	 * Getter for the property catTableName.
	 * 
	 * @return The value for the catTableName.
	 */
	public String getCatTableName() {
		return catTableName;
	}

	/**
	 * Setter for property catTableName.
	 *
	 * @param catTableName new value of property catTableName.
	 */
	public void setCatTableName(String catTableName) {
		this.catTableName = catTableName;
	}

	/**
	 * Getter for the property queryType.
	 * 
	 * @return The value for the queryType.
	 */
	public String getQueryType() {
		return queryType;
	}

	/**
	 * Setter for property queryType.
	 *
	 * @param queryType new value of property queryType.
	 */
	public void setQueryType(String queryType) {
		this.queryType = queryType;
	}

	/**
	 * Getter for the property catPageNum.
	 * 
	 * @return The value for the catPageNum.
	 */
	public String getCatPageNum() {
		return catPageNum;
	}

	/**
	 * Setter for property catPageNum.
	 *
	 * @param catPageNum new value of property catPageNum.
	 */
	public void setCatPageNum(String catPageNum) {
		this.catPageNum = catPageNum;
	}

	/**
	 * Getter for the property catUrl.
	 * 
	 * @return The value for the catUrl.
	 */
	public String getCatUrl() {
		return catUrl;
	}

	/**
	 * Setter for property catUrl.
	 *
	 * @param catUrl new value of property catUrl.
	 */
	public void setCatUrl(String catUrl) {
		this.catUrl = catUrl;
	}

	/**
	 * Getter for the property articleUrl.
	 * 
	 * @return The value for the articleUrl.
	 */
	public String getArticleUrl() {
		return articleUrl;
	}

	/**
	 * Setter for property articleUrl.
	 *
	 * @param articleUrl new value of property articleUrl.
	 */
	public void setArticleUrl(String articleUrl) {
		this.articleUrl = articleUrl;
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
	 * Getter for the property searchKeyWord.
	 * 
	 * @return The value for the searchKeyWord.
	 */
	public String getSearchKeyWord() {
		return searchKeyWord;
	}

	/**
	 * Setter for property searchKeyWord.
	 *
	 * @param searchKeyWord new value of property searchKeyWord.
	 */
	public void setSearchKeyWord(String searchKeyWord) {
		this.searchKeyWord = searchKeyWord;
	}

	/**
	 * Getter for the property webSiteData.
	 * 
	 * @return The value for the webSiteData.
	 */
	public WebSiteData getWebSiteData() {
		return webSiteData;
	}

	/**
	 * Setter for property webSiteData.
	 *
	 * @param webSiteData new value of property webSiteData.
	 */
	public void setWebSiteData(WebSiteData webSiteData) {
		this.webSiteData = webSiteData;
	}

}
