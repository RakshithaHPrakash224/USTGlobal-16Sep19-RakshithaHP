package com.ustglobal.exception.customizecheckedexception;

public class TestAmount {
	public static void main(String[] args) {
		
		System.out.println("Main started");
		
		ValidateAmount va = new ValidateAmount();
		try {
			
			va.checkAmount(50000);
			System.out.println("Withdraw your cash");
			
		} catch (InvalidAmountException e) {
			
			System.err.println(e.getMessage());  //if you want to show error message use err instead of out
			
		}
		
		System.out.println("Main ended");
	}

}
