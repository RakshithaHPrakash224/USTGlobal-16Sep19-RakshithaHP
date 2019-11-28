package com.ustglobal.sorting.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestG {
public static void main(String[] args) {
	HashSet<Employee> h = new HashSet<Employee>();
	
	Employee e1 = new Employee(1,"Radha",12000.00);
	Employee e2 = new Employee(2,"sweety",25000.00);
	Employee e3 = new Employee(3,"ramesh",34000.00);
	Employee e4 = new Employee(4,"darshan",15000.00);
	Employee e5 = new Employee(5,"sheela",26000.00);
	Employee e6 = new Employee(5,"sheela",26000.00);
	
	
	h.add(e1);
	h.add(e2);
	h.add(e3);
	h.add(e4);
	h.add(e5);
	h.add(e6);
	
	System.out.println("***************************");
	Iterator<Employee> it = h.iterator();
	while(it.hasNext()) {
		Employee e = it.next();
		System.out.println("Name is :" +e.name);
		System.out.println("ID is :" +e.id);
		System.out.println("salary is :" +e.salary);
	}
	
	
}
}
