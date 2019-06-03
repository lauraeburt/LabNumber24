<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/flatly/bootstrap.min.css" rel="stylesheet" integrity="sha384-T5jhQKMh96HMkXwqVMSjF3CmLcL1nT9//tCqu9By5XSdj7CwR0r+F3LTzUdfkkQf" crossorigin="anonymous">
<link rel="stylesheet" type = "text/css" href="/style-people.css">
<title>Edit an Item</title>
</head>
<h1>Add a New Item</h1>
<body>
${exists }
	<form action="/add-items">
	Name:	<input type="text" name="name">  <br>
Description:	<input	type="text"name="description"> <br>
Quantity: <input type="text" name="quantity"><br>
Price:	<input type="text" name="price"> <br>
	
 <input type="Submit" name="Save">

	</form>
</body>
</html>