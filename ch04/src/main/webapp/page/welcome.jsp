<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title><spring:message code="welcome_title" /></title>
</head>
<body>
<em>This is for CSRF Logout</em>
<c:url var="logoutUrl" value="/logout.html"/>
<form action="${logoutUrl}" method="post">
    <input type="submit" value="Log out" />
    <input type="hidden" name="${_csrf.parameterName}" 	value="${_csrf.token}"/>
</form>

<ul>
    <li><a href="${pageContext.request.contextPath}/deptform.html">Department Form</a></li>
    <li></li>
    <li></li>
    <li></li>
</ul>


</body>
</html>