<%-- 
    Document   : users
    Created on : 19.05.2016, 20:24:53
    Author     : Владимир
--%>

<%@page import="java.util.List"%>
<%@page import="com.segvek.inmovie.entity.User"%>
<%@page contentType="text/html" pageEncoding="windows-1251"%>
<% List<User> users = (List<User>) request.getAttribute("users"); %>
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
                <label for="suser">Поиск пользователя: </label>
                <input value = "" type="text" name="searchUser" id="suser" class="input" size="20" maxlength="50">
                <button name="search_user" type="submit">Поиск</button>
            </p>
        </form>
        <div class="flist">
            <table>
                <tr>
                    <th>Логин</th>
                    <th>Почта</th>
                    <th>Действие</th>
                </tr>
                <% for (User user : users) {%>
                <tr>
                    <td><%=user.getLogin()%></td>
                    <td><%=user.getMail()%></td>
                    <td class="del"><a href="Admin?page=users&operation=del&id=<%=user.getId()%>">del</a></td>
                </tr>
                <%}%>
            </table>
        </div>
    </body>
</html>