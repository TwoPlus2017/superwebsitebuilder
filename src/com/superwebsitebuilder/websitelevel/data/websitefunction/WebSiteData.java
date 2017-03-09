/**
 * Copyright (C) 2016 - 2017 GB Studio. All rights reserved.
 * Filename:  WebSiteData.java
 * Purpose:   Data transfer object of 'WebSite' function.
 * Classes:   WebSiteData
 */
package com.superwebsitebuilder.websitelevel.data.websitefunction;

import java.util.List;

import com.superwebsitebuilder.espider.constant.Constants;
import com.superwebsitebuilder.websitelevel.data.businesslogic.ArticleData;
import com.superwebsitebuilder.websitelevel.data.businesslogic.PostData;

/**
 * Data transfer object of 'WebSite' function. <BR>
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
 * @author Gavin.Zhang - GB Studio
 *
 * @version 01.00.00
 *
 */

public class WebSiteData {
	
	/** Represents the id field */
	private String id;
	
	/** Represents the orderNum field */
	private String orderNum;
	
	/** Represents the activate field */
	private String activate;
	
	/** Represents the name field */
	private String name;
	
	/** Represents the showName field */
	private String showName;
	
	/** Represents the code field */
	private String code;
	
	/** Represents the indexTitle field */
	private String indexTitle;
	
	/** Represents the indexTitleSufix field */
	private String indexTitleSufix;
	
	/** Represents the desc field */
	private String desc;
	
	/** Represents the domainName field */
	private String domainName;
	
	/** Represents the relatedArticleNum field */
	private String relatedArticleNum;
	
	/** Represents the contentPostNum field */
	private String contentPostNum;
	
	/** Represents the postLinkTo field */
	private String postLinkTo;
	
	/** Represents the industryId field */
	private String industryId;
	
	/** Represents the needArticleExtends field */
	private String needArticleExtends;
	
	/** Represents the webSiteThemeId field */
	private String webSiteThemeId;
	
	/** Represents the esIndexName field */
	private String esIndexName;
	
	/** Represents the esArticleTypeName field */
	private String esArticleTypeName;
	
	/** Represents the esPostTypeName field */
	private String esPostTypeName;
	
	/** Represents the hasCat field */
	private String hasCat;
	
	/** Represents the localPort field */
	private String localPort;
	
	/** Represents the startYear field */
	private String startYear;
	
	/** Represents the createBy field */
	private String createBy;
	
	/** Represents the createDate field */
	private String createDate;
	
	/** Represents the lastUpdateBy field */
	private String lastUpdateBy;
	
	/** Represents the lastUpdateDate field */
	private String lastUpdateDate;
	
	/** Represents the enabled field */
	private String enabled;
	//^|------------------------------------------------------------- DB Mapping ----------------------------------------------------^|
	
	/** Represents the relatedArticleList field */
	private List<ArticleData> relatedArticleList;
	//^|-------------------------------------------------------- Data Transfer Section ----------------------------------------------^|
	
	/** Represents the tableKeyWordName field */
	private String tableKeyWordName;
	
	/** Represents the tablePostName field */
	private String tablePostName;
	
	/** Represents the tableCommentsName field */
	private String tableCommentsName;
	
	/** Represents the tableCatName field */
	private String tableCatName;
	
	/** Represents the returnToIndexPage field */
	private String returnToIndexPage;
	
	/** Represents the returnToCatPage field */
	private String returnToCatPage;
	
	/** Represents the returnToArticlePage field */
	private String returnToArticlePage;
	
	/** Represents the returnToPostPage field */
	private String returnToPostPage;
	
	/** Represents the returnToSearchResultPage field */
	private String returnToSearchResultPage;
	
	/** Represents the returnToNotFindPage field */
	private String returnToNotFindPage;
	
	/** Represents the domainUrl field */
	private String domainUrl;
	
	/** Represents the indexImage field */
	private String indexImage;
	
	/** Represents the indexCreateDate field */
	private String indexCreateDate;
	
	/** Represents the businessType field */
	private String businessType;
	
	/** Represents the thisYear field */
	private String thisYear;
	
	/** Represents the randomArticlesList field */
	private List<ArticleData> randomWSLevelArticlesList;
	
	/** Represents the randomWSLevelPostList field */
	private List<PostData> randomWSLevelPostList;
	
	/**
	* Creates a new WebSiteData object.
	*/
	public WebSiteData() {
		id = Constants.EMPTY_STRING;
		orderNum = Constants.EMPTY_STRING;
		activate = Constants.EMPTY_STRING;
		name = Constants.EMPTY_STRING;
		code = Constants.EMPTY_STRING;
		indexTitle = Constants.EMPTY_STRING;
		indexTitleSufix = Constants.EMPTY_STRING;
		desc = Constants.EMPTY_STRING;
		domainName = Constants.EMPTY_STRING;
		relatedArticleNum = Constants.EMPTY_STRING;
		industryId = Constants.EMPTY_STRING;
		needArticleExtends = Constants.EMPTY_STRING;
		webSiteThemeId = Constants.EMPTY_STRING;
		esIndexName = Constants.EMPTY_STRING;
		esArticleTypeName = Constants.EMPTY_STRING;
		esPostTypeName = Constants.EMPTY_STRING;
		hasCat = Constants.EMPTY_STRING;
		localPort = Constants.EMPTY_STRING;
		startYear = Constants.EMPTY_STRING;
		createBy = Constants.EMPTY_STRING;
		createDate = Constants.EMPTY_STRING;
		lastUpdateBy = Constants.EMPTY_STRING;
		lastUpdateDate = Constants.EMPTY_STRING;
		enabled = Constants.EMPTY_STRING;
		
		tableKeyWordName = Constants.EMPTY_STRING;
		tablePostName = Constants.EMPTY_STRING;
		tableCommentsName = Constants.EMPTY_STRING;
		tableCatName = Constants.EMPTY_STRING;
		returnToIndexPage = Constants.EMPTY_STRING;
		returnToCatPage = Constants.EMPTY_STRING;
		returnToArticlePage = Constants.EMPTY_STRING;
		returnToPostPage = Constants.EMPTY_STRING;
		returnToNotFindPage = Constants.EMPTY_STRING;
		domainUrl = Constants.EMPTY_STRING;
		indexImage = Constants.EMPTY_STRING;
		indexCreateDate = Constants.EMPTY_STRING;
		businessType = Constants.EMPTY_STRING;
		randomWSLevelArticlesList = null;
		thisYear = Constants.EMPTY_STRING;
		showName = Constants.EMPTY_STRING;
		contentPostNum = Constants.EMPTY_STRING;
		postLinkTo = Constants.EMPTY_STRING;
		relatedArticleList = null;
		randomWSLevelPostList = null;
	}
	
	/**
	 * Getter for the property startYear.
	 * 
	 * @return The value for the startYear.
	 */
	public String getStartYear() {
		return startYear;
	}

	/**
	 * Setter for property startYear.
	 *
	 * @param startYear new value of property startYear.
	 */
	public void setStartYear(String startYear) {
		this.startYear = startYear;
	}

	/**
	 * Getter for the property orderNum.
	 * 
	 * @return The value for the orderNum.
	 */
	public String getOrderNum() {
		return orderNum;
	}

	/**
	 * Setter for property orderNum.
	 *
	 * @param orderNum new value of property orderNum.
	 */
	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}

	/**
	 * Getter for the property randomWSLevelPostList.
	 * 
	 * @return The value for the randomWSLevelPostList.
	 */
	public List<PostData> getRandomWSLevelPostList() {
		return randomWSLevelPostList;
	}

	/**
	 * Setter for property randomWSLevelPostList.
	 *
	 * @param randomWSLevelPostList new value of property randomWSLevelPostList.
	 */
	public void setRandomWSLevelPostList(List<PostData> randomWSLevelPostList) {
		this.randomWSLevelPostList = randomWSLevelPostList;
	}

	/**
	 * Getter for the property indexTitleSufix.
	 * 
	 * @return The value for the indexTitleSufix.
	 */
	public String getIndexTitleSufix() {
		return indexTitleSufix;
	}

	/**
	 * Setter for property indexTitleSufix.
	 *
	 * @param indexTitleSufix new value of property indexTitleSufix.
	 */
	public void setIndexTitleSufix(String indexTitleSufix) {
		this.indexTitleSufix = indexTitleSufix;
	}

	/**
	 * Getter for the property postLinkTo.
	 * 
	 * @return The value for the postLinkTo.
	 */
	public String getPostLinkTo() {
		return postLinkTo;
	}

	/**
	 * Setter for property postLinkTo.
	 *
	 * @param postLinkTo new value of property postLinkTo.
	 */
	public void setPostLinkTo(String postLinkTo) {
		this.postLinkTo = postLinkTo;
	}

	/**
	 * Getter for the property activate.
	 * 
	 * @return The value for the activate.
	 */
	public String getActivate() {
		return activate;
	}

	/**
	 * Setter for property activate.
	 *
	 * @param activate new value of property activate.
	 */
	public void setActivate(String activate) {
		this.activate = activate;
	}

	/**
	 * Getter for the property showName.
	 * 
	 * @return The value for the showName.
	 */
	public String getShowName() {
		return showName;
	}

	/**
	 * Setter for property showName.
	 *
	 * @param showName new value of property showName.
	 */
	public void setShowName(String showName) {
		this.showName = showName;
	}

	/**
	 * Getter for the property contentPostNum.
	 * 
	 * @return The value for the contentPostNum.
	 */
	public String getContentPostNum() {
		return contentPostNum;
	}

	/**
	 * Setter for property contentPostNum.
	 *
	 * @param contentPostNum new value of property contentPostNum.
	 */
	public void setContentPostNum(String contentPostNum) {
		this.contentPostNum = contentPostNum;
	}

	/**
	 * Getter for the property relatedArticleNum.
	 * 
	 * @return The value for the relatedArticleNum.
	 */
	public String getRelatedArticleNum() {
		return relatedArticleNum;
	}

	/**
	 * Setter for property relatedArticleNum.
	 *
	 * @param relatedArticleNum new value of property relatedArticleNum.
	 */
	public void setRelatedArticleNum(String relatedArticleNum) {
		this.relatedArticleNum = relatedArticleNum;
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
	 * Getter for the property indexTitle.
	 * 
	 * @return The value for the indexTitle.
	 */
	public String getIndexTitle() {
		return indexTitle;
	}

	/**
	 * Setter for property indexTitle.
	 *
	 * @param indexTitle new value of property indexTitle.
	 */
	public void setIndexTitle(String indexTitle) {
		this.indexTitle = indexTitle;
	}

	/**
	 * Getter for the property needArticleExtends.
	 * 
	 * @return The value for the needArticleExtends.
	 */
	public String getNeedArticleExtends() {
		return needArticleExtends;
	}

	/**
	 * Setter for property needArticleExtends.
	 *
	 * @param needArticleExtends new value of property needArticleExtends.
	 */
	public void setNeedArticleExtends(String needArticleExtends) {
		this.needArticleExtends = needArticleExtends;
	}

	/**
	 * Getter for the property thisYear.
	 * 
	 * @return The value for the thisYear.
	 */
	public String getThisYear() {
		return thisYear;
	}

	/**
	 * Setter for property thisYear.
	 *
	 * @param thisYear new value of property thisYear.
	 */
	public void setThisYear(String thisYear) {
		this.thisYear = thisYear;
	}

	/**
	 * Getter for the property randomWSLevelArticlesList.
	 * 
	 * @return The value for the randomWSLevelArticlesList.
	 */
	public List<ArticleData> getRandomWSLevelArticlesList() {
		return randomWSLevelArticlesList;
	}

	/**
	 * Setter for property randomWSLevelArticlesList.
	 *
	 * @param randomWSLevelArticlesList new value of property randomWSLevelArticlesList.
	 */
	public void setRandomWSLevelArticlesList(
			List<ArticleData> randomWSLevelArticlesList) {
		this.randomWSLevelArticlesList = randomWSLevelArticlesList;
	}
	
	/**
	 * Getter for the property returnToNotFindPage.
	 * 
	 * @return The value for the returnToNotFindPage.
	 */
	public String getReturnToNotFindPage() {
		return returnToNotFindPage;
	}

	/**
	 * Setter for property returnToNotFindPage.
	 *
	 * @param returnToNotFindPage new value of property returnToNotFindPage.
	 */
	public void setReturnToNotFindPage(String returnToNotFindPage) {
		this.returnToNotFindPage = returnToNotFindPage;
	}

	/**
	 * Getter for the property businessType.
	 * 
	 * @return The value for the businessType.
	 */
	public String getBusinessType() {
		return businessType;
	}

	/**
	 * Setter for property businessType.
	 *
	 * @param businessType new value of property businessType.
	 */
	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}

	/**
	 * Getter for the property returnToIndexPage.
	 * 
	 * @return The value for the returnToIndexPage.
	 */
	public String getReturnToIndexPage() {
		return returnToIndexPage;
	}

	/**
	 * Setter for property returnToIndexPage.
	 *
	 * @param returnToIndexPage new value of property returnToIndexPage.
	 */
	public void setReturnToIndexPage(String returnToIndexPage) {
		this.returnToIndexPage = returnToIndexPage;
	}

	/**
	 * Getter for the property returnToCatPage.
	 * 
	 * @return The value for the returnToCatPage.
	 */
	public String getReturnToCatPage() {
		return returnToCatPage;
	}

	/**
	 * Setter for property returnToCatPage.
	 *
	 * @param returnToCatPage new value of property returnToCatPage.
	 */
	public void setReturnToCatPage(String returnToCatPage) {
		this.returnToCatPage = returnToCatPage;
	}

	/**
	 * Getter for the property returnToArticlePage.
	 * 
	 * @return The value for the returnToArticlePage.
	 */
	public String getReturnToArticlePage() {
		return returnToArticlePage;
	}

	/**
	 * Setter for property returnToArticlePage.
	 *
	 * @param returnToArticlePage new value of property returnToArticlePage.
	 */
	public void setReturnToArticlePage(String returnToArticlePage) {
		this.returnToArticlePage = returnToArticlePage;
	}

	/**
	 * Getter for the property returnToPostPage.
	 * 
	 * @return The value for the returnToPostPage.
	 */
	public String getReturnToPostPage() {
		return returnToPostPage;
	}

	/**
	 * Setter for property returnToPostPage.
	 *
	 * @param returnToPostPage new value of property returnToPostPage.
	 */
	public void setReturnToPostPage(String returnToPostPage) {
		this.returnToPostPage = returnToPostPage;
	}

	/**
	 * Getter for the property returnToSearchResultPage.
	 * 
	 * @return The value for the returnToSearchResultPage.
	 */
	public String getReturnToSearchResultPage() {
		return returnToSearchResultPage;
	}

	/**
	 * Setter for property returnToSearchResultPage.
	 *
	 * @param returnToSearchResultPage new value of property returnToSearchResultPage.
	 */
	public void setReturnToSearchResultPage(String returnToSearchResultPage) {
		this.returnToSearchResultPage = returnToSearchResultPage;
	}

	/**
	 * Getter for the property domainUrl.
	 * 
	 * @return The value for the domainUrl.
	 */
	public String getDomainUrl() {
		return domainUrl;
	}

	/**
	 * Setter for property domainUrl.
	 *
	 * @param domainUrl new value of property domainUrl.
	 */
	public void setDomainUrl(String domainUrl) {
		this.domainUrl = domainUrl;
	}

	/**
	 * Getter for the property indexImage.
	 * 
	 * @return The value for the indexImage.
	 */
	public String getIndexImage() {
		return indexImage;
	}

	/**
	 * Setter for property indexImage.
	 *
	 * @param indexImage new value of property indexImage.
	 */
	public void setIndexImage(String indexImage) {
		this.indexImage = indexImage;
	}

	/**
	 * Getter for the property indexCreateDate.
	 * 
	 * @return The value for the indexCreateDate.
	 */
	public String getIndexCreateDate() {
		return indexCreateDate;
	}

	/**
	 * Setter for property indexCreateDate.
	 *
	 * @param indexCreateDate new value of property indexCreateDate.
	 */
	public void setIndexCreateDate(String indexCreateDate) {
		this.indexCreateDate = indexCreateDate;
	}

	/**
	 * Getter for the property localPort.
	 * 
	 * @return The value for the localPort.
	 */
	public String getLocalPort() {
		return localPort;
	}

	/**
	 * Setter for property localPort.
	 *
	 * @param localPort new value of property localPort.
	 */
	public void setLocalPort(String localPort) {
		this.localPort = localPort;
	}

	/**
	 * Getter for the property tableKeyWordName.
	 * 
	 * @return The value for the tableKeyWordName.
	 */
	public String getTableKeyWordName() {
		return tableKeyWordName;
	}

	/**
	 * Setter for property tableKeyWordName.
	 *
	 * @param tableKeyWordName new value of property tableKeyWordName.
	 */
	public void setTableKeyWordName(String tableKeyWordName) {
		this.tableKeyWordName = tableKeyWordName;
	}

	/**
	 * Getter for the property tablePostName.
	 * 
	 * @return The value for the tablePostName.
	 */
	public String getTablePostName() {
		return tablePostName;
	}

	/**
	 * Setter for property tablePostName.
	 *
	 * @param tablePostName new value of property tablePostName.
	 */
	public void setTablePostName(String tablePostName) {
		this.tablePostName = tablePostName;
	}

	/**
	 * Getter for the property tableCommentsName.
	 * 
	 * @return The value for the tableCommentsName.
	 */
	public String getTableCommentsName() {
		return tableCommentsName;
	}

	/**
	 * Setter for property tableCommentsName.
	 *
	 * @param tableCommentsName new value of property tableCommentsName.
	 */
	public void setTableCommentsName(String tableCommentsName) {
		this.tableCommentsName = tableCommentsName;
	}

	/**
	 * Getter for the property tableCatName.
	 * 
	 * @return The value for the tableCatName.
	 */
	public String getTableCatName() {
		return tableCatName;
	}

	/**
	 * Setter for property tableCatName.
	 *
	 * @param tableCatName new value of property tableCatName.
	 */
	public void setTableCatName(String tableCatName) {
		this.tableCatName = tableCatName;
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
	 * Getter for the property code.
	 * 
	 * @return The value for the code.
	 */
	public String getCode() {
		return code;
	}

	/**
	 * Setter for property code.
	 *
	 * @param code new value of property code.
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * Getter for the property desc.
	 * 
	 * @return The value for the desc.
	 */
	public String getDesc() {
		return desc;
	}

	/**
	 * Setter for property desc.
	 *
	 * @param desc new value of property desc.
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}

	/**
	 * Getter for the property domainName.
	 * 
	 * @return The value for the domainName.
	 */
	public String getDomainName() {
		return domainName;
	}

	/**
	 * Setter for property domainName.
	 *
	 * @param domainName new value of property domainName.
	 */
	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	/**
	 * Getter for the property industryId.
	 * 
	 * @return The value for the industryId.
	 */
	public String getIndustryId() {
		return industryId;
	}

	/**
	 * Setter for property industryId.
	 *
	 * @param industryId new value of property industryId.
	 */
	public void setIndustryId(String industryId) {
		this.industryId = industryId;
	}

	/**
	 * Getter for the property webSiteThemeId.
	 * 
	 * @return The value for the webSiteThemeId.
	 */
	public String getWebSiteThemeId() {
		return webSiteThemeId;
	}

	/**
	 * Setter for property webSiteThemeId.
	 *
	 * @param webSiteThemeId new value of property webSiteThemeId.
	 */
	public void setWebSiteThemeId(String webSiteThemeId) {
		this.webSiteThemeId = webSiteThemeId;
	}

	/**
	 * Getter for the property esIndexName.
	 * 
	 * @return The value for the esIndexName.
	 */
	public String getEsIndexName() {
		return esIndexName;
	}

	/**
	 * Setter for property esIndexName.
	 *
	 * @param esIndexName new value of property esIndexName.
	 */
	public void setEsIndexName(String esIndexName) {
		this.esIndexName = esIndexName;
	}

	/**
	 * Getter for the property esArticleTypeName.
	 * 
	 * @return The value for the esArticleTypeName.
	 */
	public String getEsArticleTypeName() {
		return esArticleTypeName;
	}

	/**
	 * Setter for property esArticleTypeName.
	 *
	 * @param esArticleTypeName new value of property esArticleTypeName.
	 */
	public void setEsArticleTypeName(String esArticleTypeName) {
		this.esArticleTypeName = esArticleTypeName;
	}

	/**
	 * Getter for the property esPostTypeName.
	 * 
	 * @return The value for the esPostTypeName.
	 */
	public String getEsPostTypeName() {
		return esPostTypeName;
	}

	/**
	 * Setter for property esPostTypeName.
	 *
	 * @param esPostTypeName new value of property esPostTypeName.
	 */
	public void setEsPostTypeName(String esPostTypeName) {
		this.esPostTypeName = esPostTypeName;
	}

	/**
	 * Getter for the property hasCat.
	 * 
	 * @return The value for the hasCat.
	 */
	public String getHasCat() {
		return hasCat;
	}

	/**
	 * Setter for property hasCat.
	 *
	 * @param hasCat new value of property hasCat.
	 */
	public void setHasCat(String hasCat) {
		this.hasCat = hasCat;
	}

	/**
	 * Getter for the property createBy.
	 * 
	 * @return The value for the createBy.
	 */
	public String getCreateBy() {
		return createBy;
	}

	/**
	 * Setter for property createBy.
	 *
	 * @param createBy new value of property createBy.
	 */
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
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
	 * Getter for the property lastUpdateBy.
	 * 
	 * @return The value for the lastUpdateBy.
	 */
	public String getLastUpdateBy() {
		return lastUpdateBy;
	}

	/**
	 * Setter for property lastUpdateBy.
	 *
	 * @param lastUpdateBy new value of property lastUpdateBy.
	 */
	public void setLastUpdateBy(String lastUpdateBy) {
		this.lastUpdateBy = lastUpdateBy;
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
