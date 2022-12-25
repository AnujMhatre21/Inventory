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


@WebServlet("/TestAddTeacher")
public class TestAddTeacher extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String subject = req.getParameter("subject");

		Teachers teacher = new Teachers();
		teacher.setName(name);
		teacher.setEmail(email);
		teacher.setSubject(subject);

		TeacherDao teacherDao= new TeacherDao();

		teacherDao.AddTeachers(teacher);

		RequestDispatcher dispatcher = req.getRequestDispatcher("TeacherAdded.jsp");
		dispatcher.forward(req, resp);
	}
}
