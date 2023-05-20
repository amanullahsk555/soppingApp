<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin</title>
</head>
<body>
	<h2>Welcome : ${adminName }</h2>
	<br>
	<a href="addMoreAdminPage?adminId=${adminId}">Add More Admin</a>
	<br>
	<a href="addProduct?adminId=${adminId}">Add Product</a>
	<br>
	<a href="logout">Logout</a>
</body>
</html>