<%--
  Created by IntelliJ IDEA.
  User: michal.siwek
  Date: 2020-02-10
  Time: 14:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title><spring:message code="login_title"/></title>
</head>
<body>
<c:if test="${not empty errorMsg }">
    <em><c:out value="${errorMsg}" /></em> <br />
</c:if>

<h1><spring:message code="login_title"/></h1>

<form action="<c:url value='/login.html' />" method="post">
    <spring:message code="user" /> <input type="text" name="username" /> <br />
    <spring:message code="password" /> <input type="text" name="password" /> <br />
    <input type="submit" value="Login" >
</form>

</body>
</html>
