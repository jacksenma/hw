function checkForm(fid,trid,modalid) {
	//TODO增加对手机号和银行卡号的格式校验
//	alert(trid);
//	alert(modalid);
	$.ajax({
        type: "POST",
        url: "http://localhost:8080/hw/orderCancel",
        data: $(fid).serialize(),
        success: function(data){
//        	$("#"+modalid).attr("aria-hidden",true);
        	$("#"+modalid).modal('hide');
//        	$(".modal-backdrop .fade .in").remove();
        	$("div").remove(".modal-backdrop");
//        	$("div").remove(".fade");
//        	$("div").remove(".in");
//        	$("#"+modalid).attr("style","display:none");
        	toastr.success('取消预订成功');
        	$(trid).remove();
//        	$("#rs").click();
//        	$("#"+modalid).modal('hide');
//        	$("body").removeClass();
        	
//        	var e = jQuery.Event("keydown");//模拟一个键盘事件 
//        	e.keyCode = 27;//keyCode=13是回车
//        	$(fid).tigger(e);//模拟按下回车
        	
//     	   if(data=="yes")
//     		   toastr.warning('用户名已存在');
//     	   else{
//     		   $("#sub").click();
//     	   }
           }
     });

//	toastr.success('取消预订成功');
//	setTimeout(function() { $("#sub").click() }, 1000);
}
