<div id="header" class="container-fluid pages">
        <div class="row">
            <div class="top_header">
                <nav class="navbar navbar-fixed-top">
                    <div class="container">
                        <div class="logo">
                            <a href="http://${feData.osDomainUrl}/"><img src="http://${feData.osDomainUrl}/assets/images/logo2.png" alt="" /></a>
                        </div>
                        <div class="navbar-header">
                            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                                <span class="sr-only">Toggle navigation</span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                            </button>
                        </div>
                        <div class="collapse navbar-collapse pull-right" id="bs-example-navbar-collapse-1">
                            <ul class="nav navbar-nav">
                                <li><a href="http://${feData.osDomainUrl}/">Home</a></li>
                                <li class="dropdown">
                                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Top Month</a>
                                    <ul class="dropdown-menu">
                                        <c:forEach items="${feData.webSiteData.randomWSLevelArticlesList}" var="item" varStatus="status" begin="0" end="5" step="1">
		                                    <li><a href="http://${feData.osDomainUrl}/${item.selfUrl}" title="${item.title}">${item.title}</a></li>
		                                </c:forEach>
                                    </ul>
                                </li>
                                <li class="dropdown">
                                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Top Week</a>
                                    <ul class="dropdown-menu">
                                        <c:forEach items="${feData.webSiteData.randomWSLevelArticlesList}" var="item" varStatus="status" begin="6" end="11" step="1">
		                                    <li><a href="http://${feData.osDomainUrl}/${item.selfUrl}" title="${item.title}">${item.title}</a></li>
		                                </c:forEach>
                                    </ul>
                                </li>
                                <li class="dropdown">
                                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Top Day</a>
                                    <ul class="dropdown-menu">
                                        <c:forEach items="${feData.webSiteData.randomWSLevelArticlesList}" var="item" varStatus="status" begin="12" end="17" step="1">
		                                    <li><a href="http://${feData.osDomainUrl}/${item.selfUrl}" title="${item.title}">${item.title}</a></li>
		                                </c:forEach>
                                    </ul>
                                </li>
                            </ul>
                        </div>
                    </div>
                </nav>
            </div>
        </div>
    </div>