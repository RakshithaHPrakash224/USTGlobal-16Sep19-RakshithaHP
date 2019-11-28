package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.Comparator;

public class TestC {
public static void main(String[] args) {
	ArrayList<Integer> al = new ArrayList<Integer>();
	al.add(70);
	al.add(84);
	al.add(23);
	al.add(65);
	al.add(34);
	al.add(65);
	al.add(67);
	
	Comparator<Integer> cmp = (m1, m2) ->{
		if(m1 > m2) {
			return 1;
		}else if(m1<m2){
			return -1;
		}else {
			return 0;
		}
		};
		
		long noOffailedStudents = 
				al.stream().filter(i -> i<40).count();
		System.out.println(noOffailedStudents);
		
		
		
	
	
}
}
