<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
 <div class="easyui-panel" data-options="fit:true">
        <div style="padding:50px 60px 20px 60px;text-align:center">
        <form id="consume_detail_form" method="post">
            <table cellpadding="5">
                <tr>
                    <td>名称:</td>
                    <td><input class="easyui-textbox" type="text" name="consume_name"  id="consume_name" ></input></td>
                </tr>
                <tr>
                    <td>消费金额:</td>
                    <td><input class="easyui-numberbox"   name="consume_sum"    id="consume_sum"></input></td>
                </tr>
                <tr>
                    <td>消费地址:</td>
                    <td><input class="easyui-textbox" type="text" name="consume_address"  id="consume_address" ></input></td>
                </tr>
                
                <tr>
                    <td>消费日期:</td>
                    <td><input class="easyui-datebox"   name="comsume_date" id="comsume_date" ></input></td>
                </tr>
                
                <tr>
                    <td>消费原因:</td>
                    <td><input class="easyui-textbox" name="consume_reason"   style="height:60px" id="consume_reason"></input></td>
                </tr>
                <tr>
                    <td>消费类型:</td>
                    <td>
                        <select class="easyui-combobox" name="isNeed">
                        		<option value="0">Arabic</option>
                        		<option value="0">Bulgarian</option>
                        		<option value="0">Catalan</option>
                        		<option value="0">Chinese Traditional</option>
                        		<option value="1">Persian</option>
                    </td>
                </tr>
            </table>
        </form>
        <div style="text-align:center;padding:5px">
            <a href="javascript:void(0)" class="easyui-linkbutton"   onclick="consume_detail_submit()">Submit</a>
            <a href="javascript:void(0)" class="easyui-linkbutton"   onclick="consume_detail_clear()" >Clear</a>
        </div>
        </div>
    </div>
