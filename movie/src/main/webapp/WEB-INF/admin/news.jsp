<%-- 
    Document   : edit_news
    Created on : 19.05.2016, 20:35:12
    Author     : ��������
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
        <div class="flist">
            <table>
                <tr>
                    <th>��������</th>
                    <th colspan="2">��������</th>
                </tr>
                <tr>
                    <td>name</td>
                    <td class="del"><a href="">edit</a></td>
                    <td class="del"><a href="">del</a></td>
                </tr>
            </table>
        </div>
    </body>
</html>
