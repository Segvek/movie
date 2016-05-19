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
                        <li><a href="affiche.php">�����</a></li>
                        <li><a href="trailers.php">��������</a></li>
                        <li><a href="news.php">�������</a></li> 
                    </ul>
                </div>
            </div>
            <div class="headbut">
                <input type="text" class="search" placeholder="������...">
                <a href="logreg.php"><input type="button" class="login" value="����"></a>
            </div>
        </div>
        <div class="content">
            <div class="fblock">
                <div class="bhead">������� � ����</div>
                <div class="f1">     
                    <a href="page?operation=film&id=1">
                        <div class="post1"></div>
                        <span class="btext">������ ������</br> ���������</span>
                    </a>
                    <div class="date">24.03.16</div>
                </div>
                <div class="f2">
                    <a href="view_film.php"><div class="post2"></div></a>
                    <a href="view_film.php"><span class="btext">������</span></a>
                    <div class="date">24.03.16</div>
                </div>
                <div class="f3">
                    <a href="view_film.php"> <div class="post3"></div></a>
                    <a href="view_film.php">  <span class="btext">������ ��������: ��������������</span></a>
                    <div class="date">24.03.16</div>
                </div>   
            </div>
        </div>
        <div class="cont2">
            <div class="mnews">
                <div class="nhead">�������</div>
                <div class="nblock">
                    <a href="view_news.php"><div class="nimg"></div></a>
                    <div class="ntext">
                        <a href="view_news.php"><h2>������ �� �������� ������� ������ ����� ���������</h2></a>
                        <p>��������� � ����������� ������������ �������, ����������� ������ ������ ������ ������ �� ������� ������������� �������� ������������� ����� ���������. ��������� �������� �� ������� � �������� ����������� �������� ������ �� ���������� ����� ������ ����� � ����������� ���� ����λ.</p>
                    </div>
                </div>
                <div class="nblock">
                    <a href="view_news.php"><div class="nimg"></div></a>
                    <div class="ntext">
                        <a href="view_news.php"><h2>������ �� �������� ������� ������ ����� ���������</h2></a>
                        <p>��������� � ����������� ������������ �������, ����������� ������ ������ ������ ������ �� ������� ������������� �������� ������������� ����� ���������. ��������� �������� �� ������� � �������� ����������� �������� ������ �� ���������� ����� ������ ����� � ����������� ���� ����λ.</p>
                    </div>
                </div>
            </div>
            <div class="mtrail">
                <div class="nhead">����� ��������</div>
                <div class="mblock">
                    <a href="view_film.php"><div class="mtitle"><h2>����� ���������</h2></div></a>
                    <div class="mvid"><iframe src="https://www.youtube.com/embed/7xLCggrIRHY" frameborder="0" allowfullscreen></iframe></div>
                </div>
                <div class="mblock">
                    <a href="view_film.php"><div class="mtitle"><h2>����� ���������</h2></div></a>
                    <div class="mvid"><iframe src="https://www.youtube.com/embed/7xLCggrIRHY" frameborder="0" allowfullscreen></iframe></div>
                </div>
            </div>
        </div>
        <%@include file="blocks/footer.jspf" %>  
    </body>
</html>
