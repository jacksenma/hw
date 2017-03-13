
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
		  "timeOut": "1000",
		  "extendedTimeOut": "1000",
		  "showEasing": "swing",
		  "hideEasing": "linear",
		  "showMethod": "fadeIn",
		  "hideMethod": "fadeOut"
		}



function adminPay(){
	$.ajax({
        type: "POST",
        url: "adminPay",
        success: function(data){
     	   if(data=="ok"){
     		  toastr.success('结算成功');
     		  
     	   }else{
     		  toastr.warning("暂无需要结算的客栈");
     	   }
           }
     });
	
}