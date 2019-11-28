package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestC {
public static void main(String[] args) {
	ArrayList<Student> al = new ArrayList<Student>();
	
	Student s1 = new Student(12 , "dimple" , 35.66);
	Student s2 = new Student(13 , "Sweety" , 78.88);
	Student s3 = new Student(14 , "jimmy" , 88.50);
	Student s4 = new Student(15 , "kimple" , 78.80);
	
	
	al.add(s1);
	al.add(s2);
	al.add(s3);
	al.add(s4);
	System.out.println("Before sorting ----------");
	displayStudentDetails(al);
	Collections.sort(al);
	
	System.out.println("After sorrting ----------");
	displayStudentDetails(al);
}

static void displayStudentDetails(ArrayList<Student> al) {
	Iterator<Student> it = al.iterator();
	while(it.hasNext()) {
		Student s = it.next();
		System.out.println("Id is "+s.id);
		System.out.println("Name is "+s.name);
		System.out.println("Percentage "+s.percentage);
		
	}
}
}
