<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf8"%>
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

<!-- tostr -->
<title>统计信息</title>
</head>
<body>
<%@ include file="/WEB-INF/jsp/hnavigation.jsp"%>
<script type="text/javascript">
$("#statistics").addClass("active");
</script>
	<div class="container" style="margin-top:50px">
    	<ul id="myTab" class="nav nav-tabs">
    		<li class="active">
        		<a href="#showOandC" data-toggle="tab" id="tabOandC">
                	预订/退订情况
        		</a>
    		</li>
    		<li>
    			<a href="#showEandL" data-toggle="tab" id="tabEandL">
    			入住/退房情况
    			</a>
    		</li>
    		<li>
    			<a href="#showFinance" data-toggle="tab" id="tabFinance">
    			财务明细情况
    			</a>
    		</li>
    
		</ul>
		
		<div id="myTabContent" class="tab-content">
    		<div class="tab-pane fade in active" id="showOandC">
        		<div id="OandC" style="width: 600px;height:400px;"></div>
    		</div>
    		<div class="tab-pane fade" id="showEandL">
        		<div id="EandL" style="width: 600px;height:400px;"></div>
    		</div>
    		<div class="tab-pane fade" id="showFinance">
        		<div id="Finance" style="width: 600px;height:400px;"></div>
    		</div>
    
		</div>
    
    
    
</div>
</body>
<script src="http://cdn.bootcss.com/echarts/3.4.0/echarts.min.js"></script>
<script src="./js/hstatistics.js"></script>

</html>