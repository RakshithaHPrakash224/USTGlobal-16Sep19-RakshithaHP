package com.ustglobal.sorting.set;

import java.util.Comparator;

public class SortByPincode implements Comparator<Bank> {

	@Override
	public int compare(Bank s1, Bank s2) {
		// TODO Auto-generated method stub
		Integer i = s1.pincode;
		Integer j = s2.pincode;
		
		return i.compareTo(j);
		
	}

}
