<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<title>个人财务管理</title>
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
<script type="text/javascript"
	src="${path}/pem/easyui/jquery.min.js"></script>
<script type="text/javascript"
	src="${path}/pem/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript">
$(function(){
	$("#person_consume_detail").bind("click",function(){
		//在家个人消费内容
		consume_detail();
	});
	
	$("#pem_bank").bind("click",function(){
		//个人银行卡信息
		pem_bank();
	});
});
function consume_detail(){
	$("#center_panel").panel({
		border:true,
		fit:true,
		content:'<iframe src="${path}/pem/consume_detail/index"   height="100%" width="100%"></iframe>'
	});
}	

function pem_bank(){
	$("#center_panel").panel({
		border:true,
		fit:true,
		content:'<iframe src="${path}/pem/pem_bank/index"   height="100%" width="100%"></iframe>'
	});
}
</script>
</head>
<body>
	<div class="easyui-layout"   data-options="fit:true">
		<!-- 头部面板类容 -->
		<div data-options="region:'north',border:true" style="height: 100px">
				
		</div>
		<!--右边面板内容 -->
		<div data-options="region:'east',split:true" title="East" style="width:180px;">
		
        </div>
		<!-- 西边部分内容 -->
		<div data-options="region:'west',split:true" title="个人开销管理" style="width: 200px;">
			<div class="easyui-accordion" data-options="fit:true,border:true,minimizable:true">
				<div title="日常消费" style="padding: 10px;">
						<a  href="#"  id="person_consume_detail">个人日常消费管理</a>
				</div>
				<div title="个人银行卡管理" style="padding: 10px;">
			
						<a  href="#"  id="pem_bank">个人银行卡管理</a>
				</div>
			</div>
		</div>
		<!-- 中间内容 -->
		<div  data-options="region:'center',title:'内容面板'" >
			<div    id="center_panel"   ></div>
		</div>
	</div>
</body>
</html>