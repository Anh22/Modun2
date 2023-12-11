<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/12/2023
  Time: 10:18 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit</title>
</head>
<body>
<h1>Edit</h1>
<form method="post">
    <input type="number" name="id" value="${svCanSua.id}">
    <input type="text" name="name" value="${svCanSua.name}">
    <input type="number" name="age" value="${svCanSua.age}">
    <input type="text" name="sexes" value="${svCanSua.sexes}">
    <input type="text" name="address" value="${svCanSua.address}">
    <input type="number" name="score"value="${svCanSua.score}">
    <button>Edit</button>



</form>


</body>
</html>
