<!DOCTYPE HTML>
<html>
     <head>
           <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
           <link type="text/css" href="css/style.css" rel="stylesheet">
           <title>ADMIN</title>
     </head>
<body>

<div class="header"><a href="index.php">ADMINKA</a></div>
<div class="content">
<ul class="menu">
  <li><a href="users.php">Пользователи</a></li>
  <li><a href="add_film.php">Добавить фильм</a>
     <ul class="hidden">
        <li><a href="edit_film.php">Редактировать</a></li>
        <li><a href="del_film.php">Удалить</a></li>
     </ul></li>
  <li><a href="add_news.php">Добавить новость</a>
  <ul class="hidden1">
        <li><a href="edit_news.php">Редактировать</a></li>
        <li><a href="del_news.php">Удалить</a></li>
     </ul></li>
</ul>
</div>
<form>
  
  <p><label for="name">Введите название новости:</label></p>
  <p><input value = "" type="text" name="name" id="name" class="input" size="50" maxlength="50"></p>
  
  <p><label for="text">Введите текст новости:</label></p>
  <p><textarea name="text" cols="80" rows="15" id="text"></textarea></p>
  
  <p><label for="image">Выберите файл картинки:</label></p>
  <p><input value = "" type="file" name="image" id="image" class="input"></p>
  
  <p><button name="add_film" type="submit">Добавить</button></p>
 
</form>

</body>
</html>