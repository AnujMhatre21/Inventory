package com.teacher;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class getAllTeacher {
	
	public static void main(String[] args) throws SQLException {
		String url = "jdbc:mysql://localhost:3306/school";
		String username = "root";
		String password = "root";
		String sqlquery = "SELECT * FROM teacher";
		Connection connection = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, username, password);
			Statement statement = connection.createStatement();
			ResultSet result = statement.executeQuery(sqlquery);
			while (result.next()) {
//				System.out.println("=============================");
				System.out.print(result.getInt(1) + " ");
				System.out.print(result.getString(2) + " ");
				System.out.print(result.getString(3) + " ");
				System.out.println();
//				System.out.println("=============================");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			connection.close();
		}

	}
}
