package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class ExcuteUpdateQuery {
	public static void main(String[] args) {

		Connection conn = null;
		Statement stmt = null;

		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);

			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);
			String sql = "update employee_info set name='atish' , sal=70000 , gender = 'M' where id=6";
			stmt = conn.createStatement();
			int count = stmt.executeUpdate(sql);
			System.out.println(count + " Row(s) updated");

		}catch(SQLException e) {
			e.printStackTrace();
		}finally {

			try {
				if(conn!=null) {
					conn.close();

				}if (stmt!=null) {
					stmt.close();
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

















