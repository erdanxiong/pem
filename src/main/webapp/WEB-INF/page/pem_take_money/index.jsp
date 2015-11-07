<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<title>取钱记录</title>
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
	$("#take_monoey_detail").datagrid({
		title:'取钱记录',
		loadMsg:"正在加载请稍后",
		fitColumns:true,
		url:'${path}/pem/moneyController/getAll',
		toolbar: [{
			iconCls: 'icon-add',
			handler: function(){
				//添加取钱记录
				addtake_money();
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
		            {field:'bank_id',title:'银行名称',width:100,align:'center'},   
		            {field:'address',title:'取钱地点',width:100,align:'center'},
		            {field:'sum',title:'取钱金额',width:100,align:'center'},
		            {field:'take_date',title:'取钱时间',width:100,align:'center',formatter: function(value,row,index){
		            	var targetDate =  new Date(value);
		            	return  targetDate.toLocaleDateString();
		            }}
		        ]] 
	});
});

//添加取钱记录的js
function addtake_money(){
	$("#take_moeny_dialog").dialog({
	    title: '添加银行卡',  
	    href:'${path}/pem/moneyController/add',
	    width: 450,   
	    height: 300,   
	    closed: false,   
	    cache: false,   
	    modal: true  
	});
}

//取钱记录添加
function take_money_submit(){
		$("#take_money_form").form("submit",{
			url:'${path}/pem/moneyController/addtake_money',
			success:function(data){
				if(data=='success'){
					$("#take_moeny_dialog").dialog("close");
					$("#take_monoey_detail").datagrid('reload');
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
			<div id="take_monoey_detail"></div>
			<div id="take_moeny_dialog"></div>
</body>
</html>