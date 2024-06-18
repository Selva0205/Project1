<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bill</title>
</head>
<body bgcolor="#00FFFF">
<h1>Bill</h1>
<form action="savebill" method="post">
<pre>
<input type="hidden" name="id" value="${contact.id}"/>
First Name :<input type="test" name="firstName" value="${contact.firstName}"/>

last Name  :<input type="test" name="lastName" value="${contact.lastName}"/>

Email Id   :<input type="test" name="emailId" value="${contact.emailId}"/>

Mobile No  :<input type="test" name="mobileNo" value="${contact.mobileNo}"/>

Quantity   :<input type="number" name="qty"/>

Price      :<input type="number" name="price"/>

Prod Name  :<input type="text" name="pName"/>

             <input type="submit" value="Bill">

</pre>
</form>
</body>
</html>