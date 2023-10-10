<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Form Page</title>
</head>
<body>
    <form:form method="GET" action="add">
        <label for="username">Username:</label>
        <form:input type="text" path="username" /><br>

        <label for="password">Password:</label>
        <form:input type="password" path="password" /><br>

        <input type="submit" value="Submit" /><br>
    </form:form>
</body>
</html>