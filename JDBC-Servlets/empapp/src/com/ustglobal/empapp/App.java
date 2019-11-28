package com.ustglobal.empapp;

import java.util.List;
import java.util.Scanner;

import com.ustglobal.empapp.util.EmployeeManager;
import com.ustglobal.empappdao.EmployeeDAO;
import com.ustglobal.empappdao.EmployeeDAOImpl;
import com.ustglobal.empappdto.EmployeeBean;

public class App {
public static void main(String[] args) {
System.out.println("Press 1 to get all employee data");
System.out.println("Press 2 to insert employee data");
System.out.println("Press 3 to update employee data");
System.out.println("Press 4 to delete employee data");
System.out.println("Press 5 to search single employee data");

Scanner scn = new Scanner(System.in);
int ch = scn.nextInt();

switch(ch) {
case 1 :
	EmployeeDAO dao = EmployeeManager.getEmployeeDAO();
	List<EmployeeBean> result = dao.getAllEmployeeData();
	for(EmployeeBean bean : result) {
		System.out.println("Id : "+bean.getId());
		System.out.println("Name : "+bean.getName());
		System.out.println("Salary : "+bean.getGender());
		System.out.println("Gender : "+bean.getSal());
	}
	break;
	
case 2:
	break;
	
case 3:
	break;
	
case 4:
	break;
	
case 5:
	
	EmployeeDAO dao5 = EmployeeManager.getEmployeeDAO();
	System.out.println("enter employee id");
	int id = scn.nextInt();
	EmployeeBean bean = dao5.searchemployeeData(id);
	if(bean!=null) {
		System.out.println("Id : "+bean.getId());
		System.out.println("Name : "+bean.getName());
		System.out.println("Salary : "+bean.getGender());
		System.out.println("Gender : "+bean.getSal());
	}else {
		System.out.println("no data found");
	}
	break;
	


}
}
}
