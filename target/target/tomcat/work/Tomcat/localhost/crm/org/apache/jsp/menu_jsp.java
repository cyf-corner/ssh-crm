/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-11-02 14:25:22 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3c.org/TR/1999/REC-html401-19991224/loose.dtd\">\r\n");
      out.write("<HTML>\r\n");
      out.write("<HEAD>\r\n");
      out.write("<TITLE>导航</TITLE>\r\n");
      out.write("<META http-equiv=Content-Type content=\"text/html; charset=utf-8\">\r\n");
      out.write("<STYLE type=text/css>\r\n");
      out.write("BODY {\r\n");
      out.write("\tPADDING-RIGHT: 0px;\r\n");
      out.write("\tPADDING-LEFT: 0px;\r\n");
      out.write("\tPADDING-BOTTOM: 0px;\r\n");
      out.write("\tMARGIN: 0px;\r\n");
      out.write("\tPADDING-TOP: 0px;\r\n");
      out.write("\tBACKGROUND-COLOR: #2a8dc8\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("BODY {\r\n");
      out.write("\tFONT-SIZE: 11px;\r\n");
      out.write("\tCOLOR: #003366;\r\n");
      out.write("\tFONT-FAMILY: Verdana\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("TD {\r\n");
      out.write("\tFONT-SIZE: 11px;\r\n");
      out.write("\tCOLOR: #003366;\r\n");
      out.write("\tFONT-FAMILY: Verdana\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("DIV {\r\n");
      out.write("\tFONT-SIZE: 11px;\r\n");
      out.write("\tCOLOR: #003366;\r\n");
      out.write("\tFONT-FAMILY: Verdana\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("P {\r\n");
      out.write("\tFONT-SIZE: 11px;\r\n");
      out.write("\tCOLOR: #003366;\r\n");
      out.write("\tFONT-FAMILY: Verdana\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".mainMenu {\r\n");
      out.write("\tFONT-WEIGHT: bold;\r\n");
      out.write("\tFONT-SIZE: 14px;\r\n");
      out.write("\tcursor: pointer;\r\n");
      out.write("\tCOLOR: #000000\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("A.style2:link {\r\n");
      out.write("\tPADDING-LEFT: 4px;\r\n");
      out.write("\tCOLOR: #0055bb;\r\n");
      out.write("\tTEXT-DECORATION: none\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("A.style2:visited {\r\n");
      out.write("\tPADDING-LEFT: 4px;\r\n");
      out.write("\tCOLOR: #0055bb;\r\n");
      out.write("\tTEXT-DECORATION: none\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("A.style2:hover {\r\n");
      out.write("\tPADDING-LEFT: 4px;\r\n");
      out.write("\tCOLOR: #ff0000;\r\n");
      out.write("\tTEXT-DECORATION: none\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("A.active {\r\n");
      out.write("\tPADDING-LEFT: 4px;\r\n");
      out.write("\tCOLOR: #ff0000;\r\n");
      out.write("\tTEXT-DECORATION: none\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".span {\r\n");
      out.write("\tCOLOR: #ff0000;\r\n");
      out.write("}\r\n");
      out.write("</STYLE>\r\n");
      out.write("\r\n");
      out.write("<SCRIPT language=javascript>\r\n");
      out.write("\tfunction MenuDisplay(obj_id) {\r\n");
      out.write("\t\tfor (var i = 1; i <= 9; i++) {\r\n");
      out.write("\t\t\tvar obj = document.getElementById('table_' + i);\r\n");
      out.write("\t\t\tif(obj){\r\n");
      out.write("\t\t\t\tdocument.getElementById('table_' + i).style.display = 'none';\r\n");
      out.write("\t\t\t\tdocument.getElementById('table_' + i + 'Span').innerText = '＋';\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tvar obj = document.getElementById(obj_id);\r\n");
      out.write("\t\tif(obj){\r\n");
      out.write("\t\t\tif (obj.style.display == 'none') {\r\n");
      out.write("\t\t\t\tobj.style.display = 'block';\r\n");
      out.write("\t\t\t\tdocument.getElementById(obj_id + 'Span').innerText = '－';\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\tobj.style.display = 'none';\r\n");
      out.write("\t\t\t\tdocument.getElementById(obj_id + 'Span').innerText = '＋';\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("</SCRIPT>\r\n");
      out.write("\r\n");
      out.write("<META content=\"MSHTML 6.00.2900.3492\" name=GENERATOR>\r\n");
      out.write("</HEAD>\r\n");
      out.write("<BODY>\r\n");
      out.write("\t<FORM id=form1 name=form1 action=YHMenu.aspx method=post>\r\n");
      out.write("\t\t<TABLE cellSpacing=0 cellPadding=0 width=210 align=center border=0>\r\n");
      out.write("\t\t\t<TBODY>\r\n");
      out.write("\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t<TD width=15><IMG src=\"images/new_005.jpg\" border=0></TD>\r\n");
      out.write("\t\t\t\t\t<TD align=\"center\" width=180 background=images/new_006.jpg\r\n");
      out.write("\t\t\t\t\t\theight=35><B>人力资源 －功能菜单</B></TD>\r\n");
      out.write("\t\t\t\t\t<TD width=15><IMG src=\"images/new_007.jpg\" border=0></TD>\r\n");
      out.write("\t\t\t\t</TR>\r\n");
      out.write("\t\t\t</TBODY>\r\n");
      out.write("\t\t</TABLE>\r\n");
      out.write("\t\t<TABLE cellSpacing=0 cellPadding=0 width=210 align=center border=0>\r\n");
      out.write("\t\t\t<TBODY>\r\n");
      out.write("\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t<TD width=15 background=images/new_008.jpg></TD>\r\n");
      out.write("\t\t\t\t\t<TD vAlign=top width=180 bgColor=#ffffff>\r\n");
      out.write("\t\t\t\t\t\t<TABLE cellSpacing=0 cellPadding=3 width=165 align=center border=0>\r\n");
      out.write("\t\t\t\t\t\t\t<TBODY>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<TD class=mainMenu onClick=\"MenuDisplay('table_1');\"><SPAN\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=span id=table_1Span>＋</SPAN> 客户管理</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<TABLE id=table_1 style=\"DISPLAY: none\" cellSpacing=0\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tcellPadding=2 width=155 align=center border=0>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<TBODY>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<TD class=menuSmall><A class=style2 href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/jsp/customer/add.jsp\" \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\ttarget=main>－ 新增客户</A></TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<TR> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<TD class=menuSmall><A class=style2 href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/CustomerAction_list\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\ttarget=main>－ 客户列表</A></TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</TBODY>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</TABLE>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<TD background=images/new_027.jpg height=1></TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<TD class=mainMenu onClick=\"MenuDisplay('table_2');\"><SPAN\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=span id=table_2Span>＋</SPAN> 联系人管理</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<TABLE id=table_2 style=\"DISPLAY: none\" cellSpacing=0\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tcellPadding=2 width=155 align=center border=0>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<TBODY>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<TD class=menuSmall><A class=style2 href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/jsp/linkman/add.jsp\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\ttarget=main>－ 新增联系人</A></TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<TD class=menuSmall><A class=style2 href=\"LinkManAction_list\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\ttarget=main>－联系人列表</A></TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</TBODY>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</TABLE>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<TD background=images/new_027.jpg height=1></TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<TD class=mainMenu onClick=\"MenuDisplay('table_5');\"><SPAN\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=span id=table_5Span>＋</SPAN> 客户拜访管理</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<TABLE id=table_5 style=\"DISPLAY: none\" cellSpacing=0\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tcellPadding=2 width=155 align=center border=0>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<TBODY>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<TD class=menuSmall><A class=style2 href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/jsp/salevisit/add.jsp\" target=main>－新增客户拜访</A></TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<TD class=menuSmall><A class=style2 href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/SaleVisitAction_list\" target=main>－客户拜访列表</A></TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</TBODY>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</TABLE>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<TD background=images/new_027.jpg height=1></TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<TD class=mainMenu onClick=\"MenuDisplay('table_4');\"><SPAN\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=span id=table_4Span>＋</SPAN> 统计分析</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<TABLE id=table_4 style=\"DISPLAY: none\" cellSpacing=0\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tcellPadding=2 width=155 align=center border=0>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<TBODY>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<TD class=menuSmall><A class=style2 href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/CustomerAction_industryCount\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\ttarget=main>－客户行业统计</A></TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<TD class=menuSmall><A class=style2 href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/CustomerAction_sourceCount\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\ttarget=main>－客户来源统计</A></TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</TBODY>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</TABLE>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<TD background=images/new_027.jpg height=1></TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<TD class=mainMenu onClick=\"MenuDisplay('table_6');\"><SPAN\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=span id=table_6Span>＋</SPAN>系统管理</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<TABLE id=table_6 style=\"DISPLAY: none\" cellSpacing=0\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tcellPadding=2 width=155 align=center border=0>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<TBODY>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<TD class=menuSmall><A class=style2 href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/UserAction_list\" target=main>－用户管理</A></TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</TBODY>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</TABLE>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t</TBODY>\r\n");
      out.write("\t\t\t\t\t\t</TABLE>\r\n");
      out.write("\t\t\t\t\t</TD>\r\n");
      out.write("\t\t\t\t\t<TD width=15 background=images/new_009.jpg></TD>\r\n");
      out.write("\t\t\t\t</TR>\r\n");
      out.write("\t\t\t</TBODY>\r\n");
      out.write("\t\t</TABLE>\r\n");
      out.write("\t\t<TABLE cellSpacing=0 cellPadding=0 width=210 align=center border=0>\r\n");
      out.write("\t\t\t<TBODY>\r\n");
      out.write("\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t<TD width=15><IMG src=\"images/new_010.jpg\" border=0></TD>\r\n");
      out.write("\t\t\t\t\t<TD align=\"center\" width=180 background=images/new_011.jpg\r\n");
      out.write("\t\t\t\t\t\theight=15></TD>\r\n");
      out.write("\t\t\t\t\t<TD width=15><IMG src=\"images/new_012.jpg\" border=0></TD>\r\n");
      out.write("\t\t\t\t</TR>\r\n");
      out.write("\t\t\t</TBODY>\r\n");
      out.write("\t\t</TABLE>\r\n");
      out.write("\t</FORM>\r\n");
      out.write("</BODY>\r\n");
      out.write("</HTML>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
