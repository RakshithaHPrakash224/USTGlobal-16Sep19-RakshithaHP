package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Helper {
	
	
void displayAllStudent(ArrayList<Student> al) {
	Iterator<Student> it = al.iterator();
	while(it.hasNext()) {
		Student s = it.next();
		System.out.println("id is "+s.id);
		System.out.println("Name is "+s.name);
		System.out.println("Percentage is "+s.percentage);
	}
}
	void displayFailedStudents(ArrayList<Student> al) {
		List<Student> l =
				al.stream().filter(student ->student.percentage <60).collect(Collectors.toList());		
		
		Iterator<Student> it = l.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println("id is "+s.id);
			System.out.println("Name is "+s.name);
			System.out.println("Percentage is "+s.percentage);
		}
	}
		void displayPassedStudents(ArrayList<Student> al) {
			List<Student> l =
					al.stream().filter(student ->student.percentage >60).collect(Collectors.toList());		
			
			Iterator<Student> it = l.iterator();
			while(it.hasNext()) {
				Student s = it.next();
				System.out.println("id is "+s.id);
				System.out.println("Name is "+s.name);
				System.out.println("Percentage is "+s.percentage);
			}
				
		}
		
		void displayTopperStudents(ArrayList<Student> al) {
			
			Comparator<Student> cmp = (m1, m2) ->{
				if(m1.percentage > m2.percentage) {
					return 1;
				}else if(m1.percentage < m2.percentage){
					return -1;
				}else {
					return 0;
				}
				};
				
			Student s = al.stream().max(cmp).get();		
				System.out.println("id is "+s.id);
				System.out.println("Name is "+s.name);
				System.out.println("Percentage is "+s.percentage);
			
				
		}
}


