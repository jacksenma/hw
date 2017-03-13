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
<link href="./css/toastr.css" rel="stylesheet"/>

<link rel="stylesheet" href="./css/daterangepicker.min.css">

<link rel="stylesheet" href="./css/hmain.css">
<title>住店登记</title>
</head>

<body style="background-color:#F5F6EB;font-family:微软雅黑;">
<%@ include file="/WEB-INF/jsp/hnavigation.jsp"%>
<script type="text/javascript">
$("#enterAndLeave").css({"color":"rgb(255, 255, 255)","background-color":"rgb(255,233,87)"});
</script>
<div id="container" >
	<div id="enterBox" class="col-lg-4 col-lg-offset-4 col-sm-6 col-sm-offset-3 col-xs-8 col-xs-offset-2" >
	
	<ul id="myTab" class="nav nav-tabs">
    <li class="active">
        <a href="#yesVip" data-toggle="tab">
                            会员入住
        </a>
    </li>
    <li>
    	<a href="#notVip" data-toggle="tab">
    	非会员入住
    	</a>
    </li>
    
	</ul>

<div id="myTabContent" class="tab-content">
    <div class="tab-pane fade in active" id="yesVip">
       <form class="form" action="henter" method="post" id="henter">
       		<div>
		    <span>会员编号:</span>
		    <input type="text" id="vipId" name="vipId" class="form-control" placeholder="填写会员编号">
         	</div>  
         	 <div>
            <span>会员密码:</span>
            <input type="password" id="vipPassword" name="vipPassword" class="form-control" onchange='getOrder("${hostelInfo.id }")' placeholder="填写会员密码">
            </div>
            <div>
            <span>住客姓名:</span>
            <input type="text" id="uname" name="uname" class="form-control" placeholder="填写住客姓名">
           </div>
           <div>
			<span>房间类型:</span>
				<select class="form-control" id="bed" name="bed" >
      			<option id="b1">标准单人房</option>
      			<option id="b2">标准双人房</option>
      			<option id="b3">豪华单人房</option>
      			<option id="b4">豪华双人房</option>
      			</select>
      			</div>
      		<div>
			<span>房间数量:</span>
			<input type="text" class="form-control" id="num" name="num" placeholder="请输入房间数量" ><br/>
            </div>
            <input type="text" id="hid" name="hid" value="${hostelInfo.id }" style="display:none">
            <button type="button" id="ed" class="btn btn-primary btn-lg btn-block" onclick="checkForm()">保存</button>
            <input type="submit" id="sub" value="submit" style="display:none">
            <input type="reset" id="rs" value="reset" style="display:none">
         </form>
    </div>
    <div class="tab-pane fade" id="notVip">
        <form class="form" action="henterNotVip" method="post" id="henterNotVip">
            <div>
            <span>住客姓名:</span>
            <input type="text" id="nuname" name="nuname" class="form-control" placeholder="填写住客姓名">
            </div>
            <div>
            <span>身份证号码:</span>
            <input type="text" id="nidCard" name="nidCard" class="form-control" placeholder="填写住客身份证号码">
            </div>
            <div>
			<span>房间类型:</span>
				<select class="form-control" id="nbed" name="nbed" >
      			<option >标准单人房</option>
      			<option >标准双人房</option>
      			<option >豪华单人房</option>
      			<option >豪华双人房</option>
      			</select>
      			</div>
			<div>
			<span>房间数量:</span><input type="text" class="form-control" id="nnum" name="nnum" placeholder="请输入房间数量" ><br/>
            </div>
            <input type="text" id="nhid" name="nhid" value="${hostelInfo.id }" style="display:none">
            
            <button type="button" id="ned" class="btn btn-primary btn-lg btn-block" onclick="checkFormNotVip()">保存</button>
            <input type="submit" id="nsub" value="submit" style="display:none">
            <input type="reset" id="nrs" value="reset" style="display:none">
         </form>
    </div>
    
</div>
		
	</div>
</div>    

</body>
<script src="./js/toastr.js"></script>
<script type="text/javascript" src="./js/moment.min.js"></script>
<script type="text/javascript" src="./js/jquery.daterangepicker.min.js"></script>
<script type="text/javascript" src="./js/hmain.js"></script>
</html>