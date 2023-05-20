<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin||Login</title>
</head>
<body>
	<h2>Welcome Admin</h2>
	<h3>Please login...</h3>

	<form action="checkLoginData" method="post"> 
		<pre>
			Enter User id: <input type="text" name="loginId">
			Enter Password: <input type="password" name="password"> 
			<input type="submit" value="Login">
		</pre>
		
	</form>
	${msg }

</body>
</html>