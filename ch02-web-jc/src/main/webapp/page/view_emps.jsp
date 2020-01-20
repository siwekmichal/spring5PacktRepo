<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title><spring:message code="title" /></title>
</head>
<body>
<h1><spring:message code="content_header" arguments="Spring Fanatics,2" /></h1>
<table>
    <c:forEach var="e" items="${ empList }">
        <tr>
            <td><c:out value="${ e.firstName }"/></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>