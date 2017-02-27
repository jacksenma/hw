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

function getTotalPrice(num,price,dis){
	var s1 = $("#sd").text();
	var s2 = $("#ed").text();
	s1 = new Date(s1.replace(/-/g, "/"));
	s2 = new Date(s2.replace(/-/g, "/"));
	var days = s2.getTime() - s1.getTime();
	var time = parseInt(days / (1000 * 60 * 60 * 24));
	$("#totalPrice").text("¥"+((num*price*time*(1-dis/100)).toFixed(2)));
	$("#myTotalPrice").val(((num*price*time*(1-dis/100)).toFixed(2)));
	$("#nights").text("("+time+" 晚)");
	$("#point").text(parseInt(num*price*time/10*(1-dis/100))+"分");
	$("#myPoint").val(parseInt(num*price*time/10*(1-dis/100)));
//	alert(time+"天")
}

function checkForm(vb){
//	alert($("#totalPrice").val());
	if($("#name").val()==""){
		toastr.warning('请填写住客姓名');
	}
	else if(parseFloat($("#myTotalPrice").val())>parseFloat(vb)){
		toastr.warning('会员卡余额不足');
	}
	else{
		alert($("#myOrder").serialize());
		$("#sub").click();
	}
		
}
//$(".field").change(function(){
//	  alert("qq");
//	});
//
//function getTotalPriceByDate(price){
//	alert("date");
//	var s1 = $("#date-range200").val();
//	var s2 = $("#date-range201").val();
//	s1 = new Date(s1.replace(/-/g, "/"));
//	s2 = new Date(s2.replace(/-/g, "/"));
//	var days = s2.getTime() - s1.getTime();
//	var time = parseInt(days / (1000 * 60 * 60 * 24));
//	$("#totalPrice").text("¥"+$("#roomNum").val()*price*time);
//}