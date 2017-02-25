toastr.options = {
		  "closeButton": false,
		  "debug": false,
		  "newestOnTop": false,
		  "progressBar": false,
		  "positionClass": "toast-top-center",
		  "preventDuplicates": false,
		  "onclick": null,
		  "showDuration": "300",
		  "hideDuration": "1000",
		  "timeOut": "2500",
		  "extendedTimeOut": "1000",
		  "showEasing": "swing",
		  "hideEasing": "linear",
		  "showMethod": "fadeIn",
		  "hideMethod": "fadeOut"
		}
function checkForm() {
	//TODO增加对手机号和银行卡号的格式校验
	if($("#phone").val()==""||$("#bc").val()=="")
		toastr.warning('请填写完整信息');
	else{
		toastr.success('修改成功');
		setTimeout(function() { $("#sub").click() }, 1000);
//		 $("#sub").click();
//		$.ajax({
//	        type: "POST",
//	        url: "http://localhost:8080/hw/vip/changeAjax",
//	        data: $("#vipchange").serialize(),
//	        success: function(data){
//	     	   if(data=="ok"){
//	     		  toastr.success('修改成功');
////	     		 $("#sub").click();
//	     	   }
////	     	   else{
////	     		  toastr.error('银行卡余额不足');
////	     	   }
//	           }
//	     });
		
		
			
	}
}


function vCancel(){
	toastr.success('操作成功,即将返回登录界面');
	setTimeout(function() { $("#subCancel").click() }, 2000);
	
}