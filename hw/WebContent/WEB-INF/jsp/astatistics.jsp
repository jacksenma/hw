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
<title>本站财务情况</title>
</head>
<body style="background-color:#F5F6EB;font-family:微软雅黑;">
<%@ include file="/WEB-INF/jsp/anavigation.jsp"%>
<script type="text/javascript">
$("#statistics").css({"color":"rgb(255, 255, 255)","background-color":"rgb(255,233,87)"});
</script>

<div class="col-lg-6 col-lg-offset-2 col-sm-6 col-sm-offset-3 col-xs-8 col-xs-offset-2" style="margin-top:100px" >
	<div id="Finance" style="width: 800px;height:500px;"></div>
</div>
</body>
<script src="http://cdn.bootcss.com/echarts/3.4.0/echarts.min.js"></script>
<script src="./js/astatistics.js"></script>
</html>