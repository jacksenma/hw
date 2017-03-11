//alert("amain");

toastr.options = {
		  "closeButton": false,
		  "debug": false,
		  "newestOnTop": false,
		  "progressBar": false,
		  "positionClass": "toast-top-right",
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
function pass(n,lev,pro,city,dist,phone,bc){
	var id="#tr"+n+phone+pro+city+dist;
	$.ajax({
        type: "POST",
        url: "http://localhost:8080/hw/hostelPass",
        data: "name="+n+"&level="+lev+"&province="+pro+"&city="+city+"&district="+dist+"&phone="+phone+"&bankCard="+bc,
        success: function(data){
     	   if(data=="ok"){
     		  toastr.success('操作成功');
     		  $(id).remove();
     		  showNothing();
     	   }
           }
     });
}
function notPass(n,lev,pro,city,dist,phone,bc){
	var id="#tr"+n+phone+pro+city+dist;
	$.ajax({
        type: "POST",
        url: "http://localhost:8080/hw/hostelNotPass",
        data: "name="+n+"&level="+lev+"&province="+pro+"&city="+city+"&district="+dist+"&phone="+phone+"&bankCard="+bc,
        success: function(data){
     	   if(data=="delete"){
     		  toastr.error('操作成功');
     		  $(id).remove();
     		  showNothing();
     	   }
           }
     });
}

function showNothing(){
	if($("tbody").children().length==0)
		window.location.reload();
}
//function test(a,b){
//	alert(a);
//}
//function testas(we,z,x,q,e,we,we){
//	alert("pass");
//}
//加载待审店家信息
//$(document).ready(function(){
//	$("#inita").click();
//	$.ajax({
//        type: "POST",
//        url: "http://localhost:8080/hostel/settleHostelInit",
//        data: 0,
//        success: function(data){
//     	  alert(data);
//           }
//     });

//});


//function checkForm(){
//	alert("as");
//	$.ajax({
//        type: "POST",
//        url: "http://localhost:8080/hw/hostel/settleHostelInit",
//        success: function(data){
//     	   alert(data);
//           }
//     });
//	alert("dd");
//}

