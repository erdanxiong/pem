<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
 <div class="easyui-panel" data-options="fit:true">
        <div style="padding:50px 60px 20px 60px;text-align:center">
        <form id="pem_bank_form" method="post">
            <table cellpadding="5">
                <tr>
                    <td>银行卡号:</td>
                    <td><input class="easyui-textbox" type="text" name="bankCode"  id="bank_code" ></input></td>
                </tr>
                <tr>
                    <td>银行名称:</td>
                    <td><input class="easyui-textbox"   type="text"  name="bankName"    id="bank_name"></input></td>
                </tr>
                <tr>
                    <td>持卡类型:</td>
                    <td><input class="easyui-numberbox" name="type"  id="bank_type" ></input></td>
                </tr>
            </table>
        </form>
        <div style="text-align:center;padding:5px">
            <a href="javascript:void(0)" class="easyui-linkbutton"   onclick="pem_bank_submit()">Submit</a>
            <a href="javascript:void(0)" class="easyui-linkbutton"   onclick="pem_bank_clear()" >Clear</a>
        </div>
        </div>
    </div>
