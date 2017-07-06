$(function(){
//	initFactoryAndPressureStation();
	
	initf();
})
function initf(){
    if(window.EventSource){

        var eventSource = new EventSource("http://localhost:8998/learner/action/ad/message");

        //只要和服务器连接，就会触发open事件
        eventSource.addEventListener("open",function(){
//           console.log("和服务器建立连接");
        });

        //处理服务器响应报文中的load事件
        eventSource.addEventListener("load",function(e){
            console.log("load服务器发送给客户端的数据为:" + e.data);
//            console.log(e);
        });

        //如果服务器响应报文中没有指明事件，默认触发message事件
//        eventSource.addEventListener("message",function(e){
////            console.log("message服务器发送给客户端的数据为:" + e.data);
//            console.log(e);
////            console.log(JSON.parse(e.data))
//        });
        
        eventSource.addEventListener("myevent",function(e){
        	var data = JSON.parse(e.data);
        	var url = 'action/ad/load?title='+data['result']['rows'][0].title+'&context='+data['result']['rows'][0].context
        				+ '&href='+data['result']['rows'][0].href + '&target='+data['result']['rows'][0].target ;
        				layer.closeAll();
            layer.open({

            	  title: false,
            	  closeBtn: 1, //不显示关闭按钮
            	  shade: [0],
            	  area: ['320px', '215px'],
            	  offset: 'rb', //右下角弹出
//            	  time: 2000, //2秒后自动关闭
            	  anim: 2,
            	  btn: [],
            	  type: 2,
            	  content: [url, 'no'], //iframe的url，no代表不显示滚动条
//            	  content: '<p>'+e.data+'</p>', //iframe的url，no代表不显示滚动条
            	  end: function(){ //此处用于演示
            	  }
            	});
        });

    }
    else{
        console.log("服务器不支持EvenSource对象");
    }

}
