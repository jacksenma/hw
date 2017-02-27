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
	if($("#uname").val()==""||$("#upsd").val()==""||$("#upsd2").val()=="")
		toastr.warning('请填写完整信息');
	else{
		if($("#upsd").val().length<6||$("#upsd").val().length>12)
			toastr.warning('密码长度6~12');
		else if($("#upsd").val()!=$("#upsd2").val())
			toastr.warning('两次密码不一致');
		else{
			$.ajax({
	               type: "POST",
	               url: "http://localhost:8080/hw/uregisterAjax",
	               data: $("#register").serialize(),
	               success: function(data){
	            	   if(data=="yes")
	            		   toastr.warning('用户名已存在');
	            	   else{
	            		   $("#sub").click();
	            	   }
	                  }
	            });
		}
			
	}
	
}
