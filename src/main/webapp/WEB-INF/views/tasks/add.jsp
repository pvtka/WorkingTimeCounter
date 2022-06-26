<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/views/header.jsp" %>

<html>
<head>
    <title>Title</title>
    <style><%@include file="/resources/css/select.css"%></style>
</head>
<body>

<p>add tasks</p>

<form:form method="post" modelAttribute="tasks">
    <div>
        <label for="taskName">Task name</label>
        <form:input path="taskName" id="taskName" type="text"/>
    </div>
    <div>
        <label for="taskDescription">Task description</label>
        <form:input path="taskDescription" id="taskDescription" type="text"/>
    </div>
    <label for="project.id">Select project</label>
    <form:select itemValue="id" itemLabel="projectName" path="project.id"
                 items="${projects}" />





    <div>
        <input type="submit" value="save">
    </div>
</form:form>
</body>
</html>
