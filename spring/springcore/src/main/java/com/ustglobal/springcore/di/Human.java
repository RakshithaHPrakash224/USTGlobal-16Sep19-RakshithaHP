package com.ustglobal.springcore.di;

public class Human implements Animal{
	
	 public Human() {
		System.out.println("Human is created ");
	}
	@Override
	public void makeSound() {
		System.out.println("Blah Blah!!!!!");
	}
}
