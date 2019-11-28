package com.ustglobal.customizeduncheckedexception;

import java.util.Scanner;

public class TestC {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	try(Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in)
				){
		System.out.println("Enter Age");
		int age = sc.nextInt();
		System.out.println("age" +age);
		System.out.println(age/0);
		}
	catch(ArithmeticException ae) {
		ae.printStackTrace();
	}finally {
		System.out.println("finally executed");
	}
			
}
}
