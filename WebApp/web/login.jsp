<%--
  Created by IntelliJ IDEA.
  User: bidek
  Date: 2020/6/3
  Time: 8:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <h1>Welcome,please login</h1>
<form action="/WebApp_war_exploded/login" method="post">
    login-name:<input type="text" name="loginname" width="30"/>
    password:<input type="password" name="password" width="20"/>
    <input type="submit" value="Login"/>

</form>

    <form action="/WebApp_war_exploded/signup" method="post">
        <input type="submit" value="Sign Up"/>

    </form>



    <p style="color: red">${errorMessage}</p>
</body>
</html>
