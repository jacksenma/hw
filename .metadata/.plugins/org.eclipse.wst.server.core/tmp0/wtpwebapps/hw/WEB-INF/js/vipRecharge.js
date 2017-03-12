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
	if($("#money").val()=="")
		toastr.warning('请输入充值金额');
	else if($("#vstate").val()==0&&parseFloat($("#money").val())<1000)
		toastr.warning('首充必须1000元及以上');
	else if(parseFloat($("#money").val())>parseFloat($("#vbankBalance").val()))
		toastr.warning('银行卡余额不足');
	else if(parseFloat($("#money").val())<=0)
		toastr.warning('充值金额应大于0元');
	else{
		toastr.success('充值成功');
		setTimeout(function() { $("#sub").click() }, 500);
	}
	
}

function checkFormp() {
	//TODO增加对手机号和银行卡号的格式校验
	if($("#moneyp").val()=="")
		toastr.warning('请输入充值积分');
	else if(parseFloat($("#moneyp").val())>parseFloat($("#vpointp").val()))
		toastr.warning('积分不足');
	else if(parseFloat($("#moneyp").val())<=0)
		toastr.warning('充值积分应大于0');
	else{
		toastr.success('充值成功');
		setTimeout(function() { $("#subp").click() }, 500);
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
        	
            $("#money").keydown(function(event) { 
            	
                if (event.keyCode == 13) {
                	stopDefault(event);
                	checkForm();  
                }    
            }) ,
            $("#moneyp").keydown(function(event) { 
            	
                if (event.keyCode == 13) {
                	stopDefault(event);
                	checkFormp();  
                }    
            })
        }    
    ); 