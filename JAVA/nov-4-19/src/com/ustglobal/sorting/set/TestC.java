package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestC {
public static void main(String[] args) {
	LinkedHashSet h = new LinkedHashSet();
	h.add(12);
	h.add(13);
	h.add("darshan");
	h.add(34);
	
	
	
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
