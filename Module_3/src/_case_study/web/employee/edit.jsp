<%--
  Created by IntelliJ IDEA.
  User: OS
  Date: 12/22/2020
  Time: 2:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<form action="/employees?action=edit&id=${employee.id}" method="post">
    <table class="table table-dark">
        <caption>
            <h2>
                Edit Employee
            </h2>
            <a href="/">Home</a>
        </caption>
        <c:if test="${employee != null}">
            <input type="hidden" name="id" value="<c:out value='${employee.id}' />"/>
        </c:if>
        <tbody>
        <tr>
<%--            //  String id, String nameEmployee, String birthDay, String idCard, String salary, String phoneEmployee,--%>
<%--            //   String mailEmployee, String addressEmployee, String positionId, String educationDegree, String divisionId, String userNameEmployee--%>
            <th>Id:</th>
            <td>
                <input type="text" name="id" size="45"
                       value="<c:out value='${employee.id}' />"
                />
            </td>
        </tr>
        <tr>
            <th>Name employee:</th>
            <td>
                <input type="text" name="nameEmployee" size="45"
                       value="<c:out value='${employee.nameEmployee}' />"
                />
            </td>
        </tr>>
        </tr>
        <tr>
            <th>birthDay :</th>
            <td>
                <input type="date" name="birthDay" size="45"
                       value="<c:out value='${employee.birthDay}' />"
                />
            </td>
        </tr>
        <tr>
            <th>idCard :</th>
            <td>
                <input type="text" name="idCard" size="45"
                       value="<c:out value=' ${employee.idCard}'/>"
                />
            </td>
        </tr>
        <tr>
            <th>salary :</th>
            <td>
                <input type="text" name="salary" size="45"
                       value="<c:out value='${employee.salary}' />"
                />
            </td>
        </tr>
        <tr>
            <th>phoneEmployee :</th>
            <td>
                <input type="text" name="phoneEmployee" size="45"
                       value="<c:out value='${employee.phoneEmployee}' />"
                />
            </td>
        </tr>
        <tr>
            <th>mailEmployee :</th>
            <td>
                <input type="text" name="mailEmployee" size="45"
                       value="<c:out value='${employee.mailEmployee}' />"
                />
            </td>
        </tr>
        <%--            //  String id, String nameEmployee, String birthDay, String idCard, String salary, String phoneEmployee,--%>
        <%--            //   String mailEmployee, String addressEmployee, String positionId, String educationDegree, String divisionId, String userNameEmployee--%>
        <tr>
            <th>addressEmployee :</th>
            <td>
                <input type="text" name="addressEmployee" size="45"
                       value="<c:out value='${employee.addressEmployee}' />"
                />
            </td>
        </tr>
        <tr>
            <th>positionId :</th>
            <td>
                <input type="text" name="positionId" size="45"
                       value="<c:out value='${employee.positionId}' />"
                />
            </td>
        </tr>
        <tr>
            <th>educationDegree :</th>
            <td>
                <input type="text" name="educationDegree" size="45"
                       value="<c:out value='${employee.educationDegree}' />"
                />
            </td>
        </tr>
        <tr>
            <th>divisionId :</th>
            <td>
                <input type="text" name="divisionId" size="45"
                       value="<c:out value='${employee.divisionId}' />"
                />
            </td>
        </tr>
        <tr>
            <th>userNameEmployee :</th>
            <td>
                <input type="text" name="userNameEmployee" size="45"
                       value="<c:out value='${employee.userNameEmployee}' />"
                />
            </td>
        </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" class="btn btn-primary" value="Save"/>
                </td>
            </tr>
        </tbody>
    </table>
</form>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>
