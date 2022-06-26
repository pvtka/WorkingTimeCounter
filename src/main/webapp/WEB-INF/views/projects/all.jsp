
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/WEB-INF/views/header.jsp" %>
<html>
<head>
    <title>all projects</title>
    <style><%@include file="/resources/css/select.css"%></style>
</head>
<body>
<table>
    <thead>
    <tr>id</tr>
    <tr>name</tr>
    <tr>description</tr>
    </thead>
    <tbody>
    <c:forEach items="${projects}" var="projects">
        <tr>
            <td><c:out value="${projects.id}"/></td>
            <td><c:out value="${projects.projectName}"/></td>
            <td><c:out value="${projects.projectDescription}"/></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
