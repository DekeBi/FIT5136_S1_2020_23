<%--
  Created by IntelliJ IDEA.
  User: bidek
  Date: 2020/6/3
  Time: 21:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Congratulations</title>

</head>
<body>
    <p>Congratulations, you have registered successfully!</p>
    <p>Please click 'Back' to the login page</p>

    <form action="/WebApp_war_exploded/goback" method="post">
        <input type="submit" value="Back"/>

    </form>
</body>
</html>
