$(function(){
	initFactoryAndPressureStation();
})
function initFactoryAndPressureStation(){
	/* 初始化datagrid */
	var optionSet = {
		url:'action/q&a/listJavaQandAByPage',
		queryParams:{
			'language':'java'
		},
		striped : true,
		fitColumns : true,
		rownumbers : false,
		singleSelect : false,
		loadMsg : '玩命加载中...',
		pagination : true,
		fit : false,
		height:300,
		pageList:[1,2,3],
		pageSize:1,
		nowrap:false
	}
	var option = $.extend({}, optionSet, settings2)
	
	$("#factoryAndPressureStation").datagrid(option)
	
}
var settings2 = {
		scrollbarSize : 0,
		columns : [ [ {
			field : 'check',
			title : '单选',
			checkbox : true,
			width : 100,
			align : 'center'
		}, {
			field : 'question',
			title : 'wneti',
			width : 100,
			align : 'center'
		}, {
			field : 'answer',
			title : '答案',
			width : 100,
			align : 'center'
		} ] ]
	};