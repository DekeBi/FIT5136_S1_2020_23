<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: bidek
  Date: 2020/6/3
  Time: 8:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Web App Page</title>
  </head>
  <body>
  <h1>Web App Page</h1>
  <p>Body text. This is my first webapp JSP page.</p>

  <%
    Date date = new Date();
  out.print("<h2>" + date.toString() + "</h2>");
  %>
  </body>
</html>
