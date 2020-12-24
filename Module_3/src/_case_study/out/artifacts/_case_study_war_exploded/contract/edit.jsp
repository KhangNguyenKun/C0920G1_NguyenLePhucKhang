<%--
  Created by IntelliJ IDEA.
  User: OS
  Date: 12/21/2020
  Time: 3:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div align="center">
<%--    String contract_id, String contract_start_date, String contract_end_date,--%>
<%--    String contract_deposit, String contract_total_money, String employee_id, String customer_id, String service_id--%>
    <form method="post">
        <div class="form-group">
            <label>ID</label>
            <input type="text" name="id" class="form-control" aria-describedby="emailHelp" id="id"  value="<c:out value='${customer.type_id}' />"
                   placeholder="Enter id">
<%--            <input type="text" name="type_id" size="45"--%>
<%--                   value="<c:out value='${customer.type_id}' />"--%>
<%--            />--%>
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
</body>
</html>
