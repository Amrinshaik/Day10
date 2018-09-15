<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Profile</title>
</head>
<%@ include file="loginheader.jsp" %>
<body bgcolor="cyan">
<form action="editProfile" method="post">
<label>Customer Id: </label>
<input type="text" value="${customer.customerId}" name="customerId"readonly/>
<br><br>
<label>Customer Name: </label>
<input type="text" name="customerName" size="15" required/>
<br><br>
<label>Email </label>
<input type="email" name="email" size="15" required/>
<br><br>
<label>Password</label>
<input type="password" name="password" placeholder="...." readonly/>
<br><br>
<label>Address </label>
<input type="text" name="address" required/>
<label>Date Of Birth </label>
<input type="date" name="dateOfBirth" required/>
<input type="submit" value="Update"/>
<br><br>
</form>
</body>
</html>