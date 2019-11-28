package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestE {
public static void main(String[] args) {
	TreeSet ts = new TreeSet();
	ts.add(12);
	ts.add(13);
	ts.add(14);
	ts.add(45);
	ts.add(23);
	
	for(Object a : ts) {
		 System.out.println(a);
	 }
	 
	System.out.println("================");

Iterator it = ts.iterator();

	while(it.hasNext()) {
	Object p = it.next();
	System.out.println(p);
}
	
}
}
