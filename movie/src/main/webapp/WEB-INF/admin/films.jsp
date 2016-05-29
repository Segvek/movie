<%-- 
    Document   : edit_film
    Created on : 19.05.2016, 20:30:50
    Author     : ��������
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
                <label for="suser">����� ������: </label>
                <input value = "" type="text" name="searchUser" id="suser" class="input" size="20" maxlength="50">
                <button name="search_user" type="submit">�����</button>
            </p>
        </form>
        <div class="flist">
            <table>
                <tr>
                    <th>��������</th>
                    <th>���</th>
                    <th colspan="2">��������</th>
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