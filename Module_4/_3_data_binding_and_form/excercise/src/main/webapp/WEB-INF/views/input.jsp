<%--
  Created by IntelliJ IDEA.
  User: OS
  Date: 1/5/2021
  Time: 3:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form action="/show" method="post" modelAttribute="box">

    <div>
        <label>languages:</label>
            <%--        English, Vietnamese, Japanese, Chinese--%>
        <form:radiobutton path="languages" value="English" label="English"/>
        <form:radiobutton path="languages" value="Vietnamese" label="Vietnamese"/>
        <form:radiobutton path="languages" value="Japanese" label="Japanese"/>
        <form:radiobutton path="languages" value="Chinese" label="Chinese"/>
    </div>
    <div>
        <div>
            <label>languages:</label>
                <%--         5, 10, 15, 25, 50, 100--%>
            <form:radiobutton path="pageSize" value="5" label="5"/>
            <form:radiobutton path="pageSize" value="10" label="10"/>
            <form:radiobutton path="pageSize" value="15" label="15"/>
            <form:radiobutton path="pageSize" value="25" label="25"/>
            <form:radiobutton path="pageSize" value="50" label="50"/>
            <form:radiobutton path="pageSize" value="100" label="100"/>
        </div>
    </div>
    <div>
        <label>spamsFilter:</label>
            <%--        English, Vietnamese, Japanese, Chinese--%>
        <form:radiobutton path="spamsFilter" value="Enable spams filter" label="Enable spams filter"/>
    </div>
    <div>
        <label>signature:</label>
        <form:input type="text" path="signature"  />
    </div>
    <input type="submit" value="create">

</form:form>
</body>
</html>
