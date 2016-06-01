<%-- 
    Document   : view_news
    Created on : 19.05.2016, 20:20:25
    Author     : Владимир
--%>

<%@page import="com.segvek.inmovie.entity.News"%>
<%@page contentType="text/html" pageEncoding="windows-1251"%>
<%News news = (News) request.getAttribute("news");
   %>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="blocks/head.jspf" %>
    </head>
    <body>
        <%@include file="blocks/header.jspf" %>
        <div class="acont">
            <div class="ntitle"><%=news.getTitle()%></div>
            <div>
                <img class="nimage" src="<%=news.getPatchImage()%>"/>
            </div>
            <div class="ntext"><%=news.getContent()%></div>
        </div>
        <%@include file="blocks/footer.jspf" %>  
    </body>
</html>
