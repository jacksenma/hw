function checkForm(fid) {
	//TODO增加对手机号和银行卡号的格式校验
	$.ajax({
        type: "POST",
        url: "http://localhost:8080/hw/orderCancel",
        data: $(fid).serialize(),
        success: function(data){
        	toastr.success('取消预订成功');
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
