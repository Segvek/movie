package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class indexp_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1251\">\n");
      out.write("        <link type=\"text/css\" href=\"css/style.css\" rel=\"stylesheet\">\n");
      out.write("        <title>INMovie</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"header\">\n");
      out.write("            <div class=\"headmain\">\n");
      out.write("                <span class=\"main\"><a href=\"index.php\">INMovie</a></span>\n");
      out.write("                <div class=\"menu\">\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"affiche.php\">Афиша</a></li>\n");
      out.write("                        <li><a href=\"trailers.php\">Трейлеры</a></li>\n");
      out.write("                        <li><a href=\"news.php\">Новости</a></li> \n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"headbut\">\n");
      out.write("                <input type=\"text\" class=\"search\" placeholder=\"Искать...\">\n");
      out.write("                <a href=\"logreg.php\"><input type=\"button\" class=\"login\" value=\"Вход\"></a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"content\">\n");
      out.write("            <div class=\"fblock\">\n");
      out.write("                <div class=\"bhead\">Сегодня в кино</div>\n");
      out.write("                <div class=\"f1\">     \n");
      out.write("                    <a href=\"view_film.php\"><div class=\"post1\"></div>\n");
      out.write("                    <span class=\"btext\">Бэтмен против</br> Супермена</span></a>\n");
      out.write("                    <div class=\"date\">24.03.16</div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"f2\">\n");
      out.write("                    <a href=\"view_film.php\"><div class=\"post2\"></div></a>\n");
      out.write("                    <a href=\"view_film.php\"><span class=\"btext\">Дедпул</span></a>\n");
      out.write("                    <div class=\"date\">24.03.16</div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"f3\">\n");
      out.write("                    <a href=\"view_film.php\"> <div class=\"post3\"></div></a>\n");
      out.write("                    <a href=\"view_film.php\">  <span class=\"btext\">Первый мститель: Противостояние</span></a>\n");
      out.write("                    <div class=\"date\">24.03.16</div>\n");
      out.write("                </div>   \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"cont2\">\n");
      out.write("            <div class=\"mnews\">\n");
      out.write("                <div class=\"nhead\">Новости</div>\n");
      out.write("                <div class=\"nblock\">\n");
      out.write("                    <a href=\"view_news.php\"><div class=\"nimg\"></div></a>\n");
      out.write("                    <div class=\"ntext\">\n");
      out.write("                        <a href=\"view_news.php\"><h2>Билеты на премьеру шестого сезона «Игры престолов»</h2></a>\n");
      out.write("                        <p>КиноПоиск и «Амедиатека» представляют конкурс, посвященный старту нового сезона одного из главных телевизионных проектов современности «Игра престолов». Правильно ответьте на вопросы и получите возможность выиграть билеты на премьерный показ первой серии в кинотеатрах сети «КАРО».</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"nblock\">\n");
      out.write("                    <a href=\"view_news.php\"><div class=\"nimg\"></div></a>\n");
      out.write("                    <div class=\"ntext\">\n");
      out.write("                        <a href=\"view_news.php\"><h2>Билеты на премьеру шестого сезона «Игры престолов»</h2></a>\n");
      out.write("                        <p>КиноПоиск и «Амедиатека» представляют конкурс, посвященный старту нового сезона одного из главных телевизионных проектов современности «Игра престолов». Правильно ответьте на вопросы и получите возможность выиграть билеты на премьерный показ первой серии в кинотеатрах сети «КАРО».</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"mtrail\">\n");
      out.write("                <div class=\"nhead\">Новые трейлеры</div>\n");
      out.write("                <div class=\"mblock\">\n");
      out.write("                    <a href=\"view_film.php\"><div class=\"mtitle\"><h2>Отряд самоубийц</h2></div></a>\n");
      out.write("                    <div class=\"mvid\"><iframe src=\"https://www.youtube.com/embed/7xLCggrIRHY\" frameborder=\"0\" allowfullscreen></iframe></div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"mblock\">\n");
      out.write("                    <a href=\"view_film.php\"><div class=\"mtitle\"><h2>Отряд самоубийц</h2></div></a>\n");
      out.write("                    <div class=\"mvid\"><iframe src=\"https://www.youtube.com/embed/7xLCggrIRHY\" frameborder=\"0\" allowfullscreen></iframe></div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"footer\">\n");
      out.write("            <div class=\"foottext\">@2016 INMovie.com</div>\n");
      out.write("            <script type=\"text/javascript\">(function () {\n");
      out.write("                    if (window.pluso)\n");
      out.write("                        if (typeof window.pluso.start == \"function\")\n");
      out.write("                            return;\n");
      out.write("                    if (window.ifpluso == undefined) {\n");
      out.write("                        window.ifpluso = 1;\n");
      out.write("                        var d = document, s = d.createElement('script'), g = 'getElementsByTagName';\n");
      out.write("                        s.type = 'text/javascript';\n");
      out.write("                        s.charset = 'UTF-8';\n");
      out.write("                        s.async = true;\n");
      out.write("                        s.src = ('https:' == window.location.protocol ? 'https' : 'http') + '://share.pluso.ru/pluso-like.js';\n");
      out.write("                        var h = d[g]('body')[0];\n");
      out.write("                        h.appendChild(s);\n");
      out.write("                    }\n");
      out.write("                })();</script>\n");
      out.write("            <div class=\"pluso\" data-background=\"transparent\" data-options=\"big,square,line,horizontal,nocounter,theme=02\" data-services=\"vkontakte,facebook,twitter,google\"></div>\n");
      out.write("        </div>    \n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
