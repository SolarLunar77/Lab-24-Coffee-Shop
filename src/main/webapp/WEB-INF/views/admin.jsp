<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Item Admin</title>
</head>
<body>

	<c:forEach var="product" items="${Products}">
		<p>${product.name}${product.description} ${product.price}</p>
	</c:forEach>

	<a href="/add">Add Item to Menu</a>

</body>
</html>