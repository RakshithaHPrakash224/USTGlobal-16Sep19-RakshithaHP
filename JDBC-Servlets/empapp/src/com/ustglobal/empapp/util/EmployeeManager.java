package com.ustglobal.empapp.util;

import com.ustglobal.empappdao.EmployeeDAO;
import com.ustglobal.empappdao.EmployeeDAOImpl;

public class EmployeeManager {
 
	private EmployeeManager() {}
	public static EmployeeDAO getEmployeeDAO() {
		return new EmployeeDAOImpl();
	}
}
