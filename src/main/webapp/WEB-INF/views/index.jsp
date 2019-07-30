<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Welcome to Grand Circus' Coffee Kaffee Haus</h1>

	<a href="/registration-form">Sign up today to get $5 off the newest coffee.</a>

	<p>${Products[0].name} ${Products[0].description} $${Products[0].price}</p>
	<p>${Products[1].name} ${Products[1].description} $${Products[1].price}</p>
	<p>${Products[2].name} ${Products[2].description} $${Products[2].price}</p>

</body>
</html>