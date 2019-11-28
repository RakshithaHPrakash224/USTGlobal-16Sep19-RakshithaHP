package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


//import com.mysql.jdbc.Driver;

public class DynamicDeleteQuery {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			//load the driver
//			Driver driver = new Driver();
//			DriverManager.registerDriver(driver);
			
			//after jdbc 4 we dont need this also just write the url correctly
			
//			Class.forName("com.mysql.jdbc.Driver"); 

			//step 1 get the connection
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);

			//step 3 issue the SQL query
			String sql = "delete from employee_info where id =?";
			pstmt = conn.prepareStatement(sql);

//			String empid = args[0];
//			int id = Integer.parseInt(empid);
//			pstmt.setInt(1, id);
			//instead of above 3 commented line we have written only one line
			
			pstmt.setInt(1, Integer.parseInt(args[0]));
			
			int count = pstmt.executeUpdate();

			//step 4 reaad the result
			System.out.println(count+ "Row(s) updated");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null) {
					pstmt.close();
				}
				if(conn!=null) {
					conn.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}//end of try-catch block
	}//end of main method
}//end of class