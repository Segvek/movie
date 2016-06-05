<%-- 
    Document   : view_film.jsp
    Created on : 19.05.2016, 3:02:50
    Author     : Panas
--%>

<%@page import="com.segvek.inmovie.entity.Janr"%>
<%@page import="com.segvek.inmovie.entity.Film"%>
<%@page contentType="text/html" pageEncoding="windows-1251"%>
<% Film film = (Film) request.getAttribute("film");%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="blocks/head.jspf" %>      
        <script type="text/javascript" src="js/kinopoisk.js"></script>
    </head>
    <body>
        <%@include file="blocks/header.jspf" %>
        <div class="acont">
            <div class="ftitle"><%=film.getName()%></div>
            <div class="film"> 
                <div class="kinopoisk" data-movie="771067"></div>
                <div>
                    <img class="fpost" src="<%=film.getPatchImage()%>" />
                </div>
                <%if (user != null) {%>
                <a href="">
                    <form method="post" action="page?operation=addToWatchList&idFilm=<%=film.getId()%>">
                        <input type="submit" class="addto" value="�������� � Watchlist">
                        <input type="submit" class="delout" value="������ �� Watchlist">
                    </form>
                </a>
                <%}%>
                <div class="finfo">
                    <table cols="2">
                        <tr>
                            <td>���:</td>
                            <td><%=film.getYear()%></td>
                        </tr>
                        <tr>
                            <td>������:</td>
                            <td><%=film.getCounty()%></td>
                        </tr>
                        <tr>
                            <td>�������:</td>
                            <td><%=film.getRegeser()%></td>
                        </tr>
                        <tr>
                            <td>��������:</td>
                            <td><%=film.getSchenarist()%></td>
                        </tr>
                        <tr>
                            <td>��������:</td>
                            <td><%=film.getProduser()%></td>
                        </tr>
                        <tr>
                            <td>����������:</td>
                            <td><%=film.getKompositor()%></td>
                        </tr>
                        <tr>
                            <td>����:</td>
                            <td>
                                <%for (Janr janr : film.getJanrs()) {%>
                                <%=janr.getName() + " "%>
                                <%}%>
                            </td>
                        </tr>
                        <tr>
                            <td>������:</td>
                            <td><%=film.getBudget()%></td>
                        </tr>
                        <tr>
                            <td>�����:</td>
                            <td><%=film.getSbory()%></td>
                        </tr>
                        <tr>
                            <td>��������:</td>
                            <td><%=film.getPremera()%></td>
                        </tr>
                        <tr>
                            <td>�����:</td>
                            <td><%=film.getTime()%></td>
                        </tr>
                    </table>
                </div>
                <div class="froles">� ������� �����:
                    <p><%=film.getAtRore()%></p>
                </div>
            </div>
            <div class="textline">��������</div>
            <div class="ftext"><p> <%=film.getAnotation()%></p></div>
            <div class="textline">�������</div>
            <div class="ftrail"><iframe src="<%=film.getLinkVideo()%>" frameborder="0" allowfullscreen></iframe></div>
            <div class="textline">����������� � ������</div>
            <div class="fcomment">
                <div class="commenttext">
                    <p>login</p>
                    <p>texttexttexttexttexttexttexttextvtexttexttexttexttexttext</p>           
                </div>
                <div class="commenttext">
                    <p>login</p>
                    <p>texttexttexttexttexttexttexttextvtexttexttexttexttexttext
                        texttexttexttexttexttexttexttextvtexttexttexttexttexttext
                        texttexttexttexttexttexttexttextvtexttexttexttexttexttext
                        texttexttexttexttexttexttexttextvtexttexttexttexttexttext
                        texttexttexttexttexttexttexttextvtexttexttexttexttexttext
                        texttexttexttexttexttexttexttextvtexttexttexttexttexttext
                        texttexttexttexttexttexttexttextvtexttexttexttexttexttext</p>           
                </div>
                <div class="commenttext">
                    <p>login</p>
                    <p>texttexttexttexttexttexttexttextvtexttexttexttexttexttext</p>           
                </div>
                <form class="comment" method="post">
                    <p>
                        <label>���:</label>
                        <input type="text" name="name" />
                    </p>
                    <p>
                        <label>�����������:</label>
                        <br />
                        <textarea name="text_comment" cols="100" rows="7"></textarea>
                    </p>
                    <p>
                        <input type="submit" value="���������" />
                    </p>
                </form>
            </div>
        </div>
        <%@include file="blocks/footer.jspf" %>
    </body>
</html>
