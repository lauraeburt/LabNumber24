<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Items</title>
</head>
<body>
<form action = "update-items">
ID:<input type = "text" name="id" value= "${id}">
Name:<input type = "text" name="name">
Category:<input type = "text" name="category">
Description:<input type = "text" name="description">
<input type = "submit" name="Add">

 </form>
</body>
</html>