<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>${feData.webSiteData.indexTitle} | ${feData.webSiteData.indexTitleSufix}</title>
    <meta name="description" content="${feData.webSiteData.desc}">
    <link rel="icon" href="assets/images/favicon.png">
    <link href="assets/css/bootstrap.min.css" rel="stylesheet">
    <link href="assets/css/style.css" rel="stylesheet">
    <link href="assets/webcss/site-responsive.css" rel="stylesheet">
    <link href="assets/webcss/animate.css" rel="stylesheet">
    <link rel="stylesheet" href="assets/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="assets/owlslider/owl-carousel/owl.carousel.css">
    <link rel="stylesheet" href="assets/owlslider/owl-carousel/owl.template.css">
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>
    <div id="header" class="container-fluid home">
        <div class="row">
            <div class="header_banner">
                <div class="slides">
                    <div class="slider_items parallax-window" data-parallax="scroll" data-image-src="assets/images/headerimage1.jpg"></div>
                </div>
            </div>
            <div class="top_header">
                <nav class="navbar navbar-fixed-top">
                    <div class="container">
                        <div class="logo">
                            <a href="http://${feData.osDomainUrl}/"><img src="assets/images/logo2.png" alt="Photo" /> </a>
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
                                <li class="dropdown">
                                	<a href="http://${feData.osDomainUrl}/" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Home <span class="sr-only">(current)</span></a>
                                </li>
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
                <div class="container slogan">
                    <div class="col-lg-12">
                        <h1 class="animated fadeInDown">Looking for Your Keywords Topic List</h1>
                        <h3>${feData.webSiteData.indexTitleSufix}</h3>
                    </div>
                </div>
            </div>
        </div>
    </div>
    
    <div class="container-fluid recent-post" style="background:#fff;">
        <div class="row">
            <div class="container main-container">
                <h3 class="text-center">Recent Post</h3>
                <p class="text-center">Completely synergize resource sucking relationships via premier niche markets.</p>
            </div>
            <div class="container main-container posts-list">
            	<c:forEach items="${feData.webSiteData.randomWSLevelPostList}" var="item" varStatus="status" begin="0" end="0" step="1">
                <div class="col-lg-4 col-md-4 col-sm-6 col-xs-12 post post-01">
                    <div class="post-thumb">
                        <img src="assets/images/post-image1.jpg" alt="Photo" />
                    </div>
                    <div class="post-meta">
                        <h4><a href="http://${feData.osDomainUrl}/${item.selfUrl}">${item.title}</a></h4>
                        <p>${item.description}</p>
                        <a href="http://${feData.osDomainUrl}/${item.selfUrl}" class="readmore">Read More</a>
                    </div>
                </div>
                </c:forEach>
                <c:forEach items="${feData.webSiteData.randomWSLevelPostList}" var="item" varStatus="status" begin="1" end="1" step="1">
                <div class="col-lg-4 col-md-4 col-sm-6 col-xs-12 post post-02">
                    <div class="post-thumb">
                        <img src="assets/images/post-image2.jpg" alt="Photo" />
                    </div>
                    <div class="post-meta">
                        <h4><a href="http://${feData.osDomainUrl}/${item.selfUrl}">${item.title}</a></h4>
                        <p>${item.description}</p>
                        <a href="http://${feData.osDomainUrl}/${item.selfUrl}" class="readmore">Read More</a>
                    </div>
                </div>
                </c:forEach>
                <c:forEach items="${feData.webSiteData.randomWSLevelPostList}" var="item" varStatus="status" begin="2" end="2" step="1">
                <div class="col-lg-4 col-md-4 col-sm-6 col-xs-12 post post-03">
                    <div class="post-thumb">
                        <img src="assets/images/post-image3.jpg" alt="Photo" />
                    </div>
                    <div class="post-meta">
                        <h4><a href="http://${feData.osDomainUrl}/${item.selfUrl}">${item.title}</a></h4>
                        <p>${item.description}</p>
                        <a href="http://${feData.osDomainUrl}/${item.selfUrl}" class="readmore">Read More</a>
                    </div>
                </div>
                </c:forEach>
            </div>
        </div>
    </div>
    
    <%@include file="sections/footer.jsp" %>
    
    <script type="text/javascript" src="assets/js/jquery-1.9.1.min.js"></script>
    <script type="text/javascript" src="assets/js/select2.min.js"></script>
    <script src="assets/tinymce/tinymce.min.js"></script>
    <script type="text/javascript" src="assets/parallax.js-1.4.2/parallax.js"></script>
    <script src="assets/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="assets/owlslider/owl-carousel/owl.carousel.js"></script>
    <script type="text/javascript" src="assets/js/waypoints.min.js"></script>
    <script type="text/javascript" src="assets/counter/jquery.counterup.min.js"></script>
    <script src="assets/js/webjs.js"></script>
</body>

</html>
