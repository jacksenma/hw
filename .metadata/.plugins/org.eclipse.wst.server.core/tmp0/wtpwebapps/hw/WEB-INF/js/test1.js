function test(){
	var date=[];
	var orderNum=[];
	var cancelNum=[];
	var enterNum=[];
	var leaveNum=[];
	$.ajax({
        type: "get",
        url: "http://localhost:8080/hw/getAllHchecks",
        
        success: function(data){
        	var da=eval("("+data+")");
        	for(var i=0;i<da.checks.length;i++){
        		date[i]=da.checks[i].date;
        		orderNum[i]=da.checks[i].orderNum;
        		cancelNum[i]=da.checks[i].cancelNum;
        		enterNum[i]=da.checks[i].enterNum;
        		leaveNum[i]=da.checks[i].leaveNum;
        		
        	}
        	

           }
     });
}