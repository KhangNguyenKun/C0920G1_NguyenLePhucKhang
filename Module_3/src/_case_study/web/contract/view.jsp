<%--
  Created by IntelliJ IDEA.
  User: OS
  Date: 12/21/2020
  Time: 3:17 PM
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
    <a href="/contract?action=create" role="button" class="btn btn-primary">Create</a>
    <a href="/" role="button" class="btn btn-outline-primary">Home</a>

</div>
<div align="center">
    <%--    String id, String type_id, String nameCustomer, String birthDay,--%>
    <%--    String addressCustomer, String emailCustomer, String idCard, String genderCustomer, String phoneCustomer--%>
    <table border="1" cellpadding="5">
        <caption><h2 style="align-content: center">List of Contract</h2></caption>
    </table>
    <form class="form-inline my-2 my-lg-0">
        <input name="action"  class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
        <button name="name" class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
    </form>
    <table class="table table-dark">
        <thead>
        <tr>
<%--            //    String contract_id, String contract_start_date, String contract_end_date,--%>
<%--            //    String contract_deposit, String contract_total_money, String employee_id, String customer_id, String service_id--%>
            <th>ID</th>
            <th>Contract start date</th>
            <th>Contract end day</th>
            <th>Contract deposit</th>
            <th>Contract total money</th>
            <th>Employee id</th>
            <th>Customer id</th>
            <th>Service id</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="contract" items="${listContract}">
            <tr>
                    <%--            //    String contract_id, String contract_start_date, String contract_end_date,--%>
                    <%--            //    String contract_deposit, String contract_total_money, String employee_id, String customer_id, String service_id--%>
                <td><c:out value="${contract.contract_id}"/></td>
                <td><c:out value="${contract.contract_start_date}"/></td>
                <td><c:out value="${contract.contract_end_date}"/></td>
                <td><c:out value="${contract.contract_deposit}"/></td>
                <td><c:out value="${contract.contract_total_money}"/></td>
                <td><c:out value="${contract.employee_id}"/></td>
                <td><c:out value="${contract.customer_id}"/></td>
                <td><c:out value="${contract.service_id}"/></td>
                <td>
                    <a class="btn btn-outline-primary" href="/contract?action=edit&id=${contract.contract_id}">Edit</a>
                    <a class="btn btn-outline-primary" href="/contract?action=delete&id=${contract.contract_id}">Delete</a>
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
