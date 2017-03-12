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
function stopDefault(e) {  
    //如果提供了事件对象，则这是一个非IE浏览器   
    if(e && e.preventDefault) {  
    　　//阻止默认浏览器动作(W3C)  
    　　e.preventDefault();  
    } else {  
    　　//IE中阻止函数器默认动作的方式   
    　　window.event.returnValue = false;   
    }  
    return false;  
} 

$(document).ready(    
        function() { 
        	
            $("input").keydown(function(event) { 
            	
                if (event.keyCode == 13) {
                	stopDefault(event);
                	checkForm();  
                }    
            })    
        }    
    ); 
