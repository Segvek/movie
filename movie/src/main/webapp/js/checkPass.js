function checkPass() {
    if (document.getElementById('pass').value != document.getElementById('passr').value) {
        var reg = document.getElementById('regalert');
        reg.innerHTML = "Пароли не совпадают";
        reg.setAttribute("style", "display:block");
        return false;
    } else
        return true;
}