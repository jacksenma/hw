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
<body>
<%@ include file="/WEB-INF/jsp/unavigation.jsp"%>
<script type="text/javascript">
$("#order").addClass("active");
</script>

<div class="container" style="margin-top:50px">
	<!-- 搜索框 -->
	<div id="search" class="col-lg-4  col-sm-5  col-xs-6 ">
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
    	<span>关键词</span>
    		<input type="text" class="form-control" id="key" name="key" placeholder="(选填)酒店名" value="${key }"><br/>
    		
    	
    	<input type="submit" id="sub" value="submit" style="display:none">
		</form>
		
		<button class="btn btn-primary ladda-button" id="searchBtn"data-style="expand-right" onclick="checkForm()"><span class="ladda-label">expand-right</span></button>
    
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
	// You can control loading explicitly using the JavaScript API
	// as outlined below:
	// var l = Ladda.create( document.querySelector( 'button' ) );
	// l.start();
	// l.stop();
	// l.toggle();
	// l.isLoading();
	// l.setProgress( 0-1 );
</script>
	</div>
	
	<!-- 展示框 -->
	
	<div id="show" class="col-lg-8  col-sm-7  col-xs-6 ">
	<table class="table table-striped">
    
    <tbody>
		<c:forEach items="${OrderHostelInfo}" var="h">
			<tr id="tr${h.hid}${h.bed}">
				<td class="col-lg-4  col-sm-4  col-xs-4"><img src="${h.imgUrl }" class="col-lg-6  col-sm-6  col-xs-6"></td>
    			<td>${h.name}</td>
    			<td>${h.level}</td>
    			<td>${h.province}${h.city}${h.district}</td>
    			<td>${h.bed}</td>
    			<td>¥${h.price}</td>
    			
    			<td><form action="preOrder" method="post">
    			<input type="text" name="preHid" value="${h.hid }" style="display:none">
    			<input type="text" name="preStartDate" value="${startDate }" style="display:none">
    			<input type="text" name="preEndDate" value="${endDate }" style="display:none">
    			<input type="text" name="preBed" value="${h.bed }" style="display:none">
    			<input type="text" name="prePrice" value="${h.price }" style="display:none">
    			<input type="text" name="preNum" value="${h.num }" style="display:none">
    			<input type="text" name="planStartDate" value="${h.startDate }" style="display:none">
    			<input type="text" name="planEndDate" value="${h.endDate }" style="display:none">
    			
    			<button type="submit" class="btn btn-info btn-xs">预订</a></td>
    			</form>
    			
			</tr>
			
			
			
		
		</c:forEach>
	</tbody>
</table>
	</div>
	


</div>

</body>
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