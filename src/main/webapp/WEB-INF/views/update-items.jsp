<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Items</title>
</head>
<body>

<form action = "update-form">
<input type = "hidden" name="id" value= "${id}">
Name:<input type="text" name="name" placeholder="${ item.name }" required>
	Quantity<input type="number" name="quantity" placeholder="${ item.quantity }" required>
	Price<input type="number" name="price" step="any" placeholder="${ item.price }" required>
		<p>
		<label>Item description</label>
		<textarea id="myTextArea" name = "description" rows="3" cols="80" placeholder="${ item.description }" required></textarea>
		</p>
	<input type="submit" value="update">
 </form>
</body>
</html>