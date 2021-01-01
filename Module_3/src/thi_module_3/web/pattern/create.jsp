Created by IntelliJ IDEA.
User: OS
Date: 12/28/2020
Time: 9:20 PM
To change this template use File | Settings | File Templates.


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
        <a href="/patterns" class="btn btn-primary">List pattern</a>
    </h2>
</center>
<div>
    <form method="get">
        <input name="action" value="search" type="hidden">
        <input type="text" name="name">
    </form>
</div>
<div align="center">
    <form method="post" action="/patterns?action=create">
        <table class="table table-dark">
            <caption>
                <h2>Add New Pattern</h2>
            </caption>
            <tbody>
            <%--            String id, String maBenhAn, String maBenhNhan,--%>
            <%--            String tenBenhNhan, String ngayNhapVien, String ngayRaVien, String lyDoNhapVien--%>
            <tr>
                <th>Contract Id:</th>
                <td>
                    <input type="text" name="id" id="id" size="45"/>
                </td>
            </tr>
            <tr>
                <th>maBenhAn:</th>
                <td>
                    <input type="text" name="maBenhAn" id="maBenhAn" size="45"/>
                </td>
            </tr>
            <tr>
                <th>maBenhNhan:</th>
                <td>
                    <input type="text" name="maBenhNhan" id="maBenhNhan" size="45"/>
                </td>
            </tr>
            <tr>
                <th>tenBenhNhan:</th>
                <td>
                    <input type="text" name="tenBenhNhan" id="tenBenhNhan" size="15"/>
                </td>
            </tr>
            <tr>
                <th>ngayNhapVien:</th>
                <td>
                    <input type="date" name="ngayNhapVien" id="ngayNhapVien" size="15"/>
                </td>
            </tr>
            <tr>
                <th>ngayRaVien:</th>
                <td>
                    <input type="date" name="ngayRaVien" id="ngayRaVien" size="15"/>
                </td>
            </tr>

            <tr>
                <th>lyDoNhapVien:</th>
                <td>
                    <input type="text" name="lyDoNhapVien" id="lyDoNhapVien" size="15"/>
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