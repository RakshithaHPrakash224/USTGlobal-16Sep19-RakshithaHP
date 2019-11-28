package com.ustglobal.typecasting.refrence;

public class Marker extends Pen
{
	double size;
	void color() 
	{
		System.out.println("Marker color() method");
	}
	void write()                          //upcasting the write method from parent class
	{
		System.out.println("Marker write() method");
	}
}
