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

<title>修改信息</title>
</head>
<body>
<%@ include file="/WEB-INF/jsp/unavigation.jsp"%>
<script type="text/javascript">
	$("#me").addClass("active");
</script>
<div class="container" style="margin-top:50px">
	
	<div class="col-lg-4 col-lg-offset-4 col-sm-6 col-sm-offset-3 col-xs-8 col-xs-offset-2" >
		<form class="form" action="vchange" method="post" enctype="multipart/form-data" id="vipchange">
            <span>会员卡编号:</span><span>${vipInfo.id}</span><br/>
            <span>会员卡状态:</span>
            <c:if test="${vipInfo.state==0}"><span style="color:gray">未激活</span></c:if>
            <c:if test="${vipInfo.state==1}"><span style="color:green">正常</span></c:if>
            <c:if test="${vipInfo.state==2}"><span style="color:orange">暂停记录</span></c:if>
            <c:if test="${vipInfo.state==3}"><span style="color:red">停止记录</span>(该会员卡不可用,请取消会员之后重新注册会员)</c:if>
            <button type="button" style="float:right" class="btn btn-danger btn-xs" data-toggle="modal" data-target="#vipCancel">取消会员资格</button>
            <br/>
            <span>会员卡余额:</span><span>${vipInfo.balance}</span>&nbsp;元<br/>
            <span>会员卡等级:</span><span>${vipInfo.level}</span><br/>
            <span>会员卡积分:</span><span>${vipInfo.point}</span><br/>
            <span>身份证信息:</span><span>${vipInfo.idCard}</span><br/>
            <span>手机号码:</span><input type="text" class="form-control" id="phone" name="phone" value="${vipInfo.phone }" placeholder="请输入本手机号码" <c:if test="${vipInfo.state==3}">disabled</c:if>><br/>
            <span>银行卡号:</span><input type="text" class="form-control" id="bc" name="bc" value="${vipInfo.bankCard }" placeholder="请输入要绑定的银行卡号" <c:if test="${vipInfo.state==3}">disabled</c:if>><br/>
            <button type="button" id="recharge" class="btn btn-primary btn-lg btn-block" onclick='checkForm()' <c:if test="${vipInfo.state==3}">disabled</c:if>>确认修改</button>
            <input type="text" id="vid" name="vid" value="${vipInfo.id }" style="display:none">
            <input type="text" id="vstate" name="vstate" value="${vipInfo.state }" style="display:none">
            <input type="submit" id="sub" value="submit" style="display:none">
            
</form>
	</div>
</div>
<div class="modal fade" id="vipCancel" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h4 class="modal-title" id="myModalLabel">取消会员资格</h4>
            </div>
            <div class="modal-body">
            	<h3>此操作将取消你的会员资格，您将无法再享受相应的会员特权，是否确定?</h3>
            	</div>
            <div class="modal-footer">
            <form action="vipCancel">
            		<input type="text" id="vid" name="vid" value="${vipInfo.id }" style="display:none">
            		<input type="text" id="uid" name="uid" value="${vipInfo.uid }" style="display:none">
            		<!-- <button type="button" onclick='vCancel' class="btn btn-primary">确定</button>
            		<input type="submit" style="display:none" id="subCancel"> -->
            		<input type="submit" class="btn btn-primary" value="确定">
            		<button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
            	</form>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
</div>




</body>
<script src="./js/toastr.js"></script>
<script src="./js/vipChange.js"></script>
</html>