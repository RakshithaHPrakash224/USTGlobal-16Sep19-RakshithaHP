package com.ustglobal.exception.first;

public class PVR  {	
void book() { 
try
{
	System.out.println("booking started");
	System.out.println(10/0);
	System.out.println("logic for booing");
	System.out.println("bookoing confirmed ");
} catch(ArithmeticException ae) {
	System.out.println("booking failed");
}
}
}
