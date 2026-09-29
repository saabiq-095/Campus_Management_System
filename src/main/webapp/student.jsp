<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <doctype html>
<html>
    <head>
        <meta charset=UTF-8">
        <title>List Of Students</title>
    <meta charset="UTF-8">
    <title>List Of Students</title>
    </head>

<body>
    <h1>Campus Management System</h1>
    <ul>
        <% for (Student student : students) { %>
            <li><%= student %></li>
        <% } %>
    </ul>
    <br>
    <a href="/student.html">Add Student</a>
</body>
</html>