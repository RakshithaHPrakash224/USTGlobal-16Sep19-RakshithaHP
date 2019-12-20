package com.ustglobal.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ustglobal.springcore.di.Author;
import com.ustglobal.springcore.di.Hello;

public class BookApp {
public static void main(String[] args) {
	
	ApplicationContext context = new ClassPathXmlApplicationContext("bookbeans.xml");
	Author author = context.getBean(Author.class);
    System.out.println(author.getName());
    System.out.println(author.getPen_name());
}
}
