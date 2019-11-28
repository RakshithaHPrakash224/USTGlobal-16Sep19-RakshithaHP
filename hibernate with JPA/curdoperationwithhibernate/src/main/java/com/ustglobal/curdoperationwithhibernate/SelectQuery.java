package com.ustglobal.curdoperationwithhibernate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class SelectQuery {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		
		
		try {
			//Step1: Load the driver
			Driver driver = new Driver(); //to connect to the db java uses the driver
			DriverManager.registerDriver(driver);// Driver manger is  a class  having a static method registerDriver 
			// passing the value driver for the connection and it has no return type
		
			
			//Step2:
		
			
			String url = "jdbc:mysql://localhost:3307/ust_ty_db?"
					+"user=root&password=sideshwara224";
			conn = DriverManager.getConnection(url);
			
			//Step3: Issue sql query
			stmt = conn.createStatement();
			String sql = "select * from employee_info";
			rs = stmt.executeQuery(sql);
			
			
			//Step4 : Read the result
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int sal = rs.getInt("sal");
				String gender = rs.getString("gender");
				System.out.println("Id is : "+id);
				System.out.println("Name is : "+name);
				System.out.println("Salary is :"+sal);
				System.out.println("Gender is :"+gender);
				System.out.println("****************************************");
				
			}
			//Step5 :Close all jdbc objects
		}catch(SQLException e){
			e.printStackTrace();
		}
		finally {
			try {
				if(conn!=null) {
					conn.close();
				}
				if(stmt!=null) {
					stmt.close();
				}
				if(rs!=null) {
					rs.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
	}
	}
}
