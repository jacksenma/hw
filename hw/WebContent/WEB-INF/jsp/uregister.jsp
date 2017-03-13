<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf8"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<!-- 下面这句用于响应移动设备的改变布局，必须写在前面  -->
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" />

<!-- 新 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.4/css/bootstrap.min.css">

<!-- 可选的Bootstrap主题文件（一般不用引入） -->


<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="http://cdn.bootcss.com/jquery/1.11.2/jquery.min.js"></script>

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="http://cdn.bootcss.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>

<!-- tostr -->
<link href="./css/uregister.css" rel="stylesheet"/>
<link href="./css/toastr.css" rel="stylesheet"/>
<title>用户注册</title>
</head>
<body style="font-family:微软雅黑;">

<div class="container">
	<div id="uregisterBox" class="col-lg-4 col-lg-offset-4 col-sm-6 col-sm-offset-3 col-xs-8 col-xs-offset-2" >
		<span id="loginSpan">用户注册</span>
		
		<form action="uregister" method="post" id="register">
			<div id="unameDIV" class="input-group input-group-lg">  
                <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>  
                <input type="text" class="form-control" id="uname" name="uname" onchange="isUser(this.value)" placeholder="请输入用户名">
            </div><br> 
			
			<div class="input-group input-group-lg">  
                <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>  
                <input type="password" class="form-control" id="upsd" name="upsd" placeholder="请输入密码(6~12位)">
            </div><br>
            
            <div class="input-group input-group-lg">  
                <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>  
                <input type="password" class="form-control" id="upsd2" name="upsd2" placeholder="请再次输入密码">
            </div>
			
			
			
			
			
			<button type="button" id="register1" class="btn btn-primary btn-lg btn-block" onclick="checkForm()">立即注册</button>
			<input type="submit" id="sub" value="submit" >
		</form>
	</div>
</div>

	



</body>
<script src="./js/toastr.js"></script>
<script src="./js/uregister.js"></script>
</html>