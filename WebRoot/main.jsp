<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>航管雷达室运行信息提示</title>
<link rel="stylesheet" type="text/css"
	href="themes/jquery-easyui/ui-cupertino/easyui.css">
<link rel="stylesheet" type="text/css"
	href="themes/jquery-easyui/icon.css">
<script type="text/javascript" src="jquery-1.11.0.min.js"></script>
<script type="text/javascript" src="jquery.easyui.min.js"></script>
<style type="text/css">
body {
	margin: 0px;
	padding: 0px;
	width: 100%;
	height: 100%;
}
</style>
</head>
<body class="easyui-layout">
	<div region="north" title="运行信息" split="true"
		style="height:50%;border-left:0px;border-right:0px;overflow:hidden;">
		<iframe id="recordF" name="inFrame" scrolling="NO" frameborder="0"
			src="record.jsp" style="width:100%;height:100%;"> </iframe>
	</div>
	<div region="west" title="科室工作计划" split="true"
		style="width:50%;border-left:0px;border-right:0px;overflow:hidden;">
		<iframe name="inFrame" scrolling="NO" frameborder="0"
			src="planquery.jsp" style="width:100%;height:100%;"> </iframe>
	</div>
	<div region="center" title="今日值班人员工作安排" border="true"
		style="border-left:0px;border-right:0px;overflow:hidden;">
		<iframe name="inFrame" scrolling="NO" frameborder="0"
			src="ondutyplan.jsp" style="width:100%;height:100%;"> </iframe>
	</div>
</body>
</html>