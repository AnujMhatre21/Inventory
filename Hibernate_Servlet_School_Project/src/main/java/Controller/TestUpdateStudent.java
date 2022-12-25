package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.StudentDao;
import Dto.Students;

@WebServlet("/TestUpdateStudent")
public class TestUpdateStudent extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email=req.getParameter("email");
		String name=req.getParameter("name");
		
		StudentDao dao=new StudentDao();
		Students student=dao.GetId(email);
		student.setName(name);
		
		dao.UpdateStudent(student);
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("UpdateDone.jsp");
		dispatcher.forward(req, resp);
	}
	
	
}
