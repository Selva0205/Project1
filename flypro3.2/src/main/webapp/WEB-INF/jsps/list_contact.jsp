<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List All Contact</title>
</head>
<body bgcolor="#7FFFD4">
<h2>List All Contact</h2>
<table>
<tr>
<th>First Name</th>
<th>Last Name</th>
<th>Email Id</th>
<th>Mobile No</th>
</tr>
<s:forEach var="contacts" items="${contacts}">
<tr>
<td>${contacts.firstName}</td>
<td>${contacts.lastName}</td>
<td>${contacts.emailId}</td>
<td>${contacts.mobileNo}</td>
</tr>
</s:forEach>
</table>
</body>
</html>