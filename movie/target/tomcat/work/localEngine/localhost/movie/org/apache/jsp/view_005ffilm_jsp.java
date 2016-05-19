package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class view_005ffilm_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1251\">\n");
      out.write("<link type=\"text/css\" href=\"css/style.css\" rel=\"stylesheet\">\n");
      out.write("<title>INMovie</title>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"header\">\n");
      out.write("    <div class=\"headmain\">\n");
      out.write("        <span class=\"main\"><a href=\"index.php\">INMovie</a></span>\n");
      out.write("        <div class=\"menu\">\n");
      out.write("            <ul>\n");
      out.write("                <li><a href=\"affiche.php\">Афиша</a></li>\n");
      out.write("                <li><a href=\"trailers.php\">Трейлеры</a></li>\n");
      out.write("                <li><a href=\"news.php\">Новости</a></li> \n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"headbut\">\n");
      out.write("        <input type=\"text\" class=\"search\" placeholder=\"Искать...\">\n");
      out.write("        <a href=\"logreg.php\"><input type=\"button\" class=\"login\" value=\"Вход\"></a>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("        <div class=\"acont\">\n");
      out.write("            <div class=\"ftitle\">Книга Джунглей</div>\n");
      out.write("            <div class=\"film\"> \n");
      out.write("                <div class=\"fpost\"></div>\n");
      out.write("                <div class=\"finfo\">\n");
      out.write("                    <table cols=\"2\">\n");
      out.write("                        <tr>\n");
      out.write("                            <td>год:</td>\n");
      out.write("                            <td>2016</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>страна:</td>\n");
      out.write("                            <td>США</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>режисер:</td>\n");
      out.write("                            <td>Джон Фавро</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>сценарий:</td>\n");
      out.write("                            <td>Джастин Маркс, Редьярд Киплинг</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>продюсер:</td>\n");
      out.write("                            <td>Джон Фавро, Бригхэм Тейлор, Молли Аллен</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>композитор:</td>\n");
      out.write("                            <td>Джон Дебни</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>жанр:</td>\n");
      out.write("                            <td>фэнтези, драма, приключения</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>бюджет:</td>\n");
      out.write("                            <td>$175 000 000</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>сборы:</td>\n");
      out.write("                            <td>$393 754 426</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>премьера:</td>\n");
      out.write("                            <td>4 апреля 2016</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>время:</td>\n");
      out.write("                            <td>105 мин./01:45</td>\n");
      out.write("                        </tr>\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"froles\">В главных ролях:\n");
      out.write("                    <p>Нил Сетхи</br>\n");
      out.write("                        Билл Мюррей</br>\n");
      out.write("                        Бен Кингсли</br>\n");
      out.write("                        Идрис Эльба</br>\n");
      out.write("                        Лупита Нионго</br>\n");
      out.write("                        Скарлетт Йоханссон</br>\n");
      out.write("                        Джанкарло Эспозито</br>\n");
      out.write("                        Кристофер Уокен</br>\n");
      out.write("                        Гарри Шендлинг</br>\n");
      out.write("                        Брайтон Роуз</p></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"textline\">Описание</div>\n");
      out.write("            <div class=\"ftext\"><p>Непримиримая борьба с опасным и внушающим страх тигром Шерханом вынуждает Маугли покинуть волчью стаю и отправиться в захватывающее путешествие. На пути мальчика ждут удивительные открытия и запоминающиеся встречи с пантерой Багирой, медведем Балу, питоном Каа и другими обитателями дремучих джунглей.</p></div>\n");
      out.write("            <div class=\"textline\">Трейлер</div>\n");
      out.write("            <div class=\"ftrail\"><iframe src=\"https://www.youtube.com/embed/IyJMXh8JscA\" frameborder=\"0\" allowfullscreen></iframe></div>\n");
      out.write("            <div class=\"textline\">Комментарии к фильму</div>\n");
      out.write("            <div class=\"fcomment\"></div>\n");
      out.write("        </div>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"footer\">\n");
      out.write("    <div class=\"foottext\">@2016 INMovie.com</div>\n");
      out.write("    <script type=\"text/javascript\">(function () {\n");
      out.write("            if (window.pluso)\n");
      out.write("                if (typeof window.pluso.start == \"function\")\n");
      out.write("                    return;\n");
      out.write("            if (window.ifpluso == undefined) {\n");
      out.write("                window.ifpluso = 1;\n");
      out.write("                var d = document, s = d.createElement('script'), g = 'getElementsByTagName';\n");
      out.write("                s.type = 'text/javascript';\n");
      out.write("                s.charset = 'UTF-8';\n");
      out.write("                s.async = true;\n");
      out.write("                s.src = ('https:' == window.location.protocol ? 'https' : 'http') + '://share.pluso.ru/pluso-like.js';\n");
      out.write("                var h = d[g]('body')[0];\n");
      out.write("                h.appendChild(s);\n");
      out.write("            }\n");
      out.write("        })();</script>\n");
      out.write("    <div class=\"pluso\" data-background=\"transparent\" data-options=\"big,square,line,horizontal,nocounter,theme=02\" data-services=\"vkontakte,facebook,twitter,google\"></div>\n");
      out.write("</div>\n");
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
