package com.ustglobal.beanobject.bean;

import java.util.Scanner;

public class TestB 
{
	public static void main(String[] args) 
	{
		System.out.println("Scanner class");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age : ");
		int age = sc.nextInt();
		System.out.println("Age is "+age);
		
		System.out.println("Are you male???");
		boolean a = sc.nextBoolean();
		System.out.println(a);
	}

}
