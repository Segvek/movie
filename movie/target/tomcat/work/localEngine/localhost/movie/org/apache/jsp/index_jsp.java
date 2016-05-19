package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(3);
    _jspx_dependants.add("/blocks/head.jspf");
    _jspx_dependants.add("/blocks/header.jspf");
    _jspx_dependants.add("/blocks/footer.jspf");
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html;charset=windows-1251");
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1251\">\r\n");
      out.write("<link type=\"text/css\" href=\"css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("<title>INMovie</title>\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"header\">\r\n");
      out.write("    <div class=\"headmain\">\r\n");
      out.write("        <span class=\"main\"><a href=\"index.php\">INMovie</a></span>\r\n");
      out.write("        <div class=\"menu\">\r\n");
      out.write("            <ul>\r\n");
      out.write("                <li><a href=\"affiche.php\">Афиша</a></li>\r\n");
      out.write("                <li><a href=\"trailers.php\">Трейлеры</a></li>\r\n");
      out.write("                <li><a href=\"news.php\">Новости</a></li> \r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"headbut\">\r\n");
      out.write("        <input type=\"text\" class=\"search\" placeholder=\"Искать...\">\r\n");
      out.write("        <a href=\"logreg.php\"><input type=\"button\" class=\"login\" value=\"Вход\"></a>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"content\">\r\n");
      out.write("            <div class=\"fblock\">\r\n");
      out.write("                <div class=\"bhead\">Сегодня в кино</div>\r\n");
      out.write("                <div class=\"f1\">     \r\n");
      out.write("                    <a href=\"page?operation=film&id=1\">\r\n");
      out.write("                        <div class=\"post1\"></div>\r\n");
      out.write("                        <span class=\"btext\">Бэтмен против</br> Супермена</span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <div class=\"date\">24.03.16</div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"f2\">\r\n");
      out.write("                    <a href=\"view_film.php\"><div class=\"post2\"></div></a>\r\n");
      out.write("                    <a href=\"view_film.php\"><span class=\"btext\">Дедпул</span></a>\r\n");
      out.write("                    <div class=\"date\">24.03.16</div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"f3\">\r\n");
      out.write("                    <a href=\"view_film.php\"> <div class=\"post3\"></div></a>\r\n");
      out.write("                    <a href=\"view_film.php\">  <span class=\"btext\">Первый мститель: Противостояние</span></a>\r\n");
      out.write("                    <div class=\"date\">24.03.16</div>\r\n");
      out.write("                </div>   \r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"cont2\">\r\n");
      out.write("            <div class=\"mnews\">\r\n");
      out.write("                <div class=\"nhead\">Новости</div>\r\n");
      out.write("                <div class=\"nblock\">\r\n");
      out.write("                    <a href=\"view_news.php\"><div class=\"nimg\"></div></a>\r\n");
      out.write("                    <div class=\"ntext\">\r\n");
      out.write("                        <a href=\"view_news.php\"><h2>Билеты на премьеру шестого сезона «Игры престолов»</h2></a>\r\n");
      out.write("                        <p>КиноПоиск и «Амедиатека» представляют конкурс, посвященный старту нового сезона одного из главных телевизионных проектов современности «Игра престолов». Правильно ответьте на вопросы и получите возможность выиграть билеты на премьерный показ первой серии в кинотеатрах сети «КАРО».</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"nblock\">\r\n");
      out.write("                    <a href=\"view_news.php\"><div class=\"nimg\"></div></a>\r\n");
      out.write("                    <div class=\"ntext\">\r\n");
      out.write("                        <a href=\"view_news.php\"><h2>Билеты на премьеру шестого сезона «Игры престолов»</h2></a>\r\n");
      out.write("                        <p>КиноПоиск и «Амедиатека» представляют конкурс, посвященный старту нового сезона одного из главных телевизионных проектов современности «Игра престолов». Правильно ответьте на вопросы и получите возможность выиграть билеты на премьерный показ первой серии в кинотеатрах сети «КАРО».</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"mtrail\">\r\n");
      out.write("                <div class=\"nhead\">Новые трейлеры</div>\r\n");
      out.write("                <div class=\"mblock\">\r\n");
      out.write("                    <a href=\"view_film.php\"><div class=\"mtitle\"><h2>Отряд самоубийц</h2></div></a>\r\n");
      out.write("                    <div class=\"mvid\"><iframe src=\"https://www.youtube.com/embed/7xLCggrIRHY\" frameborder=\"0\" allowfullscreen></iframe></div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"mblock\">\r\n");
      out.write("                    <a href=\"view_film.php\"><div class=\"mtitle\"><h2>Отряд самоубийц</h2></div></a>\r\n");
      out.write("                    <div class=\"mvid\"><iframe src=\"https://www.youtube.com/embed/7xLCggrIRHY\" frameborder=\"0\" allowfullscreen></iframe></div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"footer\">\r\n");
      out.write("    <div class=\"foottext\">@2016 INMovie.com</div>\r\n");
      out.write("    <script type=\"text/javascript\">(function () {\r\n");
      out.write("            if (window.pluso)\r\n");
      out.write("                if (typeof window.pluso.start == \"function\")\r\n");
      out.write("                    return;\r\n");
      out.write("            if (window.ifpluso == undefined) {\r\n");
      out.write("                window.ifpluso = 1;\r\n");
      out.write("                var d = document, s = d.createElement('script'), g = 'getElementsByTagName';\r\n");
      out.write("                s.type = 'text/javascript';\r\n");
      out.write("                s.charset = 'UTF-8';\r\n");
      out.write("                s.async = true;\r\n");
      out.write("                s.src = ('https:' == window.location.protocol ? 'https' : 'http') + '://share.pluso.ru/pluso-like.js';\r\n");
      out.write("                var h = d[g]('body')[0];\r\n");
      out.write("                h.appendChild(s);\r\n");
      out.write("            }\r\n");
      out.write("        })();</script>\r\n");
      out.write("    <div class=\"pluso\" data-background=\"transparent\" data-options=\"big,square,line,horizontal,nocounter,theme=02\" data-services=\"vkontakte,facebook,twitter,google\"></div>\r\n");
      out.write("</div>\r\n");
      out.write("  \r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
