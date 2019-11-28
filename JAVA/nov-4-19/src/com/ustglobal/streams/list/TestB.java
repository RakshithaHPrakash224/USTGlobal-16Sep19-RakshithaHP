package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestB {
public static void main(String[] args) {

	ArrayList<Integer> al = new ArrayList<Integer>();
	al.add(10);
	al.add(20);
	al.add(35);
	al.add(40);
	al.add(50);
	al.add(65);
	al.add(70);
	al.add(85);
	al.add(90);
	
	List<Integer> l = 
			al.stream().map(i -> i*2+50).collect(Collectors.toList());
	
	for(Integer i : l) {
		System.out.println(i);
		};
	
	
	
	
}
}
