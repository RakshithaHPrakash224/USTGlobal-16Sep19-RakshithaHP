package com.ustglobal.sorting.maps;

import java.util.HashMap;

public class TestB {
public static void main(String[] args) {
	HashMap hm = new HashMap();
	hm.put("Kuku", 905643);
	hm.put("miki", 456789);
	hm.put("sheela", 567890);
	
	
	HashMap hm1 = new HashMap();
	hm.put("Kiki", 908976);
	hm.put("Nikki", 453456);
	hm.put("Tikki", 560812);
	
	boolean haskey = hm.containsKey("mala");
	System.out.println("has key " +haskey);
	
	boolean hasvalue = hm.containsValue(456789);
	System.out.println("has value " +hasvalue);
	
	hm.putAll(hm1);
	
	System.out.println("After put all" +hm);
	
	boolean  isempty = hm.isEmpty();
	System.out.println("Map is Empty " +isempty);
	
	hm.clear();
	System.out.println("after clear " +hm);
}
}
