<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/12/2023
  Time: 11:06 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach var="student" items="${sortedStudent}">
    <tr>
        <td>${student.id}</td>
        <td>${student.name}</td>
        <td>${student.age}</td>
        <td>${student.sexes}</td>
        <td>${student.address}</td>
        <td>${student.score}</td>
        <td><a href="/blog?action=edit&id=${student.id}">Edit</a></td>
        <td><a href="/blog?action=delete&id=${student.id}">Delete</a></td>

    </tr>
</c:forEach>

</body>
</html>
