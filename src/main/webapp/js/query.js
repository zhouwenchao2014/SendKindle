$(function(){

	$("#queryResult").attr("src", "https://www.baidu.com/s?wd=ceshi").on("load", function(event){  
  		console.info($(this).context.contentWindow.document.body);  
	}); 
	// var time=setInterval(function(){
	// 	var oFrm = $('#queryResult');
	// 	var state=null;
	// 	if(document.readyState){
	// 		try{
	// 			state=oFrm.document.readyState;
	// 			if(state=="complete" && !state) {
	// 				var content=document.frames?document.frames["queryResult"]:$("#queryResult")[0].contentWindow;
	// 				var body=content.document.body.innerHTML;
	// 				clearInterval(time);
	// 			}
	// 		}catch(e){state=null;}
	// 		if(state=="complete" && !state) {
	// 			var content=document.frames?document.frames["queryResult"]:$("#queryResult")[0].contentWindow;
	// 			var body=content.document.body.innerHTML;
	// 			clearInterval(time);
	// 		}
	// 	}
	// },10);

	$.ajax({
		url:"https://www.baidu.com/s?wd=ceshi",
		success:function(data){
			var a=data;
		}
	});
	
});

