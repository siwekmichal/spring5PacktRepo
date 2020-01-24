<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title><spring:message code="welcome_title" /></title>
</head>
<body>
<ul>
    <li><a href="${pageContext.request.contextPath}/simplecontroller.html">Simple Controller</a></li>
    <li><a href="${pageContext.request.contextPath}/simple/patterns.html">Patterns</a></li>
    <li><a href="${pageContext.request.contextPath}/employee_form.html">Employee form</a></li>
    <li><a href="${pageContext.request.contextPath}/send/multilist.html"><spring:message code="multi_facade" /></a></li>
    <li><a href="${pageContext.request.contextPath}/send/multilistx.html"><spring:message code="multi_facade" /> - blank</a></li>
    <li></li>
    <li></li>
    <li></li>
    <li></li>
</ul>


</body>
</html>