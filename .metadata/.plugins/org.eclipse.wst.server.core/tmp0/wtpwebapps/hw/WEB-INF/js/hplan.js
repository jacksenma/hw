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
	if($("#date-range200").val()==""
		||$("#date-range201").val()==""||$("#num").val()==""||$("#price").val()=="")
		toastr.warning('请填写完整信息');
	else{
//		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
//		System.out.println(df.format(new Date()));
//		$("#sub").click();
//	alert($("#hid").val())
			$.ajax({
	               type: "POST",
	               url: "http://localhost:8080/hw/hplan",
	               data: $("#hplan").serialize(),
	               success: function(data){
	            	   if(data=="dateWrong"){
	            		   toastr.warning('开始日期不能早于当前日期');
//	            		   location.href="test1.jsp";
	            	   }
	            		   
	            	   else{
	            		   
//	            		   $("#sub").click();
	            		   toastr.success('发布成功');
	            		   $("#rs").click();
//	            		   alert("可以注册");
	            	   }
	                  }
	            });
		
			
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
