package Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.StudentDao;
import Dto.Students;

@WebServlet("/TestDeleteStudent")
public class TestDeleteStudent extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email1=req.getParameter("email");
		
		StudentDao studentDao =new StudentDao();
		studentDao.DeleteStudent(email1);
	
	}


}
