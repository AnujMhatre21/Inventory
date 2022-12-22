<%@page import="Dto.Students"%>
<%@page import="java.util.List"%>
<%@page import="Dao.StudentDao"%>
<%@page import="Controller.TestGetAllStudents"%>
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
		</tr>
		<% StudentDao student=new StudentDao();
		Students s=new Students();
				List<Students> list= student.GetAllStudents();
				for (Students s1:list){
		%>
		
		<tr>
		<td><%= s1.getId() %></td>
		<td><%= s1.getName() %></td>
		<td><%= s1.getEmail() %></td>
		</tr>
		
		
		
<%} %>
	</table>

</body>
</html>