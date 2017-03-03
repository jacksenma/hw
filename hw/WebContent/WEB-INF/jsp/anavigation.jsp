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

<!-- ??? Bootstrap ?? JavaScript ?? -->
<script src="http://cdn.bootcss.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
	<link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
	<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>总经理</title>
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
        		<li class="dropdown" id="approve">
                	<a href="#" class="dropdown-toggle" data-toggle="dropdown">
                   	 审批申请<b class="caret"></b>
                	</a>
                	<ul class="dropdown-menu">
                    	<li><a href="fasettleHostel">审批开店信息</a></li>
                    	<li><a href="fasettleChange">审批修改信息</a></li>
                	</ul>
           	 	</li>
        		
                <li class="op" id="pay"><a href="fapay">结算支付</a></li>
                <li class="dropdown" id="statistics">
                	<a href="#" class="dropdown-toggle" data-toggle="dropdown">
                   	 统计信息<b class="caret"></b>
                	</a>
                	<ul class="dropdown-menu">
                    	<li><a href="fastatistics">财务情况</a></li>
                    	<li><a href="faHostelCondition">客栈情况</a></li>
                    	<li><a href="faVipCondition">会员情况</a></li>
                	</ul>
           	 	</li>
                
        	</ul>
            <ul class="nav navbar-nav navbar-right"> 
            	<li><a href="index.jsp"><span class="glyphicon glyphicon-log-out"></span> 退出</a></li> 
            </ul>
        </div>
    </div>
    </nav>
</body>
<script type="text/javascript">
$(document).ready(function() { 
 $('#approve').hover(function() {
  $('ul', this).slideDown(200);
  $(this).children('a:first').addClass("hov");
 }, function() {
  $('ul', this).slideUp(100);
  $(this).children('a:first').removeClass("hov");  
 });
 $('#statistics').hover(function() {
	  $('ul', this).slideDown(200);
	  $(this).children('a:first').addClass("hov");
	 }, function() {
	  $('ul', this).slideUp(100);
	  $(this).children('a:first').removeClass("hov");  
	 });
});
</script>
</html>