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
    </head>
    <body>
        <%@include file="blocks/header.jspf" %>
        <div class="acont">
            <div class="ftitle"><%=film.getName()%></div>
            <div class="film"> 
                <div class="fpost">
                    <img class="fpost" src="<%=film.getPatchImage() %>" />
                </div>
                <%if (user != null) {%>
                <a href="">
                    <div class="addto">Добавить в Watchlist</div>
                </a>
                <%}%>
                <div class="finfo">
                    <table cols="2">
                        <tr>
                            <td>год:</td>
                            <td><%=film.getYear()%></td>
                        </tr>
                        <tr>
                            <td>страна:</td>
                            <td><%=film.getCounty()%></td>
                        </tr>
                        <tr>
                            <td>режисер:</td>
                            <td><%=film.getRegeser()%></td>
                        </tr>
                        <tr>
                            <td>сценарий:</td>
                            <td><%=film.getSchenarist()%></td>
                        </tr>
                        <tr>
                            <td>продюсер:</td>
                            <td><%=film.getProduser()%></td>
                        </tr>
                        <tr>
                            <td>композитор:</td>
                            <td><%=film.getKompositor()%></td>
                        </tr>
                        <tr>
                            <td>жанр:</td>
                            <td>
                                <%for (Janr janr : film.getJanrs()) {%>
                                <%=janr.getName() + " "%>
                                <%}%>
                            </td>
                        </tr>
                        <tr>
                            <td>бюджет:</td>
                            <td><%=film.getBudget()%></td>
                        </tr>
                        <tr>
                            <td>сборы:</td>
                            <td><%=film.getSbory()%></td>
                        </tr>
                        <tr>
                            <td>премьера:</td>
                            <td><%=film.getPremera()%></td>
                        </tr>
                        <tr>
                            <td>время:</td>
                            <td><%=film.getTime()%></td>
                        </tr>
                    </table>
                </div>
                <div class="froles">В главных ролях:
                    <p><%=film.getAtRore()%></p>
                </div>
            </div>
            <div class="textline">Описание</div>
            <div class="ftext"><p> <%=film.getAnotation()%></p></div>
            <div class="textline">Трейлер</div>
            <div class="ftrail"><iframe src="<%=film.getLinkVideo()%>" frameborder="0" allowfullscreen></iframe></div>
            <div class="textline">Комментарии к фильму</div>
            <div class="fcomment"></div>
        </div>
        <%@include file="blocks/footer.jspf" %>
    </body>
</html>
