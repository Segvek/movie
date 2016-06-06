<%-- 
    Document   : index
    Created on : 19.05.2016, 1:00:30
    Author     : Panas
--%>

<%@page import="com.segvek.inmovie.entity.News"%>
<%@page import="java.util.List"%>
<%@page import="com.segvek.inmovie.entity.Film"%>
<%@page contentType="text/html" pageEncoding="windows-1251"%>
<%List<Film> films = (List<Film>) request.getAttribute("films"); %>
<%List<News> news = (List<News>) request.getAttribute("news");
   %>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="blocks/head.jspf" %>
    </head>
    <body>
        <%@include file="blocks/header.jspf" %>
        <div class="content">
            <div class="fblock">
                <div class="bhead">Новинки</div>
                <%for (int i = 0; i < films.size(); i++) {%>
                <div class="f<%=(i + 1)%>">     
                    <a href="page?operation=film&id=<%=films.get(i).getId()%>">
                        <div>
                            <img class="post<%=(i + 1)%>" src="<%=films.get(i).getPatchImage()%>"/>
                        </div>
                        <span class="btext"><%=films.get(i).getName()%></span>
                    </a>
                    <div class="date"><%=films.get(i).getPremera()%></div>
                </div> 
                <%}%>
            </div>
        </div>
        <div class="cont2">
            <div class="mnews">
                <div class="nhead">Новости</div>
                <%for (int i = 0; i < 2; i++) {%>
                <div class="nblock">
                    <a href="page?operation=viewOneNews&id=<%=news.get(i).getId()%>">
                        <div>
                            <img class="nimg" src="<%=news.get(i).getPatchImage()%>"/>
                        </div>
                    </a>
                    <div class="ntext">
                        <a href="page?operation=viewOneNews&id=<%=news.get(i).getId()%>">
                            <h2><%=news.get(i).getTitle()%></h2>
                        </a>
                        <p><%=news.get(i).getContent().substring(0, 280)%></p>
                    </div>
                </div>  
                <%}%>
            </div>
            <div class="mtrail">
                <div class="nhead">Новые трейлеры</div>
                <%for (int i = 0; i < 2; i++) {%>
                <div class="mblock">
                    <a href="page?operation=film&id=<%=films.get(i).getId()%>"><div class="mtitle"><h2><%=films.get(i).getName()%></h2></div></a>
                    <div class="mvid"><iframe src="<%=films.get(i).getLinkVideo()%>" frameborder="0" allowfullscreen></iframe></div>
                </div>
                <%}%>
            </div>
        </div>
        <%@include file="blocks/footer.jspf" %>  
    </body>
</html>
