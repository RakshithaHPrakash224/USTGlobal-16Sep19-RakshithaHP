package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestF {
public static void main(String[] args) {
	TreeSet<String> ts = new TreeSet<String>();
	ts.add("roopa");
	ts.add("deepa");
	ts.add("radha");
	ts.add("dharma");
	
	for(Object a : ts) {
		 System.out.println(a);
	 }
	 
	System.out.println("================");

Iterator<String> it = ts.iterator();

	while(it.hasNext()) {
	String p = it.next();
	System.out.println(p);
}
}
}
