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
		name : "info",
		index : "info",
		label : "关注事项",
		align : "center",
		sortable : false,
		title : false
	});

	var myGrid3 = $("#gridTable3");

	myGrid3.jqGrid({
		url : "queryPlans",
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

		gridComplete : function() {
			$(this).closest('.ui-jqgrid-view').find('div.ui-jqgrid-hdiv')
					.hide();
		},

		intervalId : setInterval(function() {
			myGrid3.trigger("reloadGrid");
		}, 1 * 20 * 1000),
	});

	jQuery("#gridTable3").navGrid('#gridPager3', {
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

	$("#mymar").height($("#noticeF", parent.document).height());
});