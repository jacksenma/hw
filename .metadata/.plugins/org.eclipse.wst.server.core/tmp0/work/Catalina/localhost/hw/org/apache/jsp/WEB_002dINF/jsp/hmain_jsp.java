/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.0.M13
 * Generated at: 2017-03-11 13:11:17 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class hmain_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("jar:file:/C:/Users/user/Desktop/hwhw/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/hw/WEB-INF/lib/standard-1.1.2.jar!/META-INF/c.tld", Long.valueOf(1098682290000L));
    _jspx_dependants.put("/WEB-INF/jsp/hnavigation.jsp", Long.valueOf(1489221126501L));
    _jspx_dependants.put("/WEB-INF/lib/standard-1.1.2.jar", Long.valueOf(1486176875158L));
  }

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
      out.write("<link rel=\"stylesheet\" href=\"http://cdn.bootcss.com/bootstrap/3.3.4/css/bootstrap-theme.min.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- jQuery??????bootstrap.min.js ???? -->\r\n");
      out.write("<script src=\"http://cdn.bootcss.com/jquery/1.11.2/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- ??? Bootstrap ?? JavaScript ?? -->\r\n");
      out.write("<script src=\"http://cdn.bootcss.com/bootstrap/3.3.4/js/bootstrap.min.js\"></script>\r\n");
      out.write("<!-- tostr -->\r\n");
      out.write("<link href=\"./css/toastr.css\" rel=\"stylesheet\"/>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"./css/daterangepicker.min.css\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<title>发布计划</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
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
      out.write("<link rel=\"stylesheet\" href=\"http://cdn.bootcss.com/bootstrap/3.3.4/css/bootstrap-theme.min.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- jQuery??????bootstrap.min.js ???? -->\r\n");
      out.write("<script src=\"http://cdn.bootcss.com/jquery/1.11.2/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- ??? Bootstrap ?? JavaScript ?? -->\r\n");
      out.write("<script src=\"http://cdn.bootcss.com/bootstrap/3.3.4/js/bootstrap.min.js\"></script>\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("\t<script src=\"http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js\"></script>\r\n");
      out.write("\t<script src=\"http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"./css/unavigation.css\">\r\n");
      out.write("<title>客栈</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<!-- 顶部导航栏 -->\r\n");
      out.write("    <nav class=\"navbar navbar-inverse navbar-fixed-top\" >\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"navbar-header\">\r\n");
      out.write("\r\n");
      out.write("            <a class=\"navbar-brand\" href=\"#\">Hostel World</a>\r\n");
      out.write("\r\n");
      out.write("            <!-- 分辨率低时显示的弹出顶部导航栏的按钮 <a class=\"navbar-brand\" href=\"#home\" data-toggle=\"tab\">Hostel World</a>-->\r\n");
      out.write("            <button type=\"button\" class=\"navbar-toggle collapsed\"\r\n");
      out.write("                data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\"\r\n");
      out.write("                aria-controls=\"navbar\">\r\n");
      out.write("                <span class=\"sr-only\">Toggle navigation</span> <span\r\n");
      out.write("                    class=\"icon-bar\"></span> <span class=\"icon-bar\"></span> <span\r\n");
      out.write("                    class=\"icon-bar\"></span>\r\n");
      out.write("            </button>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <div id=\"navbar\" class=\"navbar-collapse collapse\">\r\n");
      out.write("        \r\n");
      out.write("        \t<ul class=\"nav navbar-nav\">\r\n");
      out.write("        \t\t<li class=\"dropdown\" id=\"enterAndLeave\">\r\n");
      out.write("                \t<a href=\"#\" id=\"showdrop\" class=\"dropdown-toggle op\" data-toggle=\"dropdown\">\r\n");
      out.write("                   \t住客登记<b class=\"caret\"></b>\r\n");
      out.write("                \t</a>\r\n");
      out.write("                \t<ul class=\"dropdown-menu\">\r\n");
      out.write("                    \t <li class=\"op\" id=\"enter\"><a href=\"fhenter\">入住登记</a></li>\r\n");
      out.write("                    \t <li class=\"op\" id=\"leave\"><a href=\"fhleave\">退房登记</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("           \t \t</li>\r\n");
      out.write("                <li class=\"op \" id=\"plan\"><a href=\"fhplan\" >发布计划</a></li>\r\n");
      out.write("               \r\n");
      out.write("                \r\n");
      out.write("                <li class=\"op\" id=\"statistics\"><a href=\"fhstatistics\">统计信息</a></li>\r\n");
      out.write("                <li class=\"op\" id=\"change\"><a href=\"fhchange\" >修改信息</a></li>\r\n");
      out.write("        \t</ul>\r\n");
      out.write("            <ul class=\"nav navbar-nav navbar-right\"> \r\n");
      out.write("            \t<li class=\"op1\"><a href=\"index.jsp\"><span class=\"glyphicon glyphicon-log-out\"></span> 退出</a></li> \r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("</body>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(document).ready(function() { \r\n");
      out.write(" $('#enterAndLeave').hover(function() {\r\n");
      out.write("  $('ul', this).slideDown(200);\r\n");
      out.write("  $(this).children('a:first').addClass(\"hov\");\r\n");
      out.write(" }, function() {\r\n");
      out.write("  $('ul', this).slideUp(100);\r\n");
      out.write("  $(this).children('a:first').removeClass(\"hov\");  \r\n");
      out.write(" });\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("</html> ");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(\"#enterAndLeave\").css({\"color\":\"rgb(255, 255, 255)\",\"background-color\":\"rgb(255,233,87)\"});\r\n");
      out.write("</script>\r\n");
      out.write("<div class=\"container\" style=\"margin-top:50px\">\r\n");
      out.write("\t<div class=\"col-lg-4 col-lg-offset-4 col-sm-6 col-sm-offset-3 col-xs-8 col-xs-offset-2\" >\r\n");
      out.write("\t\r\n");
      out.write("\t<ul id=\"myTab\" class=\"nav nav-tabs\">\r\n");
      out.write("    <li class=\"active\">\r\n");
      out.write("        <a href=\"#yesVip\" data-toggle=\"tab\">\r\n");
      out.write("                            会员入住\r\n");
      out.write("        </a>\r\n");
      out.write("    </li>\r\n");
      out.write("    <li>\r\n");
      out.write("    \t<a href=\"#notVip\" data-toggle=\"tab\">\r\n");
      out.write("    \t非会员入住\r\n");
      out.write("    \t</a>\r\n");
      out.write("    </li>\r\n");
      out.write("    \r\n");
      out.write("</ul>\r\n");
      out.write("<div id=\"myTabContent\" class=\"tab-content\">\r\n");
      out.write("    <div class=\"tab-pane fade in active\" id=\"yesVip\">\r\n");
      out.write("       <form class=\"form\" action=\"henter\" method=\"post\" id=\"henter\">\r\n");
      out.write("\t\t    <span>会员编号:</span>\r\n");
      out.write("\t\t    <input type=\"text\" id=\"vipId\" name=\"vipId\" class=\"form-control\" placeholder=\"填写会员编号\">\r\n");
      out.write("            <span>会员密码:</span>\r\n");
      out.write("            <input type=\"password\" id=\"vipPassword\" name=\"vipPassword\" class=\"form-control\" onchange='getOrder(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${hostelInfo.id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\")' placeholder=\"填写会员密码\">\r\n");
      out.write("            <span>住客姓名:</span>\r\n");
      out.write("            <input type=\"text\" id=\"uname\" name=\"uname\" class=\"form-control\" placeholder=\"填写住客姓名\">\r\n");
      out.write("            <br/>\r\n");
      out.write("\t\t\t<span>房间类型:</span>\r\n");
      out.write("\t\t\t\t<select class=\"form-control\" id=\"bed\" name=\"bed\" >\r\n");
      out.write("      \t\t\t<option id=\"b1\">标准单人房</option>\r\n");
      out.write("      \t\t\t<option id=\"b2\">标准双人房</option>\r\n");
      out.write("      \t\t\t<option id=\"b3\">豪华单人房</option>\r\n");
      out.write("      \t\t\t<option id=\"b4\">豪华双人房</option>\r\n");
      out.write("      \t\t\t</select><br/>\r\n");
      out.write("\t\t\t<span>房间数量:</span><input type=\"text\" class=\"form-control\" id=\"num\" name=\"num\" placeholder=\"请输入房间数量\" ><br/>\r\n");
      out.write("            <input type=\"text\" id=\"hid\" name=\"hid\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${hostelInfo.id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" style=\"display:none\">\r\n");
      out.write("            <button type=\"button\" id=\"ed\" class=\"btn btn-primary btn-lg btn-block\" onclick=\"checkForm()\">保存</button>\r\n");
      out.write("            <input type=\"submit\" id=\"sub\" value=\"submit\" style=\"display:none\">\r\n");
      out.write("            <input type=\"reset\" id=\"rs\" value=\"reset\" style=\"display:none\">\r\n");
      out.write("         </form>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"tab-pane fade\" id=\"notVip\">\r\n");
      out.write("        <form class=\"form\" action=\"henterNotVip\" method=\"post\" id=\"henterNotVip\">\r\n");
      out.write("            <span>住客姓名:</span>\r\n");
      out.write("            <input type=\"text\" id=\"nuname\" name=\"nuname\" class=\"form-control\" placeholder=\"填写住客姓名\">\r\n");
      out.write("            <br/>\r\n");
      out.write("            <span>身份证号码:</span>\r\n");
      out.write("            <input type=\"text\" id=\"nidCard\" name=\"nidCard\" class=\"form-control\" placeholder=\"填写住客身份证号码\">\r\n");
      out.write("            <br/>\r\n");
      out.write("\t\t\t<span>房间类型:</span>\r\n");
      out.write("\t\t\t\t<select class=\"form-control\" id=\"nbed\" name=\"nbed\" >\r\n");
      out.write("      \t\t\t<option >标准单人房</option>\r\n");
      out.write("      \t\t\t<option >标准双人房</option>\r\n");
      out.write("      \t\t\t<option >豪华单人房</option>\r\n");
      out.write("      \t\t\t<option >豪华双人房</option>\r\n");
      out.write("      \t\t\t</select><br/>\r\n");
      out.write("\t\t\t<span>房间数量:</span><input type=\"text\" class=\"form-control\" id=\"nnum\" name=\"nnum\" placeholder=\"请输入房间数量\" ><br/>\r\n");
      out.write("            <input type=\"text\" id=\"nhid\" name=\"nhid\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${hostelInfo.id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" style=\"display:none\">\r\n");
      out.write("            <button type=\"button\" id=\"ned\" class=\"btn btn-primary btn-lg btn-block\" onclick=\"checkFormNotVip()\">保存</button>\r\n");
      out.write("            <input type=\"submit\" id=\"nsub\" value=\"submit\" style=\"display:none\">\r\n");
      out.write("            <input type=\"reset\" id=\"nrs\" value=\"reset\" style=\"display:none\">\r\n");
      out.write("         </form>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>    \r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("<script src=\"./js/toastr.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"./js/moment.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"./js/jquery.daterangepicker.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"./js/hmain.js\"></script>\r\n");
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
