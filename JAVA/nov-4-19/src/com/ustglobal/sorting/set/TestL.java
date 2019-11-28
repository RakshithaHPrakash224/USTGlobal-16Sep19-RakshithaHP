package com.ustglobal.sorting.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TestL {
	public static void main(String[] args) {
		
		Comparator<EEmployee> comp = (e1, e2) -> {
			return e1.name.compareTo(e2.name);
		};
		TreeSet<EEmployee> ts = new TreeSet<EEmployee>(comp);
		
		
		EEmployee e1 = new EEmployee(4 , "niki" , 5.5);
		EEmployee e2 = new EEmployee(3 , "vicky" , 5.8);
		EEmployee e3 = new EEmployee(2 , "miki" , 5.9);
		EEmployee e4 = new EEmployee(1 , "tiki" , 5.6);
		
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		
		Iterator<EEmployee> it = ts.iterator();
		while(it.hasNext()) {
			EEmployee e = it.next();
			System.out.println("Name is :"+e.name);
			System.out.println("ID is :"+e.id);
			System.out.println("Height is :"+e.height);
		}
		
	}
}
