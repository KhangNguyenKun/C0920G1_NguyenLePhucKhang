<%--
  Created by IntelliJ IDEA.
  User: OS
  Date: 12/21/2020
  Time: 3:17 PM
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
<form action="/customers?action=edit&id=${customer.id}" method="post">
<table class="table table-dark">
    <caption>
        <h2>
            Edit Customer
        </h2>
        <a class="btn btn-outline-primary"  href="/">Home</a>
    </caption>
    <c:if test="${customer != null}">
        <input type="hidden" name="id" value="<c:out value='${customer.id}' />"/>
    </c:if>
    <tbody>
    <tr>
<%--        String id, String type_id, String nameCustomer, String birthday, String genderCustomer,--%>
<%--        String id_card, String phoneCustomer, String emailCustomer, String addressCustomer--%>
        <th>Id:</th>
        <td>
            <input type="text" name="id" size="45"
                   value="<c:out value='${customer.id}' />"
            />
        </td>
    </tr>
    <tr>
        <th>Type of id:</th>
        <td>
            <input type="text" name="type_id" size="45"
                   value="<c:out value='${customer.type_id}' />"
            />
        </td>
    </tr>
    <tr>
        <th>Name :</th>
        <td>
            <input type="text" name="nameCustomer" size="45"
                   value="<c:out value='${customer.nameCustomer}' />"
            />
        </td>
    </tr>
    <tr>
        <th>birthDay :</th>
        <td>
            <input type="date" name="birthday" size="45"
                   value="<c:out value='${customer.birthday}' />"
            />
        </td>
    </tr>
    <tr>
        <th>genderCustomer :</th>
        <td>
            <input type="text" name="genderCustomer" size="45"
                   value="${customer.genderCustomer}"
            />
        </td>
    </tr>
    <tr>
        <th>idCard :</th>
        <td>
            <input type="text" name="id_card" size="45"
                   value="<c:out value='${customer.id_card}' />"
            />
        </td>
    </tr>

    <tr>
        <th>phoneCustomer :</th>
        <td>
            <input type="text" name="phoneCustomer" size="45"
                   value="<c:out value='${customer.phoneCustomer}' />"
            />
        </td>
    </tr>
    <tr>
        <th>emailCustomer :</th>
        <td>
            <input type="text" name="emailCustomer" size="45"
                   value="<c:out value='${customer.emailCustomer}' />"
            />
        </td>
    </tr>
    <tr>
        <th>addressCustomer :</th>
        <td>
            <input type="text" name="addressCustomer" size="45"
                   value="<c:out value='${customer.addressCustomer}' />"
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
