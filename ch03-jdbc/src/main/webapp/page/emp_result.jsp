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
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title><spring:message code="emp_list"/></title>
</head>
<body>
<h1><spring:message code="emp_list"/></h1>

<table>
    <tr>
        <th><spring:message code="emp_id" /></th>
        <th><spring:message code="emp_fname" /></th>
        <th><spring:message code="emp_lname" /></th>
        <th><spring:message code="emp_age" /></th>
        <th><spring:message code="emp_email" /></th>
        <th><spring:message code="emp_bday" /></th>
        <th><spring:message code="dept_id" /></th>

    </tr>
    <c:forEach var="emp" items="${ employees }">
        <tr>
            <td>${emp.empId}</td>
            <td>${emp.firstName}</td>
            <td>${emp.lastName}</td>
            <td>${emp.age}</td>
            <td>${emp.email}</td>
            <td>${emp.birthday}</td>
            <td>${emp.deptId}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
