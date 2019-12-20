package com.ustglobal.springcore.di;

import org.springframework.stereotype.Component;


public class Dog implements Animal {
	
	public Dog() {
		System.out.println("Dog is creted");
	}

	@Override
	public void makeSound() {
		System.out.println("Bow Bow!!!!!");
		
	}

}
