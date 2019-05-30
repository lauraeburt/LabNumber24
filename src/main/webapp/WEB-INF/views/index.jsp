<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome</title>
</head>
<body>
    Hello World!
    
    
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
         <td><a href="update-form?id=${item.id }">Update</a></td>
         <td><a href="delete?id=${item.id }">Delete</a></td>
    
    </tr>
    </c:forEach>
    </tbody>
    </table>
    
    <a href= "add">Add Food</a>
    
</body>
</html>