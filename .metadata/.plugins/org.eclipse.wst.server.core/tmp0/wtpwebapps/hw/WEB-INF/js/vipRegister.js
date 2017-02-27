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
	if($("#phone").val()==""||$("#bankCard").val()==""||$("#idCard").val()=="")
		toastr.warning('请填写完整信息');
	else{
		$.ajax({
	        type: "POST",
	        url: "http://localhost:8080/hw/vregister",
	        data: $("#vipregister").serialize(),
	        success: function(data){
	     	   if(data=="ok"){
	     		  toastr.success('注册成功');
	     		 $("#sub").click();
	     	   }else{
	     		  toastr.error('您已注册，请勿重复注册');
	     	   }
	           }
	     });
		
		
			
	}
	
}