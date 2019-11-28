package com.ustglobal.singleton;

public class Test {
	public static void main(String[] args) {
		
	String  s = "hello";
	
Mysingleton ms = Mysingleton.getDbConnection();
ms.s1 = "Hello";
System.out.println(ms.hashCode());

	}
}
