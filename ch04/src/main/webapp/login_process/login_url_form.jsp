<%--
  Created by IntelliJ IDEA.
  User: michal.siwek
  Date: 2020-02-10
  Time: 14:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html;charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title><spring:message code="afterLogin_title"/></title>
</head>
<body>
<c:if test="${not empty errorMsg }">
    <em><c:out value="${errorMsg}"/></em> <br/>
</c:if>

<h1><spring:message code="afterLogin_title"/></h1>

<form action="/ch04/login_process" method="post">
    <table>
        <tr>
            <td>User:</td>
            <td>
                <input type='text' name='username' value=''>
            </td>
        </tr>
        <tr>
            <td>Password:</td>
            <td>
                <input type='password' name='password'/>
            </td>
        </tr>
        <tr>
            <td colspan='2'>
                <input name="submit" type="submit" value="submit"/>
            </td>
        </tr>
        <tr>
            <td colspan='2'>
                <input name="reset" type="reset"/>
            </td>
        </tr>
    </table>
    </table>
</form>

</body>
</html>
