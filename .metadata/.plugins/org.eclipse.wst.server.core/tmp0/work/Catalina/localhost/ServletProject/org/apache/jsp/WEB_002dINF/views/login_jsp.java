/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.70
 * Generated at: 2017-11-01 09:35:24 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("    \r\n");
      out.write("    <title>无线点餐 后台登陆</title>\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("    \r\n");
      out.write("   <link rel=\"stylesheet\" type=\"text/css\" href=\"/ServletProject/bootstrap/css/bootstrap.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"/ServletProject/css/theme.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/ServletProject/font-awesome/css/font-awesome.css\">\r\n");
      out.write("\r\n");
      out.write("\t<script src=\"/ServletProject/js/jquery-1.7.2.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("    <script src=\"/ServletProject/bootstrap/js/bootstrap.js\"></script>\r\n");
      out.write("   \r\n");
      out.write("\t<style type=\"text/css\">\r\n");
      out.write("      .form-signin {\r\n");
      out.write("        max-width: 300px;\r\n");
      out.write("        padding: 19px 29px 29px;\r\n");
      out.write("        margin: 0 auto 20px;\r\n");
      out.write("        background-color:  #fff;\r\n");
      out.write("        border: 1px solid #e5e5e5;\r\n");
      out.write("        -webkit-border-radius: 5px;\r\n");
      out.write("           -moz-border-radius: 5px;\r\n");
      out.write("                border-radius: 5px;\r\n");
      out.write("        -webkit-box-shadow: 0 1px 2px rgba(0,0,0,.05);\r\n");
      out.write("           -moz-box-shadow: 0 1px 2px rgba(0,0,0,.05);\r\n");
      out.write("                box-shadow: 0 1px 2px rgba(0,0,0,.05);\r\n");
      out.write("      }\r\n");
      out.write("      .form-signin .form-signin-heading,\r\n");
      out.write("      .form-signin .checkbox {\r\n");
      out.write("        margin-bottom: 10px;\r\n");
      out.write("      }\r\n");
      out.write("      .form-signin input[type=\"text\"],\r\n");
      out.write("      .form-signin input[type=\"password\"] {\r\n");
      out.write("        font-size: 16px;\r\n");
      out.write("        height: auto;\r\n");
      out.write("        margin-bottom: 15px;\r\n");
      out.write("        padding: 7px 9px;\r\n");
      out.write("      }\r\n");
      out.write("      #line-chart {\r\n");
      out.write("            height:300px;\r\n");
      out.write("            width:800px;\r\n");
      out.write("            margin: 0px auto;\r\n");
      out.write("            margin-top: 1em;\r\n");
      out.write("        }\r\n");
      out.write("        .brand { font-family: georgia, serif; }\r\n");
      out.write("        .brand .first {\r\n");
      out.write("            color: #ccc;\r\n");
      out.write("            font-style: italic;\r\n");
      out.write("        }\r\n");
      out.write("        .brand .second {\r\n");
      out.write("            color: #fff;\r\n");
      out.write("            font-weight: bold;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("  </head>\r\n");
      out.write("  <body class=\"\">\r\n");
      out.write("    <div class=\"navbar\">\r\n");
      out.write("        <div class=\"navbar-inner\">\r\n");
      out.write("                <ul class=\"nav pull-right\">\r\n");
      out.write("                    \r\n");
      out.write("                </ul>\r\n");
      out.write("                <a class=\"brand\" href=\"index.jsp\"><span class=\"first\">无线点餐</span> <span class=\"second\">系统</span></a>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"container\" style=\"margin-top:100px\" \">\r\n");
      out.write("      <form class=\"form-signin\" action=\"/ServletProject/login.do\" method=\"post\">\r\n");
      out.write("         <div class=\"page-header\" >\r\n");
      out.write("          <h2>无线点餐系统</h2>\r\n");
      out.write("        </div>\r\n");
      out.write("        <input type=\"text\" class=\"input-block-level\" placeholder=\"用户名\"  name=\"uname\">\r\n");
      out.write("        <input type=\"password\" class=\"input-block-level\" placeholder=\"密码\"  name=\"password\">\r\n");
      out.write("        <input type=\"text\" name=\"validateCode\" class=\"input-block\" placeholder=\"请输入验证码\" >\r\n");
      out.write("       <img src=\"vcode.do\"  class=\"img-rounded\" onclick=\"this.src='vcode.do?'+Math.random();\" />\r\n");
      out.write("        <button class=\"btn  btn-primary\" type=\"submit\">登陆</button>\r\n");
      out.write("         <button class=\"btn  \" type=\"reset\">重置</button>\r\n");
      out.write("      </form>\r\n");
      out.write("         <hr>\r\n");
      out.write("            <p class=\"pull-right\">&copy; 2017.10 <a href=\"#\" target=\"_blank\"> eat</a></p>\r\n");
      out.write("        </footer>\r\n");
      out.write("\t");
      out.write('\r');
      out.write('\n');
      out.write('	');
      out.write("\r\n");
      out.write("    </div> \r\n");
      out.write("  \r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
