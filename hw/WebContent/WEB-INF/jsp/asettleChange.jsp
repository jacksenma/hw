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
<link href="css/toastr.css" rel="stylesheet"/>
<title>审批修改信息</title>
</head>
<body>
<%@ include file="/WEB-INF/jsp/anavigation.jsp"%>
<script type="text/javascript">
$("#approve").addClass("active");
</script>
    
 <c:if test="${hostelChange!=null }">
<div class="table-responsive" style="margin-top:50px" >
  <table class="table table-striped">
    <caption>待审批客栈修改信息</caption>
    <thead>
      <tr>
        <th>名称</th>
        <th>等级</th>
        <th>地址</th>
        <th>手机</th>
        <th>银行卡</th>
        <th>图片</th>
        <th>通过</th>
        <th>不通过</th>
      </tr>
    </thead>
    <tbody>
    <c:forEach items="${hostelChange}" var="h">
    	
    		<tr id="tr${h.id}">
    			<td>${h.name}</td>
    			<td>${h.level}</td>
    			<td>${h.province}${h.city}${h.district}</td>
    			<td>${h.phone}</td>
    			<td>${h.bankCard}</td>
    			<td><button class="btn btn-info btn-xs" data-toggle="modal" data-target="#${h.id}">查看图片</button></td>
    			<!-- 模态框（Modal） -->
<div class="modal fade" id="${h.id}" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h4 class="modal-title" id="myModalLabel">图片</h4>
            </div>
            <div class="modal-body"><img alt="" src="${h.imgUrl}" style="width:100%;height:100%"></div>
            <div class="modal-footer">
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
</div>
    			<td><button type="button" class="btn btn-success btn-xs" onclick='changepass("${h.id}")'>审批通过</button></td>
    			
    			<td><button type="button" class="btn btn-danger btn-xs" onclick='changenotPass("${h.id}")'>不予通过</button></td>
    		</tr>
    	
    </c:forEach>
    </tbody>
  </table>
  
</div>
</c:if>    
<c:if test="${hostelChange==null }">
<p style="margin-top:50px">暂无可审批的客栈修改信息。。。。。。</p>
</c:if>
</body>
<script src="./js/toastr.js"></script>
<script src="./js/asettleChange.js"></script>
</html>