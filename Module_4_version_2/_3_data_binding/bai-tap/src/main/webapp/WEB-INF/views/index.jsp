<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="input" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: OS
  Date: 2/24/2021
  Time: 8:23 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<form:form method="post" action="create" modelAttribute="email">
    <div>
        <label>Languages</label>
        <form:radiobutton path="languages" value="english" label="English"/>
        <form:radiobutton path="languages" value="japanese" label="Japanese"/>
        <form:radiobutton path="languages" value="vietnamese" label="Vietnamese"/>
        <form:radiobutton path="languages" value="chinese" label="Chinese"/>
    </div>
    <label>Page size :</label>
    <div>
        <form:radiobutton path="pageSize" value="5" label="5"/>
        <form:radiobutton path="pageSize" value="10" label="10"/>
        <form:radiobutton path="pageSize" value="15" label="15"/>
        <form:radiobutton path="pageSize" value="25" label="25"/>
    </div>

    <div>
        <label>Spam filter </label>
        <form:radiobutton path="spamFilter" value="Enable spams filter" label="Enable spams filter"/>
    </div>
    <div>
        <form:input path="signature"/>
    </div>
  <input type="submit" value="Submit">
</form:form>

<table>
    <tr>
        <td>Languages :</td>
        <td>${language}</td>
    </tr>
    <tr>
        <td>pageSize :</td>
        <td>${pageSize}</td>
    </tr>
    <tr>
        <td>spamsFilter :</td>
        <td>${spamFilter}</td>
    </tr>
    <tr>
        <td>signature :</td>
        <td>${signature}</td>
    </tr>
</table>
</body>
</html>
