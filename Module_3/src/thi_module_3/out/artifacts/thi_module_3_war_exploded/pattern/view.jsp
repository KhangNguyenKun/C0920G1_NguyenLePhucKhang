<%--
  Created by IntelliJ IDEA.
  User: OS
  Date: 12/28/2020
  Time: 9:20 PM
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
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
            integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
            crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
            integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
            crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
            integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
            crossorigin="anonymous"></script>
</head>
<body>
<div>
    <a href="/patterns?action=create" role="button" class="btn btn-primary">Create</a>
    <a href="/" role="button" class="btn btn-outline-primary">Home</a>

</div>
<div align="center">
    <%--    String id, String type_id, String nameCustomer, String birthDay,--%>
    <%--    String addressCustomer, String emailCustomer, String idCard, String genderCustomer, String phoneCustomer--%>
    <table border="1" cellpadding="5">
        <caption><h2 style="align-content: center">List of Customer</h2></caption>

    </table>
    <%--        <form method="get">--%>
    <%--            <input name="action" value="search" type="hidden">--%>
    <%--            <input type="text" name="name">--%>
    <%--        </form>--%>
    <form class="form-inline my-2 my-lg-0">
        <input name="action"  class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
        <button name="name" class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
    </form>
    <table class="table table-dark">
        <thead>
        <tr>
<%--            String id, String maBenhAn, String maBenhNhan,--%>
<%--            String tenBenhNhan, String ngayNhapVien, String ngayRaVien, String lyDoNhapVien--%>
            <th>ID</th>
            <th>Name </th>
            <th>maBenhNhan</th>
            <th>tenBenhNhan card</th>
            <th>ngayNhapVien</th>
            <th>ngayRaVien</th>
            <th>lyDoNhapVien</th>

        </tr>
        </thead>
        <tbody>
        <c:forEach var="pattern" items="${listPattern}">
            <tr>

                <td><c:out value="${pattern.id}"/></td>
                <td><c:out value="${pattern.maBenhAn}"/></td>
                <td><c:out value="${pattern.maBenhNhan}"/></td>
                <td><c:out value="${pattern.tenBenhNhan}"/></td>
                <td><c:out value="${pattern.ngayNhapVien}"/></td>
                <td><c:out value="${pattern.ngayRaVien}"/></td>
                <td><c:out value="${pattern.lyDoNhapVien}"/></td>
                <td>
                    <a class="btn btn-outline-primary" href="/patterns?action=edit&id=${pattern.id}">Edit</a>
                    <a class="btn btn-outline-primary" href="/patterns?action=delete&id=${pattern.id}">Delete</a>
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
<script>
    $(function(){
        var myImage = document.querySelector('img');
        myImage.onclick = function() {
            var mySrc = myImage.getAttribute('src');
            if(mySrc === 'http://static.tumblr.com/1bd1b615e6da70dd71dc84fd2f47c80d/zpmncfu/oxNng9hfv/tumblr_static_95p88l86si88ks4w4wws04wk8.png') {
                myImage.setAttribute ('src','https://cdn-insomniac.s3.amazonaws.com/emoji_sexface.png');
            } else {
                myImage.setAttribute ('src','http://static.tumblr.com/1bd1b615e6da70dd71dc84fd2f47c80d/zpmncfu/oxNng9hfv/tumblr_static_95p88l86si88ks4w4wws04wk8.png');
            }
        };
    });
</script>
</body>
</html>
