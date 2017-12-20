<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="Stylesheet" type="text/css"
	href="themes/redmond/jquery.ui.all.css" />
<link rel="Stylesheet" type="text/css" href="ui.jqgrid.css" />
<link rel="Stylesheet" type="text/css" href="css/popupStyle.css" />
<script type="text/javascript" src="jquery-1.11.0.js"></script>
<script type="text/javascript" src="grid.locale-cn.js"></script>
<script type="text/javascript"
	src="themes/ui/minified/jquery-ui.custom.min.js"></script>
<script type="text/javascript" src="jquery.jqGrid.min.js"></script>

<script type="text/javascript" charset="utf-8"
	src="jquery.leanModal.min.js"></script>
<script type="text/javascript" src="planquery.js"></script>
</head>
<body>
	<marquee behavior="scroll" contenteditable="true" direction="down"
		onstart="this.firstChild.innerHTML+=this.firstChild.innerHTML;"
		scrollamount="3" width="100%" height="300px" onmouseover="this.stop();"
		onmouseout="this.start();">
		<div align="center">
			<table id="gridTable4"></table>
		</div>
	</marquee>
</body>
</html>