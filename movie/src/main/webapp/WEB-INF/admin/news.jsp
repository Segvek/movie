<%-- 
    Document   : edit_news
    Created on : 19.05.2016, 20:35:12
    Author     : Владимир
--%>

<%@page import="com.segvek.inmovie.entity.News"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="windows-1251"%>
<% List<News> news = (List<News>) request.getAttribute("news");%>
<!DOCTYPE HTML>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1251"/>
        <link type="text/css" href="css/styleAdmin.css" rel="stylesheet">
        <title>ADMIN</title>
    </head>
    <body>
        <%@include file="blocks/menu.jspf" %>
        <div class="flist">
            <table>
                <tr>
                    <th>Название</th>
                    <th colspan="2">Действие</th>
                </tr>
                <% for(News onenews:news) {%>
                <tr>
                    <td><%=onenews.getTitle()%></td>
                    <td class="del"><a href="Admin?page=editnews&id=<%=onenews.getId()%>">edit</a></td>
                    <td class="del"><a href="Admin?page=news&operation=dell&id=<%=onenews.getId()%>">del</a></td>
                </tr><%}%>
            </table>
        </div>
    </body>
</html>
