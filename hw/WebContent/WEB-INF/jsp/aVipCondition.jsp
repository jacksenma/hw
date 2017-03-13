<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<!-- ???????????????????????? -->
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" />

<!-- ? Bootstrap ?? CSS ?? -->
<link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.4/css/bootstrap.min.css">

<!-- ???Bootstrap???????????? -->


<!-- jQuery??????bootstrap.min.js ???? -->
<script src="http://cdn.bootcss.com/jquery/1.11.2/jquery.min.js"></script>

<!-- ??? Bootstrap ?? JavaScript ?? -->
<script src="http://cdn.bootcss.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>


<!-- tostr -->
<link href="css/toastr.css" rel="stylesheet"/>
<title>会员情况</title>
</head>
<body style="background-color:#F5F6EB;font-family:微软雅黑;">
<%@ include file="/WEB-INF/jsp/anavigation.jsp"%>
<script type="text/javascript">
$("#statistics").css({"color":"rgb(255, 255, 255)","background-color":"rgb(255,233,87)"});
</script>

<div class="col-lg-6 col-lg-offset-2 col-sm-6 col-sm-offset-3 col-xs-8 col-xs-offset-2" style="margin-top:66px" >
	

	<ul id="myTab" class="nav nav-tabs">
    		<li class="active">
        		<a onclick="showVipOrder()" href="#showVipOrder" data-toggle="tab" id="tabVipOrder">
                	会员预定情况
        		</a>
    		</li>
    		<li>
    			<a onclick="showVipFinance()" href="#showVipFinance" data-toggle="tab" id="tabVipFinance">
    				会员消费情况
    			</a>
    		</li>
    
		</ul>
		
		<div id="myTabContent" class="tab-content">
    		<div class="tab-pane fade in active" id="showVipOrder">
        		<div id="VipOrder" style="width: 800px;height:500px;"></div>
    		</div>
    		<div class="tab-pane fade" id="showVipFinance">
        		<div id="VipFinance" style="width: 800px;height:500px;"></div>
    		</div>
    
		</div>

</div>
</body>
<script src="http://cdn.bootcss.com/echarts/3.4.0/echarts.min.js"></script>
<script src="./js/toastr.js"></script>
<script src="./js/aVipCondition.js"></script>
</html>