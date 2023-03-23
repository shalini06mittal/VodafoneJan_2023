
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
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
						aria-current="page" href="index.jsp">Home</a></li>
					<%
					String id = (String) session.getAttribute("email");
		
					if (id == null) {
					%>
					<li class="nav-item"><a class="nav-link" href="login">Login</a>
					</li>
					<li class="nav-item"><a class="nav-link" href="register">Register</a>
					</li>
					<%
					}
					if (id != null) {
					%>
					<li class="nav-item"><a class="nav-link" href="logout">Logout</a>
					</li>
					<%
					}
					%>
				</ul>
			</div>
		</div>
	</nav>
	<div class='container'>
	<h1>Welcome ADMIN</h1>
	<%-- <%
		List<Customer> customers = (List<Customer>)request.getAttribute("customers");
	%> --%>


	<table class="table">
		<tr>
			<th>Email</th>
			<th>Phone</th>
			<th>City</th>
			<th>isMember</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>
		<c:forEach var="customer" items="${customers }">
			<tr>
				<td>${ customer.email}</td>
				<td>${ customer.phone}</td>
				<td>${ customer.city}</td>
				
				<c:if test="${customer.member }">
					<td>YES</td>
				</c:if>
				<c:if test="${!customer.member }">
					<td>NO</td>
				</c:if>
				<td><a href="edit?email=${ customer.email}">Edit</a> </td>
				<td><a href="delete?email=${ customer.email}">Del</a> </td>
			</tr>
		</c:forEach>

	</table>

	</div>
</body>
</html>