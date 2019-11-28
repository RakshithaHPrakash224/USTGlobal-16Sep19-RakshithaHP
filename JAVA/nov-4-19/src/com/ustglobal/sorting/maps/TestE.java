package com.ustglobal.sorting.maps;

import java.util.Map;
import java.util.TreeMap;

public class TestE {
public static void main(String[] args) {
	TreeMap<String , Integer> lh = new TreeMap<String , Integer>();
	lh.put("Banglore", 560068);
	lh.put("Hariyana", 134203);
	lh.put("bihar", 812001);
	
	for(Map.Entry<String , Integer> m : lh.entrySet()) {
		String key = m.getKey();
		Integer  value = m.getValue();
		System.out.println("Key value is :" +key);
		System.out.println("Valuepair value is :" +value);
	}
}
}
