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
<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<div class="container-fluid">
			<a class="navbar-brand" href="#">CMS</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>

			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0">
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="index.html">Home</a></li>
					<%
					String id = (String) session.getAttribute("id");
					if (id == null) {
					%>
					<li class="nav-item"><a class="nav-link" href="login.jsp">Login</a>
					</li>
					<li class="nav-item"><a class="nav-link" href="register.jsp">Register</a>
					</li>
					<%
					}
					if (id != null) {
					%>
					<li class="nav-item"><a class="nav-link" href="logout.jsp">Logout</a>
					</li>
					<%
					}
					%>
				</ul>
			</div>
		</div>
	</nav>

	<div class="container">

		<h2 align="center">Customer Registration!!</h2>
	</div>
	<div class="container">
		
		<form action="edit" method="post">

			<div class="row">
				<div class="col-lg-6 col-lg-offset-3">
				<div class="form-group">
						<label for="customerEmailId">EmailId:* </label> <input type="text"
							class="form-control" id="customerEmailId"
							readonly="readonly"
							placeholder="Enter EmailId" name="email" value=${requestScope.customer.email }>
					</div>
					<div class="form-group">
						<label for="name">Customer Phone:*</label> <input type="text"
							class="form-control" id="customerName" placeholder="Enter Phone"
							name="phone" value=${requestScope.customer.phone }>
					</div>

					<div class="form-group">
						<label for="city">City:</label> <input type="text"
							class="form-control" id="city" placeholder="Enter city"
							name="city"  value=${requestScope.customer.city }>
					</div>
					<div class="form-group">
						<label for="ismember">Is Member:</label> <input type="checkbox"
							id="ismember" name="ismember"
						<c:if test="${ requestScope.customer.ismember}">checked</c:if>
							 />
							 
					</div>

					<div align="center">
						<input type="submit" class="btn btn-primary" value="Edit Customer" />
					</div>
				</div>
			</div>
		</form>
	</div>


</body>
</html>