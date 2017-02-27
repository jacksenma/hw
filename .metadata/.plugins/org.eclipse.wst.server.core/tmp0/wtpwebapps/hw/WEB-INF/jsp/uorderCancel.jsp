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
<link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.4/css/bootstrap-theme.min.css">

<!-- jQuery??????bootstrap.min.js ???? -->
<script src="http://cdn.bootcss.com/jquery/1.11.2/jquery.min.js"></script>

<!-- ??? Bootstrap ?? JavaScript ?? -->
<script src="http://cdn.bootcss.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>

<link href="./css/toastr.css" rel="stylesheet"/>
<title>用户</title>
</head>
<body>
<%@ include file="/WEB-INF/jsp/unavigation.jsp"%>
<script type="text/javascript">
$("#orderCancel").addClass("active");
</script>
<div class="container" style="margin-top:50px">
<table class="table table-striped">
    <caption>我的订单</caption>
    <thead>
      <tr>
      	<th>住客姓名</th>
        <th>入住时间</th>
        <th>退房时间</th>
        <th>客栈名称</th>
        <th>客栈地址</th>
        <th>客栈星级</th>
        <th>联系电话</th>
        <th>房间类型</th>
        <th>预订数量</th>
        <th>总计房费</th>
        <th>取消预订</th>
      </tr>
    </thead>
    <tbody>
    <c:forEach items="${myOrdersInfo}" var="o">
    		<tr id="tr${o.id }">
    			<td>${o.name}</td>
    			<td>${o.startDate}</td>
    			<td>${o.endDate}</td>
    			<td>${o.hname}</td>
    			<td>${o.haddress}</td>
    			<td>${o.hlevel}</td>
    			<td>${o.hphone}</td>
    			<td>${o.bed}</td>
    			<td>${o.num}</td>
    			<td>${o.price}</td>
    			<td><button class="btn btn-info btn-xs" data-toggle="modal" data-target="#${o.id}">取消预订</button></td>
    			<!-- 模态框（Modal） -->
    			<div class="modal fade" id="${o.id}" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    				<div class="modal-dialog">
        				<div class="modal-content">
            				<div class="modal-header">
                				<button type="button" id="rs1" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                				<h4 class="modal-title" id="myModalLabel">取消预订</h4>
            				</div>
            				<div class="modal-body">
            					<h3>此操作将取消本次预定，只返还总计房费80%,并将从您的会员卡上扣除本次预定的积分收益,是否确定?</h3>
            				</div>
            				<div class="modal-footer">
            				<form action="orderCancel" method="post" id="form${o.id }">
            					<input type="text" id="oid" name="oid" value="${o.id }" style="display:none">
            		
            					<!-- <button type="button" onclick='vCancel' class="btn btn-primary">确定</button>
            					<input type="submit" style="display:none" id="subCancel"> -->
            					<button type="button" class="btn btn-primary" onclick="checkForm(form${o.id },tr${o.id },${o.id })">确定</button>
            					<input type="submit" id="sub" style="display:none">
            					<input type="text" id="vid" name="vid" value="${o.vid }" style="display:none">
            					<input type="text" id="cancelPrice" name="cancelPrice" value="${o.price }" style="display:none">
            					<button type="button" id="rs" class="btn btn-default" data-dismiss="modal">取消</button>
            				</form>
            				</div>
        				</div><!-- /.modal-content -->
    				</div><!-- /.modal -->
</div>

    			
    		</tr>
    	
    </c:forEach>
    </tbody>
  </table>
</div>
</body>
<script src="./js/toastr.js"></script>
<script src="./js/toastrInit.js"></script>
<script src="./js/uorderCancel.js"></script>
</html>