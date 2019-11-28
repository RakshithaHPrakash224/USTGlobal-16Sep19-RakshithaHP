package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import java.util.Iterator;

public class TestF {
public static void main(String[] args) {
	
	ArrayList<Employee> al = new ArrayList<Employee>();
	
	Employee e1 = new Employee("sadana",1,12000);
	Employee e2 = new Employee("sandya",2,22000);
	Employee e3 = new Employee("radha",3,32000);
	
	al.add(e1);
	al.add(e2);
	al.add(e3);
	Comparator<Employee> cmp = (e5 , e6) -> {
		return e5.name.compareTo(e6.name);
	};
	
	List<Employee> l 
	= al.stream().sorted(cmp).collect(Collectors.toList());
	
	Iterator<Employee> it = l.iterator();
	while(it.hasNext()) {
		Employee e = it.next();
		System.out.println("Id is :" +e.id);
		System.out.println("Name is :" +e.name);
		System.out.println("salary is :" +e.salary);
	}
}
}
