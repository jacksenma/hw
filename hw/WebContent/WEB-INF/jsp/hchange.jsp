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
<link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.4/css/bootstrap-theme.min.css">

<!-- jQuery??????bootstrap.min.js ???? -->
<script src="http://cdn.bootcss.com/jquery/1.11.2/jquery.min.js"></script>

<!-- ??? Bootstrap ?? JavaScript ?? -->
<script src="http://cdn.bootcss.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>

<!-- tostr -->
<link href="./css/toastr.css" rel="stylesheet"/>
<link href="./css/fileinput.min.css" rel="stylesheet"/>
<link href="./css/hchange.css" rel="stylesheet"/>

<title>修改信息</title>

修改信息
</head>
<body>
<!-- 顶部导航栏 -->
    <nav class="navbar navbar-inverse navbar-fixed-top" >
    <div class="container">
        <div class="navbar-header">

            <a class="navbar-brand" href="#">Hostel World</a>

            <!-- 分辨率低时显示的弹出顶部导航栏的按钮 <a class="navbar-brand" href="#home" data-toggle="tab">Hostel World</a>-->
            <button type="button" class="navbar-toggle collapsed"
                data-toggle="collapse" data-target="#navbar" aria-expanded="false"
                aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span> <span
                    class="icon-bar"></span> <span class="icon-bar"></span> <span
                    class="icon-bar"></span>
            </button>

        </div>
        <div id="navbar" class="navbar-collapse collapse">
        
        	<ul class="nav navbar-nav">
                <li class="op " id="plan"><a href="hplan" >发布计划</a></li>
                <li class="op" id="register"><a href="hed">入离登记</a></li>
                <li class="op" id="statistics"><a href="hstatistics">统计信息</a></li>
                <li class="op active" id="change"><a href="hchange" >修改信息</a></li>
        	</ul>
            <ul class="nav navbar-nav navbar-right"> 
            	<li><a href="index.jsp"><span class="glyphicon glyphicon-log-out"></span> 退出</a></li> 
            </ul>
        </div>
    </div>
    </nav>
    
    <!-- 主题form -->
    <div class="container" style="margin-top:50px">
	<div class="col-lg-4 col-lg-offset-4 col-sm-6 col-sm-offset-3 col-xs-8 col-xs-offset-2" >
		<form class="form" action="hchange" method="post" enctype="multipart/form-data" id="hregister">
            <span>客栈名称:</span><input type="text" class="form-control" id="hname" name="hname" placeholder="请输入客栈名" value="${hostelInfo.name }"><br/>
			<span>客栈级别:</span>
				<select class="form-control" id="level" name="level" >
      			<option <c:if test="${hostelInfo.level=='五星级/豪华' }">selected</c:if> >五星级/豪华</option>
      			<option <c:if test="${hostelInfo.level=='四星级/高档' }">selected</c:if>>四星级/高档</option>
      			<option <c:if test="${hostelInfo.level=='三星级/舒适' }">selected</c:if>>三星级/舒适</option>
      			<option <c:if test="${hostelInfo.level=='二星级及以下/经济' }">selected</c:if>>二星级及以下/经济</option>
    			</select><br/>
			<span>客栈地址:</span>
			<div data-toggle="distpicker" class="nodisplay">
  				<select style="width:33%" class="form-control col-lg-1" id="province" name="province" data-province="${hostelInfo.province }"></select>
  				<select style="width:34%"class="form-control col-lg-2" id="city" name="city" data-city="${hostelInfo.city }"></select>
  				<select style="width:33%"class="form-control col-lg-1" id="district" name="district" data-district="${hostelInfo.district }"></select>
			</div><br/>
			<span>手机号码:</span><input type="text" class="form-control" id="phone" name="phone" placeholder="请输入手机号" value="${hostelInfo.phone }"><br/>
			<span>银行卡号:</span><input type="text" class="form-control" id="bankCard" name="bankCard" placeholder="请输入银行卡号" value="${hostelInfo.bankCard }"><br/>
            <span>客栈图片:</span><input id="input-1" name="file" type="file" multiple class="file-loading" accept="image/*"/><br/>
            <script>
                $(document).on('ready', function() {
                    $("#input-1").fileinput({
                        uploadAsync:false,
                        language: 'zh',
                        showUpload: false,
                        maxFileCount: 1,
                        mainClass: "input-group-lg",
                        
                        
                    });
                });
            </script>
            <button type="button" id="register" class="btn btn-primary btn-lg btn-block" onclick="checkForm()">确认修改</button>
            <input type="text" id="imgUrl" name="imgUrl" value="${hostelInfo.imgUrl }" style="display:none" >
            <input type="text" id="hid" name="hid" value="${hostelInfo.id }" style="display:none">
            <input type="text" id="psd" name="psd" value="${hostelInfo.password }" style="display:none" >
            <input type="text" id="state" name="state" value="${hostelInfo.state }" style="display:none">
            <input type="submit" id="sub" value="submit" style="display:none">
            
            
            
</form>
	</div>
</div>


</body>
<script src="./js/toastr.js"></script>
<script src="./js/fileinput.min.js"></script>
<script src="./js/fileinput_locale_zh.js"></script>
<script src="./js/distpicker.data.js"></script>
<script src="./js/distpicker.js"></script>
<script src="./js/main.js"></script>
<script src="./js/hchange.js"></script>
</html>