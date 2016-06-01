<%-- 
    Document   : news
    Created on : 19.05.2016, 20:19:24
    Author     : Владимир
--%>

<%@page import="com.segvek.inmovie.entity.News"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="windows-1251"%>
<% List<News> news = (List<News>) request.getAttribute("news");%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="blocks/head.jspf" %>
    </head>
    <body>
        <%@include file="blocks/header.jspf" %>
        <div class="acont">
            <div class="phead">Новости</div>
            <div class="nlist">
                <% for (News oneNews : news) {%>
                <a href="page?operation=viewOneNews&id=<%=oneNews.getId()%>">
                    <div>
                        <img class="nimg1" src="<%=oneNews.getPatchImage()%>" />
                    </div>
                    <div class="ntext1"><h2><%=oneNews.getTitle()%></h2>
                </a> 
                    <p><%=oneNews.getContent().substring(0, 250)+"..." %></p>
                </div>
                <%}%>
            </div>
        </div>
        <%@include file="blocks/footer.jspf" %>  
    </body>
</html>