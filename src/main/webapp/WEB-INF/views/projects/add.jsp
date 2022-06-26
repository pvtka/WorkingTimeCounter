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

<p>add projects</p>

<form:form method="post" modelAttribute="projects">
    <div>
        <label for="projectName">Project name</label>
        <form:input path="projectName" id="projectName" type="text"/>
    </div>
    <div>
        <label for="projectDescription">Project description</label>
        <form:input path="projectDescription" id="projectDescription" type="text"/>
    </div>
    <div>
        <input type="submit" value="save">
    </div>
</form:form>
</body>
</html>
