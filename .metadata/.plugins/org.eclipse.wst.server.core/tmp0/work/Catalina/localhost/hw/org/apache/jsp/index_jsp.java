/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.0.M13
 * Generated at: 2017-03-13 05:41:10 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
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

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("<!-- ???????????????????????? -->\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\" />\r\n");
      out.write("\r\n");
      out.write("<!-- ? Bootstrap ?? CSS ?? -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"http://cdn.bootcss.com/bootstrap/3.3.4/css/bootstrap.min.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- ???Bootstrap???????????? -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- jQuery??????bootstrap.min.js ???? -->\r\n");
      out.write("<script src=\"http://cdn.bootcss.com/jquery/1.11.2/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- ??? Bootstrap ?? JavaScript ??<link rel=\"stylesheet\" href=\"//cdn.bootcss.com/bootstrap/4.0.0-alpha.6/css/bootstrap.css\"> -->\r\n");
      out.write("<script src=\"http://cdn.bootcss.com/bootstrap/3.3.4/js/bootstrap.min.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"http://cdn.bootcss.com/bootstrap/3.3.4/css/bootstrap.min.css\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- tostr -->\r\n");
      out.write("<link href=\"css/login.css\" rel=\"stylesheet\"/>\r\n");
      out.write("<link href=\"css/toastr.css\" rel=\"stylesheet\"/>\r\n");
      out.write("<title>登录</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body >\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t<div id=\"loginBox\" class=\"col-lg-4 col-lg-offset-4 col-sm-6 col-sm-offset-3 col-xs-8 col-xs-offset-2\" >\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<span id=\"loginSpan\">登录</span>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<form action=\"login\" method=\"post\" id=\"login\">\r\n");
      out.write("\t\t\t<div class=\"input-group input-group-lg\">  \r\n");
      out.write("                <span class=\"input-group-addon\"><i class=\"glyphicon glyphicon-user\"></i></span>  \r\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"loginName\" name=\"loginName\" placeholder=\"请输入用户名\">  \r\n");
      out.write("            </div><br>  \r\n");
      out.write("            \r\n");
      out.write("        \t<div class=\"input-group input-group-lg\">  \r\n");
      out.write("                <span class=\"input-group-addon\"><i class=\"glyphicon glyphicon-lock\"></i></span>  \r\n");
      out.write("                <input type=\"password\" class=\"form-control\" id=\"loginPsd\" name=\"loginPsd\" placeholder=\"请输入密码\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <a href=\"userRegister\" id=\"usup\"><u>用户注册</u></a>\r\n");
      out.write("\t\t\t<a href=\"hostelRegister\" id=\"hsup\"><u>客栈注册</u></a>\r\n");
      out.write("\t\t\t<button type=\"button\" id=\"login1\" class=\"btn btn-primary btn-lg btn-block\" onclick=\"checkLogin()\">登录</button>\r\n");
      out.write("\t\t\t<input type=\"submit\" id=\"sub\" value=\"submit\" style=\"display:none\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("<script src=\"//cdn.bootcss.com/jquery-cookie/1.4.1/jquery.cookie.min.js\"></script>\r\n");
      out.write("<script src=\"js/toastr.js\"></script>\r\n");
      out.write("<script src=\"js/login.js\"></script>\r\n");
      out.write("</html>");
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
