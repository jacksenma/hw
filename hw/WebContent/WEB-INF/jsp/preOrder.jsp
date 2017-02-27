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
<link rel="stylesheet" href="./css/daterangepicker.min.css">
<title>??</title>
</head>
<body>
<%@ include file="/WEB-INF/jsp/unavigation.jsp"%>
<script type="text/javascript">
	$("#order").addClass("active");
</script>
<div class="container" style="margin-top:50px">
	<div id="preOrder" class="col-lg-4 col-lg-offset-4 col-sm-6 col-sm-offset-3 col-xs-8 col-xs-offset-2">
	
	

				<form action="myOrder" id="myOrder" method="post">
					<span>入离日期:&nbsp;&nbsp;<span id="sd">${startDate }</span> 至  <span id="ed">${endDate }</span>&nbsp;<span id="nights" style="float:right"></span>
            		
            		<br/>
            		<br/>
            		房间类型:&nbsp;&nbsp;<span>${preBed }</span>
            		<br/>
            		<br/>
            		会员等级:&nbsp;&nbsp;<span>${vipInfo.level } (可享受${vipInfo.level*3 }%的优惠)</span>
            		<br/>
            		<br/>
            		房间数量:&nbsp;
            		<select class="form-control" id="roomNum"  name="roomNum" style="width:20%;display:inline" onchange="getTotalPrice(this.value,${prePrice },${vipInfo.level*3 })">
            			<c:forEach var="i" begin="1" end="${preNum }" step="1">
            				<option>${i }</option>   
            			</c:forEach>
            		
            		</select>
            		
            		
            	
            		<span>&nbsp;&nbsp;&nbsp;房费:<span id="totalPrice"></span></span>
            		<span >&nbsp;&nbsp;&nbsp;&nbsp;可得积分:<span id="point"></span></span>
            		<script type="text/javascript">
            			$(document).ready(function(){
            				getTotalPrice($("#roomNum").val(), ${prePrice},${vipInfo.level*3 });
            			
            				});
            		</script>
            		<br/>
            		<br/>

            		住客姓名:&nbsp;&nbsp;<input type="text" id="name" name="name"class="form-control" placeholder="填写本人真实姓名" style="width:80%;display:inline">
            		<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            		<span style="color:gray">所填姓名需与入住时所持证件一致</span>
            		<br/>
            		<br/>
            		<button type="button" id="myOrder" class="btn btn-primary btn-lg btn-block" onclick="checkForm(${vipInfo.balance})">预订</button>
					<input type="submit" id="sub" value="submit" style="display:none">
					<input type="text" id="myPoint" name="myPoint" style="display:none">
					<input type="text" id="myTotalPrice" name="myTotalPrice" style="display:none">
					<input type="text" id="myStartDate" name="myStartDate" value="${startDate }" style="display:none">
					<input type="text" id="myEndDate" name="myEndDate" value="${endDate }" style="display:none">
            		<input type="text" id="myBed" name="myBed" value="${preBed }" style="display:none">
            		<input type="text" id="hname" name="hname" value="${preHname }" style="display:none">
            		<input type="text" id="haddress" name="haddress" value="${preAddress }" style="display:none">
            		<input type="text" id="hlevel" name="hlevel" value="${preLevel }" style="display:none">
            		<input type="text" id="hphone" name="hphone" value="${prePhone }" style="display:none">
            		</form>
            	
	</div>
</div>

</body>
<script src="./js/toastr.js"></script>
<script type="text/javascript" src="./js/moment.min.js"></script>
<script type="text/javascript" src="./js/jquery.daterangepicker.min.js"></script>
<script src="./js/preOrder.js"></script>
</html>