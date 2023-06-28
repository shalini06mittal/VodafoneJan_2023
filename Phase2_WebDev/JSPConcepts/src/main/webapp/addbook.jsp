<%@page import="model.Book"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Book Registered</h1>
	<%-- <%
		Book b1 = new Book();
		b1.setBid(Integer.parseInt(request.getParameter("bid")));
		b1.setTitle(request.getParameter("title"));
		b1.setAuthor(request.getParameter("author"));
		b1.setPrice(Double.parseDouble(request.getParameter("price")));
	%> --%>
	<jsp:useBean id="b1" class="model.Book">
	</jsp:useBean>
	<jsp:setProperty property="*" name="b1"/>
	<jsp:setProperty property="title" param="booktitle" name="b1"/>
	<%= b1 %>
	${b1.title }
</body>
</html>