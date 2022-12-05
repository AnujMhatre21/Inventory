package com.controller;

import java.sql.SQLException;

import com.dao.StudentDao;
import com.dto.Student;

public class ViewAllController {
	public static void main(String[] args) throws SQLException {
		Student student = new Student();
		StudentDao studentdoa = new StudentDao();
		studentdoa.ViewAllStudent(student);
	}

}
