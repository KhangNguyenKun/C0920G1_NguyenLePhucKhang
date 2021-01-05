<%--
  Created by IntelliJ IDEA.
  User: OS
  Date: 1/4/2021
  Time: 9:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/save" method="get">
    <input type="text" name="number1">Input number 1
    <input type="text" name="number2">Input number 2
    <br>
<button type="submit" value="+" name="calculation">Addition</button>
<button type="submit" value="-" name="calculation">Subtraction</button>
<button type="submit" value="*" name="calculation">Multiplication</button>
<button type="submit" value="/" name="calculation">Division</button>
</form>
<h2>${firstNumber} ${calculation} ${secondNumber} = ${result}</h2>
<h2 style="color: red">${message}</h2>
</body>
</html>
