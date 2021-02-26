<%--
  Created by IntelliJ IDEA.
  User: OS
  Date: 2/23/2021
  Time: 11:15 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="/save" method="get">
    <input type="checkbox" value="Lettuce" name="condiment"> Lettuce
    <input type="checkbox" value="Tomato"  name="condiment"> Tomato
    <input type="checkbox" value="Mustard" name="condiment"> Mustard
    <input type="checkbox" value="Sprouts" name="condiment">  Sprouts
    <button type="submit">Submit</button>
  </form>

  </body>
</html>
