package com.ustglobal.accessmodifiesr.pkg1;

import com.ustglobal.accessmodifiesr.pkg2.Demo;

public class Sample extends Demo
{
	public static void main(String[] args) 
	{
		Demo d = new Demo();
		
		//PRIVATE
//		System.out.println(d.a);   //not possible
//		d.add();
		
		//DEFAULT
//		System.out.println(d.b);
//		d.sub();
		
		Sample s = new Sample();
//		//PROTECTED
//		System.out.println(d.c);
//		d.mul();
		
		//PUBLIC
		System.out.println(d.name);
		d.div();
	}
}
