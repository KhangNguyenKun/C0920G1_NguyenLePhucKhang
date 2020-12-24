<%--
  Created by IntelliJ IDEA.
  User: OS
  Date: 12/22/2020
  Time: 10:11 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>User Management Application</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<center>
    <h1>Customer Management</h1>
    <h2>
        <a href="/customers" class="btn btn-primary">List customer</a>
    </h2>
</center>
<div>
    <form method="get">
        <input name="action" value="search" type="hidden">
        <input type="text" name="name">
    </form>
</div>
<div align="center">
    <%--    String id, String type_id, String nameCustomer, String birthDay,--%>
    <%--    String addressCustomer, String emailCustomer, String idCard, String genderCustomer, String phoneCustomer--%>
    <form method="post" >
        <table class="table table-dark">
            <caption>
                <h2>Add New Customer</h2>
            </caption>
            <tbody>
            <tr>
                <th> Id:</th>
                <td>
                    <input type="text" name="id" id="id" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Type id:</th>
                <td>
                    <input type="text" name="type_id" id="type_id" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Name customer:</th>
                <td>
                    <input type="text" name="nameCustomer" id="nameCustomer" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Your date of birth:</th>
                <td>
                    <input type="date" name="birthday" id="birthDay" size="15"/>
                </td>
            </tr>
            <tr>
                <th>Your gender:</th>
<%--                <td>--%>
<%--                    <input type="text" name="genderCustomer" id="genderCustomer" size="15"/>--%>
<%--                </td>--%>
                <td>
                <select class="btn btn-secondary dropdown-toggle">
                    <option value="0">Male</option>
                    <option value="1">Female</option>
                </select>
                </td>

            </tr>
            <tr>
                <th>ID card:</th>
                <td>
                    <input type="text" name="id_card" id="idCard" size="15"/>
                </td>
            </tr>

            <tr>
                <th>Phone number:</th>
                <td>
                    <input type="text" name="phoneCustomer" id="phoneCustomer" size="15"/>
                </td>
            </tr>
            <tr>
                <th>Email:</th>
                <td>
                    <input type="text" name="emailCustomer" id="emailCustomer" size="15"/>
                </td>
            </tr>
            <tr>
                <th>Address:</th>
                <td>
                    <input type="text" name="addressCustomer" id="addressCustomer" size="15"/>
                </td>
            </tr>


            <tr>
                <td colspan="2" align="center">
                    <input class="btn btn-primary" type="submit" value="Save"/>
                </td>
            </tr>
            </tbody>
        </table>
    </form>
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
