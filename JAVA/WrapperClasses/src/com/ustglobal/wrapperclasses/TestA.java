package com.ustglobal.wrapperclasses;

public class TestA
{
	public static void main(String[] args) 
	{
		int a = 10;
		System.out.println("a is "+a);
		Integer i = a;  //Boxing or Auto Boxing
		System.out.println("i is "+i);
		
		Integer x = 10;
		Integer z = new Integer(20);
		System.out.println("x is "+x);
		int y = x;  //unoxing auto un boxing
		System.out.println("y is "+y);
		
		
	}
}
