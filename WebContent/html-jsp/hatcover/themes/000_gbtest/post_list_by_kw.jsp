<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <title>${feData.kwShowName} Related Questions | ${feData.webSiteData.indexTitleSufix}</title>
    <link rel="icon" href="assets/images/favicon.png">
    <link href="assets/css/bootstrap.min.css" rel="stylesheet" />
    <link href="assets/css/style.css" rel="stylesheet" />
    <link href="assets/webcss/site-responsive.css" rel="stylesheet" />
    <link rel="stylesheet" href="assets/font-awesome/css/font-awesome.min.css" />
    <link rel="stylesheet" href="assets/owlslider/owl-carousel/owl.carousel.css" />
    <link rel="stylesheet" href="assets/owlslider/owl-carousel/owl.template.css" />
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body class="page-blog">
    <%@include file="sections/header.jsp" %>
    
    <div class="container-fluid page-title">
        <div class="row blue-banner">
            <div class="container main-container">
                <div class="col-lg-8 col-md-8 col-sm-12 col-xs-12">
                    <h3 class="white-heading">${feData.kwShowName}</h3>
                </div>
                <div class="col-lg-5 col-md-5 col-sm-12 colxs-12 capital">
                    <h5>Article Info</h5>
                </div>
            </div>
        </div>
    </div>
    
    <div class="container-fluid white-bg blog-posts">
        <div class="row">
            <div class="container main-container">
                <div class="col-lg-8 col-md-8 col-sm-8 col-xs-12 posts-list">
                	<c:forEach items="${feData.postList}" var="item" varStatus="status" begin="0" end="5" step="1">
                    <div class="post col-md-12">
                        <div class="data-post">
                            <h3><a href="http://${feData.osDomainUrl}/${item.selfUrl}">${item.title}</a></h3>
                            <p>${item.description}</p>
                            <a href="http://${feData.osDomainUrl}/${item.selfUrl}" class="btn btn-getstarted bg-blue">Read More</a>
                        </div>
                    </div>
                    </c:forEach>
                </div>
                <div class="col-lg-4 col-md-4 col-sm-4 col-xs-12" id="blog-sidebar">
                    <div class="search-form-block widget ">
                        <form class="search" name="indexForm" method="get" id="search">
                            <div class="pull-left form-group col-lg-10 col-md-10 col-sm-10 col-xs-9">
                                <input id="keyWord" type="search" name="" value="" placeholder="Enter keywords" />
                            </div>
                            <div class="form-group col-lg-2 col-md-2 col-sm-2 col-xs-3 submit">
                                <input type="submit" value="" onClick="javascript: goSearch();"/>
                                <span class="glyphicon fa fa-search" aria-hidden="true"></span>
                            </div>
                        </form>
                    </div>
                    <div class="widget">
                        <h3 class="widget-title">Recent post</h3>
                        <div class="recent-post">
                            <ul>
                            	<c:forEach items="${feData.postList}" var="item" varStatus="status" begin="6" end="9" step="1">
                                <li><a href="http://${feData.osDomainUrl}/${item.selfUrl}">${item.title}</a></li>
                            	</c:forEach>
                            </ul>
                        </div>
                    </div>
                    <div class="widget">
                        <h3 class="widget-title">Archive</h3>
                        <div class="post-list archive">
                            <ul>
                            	<c:forEach items="${feData.relatedArticleList}" var="item" varStatus="status">
                                    <li><a href="http://${feData.osDomainUrl}/${item.selfUrl}">${item.title}</a></li>
                                </c:forEach>
                            </ul>
                        </div>
                    </div>
                    <div class="widget ">
                        <div class="container-fluid blue-banner">
                            <div class="sidebar-fist">
                            	<c:forEach items="${feData.postList}" var="item" varStatus="status" begin="0" end="0" step="1">
                                <div class="">
                                    <h3 class="white-heading">${item.title}</h3>
                                </div>
                                <div class=""><span class="call-us">${item.description}</span></div>
                                <div class="">
                                    <a href="http://${feData.osDomainUrl}/${item.selfUrl}" class="btn btn-getstarted bg-red">get now</a>
                                </div>
                                </c:forEach>
                            </div>
                        </div>
                    </div>
                </div>
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
    <script src="assets/js/own.js"></script>
</body>

</html>
