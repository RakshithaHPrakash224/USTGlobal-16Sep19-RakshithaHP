package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestD {
public static void main(String[] args) {
	LinkedHashSet<Double> h = new LinkedHashSet<Double>();
	h.add(12.50);
	h.add(13.65);
	h.add(14.55);
	h.add(34.65);
	
	for(Object a : h) {
		 System.out.println(a);
	 }
	 
	System.out.println("================");

Iterator it = h.iterator();
	while(it.hasNext()) {
	Object p = it.next();
	System.out.println(p);
}
	
}
}
