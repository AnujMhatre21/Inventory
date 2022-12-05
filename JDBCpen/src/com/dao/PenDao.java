package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.dto.Pen;
import com.util.HelperClass;

public class PenDao {

	HelperClass hc = new HelperClass();

	public void AddPen(Pen pen) {
		String sql = "INSERT INTO pen values(?,?,?,?)";
		Connection con = hc.getConnection();

		try {
			PreparedStatement preparedStatement = con.prepareStatement(sql);
			preparedStatement.setInt(1, pen.getSRNO());
			preparedStatement.setString(2, pen.getPName());
			preparedStatement.setString(3, pen.getColour());
			preparedStatement.setString(4, pen.getBrand());

			preparedStatement.execute();
			System.out.println("Your Pen has been Added");
			if (con != null) {
				con.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void updatePen(Pen pen) {
		String sql = "UPDATE PEN SET PNAME='RE' WHERE SRNO=1";
		Connection con = hc.getConnection();

		try {
			PreparedStatement preparedStatement = con.prepareStatement(sql);
			int a = preparedStatement.executeUpdate(sql);
			if (a > 0) {
				System.out.println("updated");
			} else {
				System.out.println("not updated");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void deletePen(Pen pen) {
		String sql = "DELETE FROM PEN WHERE SRNO= 1";
		Connection con = hc.getConnection();

		try {
			PreparedStatement preparedStatement = con.prepareStatement(sql);
			int a = preparedStatement.executeUpdate(sql);
			if (a > 0) {
				System.out.println("Record Deleted");

			} else {
				System.out.println("Table is Unchanged");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void ViewAllTable(Pen pen) {
		String sql = "SELECT * FROM pen";
		Connection con = hc.getConnection();

		try {
			PreparedStatement preparedStatement = con.prepareStatement(sql);
			ResultSet result = preparedStatement.executeQuery(sql);
			while (result.next()) {
				System.out.print(result.getInt(1) + " ");
				System.out.print(result.getString(2) + " ");
				System.out.print(result.getString(3) + " ");
				System.out.print(result.getString(4) + " ");
				System.out.println();
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
