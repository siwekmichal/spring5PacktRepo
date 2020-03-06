<%--
  Created by IntelliJ IDEA.
  User: michal.siwek
  Date: 2020-03-06
  Time: 16:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html><head>
    <meta http-equiv="Content-Type" content="text/html;charset=ISO-8859-1">
    <title>Anonymous</title>
</head>
<body>
<h1>Anonymous Account</h1>
<p>This content is for our beloved guest wants to check
    our DEPARTMENT database. Enjoy!
    <em><a href="<c:url value='/login.html'/>">You want some more
        about us? Login!.</a></em>
</body>
</html>