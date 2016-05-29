<%-- 
    Document   : edit_film
    Created on : 19.05.2016, 20:30:50
    Author     : Владимир
--%>

<%@page import="java.util.List"%>
<%@page import="com.segvek.inmovie.entity.Film"%>
<%@page contentType="text/html" pageEncoding="windows-1251"%>
<% List<Film> films = (List<Film>)request.getAttribute("films");%>
<!DOCTYPE HTML>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1251"/>
        <link type="text/css" href="css/styleAdmin.css" rel="stylesheet">
        <title>ADMIN</title>
    </head>
    <body>
        <%@include file="blocks/menu.jspf" %>
        <form method="POST" action="Admin?page=users&operation=search">
            <p>
                <label for="suser">Поиск фильма: </label>
                <input value = "" type="text" name="searchUser" id="suser" class="input" size="20" maxlength="50">
                <button name="search_user" type="submit">Поиск</button>
            </p>
        </form>
        <div class="flist">
            <table>
                <tr>
                    <th>Название</th>
                    <th>Год</th>
                    <th colspan="2">Действие</th>
                </tr>
                <% for(Film film:films){ %>
                <tr>
                    <td><%=film.getName()%></td>
                    <td><%=film.getYear()%></td>
                    <td class="del"><a href="Admin?page=editfilm&id=<%=film.getId()%>">edit</a></td>
                    <td class="del"><a href="Admin?page=films&operation=dell&id=<%=film.getId()%>">del</a></td>
                </tr>
                <%}%>
            </table>
        </div>
    </body>
</html>