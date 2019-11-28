package com.ustglobal.webapp.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RedirectServelet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String search = req.getParameter("search");
		String select = req.getParameter("select");
		
		
		if(select.equals("bing")) {
			resp.sendRedirect("https://www.bing.com/search?q="+search);
		}else if(select.equals("yahoo")) {
			resp.sendRedirect("https://in.search.yahoo.com/search?p="+search);
		}else {
			resp.sendRedirect("https://www.google.com/search?q="+search);
		}
		
		
		
		
		
	}

}
