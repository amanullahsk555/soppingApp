<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add A New Product</title>
</head>
<body>
	<a href="addMoreAdminPage?adminId=${adminId}">Add More Admin</a>
	<br>
	<a href="logout">Logout</a>
	<h2>Add Product Details</h2>
	<br>
	<form action="saveProduct">
		<pre>
			Product Id (Optional):<input type="text" name="productId">
			Product Name:<input type="text" name="productName">
			Price (Rs.):<input type="text" name="price">
			Available Qty:<input type="text" name="productQty">
			Counter Number:<input type="text" name="counterNumber">
			<input type="text" name="addedBy" value=${adminId }>
			<input type="submit" value="Add">
		</pre>
	</form>
	${msg }

</body>
</html>