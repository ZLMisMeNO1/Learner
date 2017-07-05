$(function(){
//	initFactoryAndPressureStation();
	
	initf();
})
function initf(){
    if(window.EventSource){

        var eventSource = new EventSource("http://localhost:8998/learner/action/java/send");

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

        //发生错误，则会触发error事件
        eventSource.addEventListener("myevent",function(e){
            console.log("error服务器发送给客户端的数据为:" + e.data);
//            console.log(e);
            
        });

    }
    else{
        console.log("服务器不支持EvenSource对象");
    }

}
