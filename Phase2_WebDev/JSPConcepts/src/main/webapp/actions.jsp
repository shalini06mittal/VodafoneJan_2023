<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
</head>
<body>

	<h1>Actions Demo</h1>
	<c:if test="${param.error != null }">
		<jsp:forward page="register.jsp"></jsp:forward>
	</c:if>
	<div class="container">
	<p>Add New Book</p>
	
		<form action="addbook.jsp" method="post">
			<div class="mb-3">
				<label for="exampleInputEmail1" class="form-label">Book Id
					</label> <input type="text" class="form-control" 
					name="bid"
					id="exampleInputEmail1" aria-describedby="emailHelp">
				
			</div>
			<div class="mb-3">
				<label for="exampleInputPassword1" class="form-label">Title</label>
				<input type="text" class="form-control"
				name="booktitle"
					id="exampleInputPassword1">
			</div>
			<div class="mb-3">
				<label for="exampleInputPassword1" class="form-label">Author</label>
				<input type="text" class="form-control"
				name="author"
					id="exampleInputPassword1">
			</div>
			<div class="mb-3">
				<label for="exampleInputPassword1" class="form-label">Price</label>
				<input type="text" class="form-control"
				name="price"
					id="exampleInputPassword1">
			</div>
			
			<button type="submit" class="btn btn-primary">Submit</button>
		</form>
	</div>
</body>
</html>