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
  <p><label for="name">Введите название фильма:</label></p>
  <p><input value = "" type="text" name="name" id="name" class="input" size="50" maxlength="50"></p>
  
  <p><label for="year">Введите год:</label></p>
  <p><input value = "" type="text" name="year" id="year" class="input" size="10" maxlength="4"></p>
  
  <p><label for="country">Введите страну:</label></p>
  <p><input value = "" type="text" name="country" id="country" class="input" size="50" maxlength="20"></p>
  
  <p><label for="director">Введите режисеров:</label></p>
  <p><input value = "" type="text" name="director" id="director" class="input" size="50" maxlength="255"></p>
  
  <p><label for="scenario">Введите сценаристов:</label></p>
  <p><input value = "" type="text" name="scenario" id="scenario" class="input" size="50" maxlength="255"></p>
  
  <p><label for="producer">Введите продюсеров:</label></p>
  <p><input value = "" type="text" name="producer" id="producer" class="input" size="50" maxlength="255"></p>
  
  <p><label for="composer">Введите композиторов:</label></p>
  <p><input value = "" type="text" name="composer" id="composer" class="input" size="50" maxlength="255"></p>
  
  <p><label for="genre">Введите жанр:</label></p>
  <p><input value = "" type="text" name="genre" id="genre" class="input" size="50" maxlength="255"></p>
  
  <p><label for="dues">Введите сборы:</label></p>
  <p><input value = "" type="text" name="dues" id="dues" class="input" size="30" maxlength="50"></p>
  
  <p><label for="premiere">Введите дату премьеры:</label></p>
  <p><input value = "" type="text" name="premiere" id="premiere" class="input" size="10" maxlength="10"></p>
  
  <p><label for="duration">Введите длительность фильма:</label></p>
  <p><input value = "" type="text" name="duration" id="duration" class="input" size="10" maxlength="10"></p>
  
  <p><label for="description">Введите описание фильма:</label></p>
  <p><textarea name="description" cols="80" rows="15" id="description"></textarea></p>
  
  <p><label for="link">Введите ссылку на трейлер:</label></p>
  <p><input value = "" type="text" name="link" id="link" class="input" size="40"></p>
  
  <p><label for="image">Выберите файл постера:</label></p>
  <p><input value = "" type="file" name="image" id="image" class="input"></p>
  
  
  <p><button name="add_film" type="submit">Добавить</button></p>
  
  
</form>
<div class="footer"></div>

</body>
</html>