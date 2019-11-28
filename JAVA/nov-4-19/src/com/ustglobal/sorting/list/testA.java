package com.ustglobal.sorting.list;

import java.util.Collections;
import java.util.LinkedList;
public class testA {
public static void main(String[] args) {
	LinkedList<Integer> l = new LinkedList<Integer>();
	l.add(12);
	l.add(16);
	l.add(17);
	l.add(15);
	
	System.out.println("Before sorting"+l);
	Collections.sort(l);
	System.out.println("After sorting" +l);
	
	Collections.reverse(l);
	System.out.println("After reversing" +l);
	
	Collections.shuffle(l);
	System.out.println("After shuffling" +l);
	
}
}
