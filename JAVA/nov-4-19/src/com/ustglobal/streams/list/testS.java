package com.ustglobal.streams.list;

import java.util.ArrayList;

public class testS {
public static void main(String[] args) {
	ArrayList<Student> al = new ArrayList<Student>();
	
	al.add(new Student(1,"sadana", 55.44));
	al.add(new Student(2,"radana", 66.44));
	al.add(new Student(3,"madana", 67.44));
	al.add(new Student(4,"nadana", 58.44));
	
	Helper h1 = new Helper();
	h1.displayAllStudent(al);
	System.out.println("==============================");
	h1.displayFailedStudents(al);
	System.out.println("==============================");
	h1.displayPassedStudents(al);
	System.out.println("==============================");
	h1.displayTopperStudents(al);
	
	
}
}
