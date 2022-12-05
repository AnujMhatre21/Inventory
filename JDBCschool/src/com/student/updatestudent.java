package com.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class updatestudent {
	public static void main(String[] args) throws SQLException {
		String url = "jdbc:mysql://localhost:3306/school";
		String username = "root";
		String pasword = "root";
//		3,'HARSH',2,'C'
		String sqlupdate = "UPDATE student SET Name='RAHUL' WHERE RollNo=2 ";
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, username, pasword);
			Statement statement = connection.createStatement();
			statement.execute(sqlupdate);
			int a = statement.executeUpdate(sqlupdate);
			if (a > 0) {
				System.out.println("Updated");
			} else {
				System.out.println("Not Updated");
			}
			System.out.println("good");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			connection.close();
		}
	}
}
