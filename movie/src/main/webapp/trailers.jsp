<%-- 
    Document   : trailers
    Created on : 19.05.2016, 20:18:36
    Author     : Владимир
--%>

<%@page import="java.util.List"%>
<%@page import="com.segvek.inmovie.entity.Film"%>
<%@page contentType="text/html" pageEncoding="windows-1251"%>
<%List<Film> films = (List<Film>) request.getAttribute("films");
%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="blocks/head.jspf" %>
    </head>
    <body>
        <%@include file="blocks/header.jspf" %>
        <div class="acont">
            <div class="phead">Последние трейлеры</div>
            <%for (int i = 0; i < films.size(); i += 3) {%>
            <div class="tlist">
                <% for (int j = 0; j < 3; j++) {%>
                    <div class="trail">
                        <a href="page?operation=film&id=<%=films.get(i+j).getId()%>">
                            <div class="tname">
                                <%=films.get(i+j).getName()%>
                            </div>
                        </a>
                        <div class="tvid"><iframe src="<%=films.get(i+j).getLinkVideo() %>" frameborder="0" allowfullscreen></iframe></div>
                    </div> 
                <%}%>
            </div>
            <%}%>
        </div>
        <%@include file="blocks/footer.jspf" %>  
    </body>
</html>
