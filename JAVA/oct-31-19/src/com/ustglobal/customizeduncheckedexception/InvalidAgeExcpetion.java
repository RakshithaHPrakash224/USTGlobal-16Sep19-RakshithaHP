package com.ustglobal.customizeduncheckedexception;

public class InvalidAgeExcpetion extends RuntimeException {
	String message = "Invalid Age below 18 yearsb not allowed";
	 public InvalidAgeExcpetion() {
		// TODO Auto-generated constructor stub
	}
	 
	 public InvalidAgeExcpetion(String message) {
		 this.message = message;
	 }
	@Override
	public String getMessage() {
		return message;
	}
}
