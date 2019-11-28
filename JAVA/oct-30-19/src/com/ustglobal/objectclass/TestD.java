package com.ustglobal.objectclass;

public class TestD {
public static void main(String[] args) {
	Student s1 = new Student(123 , "sadana" , 75.00);
	Car s2 = new Car(11000 , "audi" , "Red");
	int h = s1.name.hashCode();
	System.out.println(h);
	s1.printDetails();
	System.out.println(s1);
	System.out.println(s2);
}
}
