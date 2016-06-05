<%-- 
    Document   : watchlist
    Created on : 19.05.2016, 20:40:47
    Author     : Владимир
--%>

<%@page import="com.segvek.inmovie.entity.Janr"%>
<%@page import="java.util.Set"%>
<%@page import="com.segvek.inmovie.entity.Film"%>
<%@page contentType="text/html" pageEncoding="windows-1251"%>
<% Set<Film> films = (Set<Film>) request.getAttribute("films");%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="blocks/head.jspf" %>
    </head>
    <body>
        <%@include file="blocks/header.jspf" %>
        <div class="acont">
            <div class="phead">Watchlist</div>
            <%for (Film film : films) {%> 
            <div class="pfilm">
                <a href="page?operation=film&id=<%=film.getId()%>">
                    <div>
                        <img class="ppost" src="<%=film.getPatchImage()%>"/>
                    </div>
                </a>
                <div class="ptext"><a href="page?operation=film&id=<%=film.getId()%>"><h2><%=film.getName()%></h2></a>
                    <p><%=film.getYear() + " " + film.getCounty() + " " + film.getTime()%></p>
                    <p>режисер: <%=film.getRegeser()%></p>
                    <p><%for (Janr janr : film.getJanrs()) {%>
                        <%=janr.getName() + " "%>
                        <%}%>
                    </p>
                </div>
                <form method="POST" action="psge?operation=deleteToWatchList&idFilm=<%=film.getId()%>">
                    <input class="delbutton" type="submit" value="Убрать из Watchlist"/>
                </form>
            </div>
            <%}%>
        </div>
        <%@include file="blocks/footer.jspf" %>  
    </body>
</html>