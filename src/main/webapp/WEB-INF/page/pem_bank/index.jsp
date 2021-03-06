<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<title>银行卡信息</title>
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
	$("#pem_bank_detail").datagrid({
		title:'银行卡信息',
		loadMsg:"正在加载请稍后",
		fitColumns:true,
		url:'${path}/pem/pem_bank/getAll',
		toolbar: [{
			iconCls: 'icon-add',
			handler: function(){
				//添加银行卡
				addConsume_detail();
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
		            {field:'bankCode',title:'银行卡号',width:100,align:'center'},   
		            {field:'bankName',title:'银行名称',width:100,align:'center'},
		            {field:'type',title:'持卡类型',width:100,align:'center'}
		        ]] 
	});
});

//添加银行卡的js
function addConsume_detail(){
	$("#pem_bank_dialog").dialog({
	    title: '添加银行卡',  
	    href:'${path}/pem/pem_bank/add',
	    width: 450,   
	    height: 300,   
	    closed: false,   
	    cache: false,   
	    modal: true  
	});
}

//银行卡添加
function pem_bank_submit(){
		$("#pem_bank_form").form("submit",{
			url:'${path}/pem/pem_bank/addPem_bank',
			success:function(data){
				if(data=='success'){
					$("#pem_bank_dialog").dialog("close");
					$("#pem_bank_detail").datagrid('reload');
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
			<div id="pem_bank_detail"></div>
			<div id="pem_bank_dialog"></div>
</body>
</html>