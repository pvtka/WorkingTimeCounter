
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/WEB-INF/views/header.jsp" %>
<html>
<head>
    <title>time</title>
    <style><%@include file="/resources/css/select.css"%></style>
</head>
<body>
<table>
    <thead>
    <th>id</th>
    <th>hours</th>
    <th>task</th>
    </thead>
    <tbody>
    <c:forEach items="${time}" var="time">
        <tr>
            <td><c:out value="${time.id}"/></td>
            <td><c:out value="${time.hours}"/></td>
            <td><c:out value="${time.tasks.taskName}"/></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
