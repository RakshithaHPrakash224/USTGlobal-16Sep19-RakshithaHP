package com.ustglobal.sorting.set;

import java.util.HashSet;

public class TestA {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		 hs.add(12);
		 hs.add(45);
		 hs.add("deepa");
		 hs.add(56.7);
		 hs.add(null);
		// hs.add(null);
		 
		 System.out.println("************ using for loop *************");
		 
		 for(Object a : hs) {
			 System.out.println(a);
		 }
		 
		 
	}

}
