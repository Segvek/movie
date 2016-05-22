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
      out.write("    ");
if (true) {
      out.write("\r\n");
      out.write("    <div class=\"headbut\">\r\n");
      out.write("        <input type=\"text\" class=\"search\" placeholder=\"Искать...\">\r\n");
      out.write("        <a href=\"page?operation=registration\"><input type=\"button\" class=\"login\" value=\"Вход\"></a>\r\n");
      out.write("    </div>\r\n");
      out.write("    ");
} else {
      out.write("\r\n");
      out.write("    <div class=\"headbut\">\r\n");
      out.write("        <input type=\"text\" class=\"search\" placeholder=\"Искать...\">\r\n");
      out.write("        <span class=\"logfield\">vovanzel&nbsp;&nbsp;&nbsp;<a href=\"\">|&nbsp;&nbsp;&nbsp;Выход</a></span>\r\n");
      out.write("        <button type=\"submit\" class=\"watchlist\">watchlist</button>\r\n");
      out.write("    </div>\r\n");
      out.write("    ");
}
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"acont\">\r\n");
      out.write("            <div class=\"ftitle\">Книга Джунглей</div>\r\n");
      out.write("            <div class=\"film\"> \r\n");
      out.write("                <div class=\"fpost\"></div>\r\n");
      out.write("                <div class=\"addto\">Добавить в Watchlist</div>\r\n");
      out.write("                <div class=\"finfo\">\r\n");
      out.write("                    <table cols=\"2\">\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>год:</td>\r\n");
      out.write("                            <td>2016</td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>страна:</td>\r\n");
      out.write("                            <td>США</td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>режисер:</td>\r\n");
      out.write("                            <td>Джон Фавро</td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>сценарий:</td>\r\n");
      out.write("                            <td>Джастин Маркс, Редьярд Киплинг</td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>продюсер:</td>\r\n");
      out.write("                            <td>Джон Фавро, Бригхэм Тейлор, Молли Аллен</td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>композитор:</td>\r\n");
      out.write("                            <td>Джон Дебни</td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>жанр:</td>\r\n");
      out.write("                            <td>фэнтези, драма, приключения</td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>бюджет:</td>\r\n");
      out.write("                            <td>$175 000 000</td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>сборы:</td>\r\n");
      out.write("                            <td>$393 754 426</td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>премьера:</td>\r\n");
      out.write("                            <td>4 апреля 2016</td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>время:</td>\r\n");
      out.write("                            <td>105 мин./01:45</td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </table>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"froles\">В главных ролях:\r\n");
      out.write("                    <p>Нил Сетхи</br>\r\n");
      out.write("                        Билл Мюррей</br>\r\n");
      out.write("                        Бен Кингсли</br>\r\n");
      out.write("                        Идрис Эльба</br>\r\n");
      out.write("                        Лупита Нионго</br>\r\n");
      out.write("                        Скарлетт Йоханссон</br>\r\n");
      out.write("                        Джанкарло Эспозито</br>\r\n");
      out.write("                        Кристофер Уокен</br>\r\n");
      out.write("                        Гарри Шендлинг</br>\r\n");
      out.write("                        Брайтон Роуз</p></div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"textline\">Описание</div>\r\n");
      out.write("            <div class=\"ftext\"><p>Непримиримая борьба с опасным и внушающим страх тигром Шерханом вынуждает Маугли покинуть волчью стаю и отправиться в захватывающее путешествие. На пути мальчика ждут удивительные открытия и запоминающиеся встречи с пантерой Багирой, медведем Балу, питоном Каа и другими обитателями дремучих джунглей.</p></div>\r\n");
      out.write("            <div class=\"textline\">Трейлер</div>\r\n");
      out.write("            <div class=\"ftrail\"><iframe src=\"https://www.youtube.com/embed/IyJMXh8JscA\" frameborder=\"0\" allowfullscreen></iframe></div>\r\n");
      out.write("            <div class=\"textline\">Комментарии к фильму</div>\r\n");
      out.write("            <div class=\"fcomment\"></div>\r\n");
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
      out.write("\r\n");
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
