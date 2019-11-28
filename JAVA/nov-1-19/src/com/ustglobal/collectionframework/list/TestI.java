package com.ustglobal.collectionframework.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

public class TestI {
		public static void main(String[] args) {
			Stack l = new Stack();
			
			l.add(10);
			l.add("sadana");
			l.add("darshan");
			l.add(23.00);
			l.add(true);
			l.add(null);
			
			Object o =  l.get(0);
			
			Iterator<Object> li = l.iterator();
			while(li.hasNext()) {
				 Object o1 = li.next();
				System.out.println(o1);
			}
			System.out.println("===========Using list iterator==============");
			
			
			ListIterator<Object> l1 = l.listIterator();
			while(l1.hasNext()) {
				Object o2 = l1.next();
				System.out.println(o2);
			}
			
			System.out.println("===========Usingfor each==============");
			
			for(Object n : l) {
				System.out.println(n);
			}
		}
}
