<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index </title>
</head>
<body>

<div>
<a href="/admin">Admin page</a>
</div>

	<h1>Welcome to Grand Circus' Coffee Kaffee Haus</h1>

	<a href="/registration-form">Register today to get $5 off the newest coffee.</a>

	<c:forEach var="product" items="${Products}">
		<p>${product.name}${product.description} ${product.price}</p>
	</c:forEach>

</body>
</html>