package com.ustglobal.sorting.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestG {
public static void main(String[] args) {
	
	Employee e1 = new Employee(1 , "radha" ,20000);
	Employee e2 = new Employee(2 , "raman" ,35000);
	Employee e3 = new Employee(3 , "rakesh" ,45000);
	Employee e4 = new Employee(4 , "rajini" ,40000);
	Employee e5 = new Employee(5 , "rahitya" ,32000);
	Employee e6 = new Employee(6 , "rashi" ,25000);
	Employee e7 = new Employee(7 , "ravi" ,54000);
	Employee e8 = new Employee(8 , "raveesh" ,67000);
	Employee e9 = new Employee(9 , "raama" ,33000);
	
	ArrayList<Employee> al1 = new ArrayList<Employee>();
	al1.add(e1);
	al1.add(e2);
	al1.add(e3);
	
	ArrayList<Employee> al2 = new ArrayList<Employee>();
	al2.add(e4);
	al2.add(e5);
	al2.add(e6);
	
	ArrayList<Employee> al3 = new ArrayList<Employee>();
	al3.add(e7);
	al3.add(e8);
	al3.add(e9);
	
	HashMap<String , ArrayList<Employee>> hm = new HashMap<>();
	hm.put("first", al1);
	hm.put("second", al2);
	hm.put("three", al3);
	
	ArrayList<Employee> first =hm.get("three");
	
	Iterator<Employee> it = first.iterator();
	while(it.hasNext()) {
		Employee e = it.next();
		System.out.println("Name is : "+ e.name);
		System.out.println("ID is : " +e.id);
		System.out.println("Salary is :"+e.salary);
	}
	
	
}
}
