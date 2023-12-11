<%@ page import="com.example.managerstudent.Model.Student" %><%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/12/2023
  Time: 9:37 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>StudentList</h1>
<a href="/student?action=create" >AddList</a><br>
<a href="/student?action=sort" >SortLike</a><br>
<table border="1" class="table table-dark">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Age</th>
        <th>Sex</th>
        <th>Address</th>
        <th>Score</th>
    </tr>
    <c:forEach var="student" items="${list}">
        <tr>
            <td>${student.id}</td>
            <td>${student.name}</td>
            <td>${student.age}</td>
            <td>${student.sexes}</td>
            <td>${student.address}</td>
            <td>${student.score}</td>
            <td><a href="/student?action=update&id=${student.id}">Edit</a></td>
            <td><a href="/student?action=delete&id=${student.id}">Delete</a></td>

        </tr>
    </c:forEach>
</table>



</body>
</html>
