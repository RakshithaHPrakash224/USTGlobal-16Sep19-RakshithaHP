package com.tyss.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import com.mysql.jdbc.Driver;


public class ExecuteUpdateQueryPS {
	public static void main(String[] args) {
		
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	
	try {//Step1 Load the Driver
		
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		
	//	Step 2 : Get the Connection
		
		String url = "jdbc:mysql://localhost:3307/ust_ty_db?user=root&password=sideshwara224";
		conn = DriverManager.getConnection(url);
		
		// Step3 : Issue the Sql query
		
		String sql = " insert into employee_info values(?,?,?,?) ";
					
		pstmt = conn.prepareStatement(sql);
		
		String empId = args[0];
		int id = Integer.parseInt(empId);
		pstmt.setInt(1, id);
		
		String name = args[1];
		pstmt.setString(2, name);
		
		String empSal = args[2];
		int sal = Integer.parseInt(empSal);
		pstmt.setInt(3, sal);
		
		String gender = args[3];
		pstmt.setString(4, gender);
		
		int count = pstmt.executeUpdate();
		
		//read the result
		
		System.out.println(count + " rows inserted ");
	}catch(SQLException e){
		e.printStackTrace();
	}finally {
		try {
			if(conn!=null) {
				conn.close();
			}if(pstmt!=null) {
				pstmt.close();
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
}