package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;

import com.dto.Student;
import com.util.HelperClass;

public class StudentDao {
	HelperClass hc = new HelperClass();

	// method to save the student
	public void saveStudent(Student student) throws SQLException {
		String sql = "INSERT INTO school values (?,?,?,?,?)";
		Connection con = hc.getConnection();
		try {
			PreparedStatement preparedStatement = con.prepareStatement(sql);
			preparedStatement.setInt(1, student.getID());
			preparedStatement.setString(2, student.getName());
			preparedStatement.setString(3, student.getEmail());
			preparedStatement.setString(4, student.getGender());
			preparedStatement.setLong(5, student.getContact());

			preparedStatement.execute();
			System.out.println("Your Program is Working Fine");
			if (con != null) {
				con.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void updateStudent(Student student) throws SQLException {
		String updatesql = "UPDATE school SET NAME='Dhoni' WHERE ID=1";
		Connection con = hc.getConnection();

		try {
			PreparedStatement preparedStatement = con.prepareStatement(updatesql);
			preparedStatement.execute(updatesql);
			int a = preparedStatement.executeUpdate(updatesql);
			if (a > 0) {
				System.out.println("UPDATED");
			} else {
				System.out.println("not updated");
			}
			System.out.println("Program working good");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			con.close();
		}

	}

	public void deleteStudent(Student student) throws SQLException {
		String deletesql = "DELETE FROM school where ID=1";
		Connection con = hc.getConnection();
		try {
			PreparedStatement preparedStatement = con.prepareStatement(deletesql);
			int a = preparedStatement.executeUpdate(deletesql);
			if (a > 0) {
				System.out.println("Updated");
			} else {
				System.out.println("not Updated");
			}
			System.out.println("Program is Working Good");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			con.close();
		}

	}
	
	public void ViewAllStudent(Student student) throws SQLException {
		String sql="SELECT * FROM school";
		Connection con=hc.getConnection();
		try {
		PreparedStatement preparedStatement =con.prepareStatement(sql);
		ResultSet result=preparedStatement.executeQuery(sql);
		while(result.next()) {
			System.out.print(result.getInt("ID")+" ");
			System.out.print(result.getString("name")+" ");
			System.out.print(result.getString("email")+" ");
			System.out.print(result.getString("Gender")+" ");
			System.out.print(result.getLong("Contact")+" ");
			System.out.println();
		}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			con.close();
		}
		
		
	}
}
