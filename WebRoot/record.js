$(function() {

	var colMode = [];
	colMode.push({
		name : "recordId",
		index : "recordId",
		label : "记录ID",
		align : "center",
		sortable : false,
		hidden : true
	});

	colMode.push({
		name : "device",
		index : "device",
		label : "设备",
		align : "center",
		width : 22,
		sortable : true,
		editable : false,
	});

	colMode.push({
		name : "occurdate",
		index : "occurdate",
		label : "发生日期",
		align : "center",
		width : 16,
		sortable : false,
		editable : false,
		formatter : 'date',
		formatoptions : {
			srcformat : 'Y-m-d',
			newformat : 'Y-m-d'
		}
	});

	colMode.push({
		name : "info",
		index : "info",
		label : "运行信息",
		align : "center",
		sortable : false,
		editable : false,
		title : false,
		width : 80,
	});

	var myGrid1 = $("#gridTable1");
	var myGrid11 = $("#gridTable11");
	myGrid11.jqGrid({
		height : "auto",
		width : $(window).width(),
		colModel : colMode,
	});

	myGrid1.jqGrid({
		url : "getRecords",
		datatype : "json",
		mtype : "POST",
		height : "auto",
		width : $(window).width(),
		autowidth : false,
		colModel : colMode,
		viewrecords : true,
		rownumbers : false,
		rowNum : -1,
		pginput : false,
		pgbuttons : false,
		forceFit : true,
		prmNames : {
			sort : "sidx"
		},
		jsonReader : {
			root : "gridModel",
			records : "record",
			repeatitems : false
		},
		caption : "",
		gridview : true,
		intervalId : setInterval(function() {
			myGrid1.trigger("reloadGrid");
		}, 1 * 20 * 1000),
	});

	jQuery("#gridTable1").navGrid('#gridPager1', {
		edit : false,
		add : false,
		del : false,
		search : false,
	},
	// edit options
	{},
	// add options
	{},
	// delete options
	{},
	// search
	{});
	
	$("#mymar").height($("#recordF", parent.document).height());
});