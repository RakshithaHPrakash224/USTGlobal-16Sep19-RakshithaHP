package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Collections;

public class TestM {
	
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Girija");
		al.add("Vanaja");
		al.add("jalala");
		al.add("Kiran");
		
		System.out.println("Before sort ..................>"+al);
		
		Collections.sort(al);
		System.out.println("after sort --------------------->"+al);
 	}

}
