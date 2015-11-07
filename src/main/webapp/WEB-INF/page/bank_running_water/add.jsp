<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
 <div class="easyui-panel" data-options="fit:true">
        <div style="padding:50px 60px 20px 60px;text-align:center">
        <form id="bank_water_form" method="post">
            <table cellpadding="5">
                <tr>
                    <td>流水:</td>
                    <td><input class="easyui-textbox" type="text" name="running_name"  id="running_name" ></input></td>
                </tr>
                <tr>
                    <td>流水金额:</td>
                    <td><input class="easyui-numberbox"   name="sum"    id="sum"></input></td>
                </tr>
                <tr>
                    <td>流水状态:</td>
                    <td><input class="easyui-numberbox" type="text" name="status"  id="status" ></input></td>
                </tr>
                
                <tr>
                    <td>卡内余额:</td>
                     <td><input class="easyui-numberbox" name="bank_balance"   id="bank_balance"></input></td>
                </tr>
                  
                <tr>
                    <td>银行卡号:</td>
                    <td><input class="easyui-numberbox" name="bank_id"    id="bank_id"></input></td>
                </tr>
                <tr>
                    <td>流水时间:</td>
                     <td><input class="easyui-datebox"   name="water_date" id="water_date" ></input></td>
                </tr>
            </table>
        </form>
        <div style="text-align:center;padding:5px">
            <a href="javascript:void(0)" class="easyui-linkbutton"   onclick="bank_water_submit()">Submit</a>
            <a href="javascript:void(0)" class="easyui-linkbutton"   onclick="consume_detail_clear()" >Clear</a>
        </div>
        </div>
    </div>
