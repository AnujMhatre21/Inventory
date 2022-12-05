package com.teacher;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class deleteTeacher {
	public static void main(String[] args) throws SQLException {
		String url="jdbc:mysql://localhost:3306/school";
		String username="root";
		String password="root";
		String sqldelete="DELETE FROM teacher WHERE Name='Rekha'";
		Connection connection=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection =DriverManager.getConnection(url, username, password);
			Statement statement=connection.createStatement();
			statement.execute(sqldelete);
			int a=statement.executeUpdate(sqldelete);
			
			if(a>0) {
				System.out.println("updated");
				
			}else {
				System.out.println("not updated");
			}
			System.out.println("good");
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			connection.close();
		}
		
	}

}
