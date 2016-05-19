<%-- 
    Document   : index
    Created on : 19.05.2016, 1:00:30
    Author     : Panas
--%>

<%@page contentType="text/html" pageEncoding="windows-1251"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="blocks/head.jspf" %>
    </head>
    <body>
        <div class="header">
            <div class="headmain">
                <span class="main"><a href="index.php">INMovie</a></span>
                <div class="menu">
                    <ul>
                        <li><a href="affiche.php">Афиша</a></li>
                        <li><a href="trailers.php">Трейлеры</a></li>
                        <li><a href="news.php">Новости</a></li> 
                    </ul>
                </div>
            </div>
            <div class="headbut">
                <input type="text" class="search" placeholder="Искать...">
                <a href="logreg.php"><input type="button" class="login" value="Вход"></a>
            </div>
        </div>
        <div class="content">
            <div class="fblock">
                <div class="bhead">Сегодня в кино</div>
                <div class="f1">     
                    <a href="page?operation=film&id=1">
                        <div class="post1"></div>
                        <span class="btext">Бэтмен против</br> Супермена</span>
                    </a>
                    <div class="date">24.03.16</div>
                </div>
                <div class="f2">
                    <a href="view_film.php"><div class="post2"></div></a>
                    <a href="view_film.php"><span class="btext">Дедпул</span></a>
                    <div class="date">24.03.16</div>
                </div>
                <div class="f3">
                    <a href="view_film.php"> <div class="post3"></div></a>
                    <a href="view_film.php">  <span class="btext">Первый мститель: Противостояние</span></a>
                    <div class="date">24.03.16</div>
                </div>   
            </div>
        </div>
        <div class="cont2">
            <div class="mnews">
                <div class="nhead">Новости</div>
                <div class="nblock">
                    <a href="view_news.php"><div class="nimg"></div></a>
                    <div class="ntext">
                        <a href="view_news.php"><h2>Билеты на премьеру шестого сезона «Игры престолов»</h2></a>
                        <p>КиноПоиск и «Амедиатека» представляют конкурс, посвященный старту нового сезона одного из главных телевизионных проектов современности «Игра престолов». Правильно ответьте на вопросы и получите возможность выиграть билеты на премьерный показ первой серии в кинотеатрах сети «КАРО».</p>
                    </div>
                </div>
                <div class="nblock">
                    <a href="view_news.php"><div class="nimg"></div></a>
                    <div class="ntext">
                        <a href="view_news.php"><h2>Билеты на премьеру шестого сезона «Игры престолов»</h2></a>
                        <p>КиноПоиск и «Амедиатека» представляют конкурс, посвященный старту нового сезона одного из главных телевизионных проектов современности «Игра престолов». Правильно ответьте на вопросы и получите возможность выиграть билеты на премьерный показ первой серии в кинотеатрах сети «КАРО».</p>
                    </div>
                </div>
            </div>
            <div class="mtrail">
                <div class="nhead">Новые трейлеры</div>
                <div class="mblock">
                    <a href="view_film.php"><div class="mtitle"><h2>Отряд самоубийц</h2></div></a>
                    <div class="mvid"><iframe src="https://www.youtube.com/embed/7xLCggrIRHY" frameborder="0" allowfullscreen></iframe></div>
                </div>
                <div class="mblock">
                    <a href="view_film.php"><div class="mtitle"><h2>Отряд самоубийц</h2></div></a>
                    <div class="mvid"><iframe src="https://www.youtube.com/embed/7xLCggrIRHY" frameborder="0" allowfullscreen></iframe></div>
                </div>
            </div>
        </div>
        <%@include file="blocks/footer.jspf" %>  
    </body>
</html>
