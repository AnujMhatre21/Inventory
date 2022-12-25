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

@WebServlet("/TestAddStudent")
public class TestAddStudent extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name1");
		String email=req.getParameter("email");

		Students student = new Students();
		student.setName(name);
		student.setEmail(email);
		
		StudentDao studentdao = new StudentDao();
		
		studentdao.AddStudent(student);
		
			
		RequestDispatcher dispatcher = req.getRequestDispatcher("StudentAdded.jsp");
		dispatcher.forward(req, resp);
		
	}
}
