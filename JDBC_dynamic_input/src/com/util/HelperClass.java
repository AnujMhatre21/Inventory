package com.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class HelperClass {
	String url = "jdbc:mysql://localhost:3306/school1";
	String username = "root";
	String password = "root";

	public Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;

	}

}
