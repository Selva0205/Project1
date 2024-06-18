<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List All Leads</title>
</head>
<body bgcolor="#7FFFD4">
<h2>List All Leads</h2>
<table>
<tr>
<th>First Name</th>
<th>Last Name</th>
<th>Email Id</th>
<th>Mobile No</th>
</tr>
<c:forEach var="leads" items="${leads}">
<tr>
<td>${leads.firstName}</td>
<td>${leads.lastName}</td>
<td>${leads.emailId}</td>
<td>${leads.mobileNo}</td>

</tr>
</c:forEach>
</table>
</body>
</html>