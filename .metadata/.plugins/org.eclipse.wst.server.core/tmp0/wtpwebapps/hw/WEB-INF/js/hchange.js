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
//	alert($("#hregister").serialize());
	if($("#hname").val()==""
		||$("#level").val()==""||$("#phone").val()==""||$("#province").val()==""
			||$("#city").val()==""||$("#district").val()==""
			||$("#bankCard").val()=="")
		toastr.warning('请填写完整信息');
	else{
//		$(".container").hide();
//		$(".container").css("display","none");
		$("#sub").click();
//		$(".container").hide();
		

		
			
	}
	
}