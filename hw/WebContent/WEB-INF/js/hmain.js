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


function getOrder(hid){
	var vid=$("#vipId").val();
	var psd=$("#vipPassword").val();
	$.ajax({
        type: "POST",
        url: "http://localhost:8080/hw/henterAjax",
        data: "vid="+vid+"&hid="+hid+"&psd="+psd,
        success: function(data){
     	   if(data=="noVip"){
     		  toastr.warning('会员编号或密码错误');
     	   } 
     	   else if(data=="noOrder")
     		  toastr.warning('此会员未预定');
     	   else{
     		   //自动填写
//     		  toastr.warning('此会员未预定');
     		  var arr = data.split('@');
     		  var name=arr[0];
     		  var bed=arr[1];
     		  var num=arr[2];
     		  $("#uname").val(arr[0]);
     		  if(bed=="标准单人房")
     			  $("#b1").attr("selected",true);
     		  else if(bed=="标准双人房")
    			  $("#b2").attr("selected",true);
     		  else if(bed=="豪华单人房")
    			  $("#b3").attr("selected",true);
     		  else if(bed=="豪华双人房"){
//     			  alert(bed);
     			 $("#b4").attr("selected",true);
     			  
     		  }
    			 
     		  
     		  $("#num").val(num);
     		  
     		  toastr.success('预订信息填充完毕');
     		   
     	   }
           }
     });
}


function checkForm(){
//	alert("yesy");
//TODO增加对手机号和银行卡号的格式校验
if($("#vipId").val()==""||$("#vipPassword").val()==""
	||$("#uname").val()==""||$("#num").val()=="")
	toastr.warning('请填写完整信息');
else{
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




function checkFormNotVip(){
//	alert("not");
	//TODO增加对手机号和银行卡号的格式校验
	if($("#nidCard").val()==""
		||$("#nuname").val()==""||$("#nnum").val()=="")
		toastr.warning('请填写完整信息');
	else{
			$.ajax({
	               type: "POST",
	               url: "http://localhost:8080/hw/henterNotVip",
	               data: $("#henterNotVip").serialize(),
	               success: function(data){
	            	   if(data=="ok"){
	            		   toastr.success('保存成功');
	            		   $("#nrs").click();
	            	   }
	            		   
	            	   else{
	            		   toastr.warning('开始日期不能早于当前日期');
	            		   
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
        	
            $("#yesVip > *").keydown(function(event) { 
            	
                if (event.keyCode == 13) {
                	stopDefault(event);
                	checkForm(); 
//                	alert("yesy");
                	
                }    
            }) ,
            $("#notVip > *").keydown(function(event) { 
            	
                if (event.keyCode == 13) {
                	stopDefault(event);
                	checkFormNotVip(); 
//                	alert("not");
                	
                }    
            })
        }    
    ); 
