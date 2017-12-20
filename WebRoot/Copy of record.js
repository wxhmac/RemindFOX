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
		width : 20,
		sortable : true,
		editable : false,
	});

	colMode.push({
		name : "occurdate",
		index : "occurdate",
		label : "发生日期",
		align : "center",
		width : 15,
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
		width : 60,
	});

	var myGrid1 = $("#gridTable1");
	var pgnum = 2;
	var re_records = 0;
	var re_rownum = 5;
	var pgtotal = 0;

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
		rowNum : re_rownum,
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
		loadComplete : function() {
			re_records = jQuery("#gridTable1").getGridParam('records');
			pgtotal = Math.ceil(re_records / re_rownum);
		},
		intervalId : setInterval(function() {

			if (pgtotal == 1) {
				myGrid1.trigger("reloadGrid");
				return;
			}

			myGrid1.clearGridData();

			if (pgnum > pgtotal) {
				pgnum = 1;
			}

			jQuery("#gridTable1").jqGrid('setGridParam', {
				page : pgnum
			});

			pgnum++;

			setTimeout(function() {
				myGrid1.trigger("reloadGrid");
			}, 1000)

			$("#record").fadeOut(1000);

			$("#record").fadeIn(3000);

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
});