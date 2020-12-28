<%--
  Created by IntelliJ IDEA.
  User: OS
  Date: 12/18/2020
  Time: 4:23 PM
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
<%--    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"--%>
<%--          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">--%>
    <link rel="stylesheet" href="bootstrap413/css/bootstrap.min.css">
    <link rel="stylesheet" href="datatables/css/dataTables.bootstrap4.min.css">
</head>
<div>
    <a class="btn btn-outline-primary"  href="/">Home</a>
</div>
</br>
</br>
</br>
<%--<form method="get">--%>
<%--    <input name="action" value="search" type="hidden">--%>
<%--    <button type="submit" class="btn btn-primary">Search</button>--%>
<%--    <input type="text" name="nameCustomer">--%>
<%--</form>--%>
<form class="form-inline my-2 my-lg-0">
    <input name="action"  class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
    <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
</form>

<div align="center">
    <%--    String id, String type_id, String nameCustomer, String birthDay,--%>
    <%--    String addressCustomer, String emailCustomer, String idCard, String genderCustomer, String phoneCustomer--%>
    <table border="1" cellpadding="5">
        <caption><h2 class="btn btn-outline-primary" style="align-content: center">List of Customer</h2></caption>
    </table>
    <table class="table table-dark" id="tableEmployee">
        <thead>
        <tr>
            <th>ID</th>
            <th>Type id</th>
            <th>Name</th>
            <th>Birthday</th>
            <th>Gender</th>
            <th>Id Card</th>
            <th>Phone number</th>
            <th>Email</th>
            <th>Address</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="customer" items="${listCustomer}">
            <tr>
<%--                String id, String type_id, String nameCustomer, String birthDay, String genderCustomer,--%>
<%--                String idCard, String phoneCustomer, String emailCustomer, String addressCustomer--%>
                <td><c:out value="${customer.id}"/></td>
                <td><c:out value="${customer.type_id}"/></td>
                <td><c:out value="${customer.nameCustomer}"/></td>
                <td><c:out value="${customer.birthday}"/></td>
                <td><c:out value="${customer.genderCustomer}"/></td>
                <td><c:out value="${customer.id_card}"/></td>
                <td><c:out value="${customer.phoneCustomer}"/></td>
                <td><c:out value="${customer.emailCustomer}"/></td>
                <td><c:out value="${customer.addressCustomer}"/></td>
                <td>
                    <a class="btn btn-outline-primary" href="/customers?action=edit&id=${customer.id}">Edit</a>
                    <a class="btn btn-outline-primary" href="/customers?action=delete&id=${customer.id}">Delete</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
<script src="jquery/jquery-3.5.1.min.js"></script>
<script src="datatables/js/jquery.dataTables.min.js"></script>
<script src="datatables/js/dataTables.bootstrap4.min.js"></script>
<script src="bootstrap413/js/bootstrap.js"></script>
<script src="jquery/popper.min.js"></script>
<%--<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"--%>
<%--        integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"--%>
<%--        crossorigin="anonymous"></script>--%>
<%--<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"--%>
<%--        integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"--%>
<%--        crossorigin="anonymous"></script>--%>
<%--<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"--%>
<%--        integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"--%>
<%--        crossorigin="anonymous"></script>--%>
</body>
<script>
    $(document).ready(function () {
        $('#tableEmployee').dataTable({
            "dom": 'lrtip',
            "lengthChange": false,
            "pageLength": 5
        });
    });
</script>
</html>
