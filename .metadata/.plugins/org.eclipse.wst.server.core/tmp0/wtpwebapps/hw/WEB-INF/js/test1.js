function page(){
	var id=1;
	$.ajax({
        type: "get",
        url: "getHostelConditionPage",
        data: "pageId="+id,
        success: function(data){
//        	alert(data);
//        	item();
        	var d=eval("("+data+")");
        	var tbody=$("tbody");
        	for(var i=0;i<d.length;i++){
        		tbody.append(item((id-1)*10+i+1,d[i].id,d[i].name,d[i].province+d[i].city+d[i].district,d[i].phone));
        	}
//        	tbody.append(item());
//        	var da=eval("("+data+")");
//        	for(var i=0;i<da.checks.length;i++){
//        		date[i]=da.checks[i].date;
//        		orderNum[i]=da.checks[i].orderNum;
//        		cancelNum[i]=da.checks[i].cancelNum;
//        		enterNum[i]=da.checks[i].enterNum;
//        		leaveNum[i]=da.checks[i].leaveNum;
//        		
//        	}
        	

           }
     });
}
//id,imgUrl,hid,name,address,phone
function item(id,hid,name,address,phone){
	
	
	var tr=$("<tr id='"+hid+"'></tr");
	var idtd=$("<td>"+id+"</td>");
//	var imgclass="col-lg-2  col-sm-4  col-xs-4";
//	var pimgtd=$("<td class="+imgclass+"></td>");
//	var pimg=$("<img src="+imgUrl+" class="+imgclass+">");
	var hidtd=$("<td>"+hid+"</td>");
	var nametd=$("<td>"+name+"</td>");
	var addresstd=$("<td>"+address+"</td>");
	var phonetd=$("<td>"+phone+"</td>");
	
	var look=$("<td><button id="+hid+" onclick='showid(this.id)'>"+"查看入住情况"+"</button></td>");
	
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

function showid(id){
	
	alert(id);
}
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