package org.apache.jsp.WEB_002dINF.page.consume_005fdetail;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class add_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write(" <div class=\"easyui-panel\" data-options=\"fit:true\">\r\n");
      out.write("        <div style=\"padding:50px 60px 20px 60px;text-align:center\">\r\n");
      out.write("        <form id=\"consume_detail_form\" method=\"post\">\r\n");
      out.write("            <table cellpadding=\"5\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>名称:</td>\r\n");
      out.write("                    <td><input class=\"easyui-textbox\" type=\"text\" name=\"consume_name\"  id=\"consume_name\" ></input></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>消费金额:</td>\r\n");
      out.write("                    <td><input class=\"easyui-numberbox\"   name=\"consume_sum\"    id=\"consume_sum\"></input></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>消费地址:</td>\r\n");
      out.write("                    <td><input class=\"easyui-textbox\" type=\"text\" name=\"consume_address\"  id=\"consume_address\" ></input></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                \r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>消费日期:</td>\r\n");
      out.write("                    <td><input class=\"easyui-datebox\"   name=\"comsume_date\" id=\"comsume_date\" ></input></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                \r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>消费原因:</td>\r\n");
      out.write("                    <td><input class=\"easyui-textbox\" name=\"consume_reason\"   style=\"height:60px\" id=\"consume_reason\"></input></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>消费类型:</td>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        <select class=\"easyui-combobox\" name=\"isNeed\">\r\n");
      out.write("                        \t\t<option value=\"0\">Arabic</option>\r\n");
      out.write("                        \t\t<option value=\"0\">Bulgarian</option>\r\n");
      out.write("                        \t\t<option value=\"0\">Catalan</option>\r\n");
      out.write("                        \t\t<option value=\"0\">Chinese Traditional</option>\r\n");
      out.write("                        \t\t<option value=\"1\">Persian</option>\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("        </form>\r\n");
      out.write("        <div style=\"text-align:center;padding:5px\">\r\n");
      out.write("            <a href=\"javascript:void(0)\" class=\"easyui-linkbutton\"   onclick=\"consume_detail_submit()\">Submit</a>\r\n");
      out.write("            <a href=\"javascript:void(0)\" class=\"easyui-linkbutton\"   onclick=\"consume_detail_clear()\" >Clear</a>\r\n");
      out.write("        </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
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
