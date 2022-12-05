package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class HelperClass {
	String url = "jdbc:mysql://localhost:3306/school1";
	String username = "root";
	String password = "root";

	public Connection getConnection() throws SQLException {

		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, username, password);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;

	}
}
