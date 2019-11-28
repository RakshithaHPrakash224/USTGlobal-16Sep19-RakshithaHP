package com.ustglobal.sorting.list;

import java.util.LinkedList;

public class TestE {
public static void main(String[] args) {
	LinkedList<Integer> l = new LinkedList<Integer>();
	l.add(12);
	l.add(32);
	l.add(24);
	l.add(35);
	
	
	Integer peekElement = l.peek();
	System.out.println("the peek element" +peekElement);
	Integer peekFirstElement = l.peekFirst();
	System.out.println("the peekFirst element" +peekFirstElement);
	Integer peekLastElement = l.peekLast();
	System.out.println("the peekLast element" +peekLastElement);
	System.out.println("after peek------------"+l);
	
	
	Integer pollElement = l.poll();
	System.out.println("the peek element" +pollElement);
	Integer pollFirstElement = l.pollFirst();
	System.out.println("the pollFirst element" +pollFirstElement);
	Integer pollLastElement = l.pollLast();
	System.out.println("the pollLast element" +pollLastElement);
	System.out.println("after poll------------"+l);
	
	
	l.push(12);
	System.out.println("After push.. "+l);
	Integer p = l.pop();
	System.out.println(p);
	System.out.println("after pop.. " +l);
}
}
