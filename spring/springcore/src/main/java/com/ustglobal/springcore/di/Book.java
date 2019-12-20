package com.ustglobal.springcore.di;

public class Book {
private Author author;
private String name1;
private int price;

public Book() {
	// TODO Auto-generated constructor stub
}

public Book(Author author, String name1, int price) {
	this.author = author;
	this.name1 = name1;
	this.price = price;
}

public Author getAuthor() {
	return author;
}
public void setAuthor(Author author) {
	this.author = author;
}
public String getName1() {
	return name1;
}
public void setName1(String name1) {
	this.name1 = name1;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}


}
