<%--
  Created by IntelliJ IDEA.
  User: OS
  Date: 12/28/2020
  Time: 9:20 PM
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
<form action="/patterns?action=edit&id=${pattern.id}" method="post">
    <table class="table table-dark">
        <caption>
            <h2>
                Edit Pattern
            </h2>
            <a href="/">Home</a>
        </caption>
        <c:if test="${pattern != null}">
            <input type="hidden" name="id" value="<c:out value='${pattern.id}' />"/>
        </c:if>
        <tbody>
        <tr>
<%--            String id, String maBenhAn, String maBenhNhan,--%>
<%--            String tenBenhNhan, String ngayNhapVien, String ngayRaVien, String lyDoNhapVien--%>
            <th>Id:</th>
            <td>
                <input type="text" name="id" size="45"
                       value="<c:out value='${pattern.id}' />"
                />
            </td>
        </tr>
        <tr>
            <th>maBenhAn:</th>
            <td>
                <input type="text" name="maBenhAn" size="45"
                       value="<c:out value='${pattern.maBenhAn}' />"
                />
            </td>
        </tr>>
        </tr>
        <tr>
            <th>maBenhNhan :</th>
            <td>
                <input type="text" name="maBenhNhan" size="45"
                       value="<c:out value='${pattern.maBenhNhan}' />"
                />
            </td>
        </tr>
        <tr>
            <th>tenBenhNhan :</th>
            <td>
                <input type="text" name="tenBenhNhan" size="45"
                       value="<c:out value=' ${pattern.tenBenhNhan}'/>"
                />
            </td>
        </tr>
        <tr>
            <th>ngayNhapVien :</th>
            <td>
                <input type="text" name="ngayNhapVien" size="45"
                       value="<c:out value='${pattern.ngayNhapVien}' />"
                />
            </td>
        </tr>
        <tr>
            <th>ngayRaVien :</th>
            <td>
                <input type="text" name="ngayRaVien" size="45"
                       value="<c:out value='${pattern.ngayRaVien}' />"
                />
            </td>
        </tr>
        <tr>
            <th>lyDoNhapVien :</th>
            <td>
                <input type="text" name="lyDoNhapVien" size="45"
                       value="<c:out value='${pattern.lyDoNhapVien}' />"
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
