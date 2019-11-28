package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;

public class TestB {
public static void main(String[] args) {
	
	ArrayList<String> al = new ArrayList<String>();
	al.add("Girija");
	al.add("safana");
	al.add("dhanya");
	al.add("radha");
	al.add("dharma");
	
	System.out.println("nefore sorting"+al);
	Collections.sort(al);
	System.out.println("After sorting"+al);
	
	Collections.reverse(al);
	System.out.println("After reversing"+al);
	
	Collections.shuffle(al);
	System.out.println("After shuffling"+al);
	
}
}
