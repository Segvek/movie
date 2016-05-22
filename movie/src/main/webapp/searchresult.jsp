<%-- 
    Document   : searchresult
    Created on : 23.05.2016, 1:12:02
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
           <div class="acont">
            <div class="phead">Результаты поиска</div>
            <div class="pfilm">
                <a href="view_film.php"><div class="ppost"></div></a>
                <div class="ptext"><a href="view_film.php"><h2>Книга джунглей</h2></a>
                    <p>2016, США, 105 мин</p>
                    <p>режисер: Джон Фавро</p>
                    <p>фэнтези, драма, приключения</p>
                </div>
                <div class="prate">рейтинг</div>
                <div class="pdate"><p>14</br>апреля</p></div>
            </div>
        </div>
        <%@include file="blocks/footer.jspf" %>  
    </body>
</html>
