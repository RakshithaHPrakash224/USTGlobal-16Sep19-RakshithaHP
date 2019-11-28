package com.ustglobal.sorting.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;


public class TestD {
public static void main(String[] args) {
	
	LinkedList<Laptop> l1 = new LinkedList<Laptop>();
	
	Laptop lp1 = new Laptop(25000 , 1 , "dell");
	Laptop lp2 = new Laptop(35000 , 2 , "mac");
	Laptop lp3 = new Laptop(25500 , 3 , "asus");
	Laptop lp4 = new Laptop(25500 , 4 , "acer");
	
	l1.add(lp1);
	l1.add(lp2);
	l1.add(lp3);
	l1.add(lp4);
	
	l1.add(new Laptop(20000 , 2 , "acer"));
	
	System.out.println("Before sorting ----------");
	displaylaptopDetails(l1);
	Collections.sort(l1);
	
	System.out.println("After sorrting ----------");
	displaylaptopDetails(l1);
	
}

static void displaylaptopDetails(LinkedList<Laptop> l) {
	Iterator<Laptop> it = l.iterator();
	while(it.hasNext()) {
		Laptop lp = it.next();
		System.out.println("Brand is " +lp.name);
		System.out.println("Id is " +lp.id);
		System.out.println("Cost is " +lp.price);
	}
}
}
