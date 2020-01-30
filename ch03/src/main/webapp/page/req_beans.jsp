<%--
  Created by IntelliJ IDEA.
  User: michal.siwek
  Date: 2020-01-27
  Time: 09:24
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
    <title>Request bean view</title>
</head>
<body>
    <h1>Request Object Created: ${ salaryGrade.instantiatedDate }</h1>
    <h1>Object Id: ${ salGradeId }</h1>

    <table>
        <tr>
            <th>Grade Level</th>
            <th>Grade Rate</th>
        </tr>
        <tr>
            <td>${ salaryGrade.grade }</td>
            <td>${ salaryGrade.rate }</td>
        </tr>
    </table>

    <br />
    <h1>Session Object Created: ${education.instantiatedDate} </h1>
    <h1>Object Id: ${ educationId }</h1>
    <table>
        <tr>
            <th>Course</th>
            <th>Major</th>
            <th>University/College</th>
        </tr>
        <tr>
            <td>${ education.degree }</td>
            <td>${ education.major }</td>
            <td>${ education.institution }</td>
        </tr>
    </table>
</body>
</html>
