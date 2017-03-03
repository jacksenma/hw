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
<link href="css/toastr.css" rel="stylesheet"/>
<title>审批开店信息</title>
</head>
<body>
<%@ include file="/WEB-INF/jsp/anavigation.jsp"%>
<script type="text/javascript">
$("#statistics").addClass("active");
</script>
<div class="container" style="margin-top:50px">
<div id="showPage">
<table class="table table-striped">
    <caption>查看客栈入住/退房情况</caption>
    <thead>
      <tr>
        <th>序号</th>
        <th>客栈编号</th>
        <th>客栈名称</th>
        <th>客栈地址</th>
        <th>联系电话</th>
        <th>查看</th>
        
      </tr>
    </thead>
    <tbody>
	</tbody>
</table>
<div id="pageControl" class="col-lg-4 col-lg-offset-4 col-sm-6 col-sm-offset-3 col-xs-8 col-xs-offset-2">
	<ul class="pager">
    <li class="previous" ><a onclick="previous()">&larr; 上一页</a></li>
    <span>第</span><input value="1" type="text" class="form-control" id="pageId" style="width: 15%;display:inline"><span>页/<span id="total" value="${totalPage }">${totalPage }</span>页</span>
    <button onclick="page()" class="btn btn-primary btn-sm ">前往</button>
    <li class="next" ><a onclick="next()">下一页 &rarr;</a></li>
	</ul>
</div>

<div class="modal fade" id="mymodal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h4 class="modal-title" id="myModalLabel">客栈入住/退房情况图</h4>
            </div>
            <div class="modal-body">
            	<div id="OandC" style="width: 600px;height:400px;"></div>
            </div>
            <div class="modal-footer">
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
</div>
</div>
</div>
</body>
<script src="./js/toastr.js"></script>
<script src="./js/aHostelCondition.js"></script>
</html>