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
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome</title>
<base href="<%=basePath%>" />
<link rel="stylesheet"
	href="plugins/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="plugins/easyui/easyui.css">
<link rel="stylesheet"
	href="plugins/font-awesome/css/font-awesome.min.css">
	<style type="text/css">
		html {
			background-color: #E55D40;
    		color: #fff;
    		display: block;
		}
	</style>
</head>
<body>
	<div>
		<h3 id="title">标题</h3>
		<p id="context">正文</p>
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
<script type="text/javascript">
		$("#title").html(GetQueryString("title"));
		$("#context").html('<a href="'+GetQueryString("href")+'" target= "'+GetQueryString("target")+'" >'+GetQueryString("context") + '</a>');
	</script>
</html>