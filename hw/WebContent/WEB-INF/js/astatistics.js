$(document).ready(drawFinance());

function drawFinance(){
	var myChart = echarts.init(document.getElementById("Finance"));
	myChart.showLoading();
	var fdate=[];
	var money=[];
	$.ajax({
        type: "get",
        url: "getHWFinance",
        
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