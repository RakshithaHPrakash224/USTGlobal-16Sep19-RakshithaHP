package com.ustglobal.project;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SearchID extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String empID = req.getParameter("empid");
		String url = "jdbc:mysql://localhost:3307/ust_ty_db?user=root&password=sideshwara224";
		String sql = "select * from employee_info where id=?";
		
		Connection conn = null;
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		PrintWriter out = resp.getWriter();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url);
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, Integer.parseInt(empID));
			rs = pstmt.executeQuery();
			
			out.println("<table>");
			out.println("<thead>");
			out.println("<th>ID</th>");
			out.println("<th>Name</th>");
			out.println("<th>Salary</th>");
			out.println("<th>Gender</th>");
			out.println("</thead>");
			
			
			
			while(rs.next()) {
				out.println("<tbody>");
				out.println("<tr>");
				out.println("<td>");
				out.println(rs.getInt("id"));
				out.println("</td>");
				
				out.println("<td>");
				out.println(rs.getString("name"));
				out.println("</td>");
				
				out.println("<td>");
				out.println(rs.getInt("sal"));
				out.println("</td>");
				
				out.println("<td>");
				out.println(rs.getString("gender"));
				out.println("</td>");
				out.println("</tr>");
				out.println("</tbody>");
				
				out.println("</table");
				
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn!=null) {
					conn.close();
				}else if(pstmt!=null) {
					pstmt.close();
				}else if(rs!=null) {
					rs.close();
				}
			}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
		
		
		
	}

}
