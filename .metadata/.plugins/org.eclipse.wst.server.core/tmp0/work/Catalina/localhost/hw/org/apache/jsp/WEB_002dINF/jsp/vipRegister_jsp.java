/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.0.M13
 * Generated at: 2017-03-11 12:00:40 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class vipRegister_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("jar:file:/C:/Users/user/Desktop/hwhw/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/hw/WEB-INF/lib/spring-webmvc-4.0.0.RELEASE.jar!/META-INF/spring-form.tld", Long.valueOf(1386774016000L));
    _jspx_dependants.put("jar:file:/C:/Users/user/Desktop/hwhw/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/hw/WEB-INF/lib/standard-1.1.2.jar!/META-INF/c.tld", Long.valueOf(1098682290000L));
    _jspx_dependants.put("/WEB-INF/lib/spring-webmvc-4.0.0.RELEASE.jar", Long.valueOf(1486176865282L));
    _jspx_dependants.put("/WEB-INF/jsp/unavigation.jsp", Long.valueOf(1489220690776L));
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

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
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
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
      out.write("    \r\n");
      out.write("    \r\n");
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
      out.write("<!-- ??? Bootstrap ?? JavaScript ?? -->\r\n");
      out.write("<script src=\"http://cdn.bootcss.com/bootstrap/3.3.4/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- tostr -->\r\n");
      out.write("\r\n");
      out.write("<link href=\"./css/toastr.css\" rel=\"stylesheet\"/>\r\n");
      out.write("<link href=\"./css/vipRegister.css\" rel=\"stylesheet\"/>\r\n");
      out.write("<title>会员注册</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"background-color:#F5F6EB;font-family:微软雅黑;\">\r\n");
      out.write("\r\n");
      out.write("     \r\n");
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
      out.write("<!-- ??? Bootstrap ?? JavaScript ?? -->\r\n");
      out.write("<script src=\"http://cdn.bootcss.com/bootstrap/3.3.4/js/bootstrap.min.js\"></script>\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("\t<script src=\"http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js\"></script>\r\n");
      out.write("\t<script src=\"http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<link href=\"./css/unavigation.css\" rel=\"stylesheet\"/>\r\n");
      out.write("<title>取消预订</title>\r\n");
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
      out.write("        \t\t<li class=\"op\" id=\"order\"><a href=\"fuorder\">预定客栈</a></li>\r\n");
      out.write("        \t\t ");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        \t</ul>\r\n");
      out.write("        \t\r\n");
      out.write("            <ul class=\"nav navbar-nav navbar-right\"> \r\n");
      out.write("            \t<li class=\"op1\"><a href=\"index.jsp\"><span class=\"glyphicon glyphicon-log-out\"></span> 退出</a></li> \r\n");
      out.write("            </ul>\r\n");
      out.write("            <ul class=\"nav navbar-nav navbar-right\"> \r\n");
      out.write("            \t <li class=\"op dropdown\" id=\"me\">\r\n");
      out.write("                \t<a href=\"#\" class=\"dropdown-toggle\"  data-toggle=\"dropdown\">\r\n");
      out.write("                \t");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                \t");
      if (_jspx_meth_c_005fif_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                   \t <b class=\"caret\"></b>\r\n");
      out.write("                \t</a>\r\n");
      out.write("                \t<ul class=\"dropdown-menu\">\r\n");
      out.write("                \t<li><a href=\"#\">修改密码</a></li>\r\n");
      out.write("                    \t");
      if (_jspx_meth_c_005fif_005f3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    \t");
      if (_jspx_meth_c_005fif_005f4(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    \t\r\n");
      out.write("                \t</ul>\r\n");
      out.write("           \t \t</li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("    <div class=\"modal fade\" id=\"vipCancel\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("    <div class=\"modal-dialog\">\r\n");
      out.write("        <div class=\"modal-content\">\r\n");
      out.write("            <div class=\"modal-header\">\r\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\r\n");
      out.write("                <h4 class=\"modal-title\" id=\"myModalLabel\">取消会员资格</h4>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-body\">\r\n");
      out.write("            \t<h3>此操作将取消你的会员资格，您将无法再享受相应的会员特权，是否确定?</h3>\r\n");
      out.write("            \t</div>\r\n");
      out.write("            <div class=\"modal-footer\">\r\n");
      out.write("            <form action=\"vipCancel\">\r\n");
      out.write("            \t\t<input type=\"text\" id=\"vid\" name=\"vid\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vipInfo.id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" style=\"display:none\">\r\n");
      out.write("            \t\t<input type=\"text\" id=\"uid\" name=\"uid\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vipInfo.uid }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" style=\"display:none\">\r\n");
      out.write("            \t\t<!-- <button type=\"button\" onclick='vCancel' class=\"btn btn-primary\">确定</button>\r\n");
      out.write("            \t\t<input type=\"submit\" style=\"display:none\" id=\"subCancel\"> -->\r\n");
      out.write("            \t\t<input type=\"submit\" class=\"btn btn-primary\" value=\"确定\">\r\n");
      out.write("            \t\t<button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">取消</button>\r\n");
      out.write("            \t</form>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div><!-- /.modal-content -->\r\n");
      out.write("    </div><!-- /.modal -->\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(document).ready(function() { \r\n");
      out.write(" $('#me').hover(function() {\r\n");
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
      out.write("\t$(\"#me\").css({\"color\":\"rgb(255, 255, 255)\",\"background-color\":\"rgb(255,233,87)\"});\r\n");
      out.write("</script>\r\n");
      out.write("<div  style=\"margin-top:50px\">\r\n");
      out.write("<div style=\"margin: 0 auto;background: url(img/vip.jpg);background-size:100%;background-position:0 -200px;height:200px\">\r\n");
      out.write("\t<div style=\"text-align: center;margin: 0 auto;\"><font color=\"#ffffff\"><span style=\"font-size: 30px;\">————————</span></font></div>\r\n");
      out.write("\t<div style=\"text-align: center;margin: 0 auto;\"><b style=\"color: rgb(255, 255, 255); font-size: 30px; background-color: transparent;\">&nbsp;注册会员</b></div>\r\n");
      out.write("\t<div style=\"text-align: center;margin: 0 auto;\"><span style=\"color: rgb(255, 255, 255); font-size: 30px; background-color: transparent;\">————————</span></div>\r\n");
      out.write("\t<div style=\"text-align: center;margin: 0 auto;\"><b style=\"color: rgb(255, 255, 255); font-size: 18px; background-color: transparent;\">&nbsp;\r\n");
      out.write("\t<span style=\"color: #EB3F2F\">会员须知<br>会员享有预订客栈、消费记录及积分奖励等服务。有效期一年,到期后或卡上<br>费用不足将暂停记录,一旦支付,则恢复。暂停1年后未支付,会员卡永久失效。</span></b></div>\r\n");
      out.write("</div>\r\n");
      out.write("\t<div id=\"registerDIV\" class=\"col-lg-4 col-lg-offset-4 col-sm-6 col-sm-offset-3 col-xs-8 col-xs-offset-2\" >\r\n");
      out.write("\t\t<form class=\"form\" action=\"vregisterTrue\" method=\"post\" enctype=\"multipart/form-data\" id=\"vipregister\">\r\n");
      out.write("            <div class=\"input-group \">  \r\n");
      out.write("            <!-- <img alt=\"\" src=\"./img/idCard.svg\" style=\"width:15px;height:15px\"> -->\r\n");
      out.write("                <span class=\"input-group-addon\"><i class=\"glyphicon glyphicon-phone\"></i></span>  \r\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"phone\" name=\"phone\" placeholder=\"请输入手机号\">\r\n");
      out.write("            </div><br>\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"input-group \">  \r\n");
      out.write("            <!-- <img alt=\"\" src=\"./img/idCard.svg\" style=\"width:15px;height:15px\"> -->\r\n");
      out.write("                <span class=\"input-group-addon\"><i class=\"glyphicon glyphicon-credit-card\"></i></span>  \r\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"bankCard\" name=\"bankCard\" placeholder=\"请输入银行卡号\">\r\n");
      out.write("            </div><br>\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"input-group \">  \r\n");
      out.write("            <!-- <img alt=\"\" src=\"./img/idCard.svg\" style=\"width:15px;height:15px\"> -->\r\n");
      out.write("                <span class=\"input-group-addon\"><img alt=\"\" src=\"./img/idCard.svg\" style=\"width:15px;height:15px\"></span>  \r\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"idCard\" name=\"idCard\" placeholder=\"请输入身份证号\">\r\n");
      out.write("            </div><br>\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("            <button type=\"button\" id=\"register\" class=\"btn btn-primary btn-lg btn-block\" onclick=\"checkForm()\">立即注册</button>\r\n");
      out.write("            <input type=\"text\" id=\"uid\" name=\"uid\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userInfo.id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" style=\"display:none\">\r\n");
      out.write("            <input type=\"submit\" id=\"sub\" value=\"submit\" style=\"display:none\">\r\n");
      out.write("            \r\n");
      out.write("</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("<script src=\"./js/toastr.js\"></script>\r\n");
      out.write("<script src=\"./js/vipRegister.js\"></script>\r\n");
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /WEB-INF/jsp/unavigation.jsp(51,11) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vipInfo!=null }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("        \t\t\t<li class=\"op\" id=\"orderCancel\"><a href=\"fuorderCancel\">我的订单</a></li>\r\n");
          out.write("                \t<li class=\"op\" id=\"statistics\"><a href=\"fustatistics\">统计信息</a></li>\r\n");
          out.write("        \t\t");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    try {
      _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f1.setParent(null);
      // /WEB-INF/jsp/unavigation.jsp(63,17) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userInfo.role==0 }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
      if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("个人信息");
          int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    try {
      _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f2.setParent(null);
      // /WEB-INF/jsp/unavigation.jsp(64,17) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userInfo.role==1 }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
      if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("会员中心");
          int evalDoAfterBody = _jspx_th_c_005fif_005f2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f3(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    try {
      _jspx_th_c_005fif_005f3.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f3.setParent(null);
      // /WEB-INF/jsp/unavigation.jsp(69,21) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userInfo.role==0 }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f3 = _jspx_th_c_005fif_005f3.doStartTag();
      if (_jspx_eval_c_005fif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("<li><a href=\"fvipRegister\">注册会员</a></li>");
          int evalDoAfterBody = _jspx_th_c_005fif_005f3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f3);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f4(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    try {
      _jspx_th_c_005fif_005f4.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f4.setParent(null);
      // /WEB-INF/jsp/unavigation.jsp(70,21) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userInfo.role==1 }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f4 = _jspx_th_c_005fif_005f4.doStartTag();
      if (_jspx_eval_c_005fif_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                    \t<li><a href=\"fvipRecharge\">会员充值</a></li>\r\n");
          out.write("                    \t<li><a href=\"fvipChange\">修改信息</a></li>\r\n");
          out.write("                    \t<li><a href=\"#\" data-toggle=\"modal\" data-target=\"#vipCancel\">取消资格</a></li>\r\n");
          out.write("                    \t\r\n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_c_005fif_005f4.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f4);
    }
    return false;
  }
}
