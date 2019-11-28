package com.ustglobal.sorting.maps;

import java.util.Hashtable;

public class TestH {
public static void main(String[] args) {
	Hashtable<Integer , String> ht = new Hashtable<Integer , String>();
	ht.put(101, "ajay");
	ht.put(102, "vijay");
	ht.put(103, "sujay");
	ht.put(104, "sonu");
	ht.put(105, "monu");
	//ht.put(null, "savitha");//Null pointer exception
	//ht.put(108, null);//null pointer exception
	
	System.out.println("Data :"+ht);
}
}
