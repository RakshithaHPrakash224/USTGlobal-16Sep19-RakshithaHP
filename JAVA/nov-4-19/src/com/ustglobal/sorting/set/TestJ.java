package com.ustglobal.sorting.set;

import java.util.Iterator;
//import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TestJ {
public static void main(String[] args) {
	SortByName1 sb1 = new SortByName1();
	TreeSet<Customer> ls = new TreeSet<Customer>(sb1);
	
	Customer c1 = new Customer("Radha" , 1 , 12000);
	Customer c2 = new Customer("Rukmini" , 2 , 26000);
	Customer c3 = new Customer("Darshan" , 3 , 45000);
	Customer c4 = new Customer("Rashmi" , 4 , 19000);
	Customer c5 = new Customer("Anagha" , 5 , 20000);
	
	ls.add(c1);
	ls.add(c2);
	ls.add(c3);
	ls.add(c4);
	ls.add(c5);
	
	
	Iterator<Customer> it = ls.iterator();
	while(it.hasNext()) {
		Customer c = it.next();
		System.out.println("Name is :"+c.name);
		System.out.println("ID is :"+c.id);
		System.out.println("Salary is :"+c.salary);
}
	
}
}
