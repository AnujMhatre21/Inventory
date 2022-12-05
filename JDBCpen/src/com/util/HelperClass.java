package com.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class HelperClass {
	String url = "jdbc:mysql://localhost:3306/Pen";
	String username = "root";
	String password = "root";

	public Connection getConnection() {
		Connection con = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			DriverManager.getConnection(url, username, password);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
}
