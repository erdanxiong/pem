<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<title>银行流水</title>
<link rel="stylesheet" type="text/css"
	href="${path}/pem/easyui/themes/black/easyui.css">
<link rel="stylesheet" type="text/css"
	href="${path}/pem/easyui/themes/icon.css">
<link rel="stylesheet" type="text/css"
	href="${path}/pem/easyui/demo/demo.css">
<style type="text/css">
#fm {
	margin: 0;
	padding: 10px 30px;
}

.ftitle {
	font-size: 14px;
	font-weight: bold;
	color: #666;
	padding: 5px 0;
	margin-bottom: 10px;
	border-bottom: 1px solid #ccc;
}

.fitem {
	margin-bottom: 5px;
}

.fitem label {
	display: inline-block;
	width: 80px;
}
</style>
<script type="text/javascript" src="${path}/pem/easyui/jquery.min.js"></script>
<script type="text/javascript" src="${path}/pem/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript">
$(function(){
	$("#bank_water_detail").datagrid({
		title:'银行流水记录',
		loadMsg:"正在加载请稍后",
		fitColumns:true,
		url:'${path}/pem/bank_runing_water/getAll',
		toolbar: [{
			iconCls: 'icon-add',
			handler: function(){
				//添加银行流水记录
				addbank_water();
			}
		},'-',{
			iconCls: 'icon-help',
			handler: function(){alert('help')}
		}],
		rownumbers:true,
		pagination:true,
		pageNumber:1,
		pageSize:10,
		pageList:[10,20,30,40,50],
		columns:[[   
		            {field:'running_name',title:'流水名称',width:100,align:'center'},   
		            {field:'sum',title:'流水金额',width:100,align:'center'},
		            {field:'status',title:'流水类型',width:100,align:'center'},
		            {field:'bank_balance',title:'卡内余额',width:100,align:'center'},
		            {field:'bank_id',title:'银行卡号',width:100,align:'center'},
		            {field:'water_date',title:'流水日期',width:100,align:'center',formatter: function(value,row,index){
		            	var targetDate =  new Date(value);
		            	return  targetDate.toLocaleDateString();
		            }}
		        ]] 
	});
});

//添加流水记录的js
function addbank_water(){
	$("#bank_water_dialog").dialog({
	    title: '流水记录',  
	    href:'${path}/pem/bank_runing_water/add',
	    width: 450,   
	    height: 400,   
	    closed: false,   
	    cache: false,   
	    modal: true  
	});
}

//流水记录添加
function bank_water_submit(){
		$("#bank_water_form").form("submit",{
			url:'${path}/pem/bank_runing_water/addBankWater',
			success:function(data){
				if(data=='success'){
					$("#bank_water_dialog").dialog("close");
					$("#bank_water_detail").datagrid('reload');
				}
			}
		});
	
}

//表单的提交验证
function message(message){
	$.messager.alert('警告',message);  
}
</script>
</head>
<body>
			<div id="bank_water_detail"></div>
			<div id="bank_water_dialog"></div>
</body>
</html>