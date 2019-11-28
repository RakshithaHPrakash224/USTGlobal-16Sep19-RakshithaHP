package com.ustglobal.inheritance;

public class ClassB  extends ClassA{
private void m1() {
	System.out.println("m2 method");
}

public static void main(String[] args) {
	ClassB c1 = new ClassB();
	c1.m1();
	
}
}
