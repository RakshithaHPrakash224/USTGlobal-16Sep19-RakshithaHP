package com.ustglobal.objectclass;

public class TestA {
public static void main(String[] args) {
	pendrive p = new pendrive();
	USBport.connect(p);
	
	mouse m = new mouse();
	USBport.connect(m);
}
}
