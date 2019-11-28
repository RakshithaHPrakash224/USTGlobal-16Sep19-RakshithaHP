package com.ustglobal.collectionframework.list;

import java.util.ArrayList;

public class TestK {
	public static void main(String[] args) {
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		Employee e1 = new Employee(501, "ajay", 45000);
		Employee e2 = new Employee(502, "pranav", 54000);
		Employee e3 = new Employee(503, "sameer", 65000);
		Employee e4 = new Employee(504, "dinesh", 75000);
		Employee e5 = new Employee(505, "kunal", 85000);
		
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);
		
		for (int i = 0; i<al.size(); i++)  {
			Employee k = al.get(i);
			System.out.println("Id is "+k.id);
			System.out.println("Nmae is "+k.name);
			System.out.println("Salary is "+k.salary);
			
		}
		System.out.println("============for each============");
		for(Employee k : al) {
			System.out.println(k);
		}
	}

}
