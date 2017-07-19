package com.dovetailsystems.sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Connect {

	public Connect() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String url = ("jdbc:oracle:thin:@localhost:1521:orcl");

		Connection conn = DriverManager.getConnection(url, "Test", "test");

		String sql = "select Employee_name, Employee_id from Employee";

		PreparedStatement ps = conn.prepareStatement(sql);

		ResultSet rs = ps.executeQuery();
		
		while(rs.next()){
			System.out.println(rs.getString("EMPLOYEE_NAME"));
		   System.out.println(rs.getInt("EMPLOYEE_ID"));
		}
		

	}

}
