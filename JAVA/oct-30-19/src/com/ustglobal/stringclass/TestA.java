package com.ustglobal.stringclass;

public class TestA {
public static void main(String[] args) {
	String s1 = "aishu";
	String s2 = "DEEPIKA";
	String s3 = new String("aishu");
	String s4 = new String ("aishu");
	String s5 = "aishu";
	
	System.out.println(s1.equals(s2));
	System.out.println(s3.equals(s4));
	System.out.println(s1.equals(s5));
	
	String s6 = s1.toUpperCase();
	String s7 = s2.toLowerCase();
	System.out.println(s6);
	System.out.println(s7);
	
	char c = s1.charAt(0);
	System.out.println(c);
	
	boolean b = s1.equalsIgnoreCase("AISHu");
	System.out.println(b);
	
	
	StringBuffer sb1 = new StringBuffer("kavya");
	sb1.append("xyz");
	System.out.println();
}
}
