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
	<div region="west" split="true"
		style="width:50%;border-left:0px;border-right:0px;overflow:hidden;">
		<div class="easyui-layout" id="subWrap" fit="true"
			style="width:100%;height:100%;background:#0A3DA4;">
			<div region="north" border="true" title="运行信息" split="true"
				style="height:50%;background:#A9FACD;overflow:hidden;">
				<iframe id="recordF" name="inFrame" scrolling="NO" frameborder="0"
					src="record.jsp" style="width:100%;height:100%;"> </iframe>
			</div>
			<div region="center" border="true" title="科室工作计划" split="true"
				style="height:100%;background:#E2E377;overflow:hidden;">
				<iframe name="inFrame" scrolling="NO" frameborder="0"
					src="planquery.jsp" style="width:100%;height:100%;"> </iframe>
			</div>
		</div>
	</div>
	<div region="center" border="true"
		style="border-left:0px;border-right:0px;overflow:hidden;">
		<div class="easyui-layout" id="subWrap" fit="true"
			style="width:100%;height:100%;background:#0A3DA4;">
			<div region="north" border="true" title="重要事项提醒" split="true"
				style="height:50%;overflow:hidden;">
				<iframe id="noticeF" name="inFrame" scrolling="NO" frameborder="0"
					src="notice.jsp" style="width:100%;height:100%;"> </iframe>
			</div>
			<div region="center" border="true" title="今日值班人员工作安排" split="true"
				style="height:100%; overflow:hidden;">
				<iframe name="inFrame" scrolling="NO" frameborder="0"
					src="ondutyplan.jsp" style="width:100%;height:100%;"> </iframe>
			</div>
		</div>
	</div>
</body>
</html>