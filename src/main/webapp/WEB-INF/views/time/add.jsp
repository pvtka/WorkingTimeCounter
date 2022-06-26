<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/views/header.jsp" %>

<html>
<head>
    <title>Title</title>
    <style><%@include file="/resources/css/select.css"%></style>

</head>
<body>

<p>add time</p>
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


<form:form method="post" modelAttribute="time">
    <div>
        <label for="tasks.id">Select task</label>
        <from:select itemValue="id" itemLabel="taskName" path="tasks.id" items="${tasks}" />
    </div>
         <label for="hours">Hours </label>
        <form:input path="hours" id="hours" type="text"/>
    <div>
        <input type="submit" value="save">
    </div>
</form:form>

</body>
</html>
