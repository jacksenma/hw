toastr.options = {
		  "closeButton": false,
		  "debug": false,
		  "newestOnTop": false,
		  "progressBar":true,
		  "positionClass": "toast-top-center",
		  "preventDuplicates": false,
		  "onclick": null,
		  "showDuration": "300",
		  "hideDuration": "1000",
		  "timeOut": "1500",
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
	            		   toastr.success('注册成功,1.5秒后跳转至登录页面');
	            		   setTimeout(function() { $("#sub").click() }, 1500);
	            		   
	            	   }
	                  }
	            });
		}
			
	}
	
}

function isUser(uname){
	$.ajax({
        type: "POST",
        url: "http://localhost:8080/hw/uregisterAjax",
        data: "uname="+uname,
        success: function(data){
     	   if(data=="yes"){
     		  toastr.warning('用户名已存在');
     		 $("#unameDIV").addClass("has-error");
     		$("#unameDIV").removeClass("has-success");
     	   }else{
     		  toastr.success('用户名可用');
     		  $("#unameDIV").addClass("has-success");
     		 $("#unameDIV").removeClass("has-error");
     	   }
     		   
     	   
           }
     });
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



var secs = 2; //倒计时的秒数 
var URL ;
function Load(url){
URL = url;
for(var i=secs;i>=0;i--) 
{ 
   window.setTimeout('doUpdate(' + i + ')', (secs-i) * 1000); 
} 
}
function doUpdate(num) 
{ 
//document.getElementById('ShowDiv').innerHTML = '将在'+num+'秒后自动跳转到主页' ;
if(num == 0) { window.location = URL; }
}
