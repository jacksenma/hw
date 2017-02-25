
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

function checkForm(){
	if($("#date-range200").val()==""
		||$("#date-range201").val()==""||$("#province").val()==""
			||$("#city").val()==""||$("#district").val()=="")
		toastr.warning('请填写完整信息');
	else{
//		$("#searchBtn").attr("value") = "搜索中";
		$("#sub").click();
	}
}

//function getTotalPrice(num,price){
//	$(".totalPrice").text("¥"+num*price)
//}
//
//function checkForm1(){
//	alert("")
//}
