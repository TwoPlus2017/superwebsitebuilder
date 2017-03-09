<div class="container-fluid footer">
        <div class="row">
            <div class="container main-container">
                <!---Footer Column 01-->
                <div class="col-lg-4 col-md-4 col-sm-4 col-xs-12">
                    <h3>Contact with us</h3>
                    <p>Manchester Road 123-78B, Silictown</p>
                    <p>+46 123 456 789</p>
                    <p>hello@sitename.com</p>
                    <p>http://www.sitename.com</p>
                </div>
                <div class="col-lg-4 col-md-4 col-sm-4 col-xs-12">
                    <h3>Random Articles</h3>
                    <ul class="list-group">
                    	<c:forEach items="${feData.webSiteData.randomWSLevelArticlesList}" var="item" varStatus="status" begin="18" end="23" step="1">
                            <li><a href="http://${feData.osDomainUrl}/${item.selfUrl}" title="${item.title}">${item.title}</a></li>
                        </c:forEach>
                    </ul>
                </div>
                <div class="col-lg-4 col-md-4 col-sm-4 col-xs-12">
                    <h3>Other Links</h3>
                    <ul class="list-group">
                        <c:forEach items="${feData.webSiteData.randomWSLevelArticlesList}" var="item" varStatus="status" begin="24" end="29" step="1">
                            <li><a href="http://${feData.osDomainUrl}/${item.selfUrl}" title="${item.title}">${item.title}</a></li>
                        </c:forEach>
                    </ul>
                </div>
            </div>
        </div>
    </div>
    <div class="container-fluid footer last-footer ">
        <div class="row">
            <div class="container main-container footer-center">
                <div class="col-lg-9 col-md-3 col-sm-9 col-xs-12">
                    <p class="copyright">&copy; ${feData.webSiteData.thisYear} by <a href="http://${feData.osDomainUrl}/">${feData.webSiteData.name}</a> | All web contents gathered from internet and all rights reserved by contents owner.</p>
                </div>
                <div class="col-lg-3 col-md-3 col-sm-9 col-xs-12 footer-center">
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