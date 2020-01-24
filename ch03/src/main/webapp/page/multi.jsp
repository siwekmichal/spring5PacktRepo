<%--
  Created by IntelliJ IDEA.
  User: michal.siwek
  Date: 2020-01-22
  Time: 14:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title><spring:message code="multi_facade"/></title>
</head>
<body>
<h1><spring:message code="multi_facade"/></h1>
<a href="${pageContext.request.contextPath}/send/message_get.html">GET Transaction</a>

<form action="${pageContext.request.contextPath}/send/message_post.html" method="post">
    <input type="submit" value="POST Transaction" />
</form>


</body>
</html>
