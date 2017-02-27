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

<link rel="stylesheet" href="./css/daterangepicker.min.css">


<title>发布计划</title>
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
        		<li class="dropdown active" id="approve">
                	<a href="#" class="dropdown-toggle" data-toggle="dropdown">
                   	住客登记<b class="caret"></b>
                	</a>
                	<ul class="dropdown-menu">
                    	 <li class="op " id="enter"><a href="#">入店登记</a></li>
                    	 <li class="op" id="leave"><a href="fhleave">离店登记</a></li>
                    </ul>
           	 	</li>
                <li class="op " id="plan"><a href="fhplan" >发布计划</a></li>
               
                
                <li class="op" id="statistics"><a href="fhstatistics">统计信息</a></li>
                <li class="op" id="change"><a href="fhchange" >修改信息</a></li>
        	</ul>
            <ul class="nav navbar-nav navbar-right"> 
            	<li><a href="index.jsp"><span class="glyphicon glyphicon-log-out"></span> 退出</a></li> 
            </ul>
        </div>
    </div>
    </nav>
<div class="container" style="margin-top:50px">
	<div class="col-lg-4 col-lg-offset-4 col-sm-6 col-sm-offset-3 col-xs-8 col-xs-offset-2" >
		<form class="form" action="henter" method="post" id="henter">
		    <span>入店时间:</span><input id="date-range13-2" name="enterDate" class="form-control" size="30" value="" placeholder="填写入店时间">
            <br/>
            <span>住客姓名:</span>
            <input type="text" id="uname" name="uname" class="form-control" placeholder="填写住客姓名">
            <br/>
            <span>身份证号码:</span>
            <input type="text" id="idCard" name="idCard" class="form-control" placeholder="填写住客身份证号码">
            <br/>
			<span>房间类型:</span>
				<select class="form-control" id="bed" name="bed" >
      			<option >标准单人房</option>
      			<option >标准双人房</option>
      			<option >豪华单人房</option>
      			<option >豪华双人房</option>
      			</select><br/>
			<span>房间数量:</span><input type="text" class="form-control" id="num" name="num" placeholder="请输入房间数量" ><br/>
            <input type="text" id="hid" name="hid" value="${hostelInfo.id }" style="display:none">
            <button type="button" id="ed" class="btn btn-primary btn-lg btn-block" onclick="checkForm()">保存</button>
            <input type="submit" id="sub" value="submit" style="display:none">
            <input type="reset" id="rs" value="reset" style="display:none">
         </form>
	</div>
</div>    

</body>
<script src="./js/toastr.js"></script>
<script type="text/javascript" src="./js/moment.min.js"></script>
<script type="text/javascript" src="./js/jquery.daterangepicker.min.js"></script>
<script type="text/javascript" src="./js/hmain.js"></script>
</html>