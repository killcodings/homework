<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sign in</title>
</head>
<body>
<p>Sign in</p>
<br>
<form method="POST" action="user/home">
    <p>Phone number: <input name="phoneNumber" required></p>
    <p>Password: <input type="password" name="password" required></p>
    <p><input type="submit" value="Submit"></p>
</form>
</body>
</html>
