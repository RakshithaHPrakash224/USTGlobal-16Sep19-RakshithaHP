package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

public class WithPropertiesInsertJDBC {

	public static void main(String[] args) {

		Connection conn = null;
		ResultSet rs = null;
		FileReader reader = null;
		PreparedStatement pstmt = null;

		try {
			reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);

			//Step 1 load the Driver
			Class.forName(prop.getProperty("driver-class-name"));

			//Step 2 Get the connection
			String url = prop.getProperty("url");

			conn = DriverManager.getConnection(url,prop);

			//Step 3 Issue SQL query
			String sql = prop.getProperty("insert-query");
			
			pstmt = conn.prepareStatement(sql);

			String empid = args[0];
			int id = Integer.parseInt(empid);
			pstmt.setInt(1,id);

			String name = args[1];
			pstmt.setString(2,name);

			String empsal = args[2];
			int sal = Integer.parseInt(empsal);
			pstmt.setInt(3,sal);

			String gender = args[3];
			pstmt.setString(4,gender);

			int  count1 = pstmt.executeUpdate();
			
			//Step 4 Read the Result
			System.out.println(count1 + "Row(s) inserted");

		}catch(Exception e) {
			e.printStackTrace();
		}finally {

			try {
				if(conn!=null) {
					conn.close();

				}
				if (pstmt!=null) {
					pstmt.close();
				}
				if(reader!=null) {
					reader.close();
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
