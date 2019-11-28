package com.ustglobal.java8features.Predicates;

import java.util.function.Predicate;

public class TestA {
public static void main(String[] args) {
	Predicate<Employee> p = e -> {
		if(e.salary > 50000) {
			return true;
		}else {
			return false;
		}
	};
	Employee e = new Employee("radha" , 1 , 45000);
	
	boolean b = p.test(e);
	System.out.println(b);
}
}
