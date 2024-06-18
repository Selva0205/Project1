<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Contact</title>
</head>
<body bgcolor="#6495ED">
<h1>New Contact</h1>
<form action="savecontact" method="post">
<pre>
<input type="hidden" name="id" value="${lead.id}"/>
First Name :<input type="test" name="firstName" value="${lead.firstName}"/>

last Name  :<input type="test" name="lastName" value="${lead.lastName}"/>

Email Id   :<input type="test" name="emailId" value="${lead.emailId}"/>

Mobile No  :<input type="test" name="mobileNo" value="${lead.mobileNo}"/>

             <input type="submit" value="convert">
                   
</pre>
</form>
</body>
</html>