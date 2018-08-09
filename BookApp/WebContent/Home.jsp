<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>BookStore</title>
</head>
<body>
		<div align=right>
			<a href="cart.app">Cart</a> ()
		</div>
		<div align=center>
			<h1>Book List</h1>
			
			<table>
				<tr>
					<th>Book Name</th>
					<th>Price</th>
				</tr>
				<jstl:forEach var="Book" items="${requestScope.Book }">
				<tr>
					<td>${Book.bookName}</td>
					<td>${Book.cost }</td>
					<td><a href="addtocart.app?bookName=${Book.bookName} ">Add to Cart</a></td>
				</tr>
			</jstl:forEach>
			</table>
		</div>

</body>
</html>