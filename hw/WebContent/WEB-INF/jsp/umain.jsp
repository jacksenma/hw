<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<!-- ???????????????????????? -->
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" />

<!-- ? Bootstrap ?? CSS ?? -->
<link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.4/css/bootstrap.min.css">

<!-- ???Bootstrap???????????? -->
<link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.4/css/bootstrap-theme.min.css">

<!-- jQuery??????bootstrap.min.js ???? -->
<script src="http://cdn.bootcss.com/jquery/1.11.2/jquery.min.js"></script>

<!-- ??? Bootstrap ?? JavaScript ?? -->
<script src="http://cdn.bootcss.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>

<link href="./css/toastr.css" rel="stylesheet"/>
<link href="./css/umain.css" rel="stylesheet"/>
<link rel="stylesheet" href="./css/daterangepicker.min.css">


<link rel="stylesheet" href="./css/ladda-themeless.min.css">
<link rel="stylesheet" href="./css/prism.css">

<title>预定客栈</title>

</head>
<body style="font-family:微软雅黑;">
<%@ include file="/WEB-INF/jsp/unavigation.jsp"%>
<script type="text/javascript">
$("#order").css({"color":"rgb(255, 255, 255)","background-color":"rgb(255,233,87)"});
</script>
<!-- -->

<div  style="margin-top:50px;">
	<div style="margin: 0 auto;background: url(img/searchHostel.jpg);background-size:100%;background-position:0 -330px;height:200px">
	<div style="text-align: center;margin: 0 auto;"><font color="#ffffff"><span style="font-size: 30px;">————————</span></font></div>
	<div style="text-align: center;margin: 0 auto;"><b style="color: rgb(255, 255, 255); font-size: 30px; background-color: transparent;">&nbsp;搜索客栈</b></div>
	<div style="text-align: center;margin: 0 auto;"><span style="color: rgb(255, 255, 255); font-size: 30px; background-color: transparent;">————————</span></div>
	<div style="text-align: center;margin: 0 auto;"><b style="color: rgb(255, 255, 255); font-size: 18px; background-color: transparent;">&nbsp;填写查找条件搜索客栈</b></div>
	</div>
	<!-- 搜索框 -->
	
	<div id="search" class="col-lg-4 col-lg-offset-4 col-sm-6 col-sm-offset-3 col-xs-8 col-xs-offset-2 " style="margin-right:50px">
		<form class="form" action="searchHostel" method="post"  id="orderSearch">
		<span>目的地:</span>
			<div data-toggle="distpicker">
  				<select style="width:33%" class="form-control col-lg-1" id="province" name="province" data-province="${province }"></select>
  				<select style="width:34%"class="form-control col-lg-2" id="city" name="city" data-city="${city }"></select>
  				<select style="width:33%"class="form-control col-lg-1" id="district" name="district" data-district="${district }"></select>
			</div>
		<br/>
		<br/>
		<br/>
		<span>时间阶段:</span>
		<div>
			<span id="two-inputs"><input type="text" class="form-control" id="date-range200" name="startDate"  value="${startDate }" placeholder="入住时间" style="width:47.1%;display:inline"> to <input type="text" class="form-control" id="date-range201" name="endDate"  value="${endDate }" placeholder="退房时间" style="width:47.1%;display:inline"></span>
		</div>
		<br/>
		<span>酒店级别</span>
			<select class="form-control" id="level" name="level">
				<option <c:if test="${level=='不限' }">selected</c:if>>不限</option>
      			<option <c:if test="${level=='五星级/豪华' }">selected</c:if>>五星级/豪华</option>
      			<option <c:if test="${level=='四星级/高档' }">selected</c:if>>四星级/高档</option>
      			<option <c:if test="${level=='三星级/舒适' }">selected</c:if>>三星级/舒适</option>
      			<option <c:if test="${level=='二星级及以下/经济' }">selected</c:if>>二星级及以下/经济</option>
      		</select>
    	<br/>
    	<span>房间价格</span>
    		<select class="form-control" id="price" name="price">
    			<option <c:if test="${price=='不限' }">selected</c:if>>不限</option>
      			<option <c:if test="${price=='150以下' }">selected</c:if>>150以下</option>
      			<option <c:if test="${price=='150-300' }">selected</c:if>>150-300</option>
      			<option <c:if test="${price=='301-450' }">selected</c:if>>301-450</option>
      			<option <c:if test="${price=='450以上' }">selected</c:if>>450以上</option>
    		</select><br/>
    	<span style="display:none">关键词</span>
    		<input type="text" class="form-control" id="key" name="key" placeholder="(选填)酒店名" value="${key }" style="display:none"><br/>
    		
    	
    	<input type="submit" id="sub" value="submit" style="display:none">
		</form>
		
		<button style="margin-bottom: 10px" class="btn btn-primary btn-block ladda-button" id="searchBtn"data-style="expand-right" onclick="checkForm()"><span class="ladda-label" >搜索</span></button>
    
    <script src="./js/spin.min.js"></script>
<script src="./js/ladda.min.js"></script>
    <script>
	// Bind normal buttons
	Ladda.bind( 'div:not(.progress-demo) button', { timeout: 2000 } );
	// Bind progress buttons and simulate loading progress
	Ladda.bind( '.progress-demo button', {
		callback: function( instance ) {
			var progress = 0;
			var interval = setInterval( function() {
				progress = Math.min( progress + Math.random() * 0.1, 1 );
				instance.setProgress( progress );
				if( progress === 1 ) {
					instance.stop();
					clearInterval( interval );
				}
			}, 200 );
		}
	} );
</script>
	</div>
	
	<!-- 展示框!!!!分页 -->
<div id="showPage1" class="col-lg-6 col-lg-offset-3 col-sm-10 col-sm-offset-1 col-xs-10 col-xs-offset-1" >
<div id="myDIV" style="display: block;text-align:center">
	<table class="table table-striped" style="margin-top:20px " >

    	<tbody id="tb1">
		</tbody>
	</table>
</div>

<div id="info1">
<div id="pageControl" style="display: none" >
	<ul class="pager">
    <li class="previous" onclick="previous()"><a href="#">&larr; 上一页</a></li>
    <span>第</span><input value="1" type="text" class="form-control" id="pageId" style="width: 15%;display:inline"><span>页/<span id="total" value="${totalPage }"></span>页</span>
    <button onclick="checkForm1()" class="btn btn-primary btn-sm ">前往</button>
    <li class="next" onclick="next()"><a href="#">下一页 &rarr;</a></li>
	</ul>
</div> 
<div id="sorry" style="display: none;margin:auto auto">抱歉，未找到符合条件的客栈</div>
</div>
</div>


<!--  
<div id="showPage" class="col-lg-12  col-sm-12  col-xs-12" >
<div id="page"></div>


<br>  
<table class="table table-striped" style="margin-top:-20px " >

     <thead>
      <tr>
        <th>序号</th>
        <th>图片</th>
        <th>名称</th>
        <th>星级</th>
        <th>地址</th>
        <th>房型</th>
        <th>价格/晚</th>
        <th>预定</th>
        
      </tr>
    </thead>
    <tbody id="tb">
	</tbody>
</table>
<div id="pageControl" >
	<ul class="pager">
    <li class="previous" onclick="previous()"><a href="#">&larr; 上一页</a></li>
    <span>第</span><input value="1" type="text" class="form-control" id="pageId" style="width: 15%;display:inline"><span>页/<span id="total" value="${totalPage }"></span>页</span>
    <button onclick="checkForm()" class="btn btn-primary btn-sm ">前往</button>
    <li class="next" onclick="next()"><a href="#">下一页 &rarr;</a></li>
	</ul>
</div>

</div>
	
-->	
	
	
	<!--  

	-->
		<form action="preOrder" method="post" >
    			<input type="text" id="preHid" name="preHid" style="display:none">
    			<input type="text" id="preStartDate" name="preStartDate" style="display:none">
    			<input type="text" id="preEndDate"  name="preEndDate" style="display:none">
    			<input type="text" id="preBed" name="preBed"  style="display:none">
    			<input type="text" id="prePrice" name="prePrice" style="display:none">
    			<input type="text" id="preNum" name="preNum" style="display:none">
    			<input type="text" id="planStartDate" name="planStartDate" style="display:none">
    			<input type="text" id="planEndDate" name="planEndDate" style="display:none">
    			<input type="text" id="preHname"  name="preHname" style="display:none">
    			<input type="text" id="preAddress" name="preAddress"  style="display:none">
    			<input type="text" id="preLevel"  name="preLevel" style="display:none">
    			<input type="text"  id="prePhone" name="prePhone" style="display:none">
    			<input type="submit" id="thesub"  style="display: none">
    			</form>
<!--</div>  -->

</div>
</body>
<script src="//cdn.bootcss.com/jquery-cookie/1.4.1/jquery.cookie.min.js"></script>
<script src="./js/toastr.js"></script>
<script src="./js/distpicker.data.js"></script>
<script src="./js/distpicker.js"></script>
<script src="./js/main.js"></script>
<script src="./js/umain.js"></script>
<script type="text/javascript" src="./js/moment.min.js"></script>
<script type="text/javascript" src="./js/jquery.daterangepicker.min.js"></script>
<script src="./js/date.js"></script>

<script src="./js/prism.js"></script>

</html>