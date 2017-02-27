$('#date-range13-2').dateRangePicker(
	{
		autoClose: true,
		singleDate : true,
		showShortcuts: false,
		singleMonth: true
	});
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
//$("#vip").click(function(){
//	  alert("vip");
//  $("#tm").hide();
//});
//
//$("#nvip").click(function(){
//	  alert("nvip");
//	$("#tm").show();
//	  });



function tmhide() {
	
	
	if($("#tm").css("display")!="none"){
//		alert("no");
		$("#tm").css("display","none");
	}
		
	else{
//		alert("yes");
		$("#tm").css("display","");
	}
		

}


function checkForm(){
	

	//TODO增加对手机号和银行卡号的格式校验
	//alert($("#hregister").serialize());
	if($("#date-range13-2").val()==""
		||$("#uname").val()==""||$("#idCard").val()=="")
		toastr.warning('请填写完整信息');
	else if($("#identity").val()=="非会员"&&$("#mode").val()=="会员卡")
		toastr.warning('住客身份与付款方式不匹配');
	else if($("#mode").val()=="现金"&&$("#total").val()=="")
		toastr.warning('请填写总计付款数');
	else{
//		$("#sub").click();
//		toastr.success('保存成功');
			$.ajax({
	               type: "POST",
	               url: "http://localhost:8080/hw/hleave",
	               data: $("#hleave").serialize(),
	               success: function(data){
	            	   if(data=="ok"){
	            		   toastr.success('保存成功');
//	            		   $("#rs").click();
	            		   $("#date-range13-2").val("");
	            		   $("#uname").val("");
	            		   $("#idCard").val("");
	            		   $("#total").val("");
	            		   
	            	   }
	            	   else if(data=="no"){
	            		   toastr.warning('请仔细核对姓名和身份证信息');
	            	   }
	            		   
	            	   else{
	            		   toastr.warning('开始日期不能早于当前日期');
	            		   
	            	   }
	                  }
	            });
		
	}
	}