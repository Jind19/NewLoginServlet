<html>
<head>
    <title> Login </title>
</head>
<body>

<h2>Login Below</h2>
<p><font color="red">${errorMessage}</font></p>
<form action="/login" method="POST">
    Name     : <input type="text" name="userName"></br></br>
    Password : <input type="password" name="userPass"></br></br>
    <input type="submit" value="login"></br>

</form>

</body>
</html>
