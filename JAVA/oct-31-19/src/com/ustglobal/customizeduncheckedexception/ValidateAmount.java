package com.ustglobal.customizeduncheckedexception;

public class ValidateAmount {
void CheckAmount(int amount) throws InvalidAmountException {
	if(amount > 40000) {
		throw new InvalidAmountException();
	}
}
}
