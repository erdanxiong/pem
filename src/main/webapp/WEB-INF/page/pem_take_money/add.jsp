<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
 <div class="easyui-panel" data-options="fit:true">
        <div style="padding:50px 60px 20px 60px;text-align:center">
        <form id="take_money_form" method="post">
            <table cellpadding="5">
                <tr>
                    <td>银行名称:</td>
                    <td><input class="easyui-numberbox" type="text" name="bank_id"  id="bank_id" ></input></td>
                </tr>
                <tr>
                    <td>取钱地点:</td>
                    <td><input class="easyui-textbox"   type="text"  name="address"    id="address"></input></td>
                </tr>
                <tr>
                    <td>取钱金额:</td>
                    <td><input class="easyui-numberbox" name="sum"  id="sum" ></input></td>
                </tr>
                
                <tr>
                    <td>消费日期:</td>
                    <td><input class="easyui-datebox"   name="take_date" id="take_date" ></input></td>
                </tr>
            </table>
        </form>
        <div style="text-align:center;padding:5px">
            <a href="javascript:void(0)" class="easyui-linkbutton"   onclick="take_money_submit()">Submit</a>
            <a href="javascript:void(0)" class="easyui-linkbutton"   onclick="take_money_clear()" >Clear</a>
        </div>
        </div>
    </div>
