
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



//function tmhide() {
//	
//	
//	if($("#tm").css("display")!="none"){
////		alert("no");
//		$("#tm").css("display","none");
//	}
//		
//	else{
////		alert("yes");
//		$("#tm").css("display","");
//	}
//		
//
//}


function getOrderVip(hid){
	var vid=$("#vipId").val();
	var psd=$("#vipPassword").val();
	$.ajax({
        type: "POST",
        url: "http://localhost:8080/hw/hleaveAjaxVip",
        data: "vid="+vid+"&hid="+hid+"&psd="+psd,
        success: function(data){
     	   if(data=="noVip"){
     		  toastr.warning('会员编号或密码错误');
     	   } 
     	   else if(data=="noOrder")
     		  toastr.warning('此会员未预定');
     	   else{
     		   //自动填写
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
     			 $("#b4").attr("selected",true);
     			  
     		  }
    			 
     		  
     		  $("#num").val(num);
     		  
     		  toastr.success('预订信息填充完毕');
     		   
     	   }
           }
     });
}


function checkForm(){
//TODO增加对手机号和银行卡号的格式校验
if($("#vipId").val()==""||$("#vipPassword").val()==""
	||$("#uname").val()==""||$("#num").val()=="")
	toastr.warning('请填写完整信息');
else{
		$.ajax({
               type: "POST",
               url: "http://localhost:8080/hw/hleave",
               data: $("#hleave").serialize(),
               success: function(data){
            	   if(data=="ok"){
            		   toastr.success('保存成功');
            		   $("#rs").click();
            	   }
            		   
            	   else{
            		   toastr.warning('保存出错');
            		   
            	   }
                  }
            });
	
}
}

//获得之前填写的非会员信息并计算总价
function getEnterNotVip(hid){
//	alert(hid);
	var name=$("#nuname").val();
	var idCard=$("#nidCard").val();
	$.ajax({
        type: "POST",
        url: "http://localhost:8080/hw/hleaveAjax",
        data: "nuname="+name+"&hid="+hid+"&nidCard="+idCard,
        success: function(data){
     	   if(data=="no"){
     		  toastr.warning('请仔细核对姓名和身份证号');
     	   } 
     	   else{
     		   //自动填写
     		  var arr = data.split('@');
     		  var total=arr[0];
     		  var bed=arr[1];
     		  var num=arr[2];
     		  
     		  if(bed=="标准单人房")
     			  $("#nb1").attr("selected",true);
     		  else if(bed=="标准双人房")
    			  $("#nb2").attr("selected",true);
     		  else if(bed=="豪华单人房")
    			  $("#nb3").attr("selected",true);
     		  else if(bed=="豪华双人房"){
     			 $("#nb4").attr("selected",true);
     			  
     		  }
     		
    			 
     		  
     		  $("#nnum").val(num);
     		 $("#total").val(arr[0]);
     		  
     		  toastr.success('预订信息填充完毕');
     		   
     	   }
           }
     });
}

function checkFormNotVip(){
	//TODO增加对手机号和银行卡号的格式校验
	if($("#nidCard").val()==""
		||$("#nuname").val()==""||$("#nnum").val()=="")
		toastr.warning('请填写完整信息');
	else{
			$.ajax({
	               type: "POST",
	               url: "http://localhost:8080/hw/hleaveNotVip",
	               data: $("#hleaveNotVip").serialize(),
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