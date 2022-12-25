<%@page import="java.util.List"%>
<%@page import="Dto.Teachers"%>
<%@page import="Dao.TeacherDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1" cellpadding = "5" cellspacing = "5" >
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Email</th>
			<th>Subject</th>
		</tr>
		<%
		TeacherDao teacher = new TeacherDao();
			Teachers t = new Teachers();
			List<Teachers> list = teacher.GetAllTeachers();
			for (Teachers s1 : list) {
		%>
		
		<tr>
		<td><%= s1.getId() %></td>
		<td><%= s1.getName() %></td>
		<td><%= s1.getEmail() %></td>
		<td><%= s1.getSubject() %></td>
		</tr>
		
		
		
<%} %>
<br><br>
<br><br>
	</table>
<a href="HomePageForward"> <button>Go Back To Home</button> </a>	

</body>
</html>