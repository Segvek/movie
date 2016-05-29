<%-- 
    Document   : add_news
    Created on : 19.05.2016, 20:34:07
    Author     : Владимир
--%>

<%@page contentType="text/html" pageEncoding="utf-8"%>
<!DOCTYPE HTML>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1251"/>
        <link type="text/css" href="css/styleAdmin.css" rel="stylesheet">
        <title>ADMIN</title>
    </head>
    <body>
        <%@include file="blocks/menu.jspf" %>
        <form method="POST" action="Admin?page=news&operation=add">

            <p><label for="title">Введите название новости:</label></p>
            <p><input type="text" name="title" class="input" size="50" maxlength="255" required></p>

            <p><label for="content">Введите текст новости:</label></p>
            <p><textarea name="content" cols="80" rows="15" id="text" required></textarea></p>

            <p><label for="patchImage">Выберите файл картинки:</label></p>
            <p><input type="text" name="patchImage" class="input" size="50" required></p>

            <p><button name="add_news" type="submit">Добавить</button>
                <button name="reset" type="reset">Сбросить</button>
            </p>

        </form>
    </body>
</html>
