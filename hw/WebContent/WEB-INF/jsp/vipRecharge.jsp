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


<!-- jQuery??????bootstrap.min.js ???? -->
<script src="http://cdn.bootcss.com/jquery/1.11.2/jquery.min.js"></script>

<!-- ??? Bootstrap ?? JavaScript ?? -->
<script src="http://cdn.bootcss.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>

<!-- tostr -->

<link href="./css/toastr.css" rel="stylesheet"/>
<link href="./css/vipRecharge.css" rel="stylesheet"/>
<title>会员充值</title>
</head>
<body style="background-color:#F5F6EB;font-family:微软雅黑;">
<%@ include file="/WEB-INF/jsp/unavigation.jsp"%>
<script type="text/javascript">
	$("#me").css({"color":"rgb(255, 255, 255)","background-color":"rgb(255,233,87)"});
</script> 
<div  style="margin-top:50px">
<div style="margin: 0 auto;background: url(img/recharge.jpg);background-size:100%;background-position:0 0px;height:200px">
	<div style="text-align: center;margin: 0 auto;"><font color="#ffffff"><span style="font-size: 30px;">————————</span></font></div>
	<div style="text-align: center;margin: 0 auto;"><b style="color: rgb(255, 255, 255); font-size: 30px; background-color: transparent;">&nbsp;会员充值</b></div>
	<div style="text-align: center;margin: 0 auto;"><span style="color: rgb(255, 255, 255); font-size: 30px; background-color: transparent;">————————</span></div>
	<div style="text-align: center;margin: 0 auto;"><b style="color: rgb(255, 255, 255); font-size: 18px; background-color: transparent;">&nbsp;<c:if test="${vipInfo.state==0}">首充1000元及以上激活会员卡</c:if>
	<c:if test="${vipInfo.state!=0}">网银或积分充值</c:if></b></div>
	
</div>
	
	<div id="rechargeDIV" class="col-lg-4 col-lg-offset-4 col-sm-6 col-sm-offset-3 col-xs-8 col-xs-offset-2" >
		<span>会员卡余额:</span><span style="font-weight:800;font-size:20px;color: rgb(242, 117, 63);">${vipInfo.balance}</span>&nbsp;元<br/>
		<span>会员卡积分:</span><span style="font-weight:800;font-size:20px;color: rgb(25, 148, 117);">${vipInfo.point}</span>&nbsp;分<br/>
<br>
<ul id="myTab" class="nav nav-tabs">
    <li class="active">
        <a href="#bank" data-toggle="tab">
                            网银充值
        </a>
    </li>
    <li>
    	<a href="#point" data-toggle="tab">
    	积分充值
    	</a>
    </li>
    
</ul>
<div id="myTabContent" class="tab-content">
    <div class="tab-pane fade in active" id="bank">
        <form class="form" action="vrecharge" method="post" enctype="multipart/form-data" id="viprecharge">
            <br>
            <span style="width:26%;display:inline">充值金额(元):</span><input type="text" style="width:54%;display:inline" class="form-control" id="money" name="money" placeholder="输入充值金额">
            <button type="button" id="recharge" style="width:20%;display:inline" class="btn btn-primary btn-sm" onclick='checkForm()'>立即充值</button>
            <input type="text" id="vid" name="vid" value="${vipInfo.id }" style="display:none">
            <input type="text" id="uid" name="uid" value="${vipInfo.uid }" style="display:none">
            <input type="text" id="vstate" name="vstate" value="${vipInfo.state }" style="display:none">
            <input type="text" id="vbalance" name="vbalance" value="${vipInfo.balance }" style="display:none">
             <input type="text" id="vbankBalance" name="vbankBalance" value="${vipInfo.bankBalance }" style="display:none">
            <input type="submit" id="sub" value="submit" style="display:none">
         </form>
    </div>
    <div class="tab-pane fade" id="point">
        <form class="form" action="vrechargep" method="post" enctype="multipart/form-data" id="viprechargep">
            <br>
            <span style="width:26%;display:inline">充值积分(分):</span><input type="text" style="width:54%;display:inline" class="form-control" id="moneyp" name="moneyp" placeholder="输入充值积分(1积分=1元)">
            <button type="button" id="rechargep" style="width:20%;display:inline" class="btn btn-primary btn-sm" onclick='checkFormp()'>立即充值</button>
            <input type="text" id="vidp" name="vidp" value="${vipInfo.id }" style="display:none">
            <input type="text" id="uidp" name="uidp" value="${vipInfo.uid }" style="display:none">
            <input type="text" id="vstatep" name="vstatep" value="${vipInfo.state }" style="display:none">
            <input type="text" id="vbalancep" name="vbalancep" value="${vipInfo.balance }" style="display:none">
             <input type="text" id="vpointp" name="vpointp" value="${vipInfo.point }" style="display:none">
            <input type="submit" id="subp" value="submit" style="display:none">
         </form>
    </div>
    
</div>
	</div>
</div>




</body>
<script src="./js/toastr.js"></script>

<script src="./js/vipRecharge.js"></script>
</html>