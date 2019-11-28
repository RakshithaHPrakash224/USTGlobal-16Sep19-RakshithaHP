package com.ustglobal.java8features;

import java.util.ArrayList;

public class TestS {
	
	public static void main(String[] args) {
		
		ArrayList<Student> al = new ArrayList<Student>();
		
		al.add(new Student(5,"Raghav",98.9));
		al.add(new Student(3,"Dhermesh",58.7));
		al.add(new Student(6,"Punith",88.9));
		al.add(new Student(2,"Shakti",68.7));
		al.add(new Student(1,"Remo",78.1));
		
		Helper h = new Helper();
//		h.displayAllStudent(al);
//		h.displayAllStudent(al);
		h.displayTopperStudent(al);
	}

}
