package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

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

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("js/jquery-1.8.0.min.js\"></script>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("js/jquery.bigautocomplete.js\"></script>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar str=\"\";\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\tvar aa=\tstr.replace(\"\",\"\");\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t\t\r\n");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t/* $(function(){\r\n");
      out.write("\r\n");
      out.write("\t    $(\"#tt\").bigAutocomplete({\r\n");
      out.write("\t        width:543,\r\n");
      out.write("\t        data:[{title:\"中国好声音\",result:{ff:\"qq\"}},\r\n");
      out.write("\t        {title:\"中国移动网上营业厅\"},\r\n");
      out.write("\t        {title:\"中国银行\"},\r\n");
      out.write("\t        {title:\"中国移动\"},\r\n");
      out.write("\t        {title:\"中国好声音第三期\"},\r\n");
      out.write("\t        {title:\"中国好声音 第一期\"},\r\n");
      out.write("\t        {title:\"中国电信网上营业厅\"},\r\n");
      out.write("\t        {title:\"中国工商银行\"},\r\n");
      out.write("\t        {title:\"中国好声音第二期\"},\r\n");
      out.write("\t        {title:\"中国地图\"}],\r\n");
      out.write("\t        callback:function(data){\r\n");
      out.write("\t            alert(data.title);    \r\n");
      out.write("\t        }\r\n");
      out.write("\t    });\r\n");
      out.write("\r\n");
      out.write("\t})\r\n");
      out.write("\t */\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t$(function(){\r\n");
      out.write("\r\n");
      out.write("\t    $(\"#key\").bigAutocomplete({\r\n");
      out.write("\t    \t\r\n");
      out.write("\t    \t\r\n");
      out.write("\t   \r\n");
      out.write("\t    \turl:\"keyword/getListKeyword\",\r\n");
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
      out.write("             url: \"keyword/addKeyWord\",\r\n");
      out.write("             data: {key:$(\"#key\").val()},\r\n");
      out.write("             dataType: \"json\",\r\n");
      out.write("             success: function(data){\r\n");
      out.write("            \t \r\n");
      out.write("            \t if(data.ret==1){            \t\t \r\n");
      out.write("            \t\t \r\n");
      out.write("            \t\t window.open(\"keyword/search?key=\"+$(\"#key\").val());\r\n");
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
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div >\r\n");
      out.write("\r\n");
      out.write("<a href=\"/product/listProduct\">商品管理</a>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div style=\"text-align: center;margin-top: 100px;\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<input class=\"input\" type=\"text\" style=\"height: 40;width: 300px;\" name='key' id=\"key\" >\r\n");
      out.write("\r\n");
      out.write("<button id=\"btn\" onclick=\"search()\">查询</button>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
