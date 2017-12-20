<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Basic Layout - jQuery EasyUI Demo</title>
<link rel="Stylesheet" type="text/css"
	href="themes/redmond/jquery.ui.all.css" />
<link rel="Stylesheet" type="text/css" href="ui.jqgrid.css" />
<link rel="Stylesheet" type="text/css" href="css/popupStyle.css" />
<link rel="stylesheet" type="text/css"
	href="themes/jquery-easyui/default/easyui.css">
<link rel="stylesheet" type="text/css"
	href="themes/jquery-easyui/icon.css">
<script type="text/javascript" src="jquery-1.11.0.min.js"></script>
<script type="text/javascript" src="jquery.easyui.min.js"></script>
<script type="text/javascript" src="jquery.marquee.js"></script>
<script type="text/javascript" src="grid.locale-cn.js"></script>
<script type="text/javascript"
	src="themes/ui/minified/jquery-ui.custom.min.js"></script>
<script type="text/javascript" src="jquery.jqGrid.min.js"></script>

<script type="text/javascript" charset="utf-8"
	src="jquery.leanModal.min.js"></script>
<script type="text/javascript" src="planquery.js"></script>
<script type="text/javascript">
	$(function() {
		$("#marquee").marquee({
			yScroll : "bottom"
		});
	});

	var mydata = [ {
		id : "1",
		invdate : "2010-05-24",
		name : "test",
		note : "note",
		tax : "10.00",
		total : "2111.00"
	}, {
		id : "2",
		invdate : "2010-05-25",
		name : "test2",
		note : "note2",
		tax : "20.00",
		total : "320.00"
	}, {
		id : "3",
		invdate : "2007-09-01",
		name : "test3",
		note : "note3",
		tax : "30.00",
		total : "430.00"
	}, {
		id : "4",
		invdate : "2007-10-04",
		name : "test",
		note : "note",
		tax : "10.00",
		total : "210.00"
	}, {
		id : "5",
		invdate : "2007-10-05",
		name : "test2",
		note : "note2",
		tax : "20.00",
		total : "320.00"
	}, {
		id : "6",
		invdate : "2007-09-06",
		name : "test3",
		note : "note3",
		tax : "30.00",
		total : "430.00"
	}, {
		id : "7",
		invdate : "2007-10-04",
		name : "test",
		note : "note",
		tax : "10.00",
		total : "210.00"
	}, {
		id : "8",
		invdate : "2007-10-03",
		name : "test2",
		note : "note2",
		amount : "300.00",
		tax : "21.00",
		total : "320.00"
	}, {
		id : "9",
		invdate : "2007-09-01",
		name : "test3",
		note : "note3",
		amount : "400.00",
		tax : "30.00",
		total : "430.00"
	}, {
		id : "11",
		invdate : "2007-10-01",
		name : "test",
		note : "note",
		amount : "200.00",
		tax : "10.00",
		total : "210.00"
	}, {
		id : "12",
		invdate : "2007-10-02",
		name : "test2",
		note : "note2",
		amount : "300.00",
		tax : "20.00",
		total : "320.00"
	}, {
		id : "13",
		invdate : "2007-09-01",
		name : "test3",
		note : "note3",
		amount : "400.00",
		tax : "30.00",
		total : "430.00"
	}, {
		id : "14",
		invdate : "2007-10-04",
		name : "test",
		note : "note",
		amount : "200.00",
		tax : "10.00",
		total : "210.00"
	}, {
		id : "15",
		invdate : "2007-10-05",
		name : "test2",
		note : "note2",
		amount : "300.00",
		tax : "20.00",
		total : "320.00"
	}, {
		id : "16",
		invdate : "2007-09-06",
		name : "test3",
		note : "note3",
		amount : "400.00",
		tax : "30.00",
		total : "430.00"
	}, {
		id : "17",
		invdate : "2007-10-04",
		name : "test",
		note : "note",
		amount : "200.00",
		tax : "10.00",
		total : "210.00"
	}, {
		id : "18",
		invdate : "2007-10-03",
		name : "test2",
		note : "note2",
		amount : "300.00",
		tax : "20.00",
		total : "320.00"
	}, {
		id : "19",
		invdate : "2007-09-01",
		name : "test3",
		note : "note3",
		amount : "400.00",
		tax : "30.00",
		total : "430.00"
	}, {
		id : "21",
		invdate : "2007-10-01",
		name : "test",
		note : "note",
		amount : "200.00",
		tax : "10.00",
		total : "210.00"
	}, {
		id : "22",
		invdate : "2007-10-02",
		name : "test2",
		note : "note2",
		amount : "300.00",
		tax : "20.00",
		total : "320.00"
	}, {
		id : "23",
		invdate : "2007-09-01",
		name : "test3",
		note : "note3",
		amount : "400.00",
		tax : "30.00",
		total : "430.00"
	}, {
		id : "24",
		invdate : "2007-10-04",
		name : "test",
		note : "note",
		amount : "200.00",
		tax : "10.00",
		total : "210.00"
	}, {
		id : "25",
		invdate : "2007-10-05",
		name : "test2",
		note : "note2",
		amount : "300.00",
		tax : "20.00",
		total : "320.00"
	}, {
		id : "26",
		invdate : "2007-09-06",
		name : "test3",
		note : "note3",
		amount : "400.00",
		tax : "30.00",
		total : "430.00"
	}, {
		id : "27",
		invdate : "2007-10-04",
		name : "test",
		note : "note",
		amount : "200.00",
		tax : "10.00",
		total : "210.00"
	}, {
		id : "28",
		invdate : "2007-10-03",
		name : "test2",
		note : "note2",
		amount : "300.00",
		tax : "20.00",
		total : "320.00"
	}, {
		id : "29",
		invdate : "2007-09-01",
		name : "test3",
		note : "note3",
		amount : "400.00",
		tax : "30.00",
		total : "430.00"
	} ];
	jQuery("#list47").jqGrid(
			{
				data : mydata,
				datatype : "local",
				height : 150,
				rowNum : 10,
				rowList : [ 10, 20, 30 ],
				colNames : [ 'Inv No', 'Date', 'Client', 'Amount', 'Tax',
						'Total', 'Notes' ],
				colModel : [ {
					name : 'id',
					index : 'id',
					width : 60,
					sorttype : "int"
				}, {
					name : 'invdate',
					index : 'invdate',
					width : 90,
					sorttype : "date",
					formatter : "date"
				}, {
					name : 'name',
					index : 'name',
					width : 100
				}, {
					name : 'amount',
					index : 'amount',
					width : 80,
					align : "right",
					sorttype : "float",
					formatter : "number"
				}, {
					name : 'tax',
					index : 'tax',
					width : 80,
					align : "right",
					sorttype : "float"
				}, {
					name : 'total',
					index : 'total',
					width : 80,
					align : "right",
					sorttype : "float"
				}, {
					name : 'note',
					index : 'note',
					width : 150,
					sortable : false
				} ],
				pager : "#plist47",
				viewrecords : true,
				caption : "Manipulating Array Data"
			});
</script>

<style type="text/css">
.demo {
	width: 420px;
	margin: 20px auto;
}

ul.marquee {
	display: block;
	line-height: 1;
	position: relative;
	overflow: hidden;
	width: 400px;
	height: 22px;
	border: 1px dotted #d3d3d3;
	background: #f7f7f7
}

ul.marquee li {
	position: absolute;
	top: -999em;
	left: 0;
	display: block;
	line-height: 20px;
	padding: 3px 5px;
	white-space: nowrap;
	text-indent: 0.8em;
}
</style>


</head>

<body>
	<marquee behavior="scroll" direction="down" scrollamount="5"
		width="350" height="600" onMouseOver="this.stop()"
		onMouseOut="this.start()">
	</marquee>
	<table id="list47"></table>
	<div id="plist47"></div>
</body>
</html>