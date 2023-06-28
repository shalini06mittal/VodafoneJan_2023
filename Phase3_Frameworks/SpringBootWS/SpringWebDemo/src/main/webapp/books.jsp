<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	select{
		width:10%;
		height:30px;
	}
	p{
		font-size: 20px;
		color:blue;
		margin-bottom:5px;
	}
</style>
</head>
<body>

	<h1>Select author id to display books</h1>
	<form action="/mvc/books/author">
		<select name="authorid">

			<c:forEach items="${ids}" var="id">
				<option value="${id }">${id }</option>
			</c:forEach>
		</select> <input type="submit" value="Find Books" />
	</form>

	<c:if test="${books != null }">
		<h1>List Of books</h1>
		<c:forEach items="${books }" var="book">
			<p class='book'>${book.booktitle }</p>
		</c:forEach>
	</c:if>


</body>
</html>