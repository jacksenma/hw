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
<script type="text/javascript">
	$("#me").addClass("active");
</script> 
<div class="container" style="margin-top:50px">
	<c:if test="${vipInfo.state==0}"><h3 style="margin:0 auto">首充必须1000元及以上方可激活会员卡</h3></c:if>
	<div class="col-lg-4 col-lg-offset-4 col-sm-6 col-sm-offset-3 col-xs-8 col-xs-offset-2" >
		<span>会员卡余额:</span><span>${vipInfo.balance}</span>&nbsp;元<br/>
		<span>会员卡积分:</span><span>${vipInfo.point}</span>&nbsp;分<br/>
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