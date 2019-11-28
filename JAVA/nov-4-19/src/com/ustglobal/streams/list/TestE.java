package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;		

import java.util.Iterator;

public class TestE {
public static void main(String[] args) {
	ArrayList<Integer> al = new ArrayList<Integer>();
	al.add(70);
	al.add(84);
	al.add(23);
	al.add(65);
	al.add(34);
	al.add(65);
	al.add(67);
	
	List<Integer> l = al.stream().sorted().collect(Collectors.toList());
	Iterator<Integer> it = l.iterator();
	while(it.hasNext()) {
		Integer i = it.next();
		System.out.println(i);
	}
}
}
