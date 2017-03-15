<div class="container-fluid footer">
        <div class="row">
            <div class="container main-container">
                <div class="col-lg-4 col-md-4 col-sm-4 col-xs-12 mb20">
                    <h3>Contact with us</h3>
                    <c:if test="${feData.queryType == 'k'}">
                        <p>Article Page for ${feData.kwShowName}</p>
                    </c:if>
                    <p>Email: info@hotindexing.com</p>
                    <p>WebSite: http://www.hotindexing.com</p>
                    <c:choose>
                        <c:when test="${feData.queryType == 'k'}">
                            <p>Last Update: ${feData.articleLastUpdateTime}</p>
                        </c:when>
                        <c:otherwise>
                            <p>Last Update: ${feData.webSiteData.indexCreateDate}</p>
                        </c:otherwise>
                    </c:choose>
                </div>
                <div class="col-lg-4 col-md-4 col-sm-4 col-xs-12">
                    <h3>Random Articles</h3>
                    <ul class="list-group">
                    	<c:forEach items="${feData.webSiteData.randomWSLevelHotArticlesList}" var="item" varStatus="status" begin="15" end="19" step="1">
                            <li><a href="http://${feData.osDomainUrl}/${item.selfUrl}" title="${item.title}">${item.title}</a></li>
                        </c:forEach>
                    </ul>
                </div>
                <div class="col-lg-4 col-md-4 col-sm-4 col-xs-12">
                    <h3>Other Links</h3>
                    <ul class="list-group">
                        <c:forEach items="${feData.webSiteData.randomWSLevelHotArticlesList}" var="item" varStatus="status" begin="20" end="24" step="1">
                            <li><a href="http://${feData.osDomainUrl}/${item.selfUrl}" title="${item.title}">${item.title}</a></li>
                        </c:forEach>
                    </ul>
                </div>
            </div>
        </div>
    </div>
    <div class="container-fluid footer last-footer ">
        <div class="row">
            <div class="container main-container">
                <div class="col-lg-9 col-md-3 col-sm-9 col-xs-12">
                    <p class="copyright">&copy; ${feData.webSiteData.thisYear} by <a href="http://${feData.osDomainUrl}/">${feData.webSiteData.name}</a> | All web contents gathered from internet and all rights reserved by contents owner.</p>
                </div>
                <div class="col-lg-3 col-md-3 col-sm-12 col-xs-12">
                    <ul>
                        <li><a href="#"><i class="fa fa-facebook"></i></a></li>
                        <li><a href="#"><i class="fa fa-twitter"></i></a></li>
                        <li><a href="#"><i class="fa fa-google-plus-square"></i></a></li>
                        <li><a href="#"><i class="fa fa-linkedin"></i></a></li>
                    </ul>
                </div>
            </div>
        </div>
    </div>