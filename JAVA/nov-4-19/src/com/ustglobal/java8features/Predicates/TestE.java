package com.ustglobal.java8features.Predicates;

import java.util.function.Supplier;

public class TestE {
public static void main(String[] args) {
	
	Supplier<Employee> s = ()->new Employee("radha" , 2 ,35000);
	
	Employee e = s.get();
	System.out.println("Name is :" +e.name);
	System.out.println("Salary is :" +e.salary);
	System.out.println("Id is :" +e.id);
	
	
	Supplier<Integer> i = () -> 20;
	int val = i.get();
	System.out.println("value is" +val);
}
}
