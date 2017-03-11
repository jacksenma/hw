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


<!-- jQuery??????bootstrap.min.js ???? -->
<script src="http://cdn.bootcss.com/jquery/1.11.2/jquery.min.js"></script>

<!-- ??? Bootstrap ?? JavaScript ??<link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/4.0.0-alpha.6/css/bootstrap.css"> -->
<script src="http://cdn.bootcss.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.4/css/bootstrap.min.css">


<!-- tostr -->
<link href="css/login.css" rel="stylesheet"/>
<link href="css/toastr.css" rel="stylesheet"/>
<title>Login</title>
</head>
<body >
	<div class="container">
	<div id="loginBox" class="col-lg-4 col-lg-offset-4 col-sm-6 col-sm-offset-3 col-xs-8 col-xs-offset-2" >
		
		<span id="loginSpan">登录</span>
		
		<form action="login" method="post" id="login">
			<div class="input-group input-group-lg">  
                <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>  
                <input type="text" class="form-control" id="loginName" name="loginName" placeholder="请输入用户名">  
            </div><br>  
            
        	<div class="input-group input-group-lg">  
                <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>  
                <input type="password" class="form-control" id="loginPsd" name="loginPsd" placeholder="请输入密码">
            </div>
            <a href="userRegister" id="usup"><u>用户注册</u></a>
			<a href="hostelRegister" id="hsup"><u>客栈注册</u></a>
			<button type="button" id="login1" class="btn btn-primary btn-lg btn-block" onclick="checkLogin()">登录</button>
			<input type="submit" id="sub" value="submit" style="display:none">
			
		</form>
	</div>
</div>

</body>
<script src="js/toastr.js"></script>
<script src="js/login.js"></script>
</html>