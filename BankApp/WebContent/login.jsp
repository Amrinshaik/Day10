<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<%@ include file="header.jsp" %>
</head>
<body bgcolor="cyan" style="text-align:center" >
	<h1>Login to your account</h1>
	<hr>
<form action="login" method="post">
	<br><br><br>
		<label> Email: </label> 
		<input type="email" name="email" placeholder="enter your Email ID" required /> 
		<br> <br>
		<label> Password: </label> 
		<input type="password" name="password" size="10" placeholder="enter password"required /> 
		<br> <br>
	<input type="submit" value="Login"/>
		<br> <br>
</form>
</body>
</html>