<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="TestDeleteStudent" method="post">

		Enter the Email of the Student you Want to Delete: <input type="email" name="email">
				<input type="submit">

	</form>
	<a href="TestGetAllStudents">
		<button>Get All Student</button>
	</a>
	<a href="HomePageForward"> <button>Go Back To Home</button> </a>
</body>
</html>