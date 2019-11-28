package com.ustglobal.objectclass;

public class TestE {
public static void main(String[] args) {
	Cow c1 = new Cow(1 , "Ganga" , 20000);
	
	Cow c2 = new Cow(2 , "Ganag" , 30000);
	
boolean c3 = c1.equals(c2);
System.out.println(c3);

Employee c4 = new Employee(111 , "Ganga" , 20000);

Employee c5 = new Employee(111 , "Ganga" , 20000);

boolean c6 = c4.equals(c5);
System.out.println(c6);


}
}
