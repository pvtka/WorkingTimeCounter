
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/WEB-INF/views/header.jsp" %>
<html>
<head>
    <title>all tasks</title>
    <style><%@include file="/resources/css/select.css"%></style>
</head>
<body>
<table>
    <thead>
    <th>id</th>
    <th>name</th>
    <th>description</th>
    <th>projects</th>
    </thead>
    <tbody>
    <c:forEach items="${tasks}" var="tasks">
        <tr>
            <td><c:out value="${tasks.id}"/></td>
            <td><c:out value="${tasks.taskName}"/></td>
            <td><c:out value="${tasks.taskDescription}"/></td>
            <td><c:out value="${tasks.project.projectName}"/></td>

        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
