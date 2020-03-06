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
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title><spring:message code="dept_list"/></title>
</head>
<body>
<h1><spring:message code="dept_list"/></h1>
<table border="1">
    <tr>
        <th>Dept Id</th>
        <th>Dept Name</th>
    </tr>
    <c:forEach var="dept" items="${ departments }">
        <tr>
            <td>${dept.deptId}</td>
            <td>${dept.name}</td>
            <c:url var="delUrl" value="/deldept.html/${dept.deptId}" />
            <td><a href="<c:out value='${ delUrl }'/>">DELETE</a></td>
            <c:url var="updateUrl" value="/updatedept.html/${dept.id}" />
            <td><a href="<c:out value='${ updateUrl }'/>">UPDATE</a></td>
        </tr>
    </c:forEach>
</table>

<br />
<a href="<c:url value='/deptform.html'/>">Add More Department</a>
<br/>
<em>This is for CSRF Logout</em>
<c:url var="logoutUrl" value="/logout.html"/>
<form action="${logoutUrl}" method="post">
    <input type="submit" value="Log out" />
    <input type="hidden" name="${_csrf.parameterName}" 	value="${_csrf.token}"/>
</form>
</body>
</html>
