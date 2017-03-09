/**
 * Copyright (C) 2016 - 2017 GB Studio. All rights reserved.
 * Filename:  Utils.java
 * Purpose:   Utils functions.
 * Classes:   Utils
 */
package com.superwebsitebuilder.espider.util;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.superwebsitebuilder.applicationLevel.manager.AdminConfigManagerIfc;
import com.superwebsitebuilder.espider.constant.Constants;
import com.superwebsitebuilder.espider.constant.WebSiteLevelConstants;
import com.superwebsitebuilder.platform.listener.InitSuperWebSiteApplicatLevelListener;
import com.superwebsitebuilder.websitelevel.data.websitefunction.WebSiteData;

/**
 * Utils functions. <BR>
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

public class Utils {
	
	/** Represents the logger field */
	private static Log logger = LogFactory.getLog(Utils.class);
	
	/**
	 * Update request string as allow characters only.  
	 * 
	 *  Allow characters: [^a-z0-9A-Z \-]+
	 *
	 * @param chart
	 * @param source
	 * @return
	 */
	public static String onlyAllowCharacter(String chart, String source) {
		if (checkNotNull(source) && checkNotEmpty(source)) {
			return removeMoreSpaceAsOne(removeMoreBarsAsOne(source.replaceAll(chart, Constants.EMPTY_STRING)).toLowerCase());
		}
		
		return Constants.EMPTY_STRING;
	}
	
	/**
	 * Update MySQL date format to nice format.
	 * 
	 *  Likes: '2017/01/18 12:22:15.0' to '2017/01/18 12:22:15'
	 *
	 * @param dateTime
	 * @return
	 */
	public static String formatDateTimeToView(String dateTime) {
		return dateTime.replace(".0", "");
	}
	
	/**
	 * Get one website real domain name.  
	 *
	 * @param url
	 * @return
	 */
	public static String getDomainUrl(String url) {
		
		if ("".equalsIgnoreCase(url.trim())) {
			return "";
		}
		
		String withOutHead = url.replaceFirst("https://", "").replaceFirst("http://", "");
		
		return withOutHead.substring(0, withOutHead.indexOf("/"));
	}
	
	/**
	 * Update more bars as one bar.
	 * 
	 *  Likes: 'aaa---bbb--c' to 'aaa-bbb-c'
	 *
	 * @param source
	 * @return
	 */
	public static String removeMoreBarsAsOne(String source) {
		return source.replaceAll("-{2,}", "-");
	}
	
	/**
	 * Update one bar to space.
	 * 
	 *  Likes: '-' to ' '. 
	 *
	 * @param source
	 * @return
	 */
	public static String replaceBarsAsSpace(String source) {
		return source.replaceAll("-", " ");
	} 
	
	/**
	 * xxx 
	 *
	 * @param source
	 * @return
	 */
	public static String removeMoreSpaceAsOne(String source) {
		return source.replaceAll(" {2,}", " ").trim();
	}
	
	/**
	 * Check is not empty.  
	 *
	 * @param str
	 * @return
	 */
	public static boolean checkNotEmpty(String str) {
		if (!Constants.EMPTY_STRING.equals(str)) {
			return true;
		}
		
		return false;
	}
	
	/**
	 * Check is empty.  
	 *
	 * @param str
	 * @return
	 */
	public static boolean isEmpty(String str) {
		return StringUtils.isEmpty(str);
	}
	
	/**
	 * Check is not NULL. 
	 *
	 * @param object
	 * @return
	 */
	public static boolean checkNotNull(Object object) {
		if (object != null) {
			return true;
		}
		
		return false;
	}
	
	/**
	 * Check is NULL; 
	 *
	 * @param object
	 * @return
	 */
	public static boolean isNull(Object object) {
		if (object == null) {
			return true;
		}
		
		return false;
	}
	
	/**
	 * Get words and include ' ', 'a-z', 'A-Z', '0-1' and '-' only.  
	 *
	 * @param source
	 * @return
	 */
	public static String getURL(String source) {
		String temp = source;
		
		temp = temp.replaceAll(" {2,}", " ");
		temp = temp.replaceAll("(?i)[^a-zA-Z0-9\\ ]", "").trim();
		temp = temp.replaceAll(" {2,}", " ");
		temp = temp.toLowerCase().replace(" ", "-");
		
		return temp.trim();
	}
	
	/**
	 * Get words and include ' ', 'a-z', 'A-Z' and '0-1' only. 
	 *
	 * @param source
	 * @return
	 */
	public static String getWords(String source) {
		String temp = source;
		
		temp = temp.replaceAll(" {2,}", " ");
		temp = temp.replaceAll("(?i)[^a-zA-Z0-9\\ ]", " ").trim();
		temp = temp.replaceAll(" {2,}", " ");
		
		return temp.trim();
	}
	
	/**
	 * Get full URL.
	 * 
	 *  Likes: 
	 *  	sss-xxx-aaa-k.html
	 *  	asdf-asdf-wer-c.html
	 *  	asdf-87678.html
	 *
	 * @param contents
	 * @param urlType
	 * @return
	 */
	public static String getFullFormatedUrl(String contents, String urlType) {
		
		if (Utils.checkNotEmpty(contents)) {
			if (Utils.checkNotEmpty(urlType)) {
				return Utils.getURL(contents) + Constants.BAR + urlType + Constants.HTML_SUFFIX_NAME;
			} else {
				return Utils.getURL(contents) + Constants.HTML_SUFFIX_NAME;
			}
		}
		
		return Constants.EMPTY_STRING;
	}
	
	/**
	 * Update request string as keyword.  
	 *
	 * @param originalStr
	 * @return
	 */
	public static final String formatAsKeyWord(String originalStr) {
		if (Constants.EMPTY_STRING.equals(originalStr)) {
			return Constants.EMPTY_STRING;
		}
		
		return originalStr.replaceAll(" {2,}", " ").replaceAll("(?i)[^a-zA-Z0-9\\ ]", "").replaceAll(" {2,}", " ").trim();
	}
	
	/**
	 * Update the first letter as upper.   
	 *
	 * @param originalStr
	 * @return
	 */
	public static final String upperFirstLetter(String originalStr) {
		if (originalStr == null) {
			return "";
		}
		
		if (Constants.EMPTY_STRING.equals(originalStr)) {
			return Constants.EMPTY_STRING;
		}
		
		return setFirstLetterAsUpperForTitle(originalStr);
	}
	
	/**
	 * Update the first letter as upper.  
	 *
	 * @param aValue
	 * @return
	 */
	public static final String setFirstLetterAsUpperForTitle(String aValue) {
    	String slValue = Constants.EMPTY_STRING;
    	String returnTitle = Constants.EMPTY_STRING;
    	String aWord = Constants.EMPTY_STRING;
    	int iLLength = 0;
    	String tempStr = getWords(aValue);
    	
    	String[] allWords = tempStr.split(Constants.SPACE);
    	
    	if (allWords.length > 0) {
    		for (int i = 0; i < allWords.length; i++) {
    			aWord = allWords[i];
    			
    			char[] allChar = aWord.trim().toCharArray();
    			
    			iLLength = allChar.length;
    			
    			for (int j = 0; j < iLLength; j++) {
    	    		if (j == 0) {
    	    			slValue += String.valueOf(allChar[j]).toUpperCase();
    	    		} else {
    	    			slValue += String.valueOf(allChar[j]).toLowerCase();
    	    		}
    	    	}
    			
    			returnTitle += slValue + Constants.SPACE;
    			slValue = Constants.EMPTY_STRING;
        	}
    	}
    	
    	return returnTitle.trim();
    }
	
	/**
	 * Check is keyword.  
	 *
	 * @param resource
	 * @return
	 */
	public static boolean isKeyWord(String resource) {
		if (resource.length() > 6 && resource.length() <= 80 && resource.contains(" ") && !isWebSiteName(resource)) {
			return true;
		}
		
		return false;
	}
	
	/**
	 * Check related website's words.  
	 *
	 * @param resource
	 * @return
	 */
	public static boolean isWebSiteName(String resource) {
		if (resource.contains("httpwww") || resource.contains("http") || resource.contains("https") || 
				resource.contains("www") || resource.contains(".com") || resource.contains(".net")) {
			return true;
		}
		
		return false;
	}
	
	/**
	 * Check has sensitive words.
	 * 
	 * Scope: 
	 * 	copyright issue
	 * 	sex words issue
	 * 	remove request issue
	 *
	 * @param resourceWords
	 * @return
	 */
	public static boolean hasSensitiveWords(String resourceWords) {
		if (hasCopyRightWord(resourceWords) || hasSexWord(resourceWords) || hasNeedRemovedLink(resourceWords)) {
			return true;
		}
		
		return false;
	}
	
	/**
	 * Check has copyright issue's domain URL.  
	 *
	 * @param resourceWords
	 * @return
	 */
	public static boolean hasCopyRightWord(String resourceWords) {
		if (StringUtils.indexOfAny(resourceWords.toLowerCase(), Constants.copyrightWords) >= 0) {
			return true;
		}
		
		return false;
	}
	
	/**
	 * Check has sex words issue.  
	 *
	 * @param resourceWords
	 * @return
	 */
	public static boolean hasSexWord(String resourceWords) {
		if (StringUtils.indexOfAny(resourceWords.toLowerCase(), Constants.sexWords) >= 0) {
			return true;
		}
		
		return false;
	}
	
	/**
	 * Check has remove request issue's domain URL. 
	 *
	 * @param link
	 * @return
	 */
	public static boolean hasNeedRemovedLink(String link) {
		if (StringUtils.indexOfAny(link.toLowerCase(), Constants.removedLinks) >= 0) {
			return true;
		}
		
		return false;
	}
	
	/**
	 * Get WebSite domain URL base running ENV.
	 * 
	 *
	 * @param wsData
	 * @return
	 */
	public static String getDomainUrlByHostName(WebSiteData wsData, AdminConfigManagerIfc acManager) {
		String domainUrl = Constants.EMPTY_STRING;
		String osName = System.getProperty("os.name");
		String hostName = getHostName(getInetAddress());
		String hostIP = getHostIP(getRealInetAddress());
		
		logger.debug("hostIP =================================" + hostIP);
		
		if (checkNotEmpty(osName) && checkNotEmpty(hostName)) {
			
			if (osName.equalsIgnoreCase(WebSiteLevelConstants.Host_Linux)) {
				// PROD host
				if (hostName.equalsIgnoreCase(acManager.getHostAndApplicationProperty().getHostName()) 
						&& hostIP.equalsIgnoreCase(acManager.getHostAndApplicationProperty().getHostIP())) {
					
					domainUrl = wsData.getDomainName();
				
				// local Linux ENV
				} else {
					domainUrl = hostIP + ":" + wsData.getLocalPort();
				}
				
			} else {
				// local Windows ENV
				domainUrl = hostIP + ":" + wsData.getLocalPort();
			}
		}
		
		return domainUrl;
	}

	/**
	 * Get host address object.  
	 *
	 * @return
	 */
	public static InetAddress getInetAddress() {
		try {
            return InetAddress.getLocalHost();
        } catch(UnknownHostException e) {
        	
        }
		
        return null;
    }
	
	public static InetAddress getRealInetAddress() {
		InetAddress inetAddress = null;
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface
                    .getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface ni = (NetworkInterface) networkInterfaces
                        .nextElement();
                Enumeration<InetAddress> nias = ni.getInetAddresses();
                while(nias.hasMoreElements()) {
                    InetAddress ia= (InetAddress) nias.nextElement();
                    if (!ia.isLinkLocalAddress() 
                     && !ia.isLoopbackAddress()
                     && ia instanceof Inet4Address) {
                    	inetAddress = ia;
                    }
                }
            }
        } catch (SocketException e) {
        }
        return inetAddress;
    }
	
	/**
	 * Get host IP.  
	 *
	 * @param netAddress
	 * @return
	 */
	public static String getHostIP(InetAddress netAddress) {
		if (Utils.checkNotNull(netAddress)) {
			return netAddress.getHostAddress(); //get the IP address
		}
		
		return Constants.EMPTY_STRING;
    }
	
    /**
     * Get host name.  
     *
     * @param netAddress
     * @return
     */
    public static String getHostName(InetAddress netAddress) {
    	if (Utils.checkNotNull(netAddress)) {
    		return netAddress.getHostName(); //get the host address
    	}
        
    	return Constants.EMPTY_STRING;
    }
    
    /**
     * Get random number for WebSite home page's image to show.  
     *
     * @param wsCode
     * @return
     */
    public static String getIndexImage(String wsCode) {
		String imageName = Constants.EMPTY_STRING;
		
		switch(wsCode) {
			case "XXX":
				imageName = getRandomNumStr(1, 10) + Constants.IMAGE_JPG_SUFIX;
				break;

			default:
				imageName = getRandomNumStr(1, 10) + Constants.IMAGE_JPG_SUFIX;
				break;
		}
		
		return imageName;
	}
    
    /**
     * Get random number list.  
     *
     * @param counter
     * @param mixNum
     * @param maxNum
     * @return
     */
    public static List<Integer> getRandomNumList(int counter, int mixNum, int maxNum) {
    	Set<Integer> numSet = new HashSet<Integer>();
    	double loopSize = maxNum + maxNum * 0.2;
    	
    	if (counter == 0) {
    		return convertSetToList(numSet);
    	}
    	
    	for (int i = 0; i < loopSize; i++) {
    		numSet.add(getRandomNum(mixNum, maxNum));
    		
    		if (numSet.size() == counter) {
    			return convertSetToList(numSet);
    		}
    	}
    	
    	return convertSetToList(numSet);
    }
    
    /**
     * Convert Set object to List object.  
     *
     * @param numSet
     * @return
     */
    private static List<Integer> convertSetToList(Set<Integer> numSet) {
    	List<Integer> numList = new ArrayList<Integer>();
    	
    	for (Integer num : numSet) {
    		numList.add(num);
    	}
    	
    	return numList;
    }
    
	/**
	 * Get random number.   
	 *
	 * @param mixNum
	 * @param maxNum
	 * @return
	 */
	public static int getRandomNum(int mixNum, int maxNum) {
		return (int)(mixNum + Math.random() * (maxNum - mixNum + 1));
	}
	
	/**
	 * Get random number's string.  
	 *
	 * @param mixNum
	 * @param maxNum
	 * @return
	 */
	public static String getRandomNumStr(int mixNum, int maxNum) {
		return String.valueOf(getRandomNum(mixNum, maxNum));
	}
	
	/**
	 * Get current year formated string. 
	 * 
	 * Likes: 2017
	 *
	 * @return
	 */
	public static final String getThisYearStr() {
		Calendar rightNow = Calendar.getInstance();
		SimpleDateFormat year = new SimpleDateFormat("yyyy");
		
		return year.format(rightNow.getTime());
	}
	
	/**
	 * Get today nice formated string.
	 * 
	 * Likes: 17 January 2017
	 *
	 * @return
	 */
	public static final String getNiceFormatTodayStr() {
		Calendar rightNow = Calendar.getInstance();
		SimpleDateFormat year = new SimpleDateFormat("yyyy");
		SimpleDateFormat day = new SimpleDateFormat("dd");
		SimpleDateFormat month = new SimpleDateFormat("MM");
		
		return day.format(rightNow.getTime()) + " " + getNiceMonthName(month.format(rightNow.getTime())) + " " + year.format(rightNow.getTime());
	}
	
	/**
	 * Get month English name.
	 *
	 * @param monthNum
	 * @return
	 */
	public static final String getNiceMonthName(String monthNum) {
		String name = Constants.EMPTY_STRING;
		
		switch(monthNum) {
			case "01":
				name = "January";
				break;
			case "02":
				name = "February";
				break;
			case "03":
				name = "March";
				break;
			case "04":
				name = "April";
				break;
			case "05":
				name = "May";
				break;
			case "06":
				name = "June";
				break;
			case "07":
				name = "July";
				break;
			case "08":
				name = "August";
				break;
			case "09":
				name = "September";
				break;
			case "10":
				name = "October";
				break;
			case "11":
				name = "November";
				break;
			case "12":
				name = "December";
				break;
				
			default:
				name = "January";	
		}
		
		return name;
	}
}
