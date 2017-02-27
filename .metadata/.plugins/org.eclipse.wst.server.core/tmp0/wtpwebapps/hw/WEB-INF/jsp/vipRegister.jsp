<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
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

<!-- tostr -->

<link href="./css/toastr.css" rel="stylesheet"/>

<title>会员注册</title>
</head>
<body>
<%@ include file="/WEB-INF/jsp/unavigation.jsp"%>
<div class="container" style="margin-top:50px">
	<div class="col-lg-4 col-lg-offset-4 col-sm-6 col-sm-offset-3 col-xs-8 col-xs-offset-2" >
		<form class="form" action="vregisterTrue" method="post" enctype="multipart/form-data" id="vipregister">
            <span>手机号码:</span><input type="text" class="form-control" id="phone" name="phone" placeholder="请输入手机号"><br/>
			<span>银行卡号:</span><input type="text" class="form-control" id="bankCard" name="bankCard" placeholder="请输入银行卡号"><br/>
			<span>身份证:</span><input type="text" class="form-control" id="idCard" name="idCard" placeholder="请输入身份证号"><br/>
            <button type="button" id="register" class="btn btn-primary btn-lg btn-block" onclick="checkForm()">立即注册</button>
            <input type="text" id="uid" name="uid" value="${userInfo.id }" style="display:none">
            <input type="submit" id="sub" value="submit" style="display:none">
            
</form>
	</div>
</div>




</body>
<script src="./js/toastr.js"></script>
<script src="./js/vipRegister.js"></script>
</html>