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
<link href="./css/fileinput.min.css" rel="stylesheet"/>

<link href="./css/hregister.css" rel="stylesheet"/>
<title>Insert title here</title>
</head>
<body>
<div class="container">
	<div class="col-lg-4 col-lg-offset-4 col-sm-6 col-sm-offset-3 col-xs-8 col-xs-offset-2" >
		<form class="form" action="hregister" method="post" enctype="multipart/form-data" id="hregister">
            <span>客栈名称:</span><input type="text" class="form-control" id="hname" name="hname" placeholder="请输入用户名"><br/>
			<span>客栈级别:</span>
				<select class="form-control" id="level" name="level">
      			<option>五星级/豪华</option>
      			<option>四星级/高档</option>
      			<option>三星级/舒适</option>
      			<option>二星级及以下/经济</option>
    			</select><br/>
			<span>客栈地址:</span>
			<div data-toggle="distpicker">
  				<select style="width:33%" class="form-control col-lg-1" id="province" name="province"></select>
  				<select style="width:34%"class="form-control col-lg-2" id="city" name="city"></select>
  				<select style="width:33%"class="form-control col-lg-1" id="district" name="district"></select>
			</div><br/>
			<span>手机号码:</span><input type="text" class="form-control" id="phone" name="phone" placeholder="请输入手机号"><br/>
			<span>银行卡号:</span><input type="text" class="form-control" id="bankCard" name="bankCard" placeholder="请输入银行卡号"><br/>
            <span>客栈图片:</span><input id="input-1" name="file" type="file" multiple class="file-loading" accept="image/*"/><br/>
            <script>
                $(document).on('ready', function() {
                    $("#input-1").fileinput({
                        uploadAsync:false,
                        language: 'zh',
                        showUpload: false,
                        maxFileCount: 1,
                        mainClass: "input-group-lg"
                    });
                });
            </script>
            <button type="button" id="register" class="btn btn-primary btn-lg btn-block" onclick="checkForm()">立即注册</button>
            <input type="submit" id="sub" value="submit" style="display:none">
            
</form>
	</div>
</div>




</body>
<script src="./js/toastr.js"></script>
<script src="./js/hregister.js"></script>
<script src="./js/fileinput.min.js"></script>
<script src="./js/fileinput_locale_zh.js"></script>
<script src="./js/distpicker.data.js"></script>
<script src="./js/distpicker.js"></script>
<script src="./js/main.js"></script>
</html>