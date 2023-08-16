/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.37
 * Generated at: 2023-06-14 23:46:52 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"ko\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<meta name=\"description\"\r\n");
      out.write("\tcontent=\"Disfruta de Netflix, películas y series en streaming en tu smart TV, consola, PC, Mac, móvil, tableta y más dispositivos.\" />\r\n");
      out.write("<title>MATFLIX</title>\r\n");
      out.write("<link rel=\"shortcut icon\" href=\"resources/img/mlogo.svg\"\">\r\n");
      out.write("<link href=\"resources/profile/css/bootstrap.min.css\" rel=\"stylesheet\" />\r\n");
      out.write("<link rel=\"canonical\"\r\n");
      out.write("\thref=\"https://getbootstrap.com/docs/4.5/examples/floating-labels/\">\r\n");
      out.write("<link href=\"../assets/dist/css/bootstrap.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"floating-labels.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"resources/profile/css/style.css\" rel=\"stylesheet\" />\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<main class=\"container-fluid\">\r\n");
      out.write("\t\t<!---->\r\n");
      out.write("\t\t<section id=\"backGround\">\r\n");
      out.write("\t\t\t<div class=\"container-fluid relative\">\r\n");
      out.write("\t\t\t\t<header>\r\n");
      out.write("\t\t\t\t\t<a href=\"/main.jsp\"> <img\r\n");
      out.write("\t\t\t\t\t\tsrc=\"resources/profile/img/matlogos.svg\"\r\n");
      out.write("\t\t\t\t\t\talt=\"Responsive image LOGO\" class=\"img-fluid\" /></a> <a\r\n");
      out.write("\t\t\t\t\t\thref=\"/customLogin\"><button type=\"button\" class=\"btn btn-danger\">로그인</button></a>\r\n");
      out.write("\t\t\t\t</header>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"jumbotron jumbotron-fluid relative mt-5\">\r\n");
      out.write("\t\t\t\t<h1>Company Profile</h1>\r\n");
      out.write("\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t<p class=\"lead\">Matflix is one of the world's leading\r\n");
      out.write("\t\t\t\t\trestaurant OTT services with over 232 million paid profiles in\r\n");
      out.write("\t\t\t\t\tover 190 countries enjoying all kind of foods\r\n");
      out.write("\t\t\t\t\tMembers can have a delicious food as much as they want, anywhere, and can\r\n");
      out.write("\t\t\t\t\tchange their plans at any time.</p>\r\n");
      out.write("\t\t\t\t<form method=\"POST\" action=\"/action_page.php\"\r\n");
      out.write("\t\t\t\t\tclass=\"form-signin needs-validation\" novalidate>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</section>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</main>\r\n");
      out.write("\t<!---footer---------->\r\n");
      out.write("\t<footer class=\"page-footer font-small blue text-muted\">\r\n");
      out.write("\t\t<div class=\"container text-left\">\r\n");
      out.write("\t\t\t<div class=\"row justify-content-space-between\">\r\n");
      out.write("\t\t\t\t<div class=\"col-12 mt-5 mb-2\">\r\n");
      out.write("\t\t\t\t\t<p class=\"h5 text-capitalize\">질문이 있으신가요? 문의 전화: 하이미디어컴퓨터학원\r\n");
      out.write("\t\t\t\t\t\t구로캠퍼스(02-3667-0008)</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<hr class=\"clearfix w-100 d-md-none pb-3\" />\r\n");
      out.write("\t\t\t\t<div class=\"col-6 col-sm-4 col-md-3\">\r\n");
      out.write("\t\t\t\t\t<ul class=\"list-unstyled articles mb-4\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"/map.jsp\">찾아 오시는 길</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">입사 정보</a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-6 col-sm-4 col-md-3\">\r\n");
      out.write("\t\t\t\t\t<ul class=\"list-unstyled articles mb-4\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">고객센터</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">이용 약관</a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-6 col-sm-4 col-md-3\">\r\n");
      out.write("\t\t\t\t\t<ul class=\"list-unstyled articles mb-4\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">계정</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">개인정보 처리방침</a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-6 col-sm-4 col-md-3\">\r\n");
      out.write("\t\t\t\t\t<ul class=\"list-unstyled articles mb-4\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">투자 정보(IR)</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">법적 고지</a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t</footer>\r\n");
      out.write("\t<script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\"\r\n");
      out.write("\t\tintegrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\"\r\n");
      out.write("\t\tcrossorigin=\"anonymous\"></script>\r\n");
      out.write("\t<script src=\"resources/profile/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("\t<script src=\"resources/profile/js/main.js\"></script>\r\n");
      out.write("</body>\r\n");
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
