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
function changepass(hid){
	var id="#tr"+hid;
	$.ajax({
        type: "POST",
        url: "http://localhost:8080/hw/hostelChangePass",
        data: "id="+hid,
        success: function(data){
     	   if(data=="ok"){
     		  toastr.success('操作成功');
     		  $(id).remove();
     	   }
           }
     });
}


function changenotPass(hid){
	alert(hid);
	var id="#tr"+hid;
	$.ajax({
        type: "POST",
        url: "http://localhost:8080/hw/hostelChangeNotPass",
        data: "id="+hid,
        success: function(data){
     	   if(data=="delete"){
     		  toastr.success('操作成功');
     		  $(id).remove();
     	   }
           }
     });
}


