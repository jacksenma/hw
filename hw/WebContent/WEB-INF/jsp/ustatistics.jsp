<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<!--[if IE 7]><html class="ie7" lang="zh"><![endif]-->
<!--[if gt IE 7]><!-->
<html lang="zh">

<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<!-- ???????????????????????? -->
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" />

<!-- ? Bootstrap ?? CSS ?? -->


<!-- ???Bootstrap???????????? -->
<link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.4/css/bootstrap-theme.min.css">

<!-- jQuery??????bootstrap.min.js ???? -->
<script src="http://cdn.bootcss.com/jquery/1.11.2/jquery.min.js"></script>

<!-- ??? Bootstrap ?? JavaScript ?? -->
<script src="http://cdn.bootcss.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
<title>统计信息</title>
<link href="./css/style.css" rel="stylesheet" type="text/css" />
</head>

<%@ include file="/WEB-INF/jsp/unavigation.jsp"%>
<script type="text/javascript">
$("#statistics").css({"color":"rgb(255, 255, 255)","background-color":"rgb(255,233,87)"});
</script>
<body>

<div class="content">
  <div class="wrapper">
    <div class="light"><i></i></div>
    <br/>
    <br/>
    <span class="line-left"></span>
    <span class="line-right"></span>
    <div class="main">
      <h1 class="title">Hostel World时间轴<span style="color: pink;font-size:18px"> (累计支出${totalFinance } 元)</span></h1>
      
      
      <c:set var="date" value="2017-02-26"></c:set>
      <c:forEach items="${FinanceTimeLine}" var="f1">
      <c:if test="${fn:split(f1.date,' ')[0] !=date}">
      
      <c:set var="date" value="${fn:split(f1.date,' ')[0]}"></c:set>
      	<div class="year"><h2><a href="#">${fn:split(f1.date," ")[0]}<i></i></a></h2>
        <div class="list">
          <ul>
          
          	<c:forEach items="${FinanceTimeLine}" var="f2">
          		<c:if test="${fn:split(f2.date,' ')[0] ==date}">
      				<li <c:if test="${f2.state==0}">class="cls highlight"</c:if>
      					<c:if test="${f2.state!=0}">class="cls"</c:if>
      				>
              			<p class="date">${fn:split(f2.date," ")[1]}</p>
              			<p class="intro">
              				<c:if test="${f2.state==0}">取消预订</c:if>
      						<c:if test="${f2.state==1}">预定客栈</c:if>
      						<c:if test="${f2.state==2}">入住客栈</c:if>
      						<c:if test="${f2.state==3}">客栈退房</c:if>
      						
              			</p>
              			<p class="version">&nbsp;</p>
              			<div class="more">
              				<c:if test="${f2.money>0}"><p>返还 ${f2.money } 元</p></c:if>
              				<c:if test="${f2.money<0}"><p>支出 ${fn:split(f2.money,"-")[0]} 元</p></c:if>
                			<p>${f2.remark }</p>
              			</div>
           			 </li>
            	</c:if>
            </c:forEach>
            
          </ul>
        </div>
      </div>
      
      
      	
      	 </c:if>
      </c:forEach>
     
      </div></div></div>
     
<div class="footer">
  <div class="footer-content clearfix">
    <div class="copyright"> Copyright © 2011-2014  All Rights Reserved </div>
  </div>
</div>


<script type="text/javascript" src="./js/jquery.min.js"></script>
<script>
	$(".main .year .list").each(function (e, target) {
	    var $target=  $(target),
	        $ul = $target.find("ul");
	    $target.height($ul.outerHeight()), $ul.css("position", "absolute");
	}); 
	$(".main .year>h2>a").click(function (e) {
	    e.preventDefault();
	    $(this).parents(".year").toggleClass("closeT");
	});
	</script>
</body>
</html>

