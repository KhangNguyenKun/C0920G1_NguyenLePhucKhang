<%--
  Created by IntelliJ IDEA.
  User: OS
  Date: 1/5/2021
  Time: 9:36 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/dictionary" method="get">
    <input type="text" name="english">English
    <input type="submit" value="submit" > Translate
</form>
<h3>Meaning: ${meaning}</h3>
</body>
</html>
