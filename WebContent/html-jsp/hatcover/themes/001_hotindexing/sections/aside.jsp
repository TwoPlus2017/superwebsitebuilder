<div class="search-form-block widget ">
                        <form class="search" name="indexForm" method="get" id="search">
                            <div class="pull-left form-group col-lg-10 col-md-10 col-sm-10 col-xs-9">
                                <input id="keyWord" type="search" name="" value="" placeholder="Enter Topic" />
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