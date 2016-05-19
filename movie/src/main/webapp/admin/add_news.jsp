<%-- 
    Document   : add_news
    Created on : 19.05.2016, 20:34:07
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
        <form>

            <p><label for="title">������� �������� �������:</label></p>
            <p><input type="text" name="title" class="input" size="50" maxlength="50"></p>

            <p><label for="content">������� ����� �������:</label></p>
            <p><textarea name="content" cols="80" rows="15" id="text"></textarea></p>

            <p><label for="patchImage">�������� ���� ��������:</label></p>
            <p><input type="file" name="patchImage" class="input"></p>

            <p><button name="add_film" type="submit">��������</button></p>

        </form>
    </body>
</html>
