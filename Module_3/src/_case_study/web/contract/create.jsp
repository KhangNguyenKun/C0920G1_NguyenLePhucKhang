<%--
  Created by IntelliJ IDEA.
  User: OS
  Date: 12/24/2020
  Time: 2:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Contract Management Application</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<center>
    <h1>Contract Management</h1>
    <h2>
        <a href="/contract" class="btn btn-primary">List contract</a>
    </h2>
</center>
<div>
    <form method="get">
        <input name="action" value="search" type="hidden">
        <input type="text" name="name">
    </form>
</div>
<div align="center">
    <form method="post" action="/contract?action=create">
        <table class="table table-dark">
            <caption>
                <h2>Add New Contract</h2>
            </caption>
            <tbody>
<%--            //    String contract_id, String contract_start_date, String contract_end_date,--%>
<%--            //    String contract_deposit, String contract_total_money, String employee_id, String customer_id, String service_id--%>
            <tr>
                <th>Contract Id:</th>
                <td>
                    <input type="text" name="contract_id" id="contract_id" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Contract start date:</th>
                <td>
                    <input type="date" name="contract_start_date" id="contract_start_date" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Contract end date:</th>
                <td>
                    <input type="date" name="contract_end_date" id="contract_end_date" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Deposit:</th>
                <td>
                    <input type="text" name="contract_deposit" id="contract_deposit" size="15"/>
                </td>
            </tr>
            <tr>
                <th>Contract total money:</th>
                <td>
                    <input type="text" name="contract_total_money" id="contract_total_money" size="15"/>
                </td>
            </tr>
            <tr>
                <th>Employee id:</th>
                <td>
                    <input type="text" name="employee_id" id="employee_id" size="15"/>
                </td>
            </tr>

            <tr>
                <th>Customer id:</th>
                <td>
                    <input type="text" name="customer_id" id="customer_id" size="15"/>
                </td>
            </tr>
            <tr>
                <th>Service id:</th>
                <td>
                    <input type="text" name="service_id" id="service_id" size="15"/>
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
