package org.apache.jsp.WEB_002dINF.page;

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
      out.write("<title>个人财务管理</title>\r\n");
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
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${path}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/pem/easyui/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${path}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/pem/easyui/jquery.easyui.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(function(){\r\n");
      out.write("\t$(\"#person_consume_detail\").bind(\"click\",function(){\r\n");
      out.write("\t\t//在家个人消费内容\r\n");
      out.write("\t\tvar  targetURL =\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${path}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/pem/consume_detail/index\";\r\n");
      out.write("\t\tcommon(targetURL);\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t$(\"#pem_bank\").bind(\"click\",function(){\r\n");
      out.write("\t\t//个人银行卡信息\r\n");
      out.write("\t\tvar  targetURL =\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${path}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/pem/pem_bank/index\";\r\n");
      out.write("\t\tcommon(targetURL);\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t$(\"#take_money\").bind(\"click\",function(){\r\n");
      out.write("\t\t//个人取钱记录\r\n");
      out.write("\t\tvar  targetURL =\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${path}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/pem/moneyController/index\";\r\n");
      out.write("\t\tcommon(targetURL);\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t$(\"#bank_water\").bind(\"click\",function(){\r\n");
      out.write("\t\t//银行操作流水\r\n");
      out.write("\t\tvar  targetURL =\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${path}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/pem/bank_runing_water/index\";\r\n");
      out.write("\t\tcommon(targetURL);\r\n");
      out.write("\t});\r\n");
      out.write("});\r\n");
      out.write("function common(targetURL){\r\n");
      out.write("\t$(\"#center_panel\").panel({\r\n");
      out.write("\t\tborder:true,\r\n");
      out.write("\t\tfit:true,\r\n");
      out.write("\t\tcontent:'<iframe src='+targetURL+'   height=\"100%\" width=\"100%\"></iframe>'\r\n");
      out.write("\t});\r\n");
      out.write("}\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"easyui-layout\"   data-options=\"fit:true\">\r\n");
      out.write("\t\t<!-- 头部面板类容 -->\r\n");
      out.write("\t\t<div data-options=\"region:'north',border:true\" style=\"height: 100px\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!--右边面板内容 -->\r\n");
      out.write("\t\t<div data-options=\"region:'east',split:true\" title=\"East\" style=\"width:180px;\">\r\n");
      out.write("\t\t\r\n");
      out.write("        </div>\r\n");
      out.write("\t\t<!-- 西边部分内容 -->\r\n");
      out.write("\t\t<div data-options=\"region:'west',split:true\" title=\"个人开销管理\" style=\"width: 200px;\">\r\n");
      out.write("\t\t\t<div class=\"easyui-accordion\" data-options=\"fit:true,border:true,minimizable:true\">\r\n");
      out.write("\t\t\t\t<div title=\"生活常用信息管理\" style=\"padding: 10px;\">\r\n");
      out.write("\t\t\t\t\t\t<div><a  href=\"#\"  id=\"person_consume_detail\">个人日常消费信息</a></div>\r\n");
      out.write("\t\t\t\t\t\t<div><a  href=\"#\"  id=\"pem_bank\">个人银行卡信息</a></div>\r\n");
      out.write("\t\t\t\t\t\t<div><a  href=\"#\"  id=\"take_money\">取钱信息</a></div>\r\n");
      out.write("\t\t\t\t\t\t<div><a  href=\"#\"  id=\"bank_water\">银行操作流水</a></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- 中间内容 -->\r\n");
      out.write("\t\t<div  data-options=\"region:'center',title:'内容面板'\" >\r\n");
      out.write("\t\t\t<div    id=\"center_panel\"   ></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
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
