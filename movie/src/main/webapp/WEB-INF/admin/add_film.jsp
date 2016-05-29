<%-- 
    Document   : add_film
    Created on : 19.05.2016, 20:29:06
    Author     : Владимир
--%>

<%@page contentType="text/html" pageEncoding="utf-8"%>
<%@page import="com.segvek.inmovie.entity.Janr"%>
<%@page import="java.util.List"%>
<!DOCTYPE HTML>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1251"/>
        <link type="text/css" href="css/styleAdmin.css" rel="stylesheet">
        <title>ADMIN</title>
    </head>
    <body>
        <%@include file="blocks/menu.jspf" %>
        <form method="POST" action="Admin?page=films&operation=add">
            <p><label for="name">Введите название фильма:</label></p>
            <p><input type="text" name="name" class="input" size="50" maxlength="50" required></p>

            <p><label for="year">Введите год:</label></p>
            <p><input type="text" name="year" class="input" size="10" maxlength="4" required></p>

            <p><label for="county">Введите страну:</label></p>
            <p><input type="text" name="county" class="input" size="50" maxlength="100" required></p>

            <p><label for="regeser">Введите режисеров:</label></p>
            <p><input type="text" name="regeser" class="input" size="50" maxlength="255" required></p>

            <p><label for="schenarist">Введите сценаристов:</label></p>
            <p><input type="text" name="schenarist" class="input" size="50" maxlength="255" required></p>

            <p><label for="producer">Введите продюсеров:</label></p>
            <p><input type="text" name="producer" class="input" size="50" maxlength="255" required></p>

            <p><label for="kompositor">Введите композиторов:</label></p>
            <p><input type="text" name="kompositor" class="input" size="50" maxlength="255" required></p>

            <p><label for="janr">Введите жанр:</label></p>
            <p><select multiple="multiple" name="janr" required> 
                    <%for (Janr janr : (List<Janr>) request.getAttribute("janrs")) {%>
                    <option value="<%=janr.getId()%>"><%=janr.getName()%></option>
                    <%}%>
                </select></p>

            <p><label for="budget">Введите бюджет:</label></p>
            <p><input type="text" name="budget" class="input" size="30" required></p>

            <p><label for="sbory">Введите сборы:</label></p>
            <p><input type="text" name="sbory" class="input" size="30" maxlength="50" required></p>

            <p><label for="premera">Введите дату премьеры:</label></p>
            <p><input type="text" name="premera" class="input" size="10" maxlength="20" required></p>

            <p><label for="time">Введите длительность фильма:</label></p>
            <p><input type="text" name="time" class="input" size="10" maxlength="10" required></p>

            <p><label for="atRore">Введите список актеров:</label></p>
            <p><textarea name="atRore" cols="40" rows="5" required></textarea></p>

            <p><label for="anotation">Введите описание фильма:</label></p>
            <p><textarea name="anotation" cols="80" rows="15" id="description" required></textarea></p>

            <p><label for="linkVideo">Введите ссылку на трейлер:</label></p>
            <p><input type="text" name="linkVideo" class="input" size="40" required></p>

            <p><label for="patchImage">Выберите файл постера:</label></p>
            <p><input type="test" name="patchImage" class="input" size="40" required></p>


            <p><button name="add_film" type="submit">Добавить</button>
                <button name="reset" type="reset">Сбросить</button>
            </p>


        </form>
    </body>
</html>
