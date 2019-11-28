package com.ustglobal.sorting.maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class TestD {
public static void main(String[] args) {
	LinkedHashMap<String , Integer> lh = new LinkedHashMap<String , Integer>();
	lh.put("Banglore", 560068);
	lh.put("Hariyana", 134203);
	lh.put("bihar", 812001);
	System.out.println(lh);
	
	for(Map.Entry<String, Integer> m : lh.entrySet()) {
		String key = m.getKey();
		Integer value = m.getValue();
		System.out.println("Key is "+key+ "-----------"+"Value" +value);
		System.out.println("===================");
	}
}
}
