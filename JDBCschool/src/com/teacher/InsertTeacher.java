package com.teacher;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTeacher {
	public static void main(String[] args) throws SQLException {
		String url ="jdbc:mysql://localhost:3306/school";
		String username="root";
		String password="root";
		String sqlinsert="INSERT INTO teacher VALUES (1,'Rekha','Maths')";
		Connection connection =null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection =DriverManager.getConnection(url, username, password);
			Statement statement =connection.createStatement();
			statement.execute(sqlinsert);
			System.out.println("Changes has been done");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			connection.close();
		}
	}

}
