package com.ustglobal.exception.first;

public class TestF
{
	public static void main(String[] args) 
	{
		System.out.println("Main started");
		String s = "hello";
		int[] a = {10,20,30};
		int b = 10;
		try
		{
			String s1 = s.toUpperCase();
			System.out.println(s1);
			System.out.println(a[2]);
			System.out.println(b/0);
		}
		catch(NullPointerException npe)
		{
			System.out.println("dont play with null");
		}
		catch(ArrayIndexOutOfBoundsException aie)
		{
			System.out.println("Index not present");
		}
		catch(ArithmeticException ae)
		{
			System.out.println("divide by zero error");
		}
		System.out.println("Main Ended");		
	}

}
