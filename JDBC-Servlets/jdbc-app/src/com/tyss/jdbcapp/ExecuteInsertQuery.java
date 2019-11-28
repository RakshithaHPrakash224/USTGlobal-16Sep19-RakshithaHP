package com.tyss.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class ExecuteInsertQuery {
public static void main(String[] args) {
	Connection conn = null;
	Statement stmt = null;
	
	try {//Step1 Load the Driver
		
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		
	//	Step 2 : Get the Connection
		
		String url = "jdbc:mysql://localhost:3307/ust_ty_db?user=root&password=sideshwara224";
		conn = DriverManager.getConnection(url);
		
		// Step3 : Issue the Sql query
		
		String sql = " insert into employee_info " 
					+" values(8,'samira',12900,'F') ";
		stmt = conn.createStatement();
		int count = stmt.executeUpdate(sql);
		
		//read the result
		
		System.out.println(count + " rows inserted ");
	}catch(SQLException e){
		e.printStackTrace();
	}finally {
		try {
			if(conn!=null) {
				conn.close();
			}if(stmt!=null) {
				stmt.close();
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
}
