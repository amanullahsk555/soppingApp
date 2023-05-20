<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add New Admin</title>
</head>
<body>
	<a href="addProduct?adminId=${adminId}">Add Product</a>
	<a href="logout">Logout</a>
	<br>
	<h2>Add Data for new Admin</h2>
	<br>
	<form action="addThisAdmin" method="post">
		<pre>
			Name: <input type="text" name="name">
			Mobile: <input type="text" name="mobile">
			Email: <input type="text" name="email">
			login Id(optional): <input type="text" name="loginId">
			password: <input type="text" name="password">
			<input type="hidden" name="referBy" value="${adminId}">
			<input type="submit" name="Add">
		</pre>
	</form>
	${msg }

</body>
</html>