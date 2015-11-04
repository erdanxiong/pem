package org.apache.jsp.WEB_002dINF.page.consume_005fdetail;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("\r\n");
      out.write("<title>日常开销</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${path}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/pem/easyui/themes/black/easyui.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${path}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/pem/easyui/themes/icon.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${path}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/pem/easyui/demo/demo.css\">\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("#fm {\r\n");
      out.write("\tmargin: 0;\r\n");
      out.write("\tpadding: 10px 30px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".ftitle {\r\n");
      out.write("\tfont-size: 14px;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("\tcolor: #666;\r\n");
      out.write("\tpadding: 5px 0;\r\n");
      out.write("\tmargin-bottom: 10px;\r\n");
      out.write("\tborder-bottom: 1px solid #ccc;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".fitem {\r\n");
      out.write("\tmargin-bottom: 5px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".fitem label {\r\n");
      out.write("\tdisplay: inline-block;\r\n");
      out.write("\twidth: 80px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${path}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/pem/easyui/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${path}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/pem/easyui/jquery.easyui.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(function(){\r\n");
      out.write("\t$(\"#consume_detail\").datagrid({\r\n");
      out.write("\t\ttitle:'消费详情',\r\n");
      out.write("\t\tloadMsg:\"正在加载请稍后\",\r\n");
      out.write("\t\tfitColumns:true,\r\n");
      out.write("\t\turl:'");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${path}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/pem/consume_detail/getAll',\r\n");
      out.write("\t\ttoolbar: [{\r\n");
      out.write("\t\t\ticonCls: 'icon-add',\r\n");
      out.write("\t\t\thandler: function(){\r\n");
      out.write("\t\t\t\t//添加栏目\r\n");
      out.write("\t\t\t\taddConsume_detail();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t},'-',{\r\n");
      out.write("\t\t\ticonCls: 'icon-help',\r\n");
      out.write("\t\t\thandler: function(){alert('help')}\r\n");
      out.write("\t\t}],\r\n");
      out.write("\t\trownumbers:true,\r\n");
      out.write("\t\tpagination:true,\r\n");
      out.write("\t\tpageNumber:1,\r\n");
      out.write("\t\tpageSize:10,\r\n");
      out.write("\t\tpageList:[10,20,30,40,50],\r\n");
      out.write("\t\tcolumns:[[   \r\n");
      out.write("\t\t            {field:'consume_name',title:'名称',width:100,align:'center'},   \r\n");
      out.write("\t\t            {field:'consume_sum',title:'消费金额(元)',width:100,align:'center'},\r\n");
      out.write("\t\t            {field:'consume_address',title:'消费地址',width:100,align:'center'},\r\n");
      out.write("\t\t            {field:'comsume_date',title:'消费日期',width:100,align:'center'},\r\n");
      out.write("\t\t            {field:'consume_reason',title:'消费原因',width:100,align:'center'},\r\n");
      out.write("\t\t            {field:'record_id',title:'录入ip',width:100,align:'center'},\r\n");
      out.write("\t\t            {field:'isNeed',title:'必要字段',width:100,align:'center'}\r\n");
      out.write("\t\t        ]] \r\n");
      out.write("\t});\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("//添加栏目的js\r\n");
      out.write("function addConsume_detail(){\r\n");
      out.write("\t$(\"#consume_detail_dialog\").dialog({\r\n");
      out.write("\t    title: '添加消费详情',  \r\n");
      out.write("\t    href:'");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${path}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/pem/consume_detail/add',\r\n");
      out.write("\t    width: 450,   \r\n");
      out.write("\t    height: 400,   \r\n");
      out.write("\t    closed: false,   \r\n");
      out.write("\t    cache: false,   \r\n");
      out.write("\t    modal: true  \r\n");
      out.write("\t});\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("//日常消费添加\r\n");
      out.write("function consume_detail_submit(){\r\n");
      out.write("\r\n");
      out.write("\t\t$(\"#consume_detail_form\").form(\"submit\",{\r\n");
      out.write("\t\t\turl:'");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${path}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/pem/consume_detail/addConsume_detail',\r\n");
      out.write("\t\t\tsuccess:function(data){\r\n");
      out.write("\t\t\t\tif(data=='success'){\r\n");
      out.write("\t\t\t\t\t$(\"#consume_detail\").datagrid('reload');\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("//表单的提交验证\r\n");
      out.write("function  consume_detatil_submitCheck(){\r\n");
      out.write("\tvar consume_name = $(\"#consume_name\").textbox('getValue');\r\n");
      out.write("\tif(consume_name==''){\r\n");
      out.write("\t\tmessage(\"消费名称不能为空\");\r\n");
      out.write("\t\treturn false ;\r\n");
      out.write("\t}\r\n");
      out.write("\tvar consume_sum =  $(\"#consume_sum\").numberbox('getValue');\r\n");
      out.write("\tif(consume_sum==''){\r\n");
      out.write("\t\tmessage(\"消费金额不能为空\");\r\n");
      out.write("\t\treturn  false;\r\n");
      out.write("\t}\r\n");
      out.write("\tvar consume_address  = $(\"#consume_address\").textbox('getValue');\r\n");
      out.write("\tif(consume_address==''){\r\n");
      out.write("\t\tmessage(\"消费地址不能为空\");\r\n");
      out.write("\t\treturn  false;\r\n");
      out.write("\t}\r\n");
      out.write("\tvar comsume_date = $(\"#comsume_date\").datebox('getValue');\t\r\n");
      out.write("\tif(comsume_date==''){\r\n");
      out.write("\t\tmessage(\"消费日期不能为空\");\r\n");
      out.write("\t\treturn  false;\r\n");
      out.write("\t}\r\n");
      out.write("\tvar  consume_reason  =   $(\"#consume_reason\").textbox('getValue');\r\n");
      out.write("\tif(consume_reason==''){\r\n");
      out.write("\t\tmessage(\"消费事由不能为空\");\r\n");
      out.write("\t\treturn  false;\r\n");
      out.write("\t}\r\n");
      out.write("//\tvar isNeed = $('#isNeed').combo('getValue');\r\n");
      out.write("\treturn true;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function message(message){\r\n");
      out.write("\t$.messager.alert('警告',message);  \r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t\t\t<div id=\"consume_detail\"></div>\r\n");
      out.write("\t\t\t<div id=\"consume_detail_dialog\"></div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
