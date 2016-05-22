<%-- 
    Document   : view_film.jsp
    Created on : 19.05.2016, 3:02:50
    Author     : Panas
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
            <div class="ftitle">Книга Джунглей</div>
            <div class="film"> 
                <div class="fpost"></div>
                <div class="addto">Добавить в Watchlist</div>
                <div class="finfo">
                    <table cols="2">
                        <tr>
                            <td>год:</td>
                            <td>2016</td>
                        </tr>
                        <tr>
                            <td>страна:</td>
                            <td>США</td>
                        </tr>
                        <tr>
                            <td>режисер:</td>
                            <td>Джон Фавро</td>
                        </tr>
                        <tr>
                            <td>сценарий:</td>
                            <td>Джастин Маркс, Редьярд Киплинг</td>
                        </tr>
                        <tr>
                            <td>продюсер:</td>
                            <td>Джон Фавро, Бригхэм Тейлор, Молли Аллен</td>
                        </tr>
                        <tr>
                            <td>композитор:</td>
                            <td>Джон Дебни</td>
                        </tr>
                        <tr>
                            <td>жанр:</td>
                            <td>фэнтези, драма, приключения</td>
                        </tr>
                        <tr>
                            <td>бюджет:</td>
                            <td>$175 000 000</td>
                        </tr>
                        <tr>
                            <td>сборы:</td>
                            <td>$393 754 426</td>
                        </tr>
                        <tr>
                            <td>премьера:</td>
                            <td>4 апреля 2016</td>
                        </tr>
                        <tr>
                            <td>время:</td>
                            <td>105 мин./01:45</td>
                        </tr>
                    </table>
                </div>
                <div class="froles">В главных ролях:
                    <p>Нил Сетхи</br>
                        Билл Мюррей</br>
                        Бен Кингсли</br>
                        Идрис Эльба</br>
                        Лупита Нионго</br>
                        Скарлетт Йоханссон</br>
                        Джанкарло Эспозито</br>
                        Кристофер Уокен</br>
                        Гарри Шендлинг</br>
                        Брайтон Роуз</p></div>
            </div>
            <div class="textline">Описание</div>
            <div class="ftext"><p>Непримиримая борьба с опасным и внушающим страх тигром Шерханом вынуждает Маугли покинуть волчью стаю и отправиться в захватывающее путешествие. На пути мальчика ждут удивительные открытия и запоминающиеся встречи с пантерой Багирой, медведем Балу, питоном Каа и другими обитателями дремучих джунглей.</p></div>
            <div class="textline">Трейлер</div>
            <div class="ftrail"><iframe src="https://www.youtube.com/embed/IyJMXh8JscA" frameborder="0" allowfullscreen></iframe></div>
            <div class="textline">Комментарии к фильму</div>
            <div class="fcomment"></div>
        </div>
        <%@include file="blocks/footer.jspf" %>
    </body>
</html>
