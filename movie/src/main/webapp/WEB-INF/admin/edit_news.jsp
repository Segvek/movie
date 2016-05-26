<%-- 
    Document   : add_news
    Created on : 19.05.2016, 20:34:07
    Author     : Владимир
--%>


<%@page import="com.segvek.inmovie.entity.News"%>
<%@page contentType="text/html" pageEncoding="utf-8"%>
<% News news = (News) request.getAttribute("news");%>
<!DOCTYPE HTML>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1251"/>
        <link type="text/css" href="css/styleAdmin.css" rel="stylesheet">
        <title>ADMIN</title>
    </head>
    <body>
        <%@include file="blocks/menu.jspf" %>
        <form method="POST" action="Admin?page=news&operation=edit&id=<%=news.getId()%>">

            <p><label for="title">Введите название новости:</label></p>
            <p><input type="text" name="title" class="input" size="50" maxlength="50" value="<%=news.getTitle()%>"></p>

            <p><label for="content">Введите текст новости:</label></p>
            <p><textarea name="content" cols="80" rows="15" id="text"><%=news.getContent()%></textarea></p>

            <p><label for="patchImage">Выберите файл картинки:</label></p>
            <p><input type="text" name="patchImage" class="input" value="<%=news.getPatchImage()%>"></p>

            <p><button name="add_film" type="submit">Добавить</button></p>

        </form>
    </body>
</html>
