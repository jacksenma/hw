$(document).ready(showVipOrder());


function showVipOrder(){
	// 基于准备好的dom，初始化echarts实例
    // 指定图表的配置项和数据
	var myChart = echarts.init(document.getElementById("VipOrder"));
	
//	myChart.showLoading();
	 var date=[];
	 var orderNum=[];//进行预定的会员数
//	 var leaveNum=[];
	$.ajax({
        type: "get",
        url: "getVipOrderNum",
        
        success: function(data){
        	var da=eval("("+data+")");
//        	alert(da);
        	for(var i=0;i<da.vip.length;i++){
        		date[i]=da.vip[i].date;
        		orderNum[i]=da.vip[i].num;
        	}

        	var option = {
        	        title: {
        	            text: '会员预定情况图'
        	        },
        	        tooltip : {  
        	            trigger: 'axis'  
        	        }, 
        	        legend: {
        	        	data:['预定']
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
        	            {  	name:'预定数(次)',
        	                type : 'value', 
        	                title:'预定数'
        	            }  
        	        ],
        	        series : [  
        	            {  
        	                name:'预定',  
        	                type:'line',  
//        	                stack: '房间数',  
//        	                areaStyle: {normal: {}},  
        	                data:orderNum
        	            }
        	        ]  
        	    };

        	    // 使用刚指定的配置项和数据显示图表。
        	    
        	    myChart.setOption(option);
        	    myChart.hideLoading();
        	    
        	}
     });
    
}




function showVipFinance(){
	// 基于准备好的dom，初始化echarts实例
    // 指定图表的配置项和数据
	var myChart = echarts.init(document.getElementById("VipFinance"));
	
//	myChart.showLoading();
	 var date=[];
	 var finance=[];//进行预定的会员数
//	 var leaveNum=[];
	$.ajax({
        type: "get",
        url: "getVipFinance",
        
        success: function(data){
        	var da=eval("("+data+")");
//        	alert(da);
        	for(var i=0;i<da.vip.length;i++){
        		date[i]=da.vip[i].date;
        		finance[i]=da.vip[i].finance;
        	}

        	var option = {
        	        title: {
        	            text: '会员消费情况图'
        	        },
        	        tooltip : {  
        	            trigger: 'axis'  
        	        }, 
        	        legend: {
        	        	data:['消费金额']
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
        	            {  	name:'金额(元)',
        	                type : 'value', 
        	                title:'金额'
        	            }  
        	        ],
        	        series : [  
        	            {  
        	                name:'消费金额',  
        	                type:'line',  
//        	                stack: '房间数',  
//        	                areaStyle: {normal: {}},  
        	                data:finance
        	            }
        	        ]  
        	    };

        	    // 使用刚指定的配置项和数据显示图表。
        	    
        	    myChart.setOption(option);
        	    myChart.hideLoading();
        	    
        	}
     });
    
}