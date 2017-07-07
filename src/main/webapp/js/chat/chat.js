
$(function(){
	listMessage();
})
document.onkeydown=function(e){
	if(e && e.keyCode==13){ // enter 键
        //要做的事情
		sendMessage();
   }
}
var chatEventSource;
function listMessage(time) {
	var list = $("#messageList");
	var url = "action/chat/list?page=1&rows=20"
	if('undefined' == typeof(time)){
		time = DateAdd('d',-3,new Date()).getTime();
	}
	url += "&time="+time;
	if(window.EventSource){
		chatEventSource = new EventSource(url);
		chatEventSource.addEventListener("chat",function(e){
			var data = JSON.parse(e.data);
			var sli = '';
			$.each(data.newmessage,function(n,v){
				sli += '<li><span class="msg">'+v.msg+'</span><span class="time">'+timeStamp2String(new Date(v.time),
						"yyyy-MM-dd HH:mm:ss")+'</span></li>'
				if(n == data.newmessage.length - 1){
					flushMessage();
					listMessage(v.time +1 )
				}
			})
			list.append(sli);
//			var h = $(document).height()-$(window).height();
			
		})
	}
}
function flushMessage(){
	if('undefined' != typeof(chatEventSource)){
		chatEventSource.close()
	}
}
function sendMessage() {
	var $text = document.querySelector("#chat")
	var context = $text.value;
	if('undefined' != typeof(context) ) {
		context = context.trim();
	}
	if('' == context) {
		layer.msg("不能为空啊，大兄弟")
		return;
	}
	executeAjaxUrlForResult("action/chat/addChat",{
		data : {
			'msg' : encodeURI(context)
		},
		async : true
	},function(result){
		layer.msg("已发送")
		$text.value = '';
		})
	$("#messageList").scrollTop(640);
}