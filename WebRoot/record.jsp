<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="Stylesheet" type="text/css"
	href="themes/redmond/jquery.ui.all.css" />
<link rel="Stylesheet" type="text/css" href="wxh.ui.jqgrid.css" />
<link rel="Stylesheet" type="text/css" href="css/popupStyle.css" />
<script type="text/javascript" src="jquery-1.11.0.js"></script>
<script type="text/javascript" src="grid.locale-cn.js"></script>
<script type="text/javascript"
	src="themes/ui/minified/jquery-ui.custom.min.js"></script>
<script type="text/javascript" src="jquery.jqGrid.min.js"></script>

<script type="text/javascript" charset="utf-8"
	src="jquery.leanModal.min.js"></script>
<script type="text/javascript" src="record.js"></script>
</head>
<body style="padding:0;margin:0;">
	<marquee behavior="scroll" direction="up" scrollamount="2" width="100%"
		id="mymar" onmouseover="this.stop();" onmouseout="this.start();">
		<div id="record" align="center">
			<table id="gridTable1"></table>
		</div>
	</marquee>
</body>
</html>