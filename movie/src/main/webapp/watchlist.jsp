<%-- 
    Document   : watchlist
    Created on : 19.05.2016, 20:40:47
    Author     : ��������
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
            <div class="phead">Watchlist</div>
             <div class="pfilm">
                <a href="view_film.php"><div class="ppost"></div></a>
                <div class="ptext"><a href="view_film.php"><h2>����� ��������</h2></a>
                    <p>2016, ���, 105 ���</p>
                    <p>�������: ���� �����</p>
                    <p>�������, �����, �����������</p>
                </div>
                
                <div class="delbutton">������ �� Watchlist</div>
            </div>
        </div>
        <%@include file="blocks/footer.jspf" %>  
    </body>
</html>