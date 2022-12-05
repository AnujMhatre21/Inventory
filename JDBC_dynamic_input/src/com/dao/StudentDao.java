package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.dto.Student;
import com.util.HelperClass;

public class StudentDao { // Data Access Object
	HelperClass helperclass = new HelperClass();

	public void saveStudent(Student student) {
		String sql = "INSERT INTO school FROM VALUES(?,?,?,?)";
		Connection connection = helperclass.getConnection();
		try {
			PreparedStatement preparedstatement = connection.prepareStatement(sql);
			preparedstatement.setInt(1, student.getRollNo());
			preparedstatement.setString(2, student.getName());
			preparedstatement.setInt(3, student.getSTD());
			preparedstatement.setString(4, student.getDIV());

			preparedstatement.execute();
			
			System.out.println("all good");
			if (connection != null) {
				connection.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
