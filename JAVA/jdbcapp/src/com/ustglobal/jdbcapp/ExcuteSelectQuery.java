package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.mysql.jdbc.Driver;

public class ExcuteSelectQuery {

	public static void main(String[] args) {

		Connection conn = null;  //interface
		Statement stmt = null;   //''
		ResultSet rs = null;   //''
		
		try {
			Driver driver = new Driver();                     //first line of jdbc 
			DriverManager.registerDriver(driver);
			
			//Step 2 get the connection
			String url = "jdbc:mysql://localhost:3306/ust_ty_db";
			
			conn = DriverManager.getConnection(url,"root","root");
			
			//Step 3 Issue query
			stmt = conn.createStatement();
			String sql = "select * from employee_info";
			rs = stmt.executeQuery(sql);
			
            //Step 4 read the results; 
			
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int  sal = rs.getInt("sal");
				String gender = rs.getString("gender");

				System.out.println("Id is : "+id);
				System.out.println("Name is : "+name);
				System.out.println("Salary is : "+sal);
				System.out.println("Gender is : "+gender);
				System.out.println("************************");

			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			
			//Step 5 close all jdbc objects connection
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
			}catch (SQLException e) {
				e.printStackTrace();
			}

		}
	}

}
