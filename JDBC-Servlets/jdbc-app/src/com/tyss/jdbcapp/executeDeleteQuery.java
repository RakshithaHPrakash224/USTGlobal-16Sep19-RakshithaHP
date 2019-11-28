package com.tyss.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class executeDeleteQuery {
public static void main(String[] args) {
	
	Connection conn = null;
	Statement stmt = null;
	try {
	Driver driver = new Driver();
	DriverManager.registerDriver(driver);
	
	String url = "jdbc:mysql://localhost:3307/ust_ty_db?user=root&password=sideshwara224";
	conn = DriverManager.getConnection(url);
	
	String sql = "delete from employee_info where id =6";
stmt = conn.createStatement();
int count = stmt.executeUpdate(sql);

//read the result

System.out.println(count + " rows inserted ");
	}catch(SQLException e) {
		e.printStackTrace();
	}finally {
		try {
			if(conn!=null) {
				conn.close();
			}
			if(stmt!=null) {
				stmt.close();
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
}
}
