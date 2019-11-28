package com.ustglobal.sorting.maps;

import java.util.HashMap;

public class TestA {
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put("Kuku", 905643);
		hm.put("miki", 456789);
		hm.put("sheela", 567890);
		System.out.println(hm);
		
		hm.put("mala", 789454);
		System.out.println("After modify" +hm);//forkeys duplicayes are not allowed
		hm.put("mala", 789400);
		System.out.println("After mala1" +hm);
		
		hm.put(null, 789464);
		System.out.println("After null" +hm);
		
		Object phonenum = hm.get("sheela");
		System.out.println("value "+phonenum);
		
		System.out.println("========================");
		
		Object value = hm.remove("kuku");
		System.out.println("value :"+value);
		
		System.out.println("========================");
		
		
	
	
	}
}
