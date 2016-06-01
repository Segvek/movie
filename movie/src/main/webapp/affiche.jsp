
<%@page import="com.segvek.inmovie.entity.Janr"%>
<%@page import="java.util.List"%>
<%@page import="com.segvek.inmovie.entity.Film"%>
<%@page contentType="text/html" pageEncoding="windows-1251"%>
<% List<Film> films = (List<Film>)request.getAttribute("films"); %>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="blocks/head.jspf" %>
    </head>
    <body>
        <%@include file="blocks/header.jspf" %>
        <div class="acont">
            <div class="phead">Новинки</div>
            <% for(Film film:films) {%>
            <div class="pfilm">
                <a href="page?operation=film&id=<%=film.getId()%>">
                    <div>
                        <img class="ppost" src="<%=film.getPatchImage() %>"/>
                    </div>
                </a>
                <div class="ptext"><a href="page?operation=film&id=<%=film.getId()%>"><h2><%=film.getName()%></h2></a>
                    <p><%=film.getYear()+" "+film.getCounty()+" "+film.getTime()%></p>
                    <p>режисер: <%=film.getRegeser()%></p>
                    <p><%for(Janr janr:film.getJanrs()) {%>
                        <%=janr.getName()+" "%>
                        <%}%>
                    </p>
                </div>
                <div class="prate">рейтинг</div>
                <div class="pdate"><p><%=film.getPremera()%> </p></div>
            </div>
            <%}%>
        </div>
        <%@include file="blocks/footer.jspf" %>  
    </body>
</html>