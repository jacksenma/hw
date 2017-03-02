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
<%@ include file="/WEB-INF/jsp/hnavigation.jsp"%>
<script type="text/javascript">
$("#plan").addClass("active");
</script>
<div class="container" style="margin-top:50px">
	<div class="col-lg-4 col-lg-offset-4 col-sm-6 col-sm-offset-3 col-xs-8 col-xs-offset-2" >
		<form class="form" action="hplan" method="post" id="hplan">
		<span>时间阶段:</span><span id="two-inputs"><input type="text" class="form-control" id="date-range200" name="startDate" size="20" value="" placeholder="开始时间" style="width:38.4%;display:inline"> to <input type="text" class="form-control" id="date-range201" name="endDate" size="20" value="" placeholder="结束时间" style="width:38.4%;display:inline"></span>
            <br/>
            
			<span>房间类型:</span>
				<select class="form-control" id="bed" name="bed" >
      			<option >标准单人房</option>
      			<option >标准双人房</option>
      			<option >豪华单人房</option>
      			<option >豪华双人房</option>
      			</select><br/>
			<span>房间数量:</span><input type="text" class="form-control" id="num" name="num" placeholder="请输入房间数量" ><br/>
			<span>每晚价格:</span><input type="text" class="form-control" id="price" name="price" placeholder="请输入房间每晚价格" ><br/>
            <input type="text" id="hid" name="hid" value="${hostelInfo.id }" style="display:none">
            <button type="button" id="plan" class="btn btn-primary btn-lg btn-block" onclick="checkForm()">确认发布</button>
            <input type="submit" id="sub" value="submit" style="display:none">
            <input type="reset" id="rs"  style="display:none">
         </form>
	</div>
</div>

</body>
<script src="./js/toastr.js"></script>
<script type="text/javascript" src="./js/moment.min.js"></script>
<script type="text/javascript" src="./js/jquery.daterangepicker.min.js"></script>
<script type="text/javascript" src="./js/date.js"></script>
<script type="text/javascript" src="./js/hplan.js"></script>
</html>