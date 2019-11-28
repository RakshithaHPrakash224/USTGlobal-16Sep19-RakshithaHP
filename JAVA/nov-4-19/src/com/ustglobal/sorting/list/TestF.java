package com.ustglobal.sorting.list;

import java.util.Stack;

public class TestF {
public static void main(String[] args) {
	Stack<Integer> s = new Stack<>();
	s.add(12);
	s.add(13);
	s.add(14);
	s.push(23);
	s.push(34);
	
	System.out.println("Using get()---------");
	for(int i = 0; i<s.size();i++) {
		System.out.println(s.get(i));
	}
	
	System.out.println("using pop() method");
	for(int i = 0 ; i<s.size(); i++) {
		System.out.println(s.pop());
	}
}
}
