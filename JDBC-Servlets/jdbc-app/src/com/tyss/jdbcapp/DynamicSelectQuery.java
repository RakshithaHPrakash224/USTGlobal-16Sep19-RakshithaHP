package com.tyss.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class DynamicSelectQuery {
public static void main(String[] args) {
	String url = "jdbc:mysql://localhost:3307/ust_ty_db?user=root&password=sideshwara224";
	String sql = "select * from employee_info where id = ?";
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	try {
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		
		conn = DriverManager.getConnection(url);
		
		pstmt = conn.prepareStatement(sql);
		
		String empid  = args[0];
		int id = Integer.parseInt(empid);
		pstmt.setInt(1, id);
		
		rs = pstmt.executeQuery();
		
		if(rs.next()) {
			int emp_id = rs.getInt("id");
			int sal = rs.getInt("sal");
			String name = rs.getString("name");
			String gender = rs.getString("gender");
			
			System.out.println("Id is : "+emp_id);
			System.out.println("Name is : " +name);
			System.out.println("Salary is : "+sal);
			System.out.println("Gender is : "+gender);
		}
		
		}catch(SQLException e) {
		e.printStackTrace();
	}finally {
		try {
			if(conn!=null) {
				conn.close();
			}
			if(pstmt!=null) {
				conn.close();
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
}
