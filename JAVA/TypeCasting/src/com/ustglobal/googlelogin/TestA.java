package com.ustglobal.googlelogin;

public class TestA {
public static void main(String[] args) {
	Browser b = new Browser();
	
	Google g = new Gmail();
	b.open(g);
	
	Google gd = new GoogleDrive();
	b.open(gd);
}
}
