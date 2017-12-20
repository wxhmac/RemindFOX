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
		name : "members",
		index : "members",
		label : "人员",
		align : "center",
		width : 20,
		sortable : false
	});
	
	colMode.push({
		name : "info",
		index : "info",
		label : "计划",
		align : "center",
		width : 60,
		sortable : false,
		title : false
	});
	
	colMode.push({
		name : "plandateEnd",
		index : "plandateEnd",
		label : "截止日期",
		align : "center",
		width : 18,
		sortable : true,
		search : false,
		formatter : 'date',
		formatoptions : {
			srcformat : 'Y-m-d',
			newformat : 'Y-m-d'
		}
	});

	var myGrid4 = $("#gridTable4");
	var pgnum = 2;
	var re_records = 0;
	var re_rownum = 6;
	var pgtotal = 0;

	myGrid4.jqGrid({
		url : "queryPlans",
		datatype : "json",
		mtype : "POST",
		height : "auto",
		width : $(window).width(),
		autowidth : false,
		colModel : colMode,
		viewrecords : true,
		rownumbers : false,
		rowNum : re_rownum,
		pginput : false,
		pgbuttons : false,
		forceFit : true,
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
		loadComplete : function() {
			re_records = jQuery("#gridTable4").getGridParam('records');
			pgtotal = Math.ceil(re_records / re_rownum);
		},
		intervalId : setInterval(function() {

			if (pgtotal == 1) {
				myGrid4.trigger("reloadGrid");
				return;
			}

			myGrid4.clearGridData();

			if (pgnum > pgtotal) {
				pgnum = 1;
			}

			jQuery("#gridTable4").jqGrid('setGridParam', {
				page : pgnum
			});

			pgnum++;

			setTimeout(function() {
				myGrid4.trigger("reloadGrid");
			}, 1000)
			
			$("#record").fadeOut(1000);

			$("#record").fadeIn(3000);
			
		}, 1 * 20 * 1000),
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