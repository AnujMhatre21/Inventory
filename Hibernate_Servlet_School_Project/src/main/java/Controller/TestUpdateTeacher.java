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

@WebServlet("/TestUpdateTeacher")
public class TestUpdateTeacher extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("email");
		String subject = req.getParameter("subject");
		
		TeacherDao dao=new TeacherDao();
		Teachers teacher =dao.GetId(email);
		
		teacher.setSubject(subject);
		
		dao.UpdateTeacher(teacher);
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("UpdateDone.jsp");
		dispatcher.forward(req, resp);
		
		
	}
}
