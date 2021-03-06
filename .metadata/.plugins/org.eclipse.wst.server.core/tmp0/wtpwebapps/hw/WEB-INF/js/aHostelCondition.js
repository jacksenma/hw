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

$(document).ready(function() {
	page();
});

function page(){
	//先判断输入的是不是数字（正则表达式）
	
	if(isNaN($('#pageId').val())==true||$('#pageId').val()==""){
		toastr.warning('请输入数字');
	}else{
	clear();
	var id=parseInt($("#pageId").val());
	var total=parseInt($("#total").text());
	 if(id>total){
		toastr.warning('不能超过总页数,为您跳转到尾页');
		$("#pageId").val(total);
		id=total;
	}
	else if(id<1){
		toastr.warning('不能小于第1页,为您跳转到首页');
		$("#pageId").val(1);
		id=1;
	}
		
	else if(id==1&&id==total){
		$(".previous").addClass("disabled");
		$(".next").addClass("disabled");
	}
		
	else if(id==total&&id!=1){
		$(".next").addClass("disabled");
		$(".previous").removeClass("disabled");
	}
	else if(id==1&&id!=total){
		$(".next").removeClass("disabled");
		$(".previous").addClass("disabled");
	}
	else if(id!=total&&id!=1){
		$(".next").removeClass("disabled");
		$(".previous").removeClass("disabled");
	}
	
	
	$.ajax({
        type: "get",
        url: "getHostelConditionPage",
        data: "pageId="+id,
        success: function(data){
        	var d=eval("("+data+")");
        	var tbody=$("tbody");
        	for(var i=0;i<d.length;i++){
        		tbody.append(item((id-1)*10+i+1,d[i].id,d[i].name,d[i].province+d[i].city+d[i].district,d[i].phone));
        	}
        }
     });
	}	
}
//id,imgUrl,hid,name,address,phone
function item(id,hid,name,address,phone){
	
	
//	var tr=$("<tr id='"+hid+"'></tr");
	var tr=$("<tr></tr");
	var idtd=$("<td>"+id+"</td>");
//	var imgclass="col-lg-2  col-sm-4  col-xs-4";
//	var pimgtd=$("<td class="+imgclass+"></td>");
//	var pimg=$("<img src="+imgUrl+" class="+imgclass+">");
	
	
	var hidtd=$("<td>"+hid+"</td>");
	var nametd=$("<td>"+name+"</td>");
	var addresstd=$("<td>"+address+"</td>");
	var phonetd=$("<td>"+phone+"</td>");
	
	var lookclass="btn btn-info btn-xs" 
	var lookdatatoggle="modal" 
	var modalId=hid+"modal";
	var lookdatatarget="#mymodal";
	
	var modalid=hid;
	
	var look=$("<td><button onclick=showEandL('"+modalid+"') class='btn btn-info btn-xs' data-toggle="+lookdatatoggle+" data-target="+lookdatatarget+">"+"查看"+"</button></td>");
	
	tr.append(idtd);
//	tr.append(pimgtd);
//	pimgtd.append(pimg);
	tr.append(hidtd);
	tr.append(nametd);
	tr.append(addresstd);
	tr.append(phonetd);
	tr.append(look);
	return tr;
}

function clear(){
	var tbody=$("tbody");
	tbody.children().remove();
}

function previous(){
	var id=parseInt($("#pageId").val())-1;
	if(id>0){
		$("#pageId").val(id);
		page();
	}
	
}

function next(){
	var id=parseInt($("#pageId").val())+1;
	var total=parseInt($("#total").text());
//	alert(id);
//	alert(total);
	if(id<=total){
		$("#pageId").val(id);
		page();
	}
}
function showEandL(id){
	// 基于准备好的dom，初始化echarts实例
    // 指定图表的配置项和数据
	var myChart = echarts.init(document.getElementById("EandL"));
	
	myChart.showLoading();
	 var date=[];
	 var enterNum=[];
	 var leaveNum=[];
	$.ajax({
        type: "get",
        url: "getAllHchecksA",
        data: "hid="+id,
        success: function(data){
        	var da=eval("("+data+")");
        	for(var i=0;i<da.checks.length;i++){
        		date[i]=da.checks[i].date;
        		enterNum[i]=da.checks[i].enterNum;
        		leaveNum[i]=da.checks[i].leaveNum;
    		
    	}

        	var option = {
        	        title: {
        	            text: '入住/退房情况图'
        	        },
        	        tooltip : {  
        	            trigger: 'axis'  
        	        }, 
        	        legend: {
        	        	data:['入住','退房']
        	        },
        	        toolbox: {
        	            feature: {
        	                dataZoom: {
        	                    yAxisIndex: 'none'
        	                },
        	                restore: {},
        	                saveAsImage: {}
        	            }
        	        },
        	        dataZoom: [
        	            {
        	                type: 'slider',
        	                show: true,
        	                xAxisIndex: [0],
        	                start: 0,
        	                end: 100
        	            },
        	            {
        	                type: 'slider',
        	                show: true,
        	                yAxisIndex: [0],
        	                left: '93%',
        	                start: 0,
        	                end: 100
        	            },
        	            {
        	                type: 'inside',
        	                xAxisIndex: [0],
        	                start: 0,
        	                end: 100
        	            },
        	            {
        	                type: 'inside',
        	                yAxisIndex: [0],
        	                start: 0,
        	                end: 100
        	            }
        	        ], 
        	       
//        	        grid: {  
//        	            left: '3%',  
//        	            right: '4%',  
//        	            bottom: '3%',  
//        	            containLabel: true  
//        	        },
        	        xAxis : [  
        	            {  
        	                type : 'category',  
        	                boundaryGap : false,  
        	                data : date  
        	            }  
        	        ],  
        	        yAxis : [  
        	            {  	name:'房间数(间)',
        	                type : 'value', 
        	                title:'房间数'
        	            }  
        	        ],
        	        series : [  
        	            {  
        	                name:'入住',  
        	                type:'line',  
//        	                stack: '房间数',  
//        	                areaStyle: {normal: {}},  
        	                data:enterNum
        	            },  
        	            {  
        	                name:'退房',  
        	                type:'line',  
//        	                stack: '房间数',  
//        	                areaStyle: {normal: {}},  
        	                data:leaveNum  
        	            }  
        	        ]  
        	    };

        	    // 使用刚指定的配置项和数据显示图表。
        	    
        	    myChart.setOption(option);
        	    myChart.hideLoading();
        	    $("#EandL").resize(function(){
                    $(myChart).resize();
                 })
        	    
//        	for(var i=0;i<da.checks.length;i++){
//        		enterNum[i]=da.checks[i].enterNum;
//        		leaveNum[i]=da.checks[i].leaveNum;
//        		
//        	}
//        	
//        	drawEandL(date,enterNum,leaveNum);
        	}
     });
    
}