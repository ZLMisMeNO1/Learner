<%@ page language="java" contentType="text/html; charset=UTF-8" 
    pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>聊天室</title>
	<base href="<%=basePath%>" />
	<!--<link ref="stylesheet"  href="../css/chat.css">-->
	<link href="https://cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css" rel="stylesheet">
	<style>
		.chat {
			width: 700px;
			height: 700px;
			border: 1px solid #ccc;
			margin: 0 auto ;
		}
		
		.chat-message {
			display: flex;
			height: 60px;
		}
		.chat-history{
			width: 700px;
			height: 640px;
			overflow: hidden;
		}
		textarea {
			resize: vertical;
		}
		.btn-send{
			padding: 0 30px;
		}
		.list-group{
			height: 640px;
			overflow:auto;

			padding-left: 10px;
			margin-bottom: 10px;
			padding-right:10px;

		}
		.list-group li{
			display: flex;
			list-style: none;
			line-height: 40px;
			font-size: 14px;
			font-family: "Microsoft YaHei";
			background: #ccc;
			border-radius: 5px;
			margin-top: 5px;
			padding:0 15px;
			justify-content: center;
		}
		.list-group li span.time{
			width:140px;
			float: right;
			font-size: 12px;
			padding:0 8px;
			margin-right: 10px;
			color: #666;
			align-items:center;
		}
		.msg{
			flex:1;
			line-height: 22px;
			
			border:1px solid #ccc;
		}
	</style>
</head>

<body>
	<div class="chat">
		<div class="chat-history">
			<ul class="list-group" id="messageList">
<!-- 				<li><span class="msg">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quo deserunt sapiente fuga, aliquam nobis sunt fugit quis officiis ipsam repellendus porro veritatis placeat impedit, blanditiis nemo ullam. Assumenda, libero, tempore!</span> <span class="time">2017-07-07 12:34:22</span></li> -->
<!-- 				<li><span class="msg">Lorem</span><span class="time">2017-07-25 12:34:56</span></li> -->
<!-- 				<li><span class="msg">000000000000000000000002</span><span class="time">2017-07-25 12:34:56</span></li> -->
<!-- 				<li><span class="msg">000000000000000000000003</span><span class="time">2017-07-25 12:34:56</span></li> -->
<!-- 				<li><span class="msg">000000000000000000000004</span><span class="time">2017-07-25 12:34:56</span></li> -->
<!-- 				<li><span class="msg">000000000000000000000005</span><span class="time">2017-07-25 12:34:56</span></li> -->
<!-- 				<li><span class="msg">000000000000000000000006</span><span class="time">2017-07-25 12:34:56</span></li> -->
<!-- 				<li><span class="msg">000000000000000000000007</span><span class="time">2017-07-25 12:34:56</span></li> -->
<!-- 				<li><span class="msg">000000000000000000000008</span><span class="time">2017-07-25 12:34:56</span></li> -->
			</ul>

		</div>
		<div class="chat-message">
		<textarea id="chat" class="form-control"></textarea>
		<button class="btn btn-success btn-send" onclick="sendMessage();">发送</button>
	</div>
	</div>
</body>
<script type="text/javascript"
	src="plugins/jquery/jquery-1.10.1.js"></script>
<script src="plugins/easyui/js/easyui.min.js"></script>
<script src="plugins/bootstrap/js/bootstrap.min.js"></script>
<script src="plugins/easyui/js/easyui-lang-zh_CN.js"></script>
<script src="plugins/echarts/echarts.min.js"></script>
<script src="plugins/layer/layer.js"></script>
<script src="plugins/waterutils.js"></script>
<script src="js/chat/chat.js"></script>
</html>