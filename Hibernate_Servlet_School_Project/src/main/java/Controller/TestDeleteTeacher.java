package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.TeacherDao;
import Dto.Teachers;

@WebServlet("/TestDeleteTeacher")
public class TestDeleteTeacher extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
		String email=req.getParameter("email");
		TeacherDao dao=new TeacherDao();
			dao.DeleteTeachers(email);
			
			RequestDispatcher dispatcher = req.getRequestDispatcher("UpdateDone.jsp");
			dispatcher.forward(req, resp);
			
}
	
}
