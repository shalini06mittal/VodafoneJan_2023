<%-- JSP Page Directive --%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!--  Java inside HTML  -->
<h1>Hello From JSP Demo</h1>
<%
	// scriplets
	out.println("<h2>Hey!!!</h2>");
	out.println("<p>"+new Date() +"</p>");
	String name = request.getParameter("username");
	if(name==null)
		out.println("<p>Welcome GUEST</p>");
	else
		out.println("<p>Welcome "+name.toUpperCase() +"</p>");
%>
</body>
</html>