<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/flatly/bootstrap.min.css" rel="stylesheet" integrity="sha384-T5jhQKMh96HMkXwqVMSjF3CmLcL1nT9//tCqu9By5XSdj7CwR0r+F3LTzUdfkkQf" crossorigin="anonymous">
<link rel="stylesheet" type = "text/css" href="/style.css">
<title>Welcome</title>


</head>
<body>
    <h1>Hounds and Grounds ADMIN PAGE </h1>
    
    <h1>~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~</h1>
    
    <h3>Please Register NEW USERS <a href ="/see-form">Here</a></h3>
    
    
    <table border="1">
    <thead>
        <tr>
          <td>Name</td>
         <td>Quantity</td>
         <td>Description</td>
         <td>Price</td>
         <td>Update</td>
         <td>Delete</td>
        </tr>
    </thead>
    <tbody>
    <c:forEach items="${test }" var="item">
    <tr> 
        <td>${item.name }</td>
         <td>${item.quantity }</td>
         <td>${item.description }</td>
         <td>${item.price }</td>
         <td><a href="edit?id=${item.id }">Edit</a></td>
         <td><a href="delete?id=${item.id }"onclick="return confirm('Are you sure you want to delete this item?');">Delete</a></td>
        
    </tr>
    </c:forEach>
    </tbody>
    </table>
    
    <a href= "/addpage">Add Item</a> <br>
    
</body>
</html>