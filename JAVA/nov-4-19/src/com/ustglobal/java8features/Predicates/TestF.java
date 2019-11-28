package com.ustglobal.java8features.Predicates;

import java.util.function.Consumer;

public class TestF {
public static void main(String[] args) {
	Consumer<Employee> c = e -> {
		System.out.println("Name is :" +e.name);
		System.out.println("Salary is :" +e.salary);
		System.out.println("Id is :" +e.id);
	};
	Employee et = new Employee("sdaana" , 12 , 23000);
	c.accept(et);
}
}
