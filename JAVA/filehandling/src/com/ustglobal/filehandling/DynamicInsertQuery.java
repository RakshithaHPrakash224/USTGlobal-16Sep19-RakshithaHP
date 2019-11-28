package com.ustglobal.filehandling;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

public class DynamicInsertQuery {
public static void main(String[] args) {
	Connection conn = null;
	PreparedStatement pstmt = null;
	FileReader reader = null;
	
	try {
		reader = new FileReader("text.properties"); 
		Properties prop = new Properties();
		prop.load(reader);
		
		Class.forName(prop.getProperty("driver-class-name"));
		String url = prop.getProperty("url");
		conn = DriverManager.getConnection(url,prop);
		
		
		String sql = prop.getProperty("insert-query");
					
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
	}catch(Exception e){
		e.printStackTrace();
	}finally {
		try {
			if(conn!=null) {
				conn.close();
			}if(pstmt!=null) {
				pstmt.close();
			}
			if(reader!=null) {
				reader.close();
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
}
