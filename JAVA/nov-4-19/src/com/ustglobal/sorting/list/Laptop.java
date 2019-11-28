package com.ustglobal.sorting.list;

public class Laptop implements Comparable<Laptop>{
int price;
int id;
String name;
public Laptop(int price, int id, String name) {
	super();
	this.price = price;
	this.id = id;
	this.name = name;
}

public int compareTo(Laptop lp) {
	
	Integer i = this.id;
	Integer j = lp.id;
	
	return i.compareTo(j);
}
}
