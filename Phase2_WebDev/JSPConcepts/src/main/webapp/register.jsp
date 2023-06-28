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

<div class="container">
		<form action="register" method="post">
		
			<div class="row">
				<div class="col-lg-6 col-lg-offset-3">
					<div class="form-group">
						<label for="name">Customer Phone:</label> 
						<input type="text"
							class="form-control" id="customerName" placeholder="Enter Phone"
							name="phone">
					</div>

					<div class="form-group">
						<label for="customerEmailId">EmailId: </label> <input type="text"
							class="form-control" id="customerEmailId" placeholder="Enter EmailId"
							name="email">
					</div>
					<div class="form-group">
						<label for="password">PASSWORD: </label> <input type="password"
							class="form-control" id="password" placeholder="Enter Password"
							name="password">
					</div>
					
					<div class="form-group">
						<label for="ismember">Identification Verification</label>
						<select>
							<c:forEach var="id" items="${requestScope.ids }">
								<option>${id }</option>
							</c:forEach>
						</select>
					</div>
					
					<div align="center">
						<input type="submit" class="btn btn-primary" value="Register"/>
					</div>
				</div>
			</div>
		</form>
	</div>
</body>
</html>