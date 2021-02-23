<%--
  Created by IntelliJ IDEA.
  User: OS
  Date: 2/22/2021
  Time: 4:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/addition" method="get">
    <input type="text" name="a">
    <input type="text" name="b">
    <button value="addition" name="cal" type="submit">Addition</button>
    <button value="subtraction" name="cal" type="submit">subtraction</button>
    <button value="multiplication" name="cal" type="submit">multiplication</button>
    <button value="division" name="cal" type="submit">division</button>

</form>
<h3> ${result}</h3>
<h3> ${message}</h3>
</body>
</html>
