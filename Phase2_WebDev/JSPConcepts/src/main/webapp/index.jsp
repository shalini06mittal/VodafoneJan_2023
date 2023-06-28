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

<!--  it includes the content at the compile time itself
	static inclusion
 -->
	<%@ include file="header.jsp"%>
	
	<!--  dynamic inclusion -->
	<jsp:include page="header.jsp"></jsp:include>
	
	<h1>JSP Demos</h1>
	<%--
	3 types of directives 
	1. Page <%@ page %>
	2. include directive
	3. taglib directive
	
	${name } => JSP expression language
 	--%>

	<c:set var="name" value="Shalini Mittal"></c:set>
	<c:out value="${name }"></c:out>

	<c:if test="${param['email'] == null }">
		<h1>Welcome Guest</h1>
	</c:if>
	<c:if test="${param['email'] != null }">
		<h1>
			Welcome
			${param['email']}
		</h1>
	</c:if>
	<c:forEach var="no" begin="1" end="50" step="2">
		<p>${no*no }</p>
	</c:forEach>
	
	<c:forTokens items="Apples,Oranges,Banana" delims="," var="fruit">
		<p>${fruit }</p>
	</c:forTokens>
	

</body>
</html>