<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Registration Page</title>
<style>
.error {
	color: #ff0000;
	font-style: italic;
}
</style>
</head>
<body>
	<center>
		<h2>Add Customer Details</h2>
		<form:form modelAttribute="customerObj" action="saveCustomer.html"
			method="POST">
			<table border="2">
				<tr>
					<th>Customer UserName</th>
					<td><form:input path="username" /></td>
				</tr>
				<tr>
					<th>Customer Password</th>
					<td><form:input path="password" /></td>
				</tr>
				<tr>
					<th>Customer Name</th>
					<td><form:input path="name" /></td>
				</tr>
				<tr>
					<th>Customer Address</th>
					<td><form:input path="address" /></td>
				</tr>
				
			</table>

			<input type="submit" value="Register">
		</form:form>

		<h4>${message}</h4>
		<a href="index.jsp">Home</a>
	</center>
</body>
</html>