package com.ustglobal.collectionframework.list;

import java.util.ArrayList;

public class TestJ {
public static void main(String[] args) {
	ArrayList<Student> al = new ArrayList<Student>();
	Student s1 = new Student(101 , "ankitha" , 45.55);
	Student s2 = new Student(102 , "salman" , 56.66);
	Student s3 = new Student(103 , "sonu" , 58.66);
	Student s4 = new Student(104 , "sonalika" , 60.66);
	Student s5 = new Student(105 , "sonakshi" , 69.78);
	
	
	al .add(s1);
	al .add(s2);
	al .add(s3);
	al .add(s4);
	al .add(s5);
	
	for(int i = 0; i<al.size();i++) {
		Student s = al.get(i);
		System.out.println("Id is : "+s.id);
		System.out.println("Name is : "+s.name);
		System.out.println("Percentage is : "+s.percentage);
	}
	
	for(Student stu : al) {
		System.out.println(stu);
		System.out.println("Id is : "+stu.id);
		System.out.println("Name is : "+stu.name);
		System.out.println("Percentage is : "+stu.percentage);
	
	}
}
}
