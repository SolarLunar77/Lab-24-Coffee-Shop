<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>AddItem</title>
</head>
<body>

<form action="/SubmitedItem">
	Name: <input type="text" name="name"><br> 
	Description: <input type="text" name="description"><br> 
	Price: <input type="number" step="0.01" name="price"><br> 
	<input type="submit" value="Save">
</form>

</body>
</html>