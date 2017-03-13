<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf8"%>
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
	<link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
	<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<link href="./css/unavigation.css" rel="stylesheet"/>
<title>取消预订</title>
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
        		<li class="op" id="order"><a href="fuorder">预定客栈</a></li>
        		 <c:if test="${vipInfo.state==1 }">
        			<li class="op" id="orderCancel"><a href="fuorderCancel">我的订单</a></li>
                	<li class="op" id="statistics"><a href="fustatistics">统计信息</a></li>
        		</c:if>
        	</ul>
        	
            <ul class="nav navbar-nav navbar-right"> 
            	<li class="op1"><a href="index.jsp"><span class="glyphicon glyphicon-log-out"></span> 退出</a></li> 
            </ul>
            <ul class="nav navbar-nav navbar-right"> 
            	 <li class="op dropdown" id="me">
                	<a href="#" class="dropdown-toggle"  data-toggle="dropdown">
                	<c:if test="${userInfo.role==0 }">个人信息</c:if>
                	<c:if test="${userInfo.role==1 }">会员中心</c:if>
                   	 <b class="caret"></b>
                	</a>
                	<ul class="dropdown-menu">
                	<li><a href="#">修改密码</a></li>
                    	<c:if test="${userInfo.role==0 }"><li><a href="fvipRegister">注册会员</a></li></c:if>
                    	<c:if test="${userInfo.role==1 }">
                    	<li><a href="fvipRecharge">会员充值</a></li>
                    	<li><a href="fvipChange">修改信息</a></li>
                    	<li><a href="#" data-toggle="modal" data-target="#vipCancel">取消资格</a></li>
                    	
                        </c:if>
                    	
                	</ul>
           	 	</li>
            </ul>
        </div>
    </div>
    </nav>
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
<script type="text/javascript">
$(document).ready(function() { 
 $('#me').hover(function() {
  $('ul', this).slideDown(200);
  $(this).children('a:first').addClass("hov");
 }, function() {
  $('ul', this).slideUp(100);
  $(this).children('a:first').removeClass("hov");  
 });
});
</script>
</html> 