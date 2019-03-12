package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class search_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fn:contains", org.apache.taglibs.standard.functions.Functions.class, "contains", new Class[] {java.lang.String.class, java.lang.String.class});
}

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_if_test.release();
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
      response.setContentType("text/html;charset=utf-8");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<link href=\"");
      out.print(basePath );
      out.write("js/bootstrap-3.0.0/css/bootstrap.min.css\" rel=\"stylesheet\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("js/jquery-1.8.0.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script src=\"");
      out.print(basePath );
      out.write("js/bootstrap-3.0.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("js/jquery.bigautocomplete.js\"></script>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(basePath);
      out.write("css/jquery.bigautocomplete.css\">\r\n");
      out.write("\t\t\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("#key{\r\n");
      out.write("border: #e5e5e5 1px solid ;\r\n");
      out.write("\r\n");
      out.write("border-radius: 5px;\r\n");
      out.write("\r\n");
      out.write("outline: none;\r\n");
      out.write("\r\n");
      out.write("font-size: 16px;\r\n");
      out.write("font-style: \"微软雅黑\";\r\n");
      out.write("\r\n");
      out.write("font-weight: 600;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#key:hover{\r\n");
      out.write("border: #eeeeee 1px solid ;\r\n");
      out.write("\r\n");
      out.write("border-radius: 5px;\r\n");
      out.write("/*动画效果*/\r\n");
      out.write("\t\t\t\t-webkit-animation-name: shineBlue;/*引用动画*/\r\n");
      out.write("\t\t\t\t-webkit-animation-duration: 3s;/*持续的时间*/\r\n");
      out.write("\t\t\t\t-webkit-animation-iteration-count: infinite;/*动画持续的次数*/\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#btn{\r\n");
      out.write("height:38px;\r\n");
      out.write("\r\n");
      out.write("width:60px;\r\n");
      out.write("\r\n");
      out.write("font-size: 16px;\r\n");
      out.write("\r\n");
      out.write("background-color:#418BCA;\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("border-radius: 5px;\r\n");
      out.write("\r\n");
      out.write("cursor: pointer;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t@-webkit-keyframes shineBlue {\r\n");
      out.write("\t\t\t\t/*定义一个动画*/\r\n");
      out.write("\t\t\t\tfrom {\r\n");
      out.write("\t\t\t\t\t-webkit-box-shadow: 0 0 9px #333;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t50% {\r\n");
      out.write("\t\t\t\t\t-webkit-box-shadow: 0 0 18px #29A7E1;\r\n");
      out.write("\t\t\t\t\tborder: #3A5FCD 1px solid;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tto {\r\n");
      out.write("\t\t\t\t\t-webkit-box-shadow: 0 0 9px #333;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t\r\n");
      out.write("\t$(function(){\r\n");
      out.write("\r\n");
      out.write("\t    $(\"#key\").bigAutocomplete({\r\n");
      out.write("\t    \t\r\n");
      out.write("\t    \t\r\n");
      out.write("\t   \r\n");
      out.write("\t    \turl:\"");
      out.print(basePath );
      out.write("keyword/getListKeyword\",\r\n");
      out.write("\t\t\twidth:500,\r\n");
      out.write("\t\t\tcallback:function(data){\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tvar key=data.title;\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\tvar arr=\tkey.split(\" \");\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tconsole.log(arr[0])\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t$(\"#key\").val(arr[0]);\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tsearch();\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t    });\r\n");
      out.write("\r\n");
      out.write("\t})\r\n");
      out.write("\t\r\n");
      out.write("\tfunction detailSearch(field,name){\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar kk=\"\";\r\n");
      out.write("\t\t\r\n");
      out.write("\t\r\n");
      out.write("\t\tvar url =location.href;\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar newr=\"\";\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar pp=\"\";\r\n");
      out.write("\t\tif(url.indexOf(field+\"=\")!=-1){\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tvar myarr=url.split(\"?\")[1].split(\"&\");\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tfor(var i=0;i<myarr.length;i++){\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tif(myarr[i].indexOf(field)!=-1){\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tmyarr[i]=field+\"=\"+name;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tif(myarr.length==i+1){\r\n");
      out.write("\t\t\t\tpp=pp+myarr[i];\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\telse{\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\tpp=pp+myarr[i]+\"&\"\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tnewr=url.split(\"?\")[0]+\"?\"+pp;\r\n");
      out.write("\t\t\tlocation.href=newr;\r\n");
      out.write("\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\telse {\r\n");
      out.write("\t\t\turl=url+\"&\"+field+\"=\"+name;\r\n");
      out.write("\t\t\tlocation.href=url;\r\n");
      out.write("\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t/*\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar arr2 =new Array();\r\n");
      out.write("\t\t\r\n");
      out.write("\t \tvar arr=url.split(\"?\")[1].split(\"&\");\t\r\n");
      out.write("\t\tarr.push(field+\"=\"+name);\r\n");
      out.write("\r\n");
      out.write("\t \t//[key=11,brand=xx]\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfor(var i=0;i<arr.length;i++){\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif(arr[i].indexOf(field)!=-1){\r\n");
      out.write("\t\t\t\tarr[i]=field+\"=\"+name;\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfor(var i=0;i<arr.length;i++){\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tkk=kk+arr[i]+\"&\";\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar newurl=url.split(\"?\")[0]+\"?\"+kk;\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//http://localhost:8080/keyword/search?key=%E6%89%8B%E6%9C%BA&brand=%20iphone&brand=%20%E5%B0%8F%E7%B1%B3\r\n");
      out.write("\t\tif(url.cotain(field)){\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tbrand=/^{*}$&;\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\telse {\r\n");
      out.write("\t\t\turl=url+\"&\"+field+\"=\"+name\r\n");
      out.write("\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tconsole.log(url); */\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\tfunction search(){\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar keyword=$(\"#key\").val();\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(!keyword){\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\talert(\"不能为空\");\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t $.ajax({\r\n");
      out.write("             type: \"GET\",\r\n");
      out.write("             url: \"");
      out.print(basePath );
      out.write("keyword/addKeyWord\",\r\n");
      out.write("             data: {key:$(\"#key\").val()},\r\n");
      out.write("             dataType: \"json\",\r\n");
      out.write("             success: function(data){\r\n");
      out.write("            \t \r\n");
      out.write("            \t if(data.ret==1){            \t\t \r\n");
      out.write("            \t\t \r\n");
      out.write("            \tlocation.href=\"");
      out.print(basePath );
      out.write("keyword/search?key=\"+$(\"#key\").val();\r\n");
      out.write("            \t\t \r\n");
      out.write("            \t }\r\n");
      out.write("            \t \r\n");
      out.write("            \t \r\n");
      out.write("            \t \r\n");
      out.write("             }\r\n");
      out.write("\t\t });\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(".col-xs-1{\r\n");
      out.write("\r\n");
      out.write("background-color: #eeeeee;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body >\r\n");
      out.write("\r\n");
      out.write("<div id=\"main\" style=\"font-size: 12px;\">\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"container-fluid\">\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<nav class=\"navbar navbar-default\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <div class=\"navbar-header\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("    <div class=\"navbar-default\" style=\"max-width: 668px;margin: auto;\">\r\n");
      out.write("    \r\n");
      out.write("    <input class=\"input\" type=\"text\" style=\"height: 40px;width: 300px;\" name='key' id=\"key\" >\r\n");
      out.write("\r\n");
      out.write("<button id=\"btn\" class=\"btn btn-primary\" onclick=\"search()\">查询</button>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("     <!--    <form class=\"navbar-form navbar-left\" role=\"search\">\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <input type=\"text\" class=\"form-control\" placeholder=\"Search\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <button type=\"submit\" class=\"btn btn-primary\">查询</button>\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("        </form> -->\r\n");
      out.write("\r\n");
      out.write("      \r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <div>\r\n");
      out.write("    \r\n");
      out.write("    \t<ol class=\"breadcrumb\">\r\n");
      out.write("  <li><a href=\"#\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${key }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a></li>\r\n");
      out.write("</ol>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    </div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"row\">\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\t\r\n");
      out.write("\t\t<div class=\"col-xs-12\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t</div>\r\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listF }", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("item");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t<div class=\"col-xs-12\">\r\n");
          out.write("\t\t\r\n");
          out.write("\t\t<div class=\"row\">\r\n");
          out.write("\t\t\r\n");
          out.write("\t\t\r\n");
          out.write("\t\t<div class=\"col-xs-1\">\r\n");
          out.write("\t\t\r\n");
          out.write("\t\t\t");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.categoryPropertyTypeName }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("：\r\n");
          out.write("\t\t\t\r\n");
          out.write("\t\t\t\r\n");
          out.write("\t\t</div>\r\n");
          out.write("\t\t\r\n");
          out.write("\t\t<div class=\"col-xs-11\">\r\n");
          out.write("\t\t\r\n");
          out.write("\t\t\r\n");
          out.write("\t\t\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_c_forEach_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\r\n");
          out.write("\t\t\r\n");
          out.write("\t\t\r\n");
          out.write("\t\t</div>\r\n");
          out.write("\t\t\r\n");
          out.write("\t\t\r\n");
          out.write("\t\t</div>\r\n");
          out.write("\t\t\r\n");
          out.write("\t\t\r\n");
          out.write("\t\t\r\n");
          out.write("\r\n");
          out.write("\t\t\t\r\n");
          out.write("\t\t</div>\r\n");
          out.write("\t\t\r\n");
          out.write("\t\t<hr>\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.fieldValue }", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("propertyValue");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\r\n");
          out.write("\t\t\t\r\n");
          out.write("\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t<a  href=\"javascript:void(0)\" onclick=\"detailSearch('");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.categoryPropertyTypeField }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("','");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${propertyValue }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("')\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${propertyValue }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
          out.write("\r\n");
          out.write("\t\t\t\r\n");
          out.write("\t\t\t\r\n");
          out.write("\t\t\t\r\n");
          out.write("\t\t\t\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(null);
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list }", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_2.setVar("p");
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\r\n");
          out.write("\t\t\t<div style=\"height: 220px;width: 200px;float: left;margin-left: 20px;border: #eeeeee 1px solid;\">\r\n");
          out.write("\t\t\t\r\n");
          out.write("\t\t\t<div style=\"max-height: 200px;max-width: 140px;float: left;margin-left: 20px;\">\r\n");
          out.write("\t\t\t\r\n");
          out.write("\t\t\t\r\n");
          out.write("\t\t\t ");
          if (_jspx_meth_c_if_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_2, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
            return true;
          out.write("\r\n");
          out.write("                                    \r\n");
          out.write("                                    ");
          if (_jspx_meth_c_if_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_2, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\r\n");
          out.write("\t\t\t\r\n");
          out.write("\t\t\t\r\n");
          out.write("\t\t\t\r\n");
          out.write("\t\t\t</div>\r\n");
          out.write("\t\t\t\r\n");
          out.write("\t\t\t<div style=\"float: left;\">\r\n");
          out.write("\t\t\t\r\n");
          out.write("\t\t\t\r\n");
          out.write("\t\t<div style=\"color: red;\">￥");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.productPrice }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</div>\t\r\n");
          out.write("\t\t\t\r\n");
          out.write("\t\t\t");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.name }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\r\n");
          out.write("\t\t\t\r\n");
          out.write("\t\t\t\r\n");
          out.write("\t\t\t</div>\r\n");
          out.write("\t\t\t</div>\r\n");
          out.write("\t\t\t\r\n");
          out.write("\t\t\t\r\n");
          out.write("\t\t\t\r\n");
          out.write("\t\t\t\r\n");
          out.write("\t\t\t\r\n");
          out.write("\t\t\t");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_2);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(p.name,'男装')}", java.lang.Boolean.class, (PageContext)_jspx_page_context, _jspx_fnmap_0)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("  \r\n");
        out.write("\t\t\t \r\n");
        out.write("\t\t\t \r\n");
        out.write("\t\t\t \t\t\t \t\t\t<img alt=\"\" src=\"/img/nn.jpg\" height=\"180\" />\r\n");
        out.write("\t\t\t \t\t\t \t\t\t\r\n");
        out.write("\t\t\t \r\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_2);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:contains(p.name,'手机')}", java.lang.Boolean.class, (PageContext)_jspx_page_context, _jspx_fnmap_0)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("  \r\n");
        out.write("\t\t\t \r\n");
        out.write("\t\t\t \t\t\t<img alt=\"\" src=\"/img/phone.jpg\" height=\"180\">\r\n");
        out.write("\t\t\t \r\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }
}
