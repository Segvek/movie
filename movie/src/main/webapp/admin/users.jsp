<%-- 
    Document   : users
    Created on : 19.05.2016, 20:24:53
    Author     : Владимир
--%>

<%@page contentType="text/html" pageEncoding="windows-1251"%>
<!DOCTYPE HTML>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1251"/>
        <link type="text/css" href="css/style.css" rel="stylesheet">
        <title>ADMIN</title>
    </head>
    <body>

        <%@include file="blocks/menu.jspf" %>
        <form>
            <p><label for="suser">Поиск пользователя: </label><input value = "" type="text" name="suser" id="suser" class="input" size="20" maxlength="50">

                <button name="search_user" type="submit">Поиск</button></p>
            <div class="flist">
                <table>
                    <tr>
                        <td>id</td>
                        <td>login</td>
                        <td class="del"><a href="">del</a></td>
                    </tr>
                    <tr>
                        <td>id</td>
                        <td>login</td>
                        <td class="del"><a href="">del</a></td>
                    </tr>
                    <tr>
                        <td>id</td>
                        <td>login</td>
                        <td class="del"><a href="">del</a></td>
                    </tr>
                </table>
            </div>
        </form>
    </body>
</html>