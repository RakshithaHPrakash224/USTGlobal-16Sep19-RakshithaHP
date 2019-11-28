package com.ustglobal.java8features.Predicates;

import java.util.function.Function;

public class TestD {
public static void main(String[] args) {
	Function<Integer , Employee> f = id ->{
		Employee e = new Employee("sadana" , 1 , 23000);
		e.id = id;
		return e;
	};
	
	Employee e = f.apply(27);
	System.out.println("Name is :" +e.name);
	System.out.println("Salary is :" +e.salary);
	System.out.println("Id is :" +e.id);
}
}
