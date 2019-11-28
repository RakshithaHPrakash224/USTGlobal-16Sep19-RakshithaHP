package com.ustglobal.customizeduncheckedexception;

public class TestAmount {
public static void main(String[] args) {
	System.out.println("Main started");
	
	ValidateAmount va = new ValidateAmount();
	try {
		va.CheckAmount(50000);
		System.out.println("Withdraw your cash");
	} catch (InvalidAmountException e) {
		// TODO Auto-generated catch block
		System.err.println(e.getMessage());
	}
	
	System.out.println("Main eneded");
}
}
