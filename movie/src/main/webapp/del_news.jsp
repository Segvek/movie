<%-- 
    Document   : del_news
    Created on : 19.05.2016, 20:35:58
    Author     : ��������
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

        <div class="header"><a href="index.php">ADMINKA</a></div>
        <div class="content">
            <ul class="menu">
                <li><a href="users.php">������������</a></li>
                <li><a href="add_film.php">�������� �����</a>
                    <ul class="hidden">
                        <li><a href="edit_film.php">�������������</a></li>
                        <li><a href="del_film.php">�������</a></li>
                    </ul></li>
                <li><a href="add_news.php">�������� �������</a>
                    <ul class="hidden1">
                        <li><a href="edit_news.php">�������������</a></li>
                        <li><a href="del_news.php">�������</a></li>
                    </ul></li>
            </ul>
        </div>
    </body>
</html>
