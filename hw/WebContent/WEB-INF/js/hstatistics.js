$(document).ready(drawOandC());


//var myChart;

//function draw(){
////	var myChart = echarts.init(document.getElementById("OandC"));
////	myChart.showLoading();
//	$.ajax({
//        type: "get",
//        url: "getAllHchecks",
//        
//        success: function(data){
//        	var da=eval("("+data+")");
//        	for(var i=0;i<da.checks.length;i++){
//        		date[i]=da.checks[i].date;
//        		
//        		orderNum[i]=da.checks[i].orderNum;
//        		cancelNum[i]=da.checks[i].cancelNum;
//        		
//        	}
//        	drawOandC(date,orderNum,cancelNum);
//        	
//        	for(var i=0;i<da.checks.length;i++){
//        		enterNum[i]=da.checks[i].enterNum;
//        		leaveNum[i]=da.checks[i].leaveNum;
//        		
//        	}
//        	
//        	drawEandL(date,enterNum,leaveNum);
//        	}
//     });
//	
//	
//	
//}

function drawOandC(){
    // 基于准备好的dom，初始化echarts实例
    // 指定图表的配置项和数据
	var myChart = echarts.init(document.getElementById("OandC"));
	
	myChart.showLoading();
	var date=[];
	var orderNum=[];
	var cancelNum=[];
	$.ajax({
        type: "get",
        url: "getAllHchecks",
        
        success: function(data){
        	var da=eval("("+data+")");
        	for(var i=0;i<da.checks.length;i++){
        		date[i]=da.checks[i].date;
        		
        		orderNum[i]=da.checks[i].orderNum;
        		cancelNum[i]=da.checks[i].cancelNum;
        		
        	}
//        	drawOandC(date,orderNum,cancelNum);
        	var option = {
        	        title: {
        	            text: '预订/退订情况图'
        	        },
        	        tooltip : {  
        	            trigger: 'axis'  
        	        }, 
        	        legend: {
        	        	data:['预订','退订']
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
        	                name:'预订',  
        	                type:'line',  
//        	                stack: '房间数',  
//        	                areaStyle: {normal: {}},  
        	                data:orderNum
        	            },  
        	            {  
        	                name:'退订',  
        	                type:'line',  
//        	                stack: '房间数',  
//        	                areaStyle: {normal: {}},  
        	                data:cancelNum  
        	            }  
        	        ]  
        	    };

        	    // 使用刚指定的配置项和数据显示图表。
        	    
        	    myChart.setOption(option);
        	    myChart.hideLoading();
        	
        	    
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


function drawEandL(){
    // 基于准备好的dom，初始化echarts实例
    // 指定图表的配置项和数据
	var myChart = echarts.init(document.getElementById("EandL"));
	
	myChart.showLoading();
	 var date=[];
	 var enterNum=[];
	 var leaveNum=[];
	$.ajax({
        type: "get",
        url: "getAllHchecks",
        
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


$("#tabFinance").mousedown(function(){
	 drawFinance();
	});

$("#tabOandC").mousedown(function(){
	 drawOandC();
	});

$("#tabEandL").mousedown(function(){
	 drawEandL();
	});

function drawFinance(){
	var myChart = echarts.init(document.getElementById("Finance"));
	myChart.showLoading();
	var fdate=[];
	var money=[];
	$.ajax({
        type: "get",
        url: "getHostelFinance",
        
        success: function(data){
        	var da=eval("("+data+")");
        	for(var i=0;i<da.finance.length;i++){
        		fdate[i]=da.finance[i].date;
        		
        		money[i]=da.finance[i].money;
        		
        		
        	}
//        	drawFinance(date,orderNum,cancelNum);
        	var option = {
        		      title: {
        		          text: '财务明细情况图'
        		      },
        		      tooltip : {  
        		          trigger: 'axis'  
        		      }, 
        		      legend: {
        		      	data:['收入']
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
        		     
//        		      grid: {  
//        		          left: '3%',  
//        		          right: '4%',  
//        		          bottom: '3%',  
//        		          containLabel: true  
//        		      },
        		      xAxis : [  
        		          {  
        		              type : 'category',  
        		              boundaryGap : false,  
        		              data : fdate  
        		          }  
        		      ],  
        		      yAxis : [  
        		          {  	name:'收入(元)',
        		              type : 'value', 
        		              title:'收入'
        		          }  
        		      ],
        		      series : [  
        		          {  
        		              name:'收入',  
        		              type:'line',  
//        		              stack: '房间数',  
//        		              areaStyle: {normal: {}},  
        		              data:money
        		          }
        		      ]  
        		  };

        		  // 使用刚指定的配置项和数据显示图表。
        		  
        		  myChart.setOption(option);
        		  myChart.hideLoading();
        	
        	}
     });
//  myChart.showLoading();
  // 指定图表的配置项和数据
  
}