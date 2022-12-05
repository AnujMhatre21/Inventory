package com.controller;

import java.sql.SQLException;
import java.sql.Statement;

import com.dao.StudentDao;
import com.dto.Student;

public class AddController {
	public static void main(String[] args) throws SQLException {
		Student student = new Student();
		student.setID(3);
		student.setName("SEEMA");
		student.setEmail("sample2@gmail.com");
		student.setGender("Female");
		student.setContact(123456789);

		StudentDao studentdoa = new StudentDao();
		studentdoa.saveStudent(student);

	}
}
