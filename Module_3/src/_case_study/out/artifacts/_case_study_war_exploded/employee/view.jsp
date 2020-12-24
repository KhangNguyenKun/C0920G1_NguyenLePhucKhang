<%--
  Created by IntelliJ IDEA.
  User: OS
  Date: 12/22/2020
  Time: 2:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Layout</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<div>
    <a href="/employees?action=create" role="button" class="btn btn-primary">Create</a>
    <form method="get">
        <input name="action" value="search" type="hidden">
        <input type="text" name="name">
    </form>
</div>
<div align="center">
    <%--    String id, String type_id, String nameCustomer, String birthDay,--%>
    <%--    String addressCustomer, String emailCustomer, String idCard, String genderCustomer, String phoneCustomer--%>
    <table border="1" cellpadding="5">
        <caption><h2 style="align-content: center">List of Customer</h2></caption>

    </table>
    <table class="table table-dark">
        <thead>
        <tr>
            <%--    String id, String nameEmployee, String birthDay, String idCard, String salary, String phoneEmployee,--%>
            <%--    String mailEmployee, String addressEmployee, String positionId, String educationDegree, String divisionId, String userNameEmployee)--%>
            <th>ID</th>
            <th>Name employee</th>
            <th>Birthday</th>
            <th>Id card</th>
            <th>Salary</th>
            <th>Phone number</th>
            <th>Email employee</th>
            <th>Address employee</th>
            <th>Position Id</th>
            <th>Education degree</th>
            <th>Division Id</th>
            <th>User name employee</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="employee" items="${listEmployee}">
            <tr>
                    <%--    String id, String nameEmployee, String birthDay, String idCard, String salary, String phoneEmployee,--%>
                    <%--    String mailEmployee, String addressEmployee, String positionId, String educationDegree, String divisionId, String userNameEmployee)--%>
                <td><c:out value="${employee.id}"/></td>
                <td><c:out value="${employee.nameEmployee}"/></td>
                <td><c:out value="${employee.birthDay}"/></td>
                <td><c:out value="${employee.idCard}"/></td>
                <td><c:out value="${employee.salary}"/></td>
                <td><c:out value="${employee.phoneEmployee}"/></td>
                <td><c:out value="${employee.mailEmployee}"/></td>
                <td><c:out value="${employee.addressEmployee}"/></td>
                <td><c:out value="${employee.positionId}"/></td>
                <td><c:out value="${employee.educationDegree}"/></td>
                <td><c:out value="${employee.divisionId}"/></td>
                <td><c:out value="${employee.userNameEmployee}"/></td>
                <td>
                    <a href="/employees?action=edit&id=${employee.id}">Edit</a>
                    <a href="/employees?action=delete&id=${employee.id}">Delete</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
        integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
        integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
        crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
        integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
        crossorigin="anonymous"></script>
</body>
</html>