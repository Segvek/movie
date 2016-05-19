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
    </head>
    <body>
        <%@include file="blocks/header.jspf" %>
        <div class="acontlog">
            <div class="loginf">
                <form>

                    <p><label for="login">Введите логин:</label></p>
                    <p><input value = "" type="text" name="login" id="login" class="input" size="30" maxlength="50"></p>

                    <p><label for="pass">Введите пароль:</label></p>
                    <p><input value = "" type="password" name="pass" id="pass" class="input" size="30" maxlength="30"></p>

                    <p><button name="logbut" type="submit" class="logregbut">Войти</button></p>

                </form>
            </div>
            <div class="regf">
                <form>

                    <p><label for="login">Введите логин:</label></p>
                    <p><input value = "" type="text" name="login" id="login" class="input" size="30" maxlength="50"></p>

                    <p><label for="email">Введите email:</label></p>
                    <p><input value = "" type="text" name="email" id="email" class="input" size="30" maxlength="50"></p>

                    <p><label for="pass">Введите пароль:</label></p>
                    <p><input value = "" type="password" name="pass" id="pass" class="input" size="30" maxlength="30"></p>

                    <p><label for="passr">Повтор пароля:</label></p>
                    <p><input value = "" type="password" name="passr" id="passr" class="input" size="30" maxlength="30"></p>


                    <p><button name="logbut" type="submit" class="logregbut">Зарегистрироваться</button></p>

                </form>

            </div>
        </div>
        <%@include file="blocks/footer.jspf" %>  
    </body>
</html>
