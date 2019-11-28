package com.ustglobal.sorting.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class TestG {

public static void main(String[] args) {
	
	
	LinkedList<Pen> l = new LinkedList<Pen>();
	
	Pen p1 = new Pen(10 , "Reynolds" , "red");
	Pen p2 = new Pen(15 , "Cello" ,"black");
	Pen p3 = new Pen(20 , "Jetter" , "blue");
	Pen p4 = new Pen(30 , "Doms" , "red");
	
	l.add(p1);
	l.add(p2);
	l.add(p3);
	l.add(p4);
	
	System.out.println("Before sorting ----------");
	displayPenDetails(l);
	Collections.sort(l);
	
	System.out.println("After sorrting ----------");
	displayPenDetails(l);
	
	
}
	static void displayPenDetails(LinkedList<Pen> l){
		Iterator<Pen> it = l.iterator();
		while(it.hasNext()) {
			Pen p = it.next();
			System.out.println("Brand is " +p.price);
			System.out.println("Id is " +p.brand);
			System.out.println("Cost is " +p.color);
		}
	}
	

}
