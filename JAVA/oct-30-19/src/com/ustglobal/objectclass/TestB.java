package com.ustglobal.objectclass;

public class TestB {
public static void main(String[] args) {
	pen p = new pen();
	int code = p.hashCode();
	System.out.println("Hashcode of p is:"+ code);
}
}
