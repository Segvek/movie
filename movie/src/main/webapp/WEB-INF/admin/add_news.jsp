<%-- 
    Document   : add_news
    Created on : 19.05.2016, 20:34:07
    Author     : Владимир
--%>

<%@page contentType="text/html" pageEncoding="windows-1251"%>
<!DOCTYPE HTML>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1251"/>
        <link type="text/css" href="css/styleAdmin.css" rel="stylesheet">
        <title>ADMIN</title>
    </head>
    <body>
        <%@include file="blocks/menu.jspf" %>
        <form>

            <p><label for="title">Введите название новости:</label></p>
            <p><input type="text" name="title" class="input" size="50" maxlength="50"></p>

            <p><label for="content">Введите текст новости:</label></p>
            <p><textarea name="content" cols="80" rows="15" id="text"></textarea></p>

            <p><label for="patchImage">Выберите файл картинки:</label></p>
            <p><input type="file" name="patchImage" class="input"></p>

            <p><button name="add_film" type="submit">Добавить</button></p>

        </form>
    </body>
</html>
