package com.ustglobal.customizeduncheckedexception;

public class Validator {
void verify(int age) {
	if(age < 18) {
		throw new InvalidAgeExcpetion("try again next time");
	}
}
}
