<%-- 
    Document   : logreg
    Created on : 19.05.2016, 20:21:48
    Author     : Владимир
--%>

<%@page contentType="text/html" pageEncoding="windows-1251"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="blocks/head.jspf" %>
        <script type="text/javascript" src="js/checkPass.js"></script>
        
    </head>
    <body>
        <%@include file="blocks/header.jspf" %>
        <div class="acontlog">
            <div class="loginf">
                <div class="logalert" style="display: none">Неправильный логин или пароль!</div>
                <form  method="POST" action="EntryPointerServlet?operation=autorization">
                    <p><label for="login">Введите логин:</label></p>
                    <p><input type="text" name="login" id="login" class="input" size="30" maxlength="50" required></p>

                    <p><label for="pass">Введите пароль:</label></p>
                    <p><input type="password" name="pass" id="pass" class="input" size="30" maxlength="30" required></p>

                    <p><button name="logbut" type="submit" class="logregbut">Войти</button></p>
                </form>
            </div>
            <div class="regf">
                <div class="regalert" style="display: none" id="regalert">Пользователь с данным e-mail уже существует!</div>
                              <form method="POST" action="EntryPointerServlet?operation=registrationUser" onsubmit="return checkPass();">
                    <p><label for="login">Введите логин:</label></p>
                    <p><input type="text" name="login" id="login" class="input" size="30" maxlength="50" required></p>

                    <p><label for="email">Введите email:</label></p>
                    <p><input type="email" name="email" id="email" class="input" size="30" maxlength="50" required></p>

                    <p><label for="pass">Введите пароль:</label></p>
                    <p><input type="password" name="pass" id="pass" class="input" size="30" maxlength="30" required></p>

                    <p><label for="passr">Повтор пароля:</label></p>
                    <p><input type="password" name="passr" id="passr" class="input" size="30" maxlength="30" required></p>
                    <p><button name="logbut" type="submit" class="logregbut">Зарегистрироваться</button></p>
                </form>

            </div>
        </div>
        <%@include file="blocks/footer.jspf" %>  
    </body>
</html>
