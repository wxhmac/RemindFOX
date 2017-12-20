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
		name : "plandateEnd",
		index : "plandateEnd",
		label : "截止日期",
		align : "center",
		width : 13,
		sortable : true,
		search : false,
		formatter : 'date',
		formatoptions : {
			srcformat : 'Y-m-d',
			newformat : 'Y-m-d'
		}
	});

	colMode.push({
		name : "info",
		index : "info",
		label : "计划内容",
		align : "center",
		width : 36,
		sortable : false,
		title : false
	});

	colMode.push({
		name : "finishdescription",
		index : "finishdescription",
		label : "执行情况",
		align : "center",
		width : 36,
		sortable : false,
		title : false
	});

	colMode.push({
		name : "members",
		index : "members",
		label : "执行成员",
		align : "center",
		width : 18,
		sortable : false
	});

	var myGrid4 = $("#gridTable4");

	myGrid4.jqGrid({
		url : "queryPlans",
		datatype : "json",
		mtype : "POST",
		height : "auto",
		width : $(window).width(),
		autowidth : false,
		colModel : colMode,
		viewrecords : true,
		rownumbers : true,
		rowNum : -1,
		pginput : false,
		pgbuttons : false,
		prmNames : {
			search : "search",
			sort : "sidx"
		},
		jsonReader : {
			root : "gridModel",
			records : "record",
			repeatitems : false
		},
		caption : "",
		gridview : true,
	});

	jQuery("#gridTable4").navGrid('#gridPager4', {
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
});