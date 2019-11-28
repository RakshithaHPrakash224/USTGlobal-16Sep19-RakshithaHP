package com.ustglobal.arrays;

public class TestC {
public static void main(String[] args) {
	Student s = new Student(1,"ravi",78.99);
	Student s1 = new Student(2,"keshav",80.99);
	Student s2 = new Student(3,"chinki",66.99);
	
	Student[] stu = new Student[3];
	
	stu[0] = s;
	stu[1] = s1;
	stu[2] = s2;
	
	for (Student st1 : stu) {
		System.out.println(st1);
	}
	receive(stu);
}
	static void receive(Student[] s1) {
		for(Student s2 : s1
				                                                      ) {
			System.out.println(s2);
		}
	}

}
