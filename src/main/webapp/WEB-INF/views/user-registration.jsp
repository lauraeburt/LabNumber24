<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/flatly/bootstrap.min.css" rel="stylesheet" integrity="sha384-T5jhQKMh96HMkXwqVMSjF3CmLcL1nT9//tCqu9By5XSdj7CwR0r+F3LTzUdfkkQf" crossorigin="anonymous">
<link rel="stylesheet" type = "text/css" href="/style-people.css">
<title>Add People</title>
</head>
<h1>Add New Clients Below</h1>
<body>
	<form action="/user-registration">
	First Name:	<input type="text" name="firstName">  <br>
Last Name:	<input	type="text"name="lastName"> <br>
Phone Number: <input type="text" name="phoneNumber"><br>
Email:	<input type="text" name="email"> <br>
	Password:	<input type="text"	name="password"><br>
 <input type="submit" name="Add">
 
	</form>
	
	

</body>
</html>