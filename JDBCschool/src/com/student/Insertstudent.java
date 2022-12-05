package com.student;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Insertstudent {

		public static void main(String[] args) throws SQLException {
			String url ="jdbc:mysql://localhost:3306/school";
			String username="root";
			String password="root";
			String sqlinsert="INSERT INTO student VALUES (2,'Sachin',2,'C')";
			Connection connection =null;
			
			
			try {
//				load the drivers
				Class.forName("com.mysql.cj.jdbc.Driver");
//				second way to load the drivers
//				DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
				connection =DriverManager.getConnection(url, username, password);
				Statement statement =connection.createStatement();
				statement.execute(sqlinsert);
				System.out.println("Changes has been done");
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				connection.close();
			}
		}
}
