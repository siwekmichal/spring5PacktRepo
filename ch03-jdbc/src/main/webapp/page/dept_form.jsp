<%--
  Created by IntelliJ IDEA.
  User: michal.siwek
  Date: 2020-02-04
  Time: 14:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title><spring:message code="dept_title"/></title>
</head>
<body>
    <h1><spring:message code="dept_title"/></h1>
    <form:form modelAttribute="departmentForm" method="post">
        <spring:message code="dept_id" /><form:input path="deptId" /><br />
        <spring:message code="dept_name" /><form:input path="name" /> <br />
        <input type="submit" value="Add Department">
    </form:form>
</body>
</html>
