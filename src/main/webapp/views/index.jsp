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
	<link rel="stylesheet" href="plugins/bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" href="plugins/easyui/easyui.css">
	<link rel="stylesheet"
		href="plugins/font-awesome/css/font-awesome.min.css">
</head>
<body>
	<table style="height: 291px;" id="factoryAndPressureStation"></table>
</body>
<script type="text/javascript" src="plugins/jquery/jquery-1.10.1.js"></script>
<script src="plugins/easyui/js/easyui.min.js"></script>
<script src="plugins/bootstrap/js/bootstrap.min.js"></script>
<script src="plugins/easyui/js/easyui-lang-zh_CN.js"></script>
<script src="plugins/echarts/echarts.min.js"></script>
<script src="plugins/layer/layer.js"></script>
<script src="plugins/waterutils.js"></script>
<script src="js/index.js"></script>
</html>