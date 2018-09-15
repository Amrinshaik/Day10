<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<%@ include file="home.jsp" %>
<title>Transfer Money</title>

</head>
<body bgcolor="cyan">
<br><br>
<h1>transaction...</h1>
<form action="transferAmount" method="post">
	<br><br>
	<label> From Account: </label>
		<input type="text" value="${customer.account.accountId}" name="fromAcc" readonly/>
		<br> <br>
	<label> To Account: </label>
		<input type="text" name="toAcc" required/>
		<br> <br>
	<label> Amount: </label>
		<input type="number"  name="amount" min=1000 max=50000 required/>
		<br> <br>
		<input type="reset" value="Clear"/>
	<input type="submit" value="Submit"/>
	<br><br>
	</form>
</body>
</html>