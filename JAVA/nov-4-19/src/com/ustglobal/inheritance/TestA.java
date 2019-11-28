package com.ustglobal.inheritance;

import java.util.ArrayList;
import java.util.List;

public class TestA {
public static void main(String[] args) {
	ArrayList<Double> al = new ArrayList<Double>();
	al.add(34.5);
	al.add(25.5);
	al.add(39.66);
	al.add(45.65);
	al.add(null);
	al.add(null);
	System.out.println(al);
	al.add(2,44.88);
	System.out.println("After addin 2nd index"+al);
	al.remove(0);
	System.out.println("after removing 0th index"+al);
	al.remove(null);
	System.out.println("after removing null"+al);
	al.set(2,77.6 );
	System.out.println("after setting the 2nd index"+al);
	al.clear();
	System.out.println("after clearing the elements"+al);
	al.contains(77.6);
	
	
	List<Double> al1 = new ArrayList<>();
	al1.add(54.55);
	al1.add(34.78);
	al1.add(34.55);
	
	al.addAll(al1);
	System.out.println("after add all "+al1);
	
	boolean contain = al.containsAll(al1);
	System.out.println("Contains all of all " +contain);
	
	boolean res = al.removeAll(al1);
	System.out.println("removing all elements "+res);
	
	
}
}
