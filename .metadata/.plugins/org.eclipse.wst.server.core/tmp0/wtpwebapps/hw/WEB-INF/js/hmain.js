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

$('#date-range13-2').dateRangePicker(
	{
		autoClose: true,
		singleDate : true,
		showShortcuts: false,
		singleMonth: true
	});
function checkForm(){
	

//TODO增加对手机号和银行卡号的格式校验
//alert($("#hregister").serialize());
if($("#date-range13-2").val()==""
	||$("#uname").val()==""||$("#idCard").val()==""||$("#num").val()=="")
	toastr.warning('请填写完整信息');
else{
//	$("#sub").click();
//	toastr.success('保存成功');
		$.ajax({
               type: "POST",
               url: "http://localhost:8080/hw/henter",
               data: $("#henter").serialize(),
               success: function(data){
            	   if(data=="ok"){
            		   toastr.success('保存成功');
            		   $("#rs").click();
            	   }
            		   
            	   else{
            		   toastr.warning('开始日期不能早于当前日期');
            		   
            	   }
                  }
            });
	
}
}