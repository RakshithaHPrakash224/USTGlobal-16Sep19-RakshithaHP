package com.ustglobal.lambdaexpressions;

public class testString {
	public static void main(String[] args) {
		
	
greet g = message -> message;
String m1 = g.Greet("hello");
System.out.println(m1);
}
}