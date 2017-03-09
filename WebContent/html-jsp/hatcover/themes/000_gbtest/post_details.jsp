<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <title>${feData.postData.title} | ${feData.webSiteData.indexTitleSufix}</title>
    <meta name="description" content="${feData.postData.description}">
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
                <div class="col-lg-10 col-md-10 col-sm-12 col-xs-12">
                    <h3 class="white-heading">${feData.postData.title}</h3>
                </div>
                <div class="col-lg-5 col-md-5 col-sm-12 colxs-12 capital">
                    <h5>post details</h5>
                </div>
            </div>
        </div>
    </div>
    <!--header section -->
    <!--blog Lists-->
    <div class="container-fluid white-bg blog-posts">
        <div class="row">
            <div class="container main-container">
                <div class="col-lg-8 col-md-8 col-sm-8 col-xs-12 posts-list">
                    <div class="post" id="post-1">
                        <div class="data-post">
                            <h3>${feData.postData.title}</h3>
                            <p>${feData.postData.description}</p>
                            <p>${feData.postData.url}</p>
                        </div>
                    </div>
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
                        <h3 class="widget-title">Archive</h3>
                        <div class="post-list archive">
                            <ul>
                            	<c:forEach items="${feData.relatedArticleList}" var="item" varStatus="status">
                                    <li><a href="http://${feData.osDomainUrl}/${item.selfUrl}">${item.title}</a></li>
                                </c:forEach>
                            </ul>
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
