package com.ustglobal.exception.customizeuncheckedexception;

public class TestAge {
	public static void main(String[] args) {
		System.out.println("Main Started");
		
		Validator v = new Validator();
		try {
		v.verify(20);
		
		}catch(InvalidAgeException e) {
			System.out.println("exception occured");
		 
			
		}
		v.verify(13);
		System.out.println("Main Ended");
	}
}
