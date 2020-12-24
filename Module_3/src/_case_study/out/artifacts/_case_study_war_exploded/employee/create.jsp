<%--
  Created by IntelliJ IDEA.
  User: OS
  Date: 12/22/2020
  Time: 2:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Employee Application</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<center>
    <h1>Employee Management</h1>
    <h2>
        <a href="/employees">List Employee</a>
    </h2>
</center>
<div align="center">
    <%--    String id, String nameEmployee, String birthDay, String idCard, String salary, String phoneEmployee,--%>
    <%--    String mailEmployee, String addressEmployee, String positionId, String educationDegree, String divisionId, String userNameEmployee)--%>
    <form method="post">
        <div class="form-group">
            <label>ID</label>
            <input type="text" name="id" class="form-control" aria-describedby="emailHelp" id="id"
                   placeholder="Enter id">
            <%--                <small  class="form-text text-muted">We'll never share your email with anyone else.</small>--%>
        </div>
        <div class="form-group">
            <label>Name employee</label>
            <input type="text" name="nameEmployee" class="form-control" aria-describedby="emailHelp" id="nameEmployee"
                   placeholder="Enter Name">
            <%--                <small  class="form-text text-muted">We'll never share your email with anyone else.</small>--%>
        </div>
        <div class="form-group">
            <label>Birthday</label>
            <input type="text" name="birthDay"class="form-control" aria-describedby="emailHelp"  id="birthDay"
                   placeholder="Enter Birthday">
            <%--                <small  class="form-text text-muted">We'll never share your email with anyone else.</small>--%>
        </div>
        <div class="form-group">
            <label>ID card</label>
            <input type="text" name="idCard"class="form-control" aria-describedby="emailHelp"  id="idCard"
                   placeholder="Enter id card">
            <%--                <small  class="form-text text-muted">We'll never share your email with anyone else.</small>--%>
        </div>
        <div class="form-group">
            <label>Salary</label>
            <input type="text" name="salary"class="form-control" aria-describedby="emailHelp"  id="salary"
                   placeholder="Enter Salary">
            <%--                <small  class="form-text text-muted">We'll never share your email with anyone else.</small>--%>
        </div>
        <div class="form-group">
            <label>Phone employee</label>
            <input type="text" name="phoneEmployee" class="form-control" aria-describedby="emailHelp" id="phoneEmployee"
                   placeholder="Enter Phone">
            <%--                <small  class="form-text text-muted">We'll never share your email with anyone else.</small>--%>
        </div>
        <div class="form-group">
            <label>Mail employee</label>
            <input type="text" name="mailEmployee" class="form-control" aria-describedby="emailHelp"  id="mailEmployee"
                   placeholder="Enter Mail">
            <%--                <small  class="form-text text-muted">We'll never share your email with anyone else.</small>--%>
        </div>
        <div class="form-group">
            <label>Address</label>
            <input type="text" name="addressEmployee" class="form-control" aria-describedby="emailHelp" id="addressEmployee"
                   placeholder="Enter Address">
            <%--                <small  class="form-text text-muted">We'll never share your email with anyone else.</small>--%>
        </div>
        <div class="form-group">
            <label>Position id</label>
            <input type="text" name="positionId" class="form-control" id="positionId" aria-describedby="emailHelp"
                   placeholder="Enter Position id">
            <%--                <small  class="form-text text-muted">We'll never share your email with anyone else.</small>--%>
        </div>
        <div class="form-group">
            <label>Education degree</label>
            <input type="text" name="educationDegree" class="form-control" id="educationDegree" aria-describedby="emailHelp"
                   placeholder="Enter Education degree">
            <%--                <small  class="form-text text-muted">We'll never share your email with anyone else.</small>--%>
        </div>
        <div class="form-group">
            <label>Division id</label>
            <input type="text" name="divisionId"  class="form-control" aria-describedby="emailHelp" id="divisionId"
                   placeholder="Enter Division id">
            <%--                <small  class="form-text text-muted">We'll never share your email with anyone else.</small>--%>
        </div>
        <div class="form-group">
            <label>Username Employee</label>
            <input type="text" name="userNameEmployee" class="form-control" aria-describedby="emailHelp"  id="userNameEmployee"
                   placeholder="Enter Username">
            <%--                <small  class="form-text text-muted">We'll never share your email with anyone else.</small>--%>
        </div>
<%--        <div class="form-group">--%>
<%--            <label>Password</label>--%>
<%--            <input type="userNameEmployee" class="form-control" id="userNameEmployee" placeholder="Password">--%>
<%--        </div>--%>
<%--        <div class="form-group form-check">--%>
<%--            <input type="checkbox" class="form-check-input" id="exampleCheck1">--%>
<%--            <label class="form-check-label" for="exampleCheck1">Check me out</label>--%>
<%--        </div>--%>
        <button type="submit" class="btn btn-primary">Submit</button>
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
