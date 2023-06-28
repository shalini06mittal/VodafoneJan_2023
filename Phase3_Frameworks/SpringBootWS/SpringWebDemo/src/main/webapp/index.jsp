<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>hello</h1>
<div> <a href="login">Login</a></div>
<div> <a href="mvc/books">Books Page</a></div>

<div>
	<form method="post" enctype="multipart/form-data" 
	action="rest/upload">
		<input type="file" name="file"/>
		<input type="submit">
	</form>

</div>
</body>
</html>