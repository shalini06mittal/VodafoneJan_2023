<%@page import="entity.Customer"%>
<%@page import="java.util.List"%>
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
	<h1>Welcome ADMIN</h1>
	<%-- <%
		List<Customer> customers = (List<Customer>)request.getAttribute("customers");
	%> --%>
	<div class="container">
	<table class="table">
		<tr>
			<th>Email</th>
			<th>Phone</th>
			<th>City</th>
			<th>isMember</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>
		<c:forEach var="customer" items="${requestScope.customers }">
			<tr>
				<td>${ customer.email}</td>
				<td>${ customer.phone}</td>
				<td>${ customer.city}</td>
				<c:if test="${customer.ismember }">
					<td>YES</td>
				</c:if>
				<c:if test="${!customer.ismember }">
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