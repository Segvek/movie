<%-- 
    Document   : add_film
    Created on : 19.05.2016, 20:29:06
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

        <%@include file="blocks/menu.jspf" %>
        <form>
            <p><label for="name">������� �������� ������:</label></p>
            <p><input type="text" name="name" class="input" size="50" maxlength="50"></p>

            <p><label for="year">������� ���:</label></p>
            <p><input type="text" name="year" class="input" size="10" maxlength="4"></p>

            <p><label for="county">������� ������:</label></p>
            <p><input type="text" name="county" class="input" size="50" maxlength="20"></p>

            <p><label for="regeser">������� ���������:</label></p>
            <p><input type="text" name="regeser" class="input" size="50" maxlength="255"></p>

            <p><label for="schenarist">������� �����������:</label></p>
            <p><input type="text" name="schenarist" class="input" size="50" maxlength="255"></p>

            <p><label for="producer">������� ����������:</label></p>
            <p><input type="text" name="producer" class="input" size="50" maxlength="255"></p>

            <p><label for="kompositor">������� ������������:</label></p>
            <p><input type="text" name="kompositor" class="input" size="50" maxlength="255"></p>

            <p><label for="janr">������� ����:</label></p>
            <p><select multiple="multiple" name="janr"> 
                    <option>�������</option>
                    <option>�����</option>
                    <option>�����</option>
                    <option>����������</option>
                    <option>�����������</option>
                    <option>�������</option>
                </select></p>

            <p><label for="sbory">������� �����:</label></p>
            <p><input type="text" name="sbory" class="input" size="30" maxlength="50"></p>

            <p><label for="premera">������� ���� ��������:</label></p>
            <p><input type="text" name="premera" class="input" size="10" maxlength="10"></p>

            <p><label for="time">������� ������������ ������:</label></p>
            <p><input type="text" name="time" class="input" size="10" maxlength="10"></p>

            <p><label for="atRore">������� ������ �������:</label></p>
            <p><textarea name="atRore" cols="40" rows="5"></textarea></p>

            <p><label for="anotation">������� �������� ������:</label></p>
            <p><textarea name="anotation" cols="80" rows="15" id="description"></textarea></p>

            <p><label for="linkVideo">������� ������ �� �������:</label></p>
            <p><input type="text" name="linkVideo" class="input" size="40"></p>

            <p><label for="patchImage">�������� ���� �������:</label></p>
            <p><input type="file" name="patchImage" class="input"></p>


            <p><button name="add_film" type="submit">��������</button></p>

        </form>
    </body>
</html>
