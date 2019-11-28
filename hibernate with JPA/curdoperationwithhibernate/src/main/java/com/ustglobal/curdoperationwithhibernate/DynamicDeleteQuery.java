package com.ustglobal.curdoperationwithhibernate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DynamicDeleteQuery {
public static void main(String[] args) {
		
		Connection  conn = null;
		PreparedStatement pstmt = null;
		
		try {
//			Driver driver = new Driver();
//			DriverManager.registerDriver(driver);
			
			Class.forName("com.mysql.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3307/ust_ty_db?user=root&password=sideshwara224";
			conn = DriverManager.getConnection(url);
			
			String sql = "delete from employee_info where id=?";
			pstmt = conn.prepareStatement(sql);
		
			
//			String name = args[1];
//			
//			String empsal = args[2];
//			int sal = Integer.parseInt(empsal);
//			
//			String gender = args[3];
//			
			
			
			pstmt.setInt(1, Integer.parseInt(args[0]));
//			pstmt.setString(1,name);
//			pstmt.setInt(2, sal);
//			pstmt.setString(3, gender);
			
			int count = pstmt.executeUpdate();
			
			
			System.out.println(count + " rows affected ");
			
			
			
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			try {
				if(conn!=null) {
					conn.close();
				}
				if(pstmt!=null) {
					pstmt.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
