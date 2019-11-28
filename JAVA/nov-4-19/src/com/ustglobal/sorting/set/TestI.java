package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestI {
public static void main(String[] args) {
	SortByName sb = new SortByName();
	SortByPincode sb1 = new SortByPincode();
	
	TreeSet<Bank> ts = new TreeSet<Bank>(sb1);
	Bank b1 = new Bank("HDFC" , 573201 , 5679043);
	Bank b2 = new Bank("SBI" , 573005 , 5673433);
	Bank b3 = new Bank("HDCC" , 500601 , 5673543);
	Bank b4 = new Bank("AXIS" , 571231 , 5675483);
	Bank b5 = new Bank("PNB" , 574561 , 5679053);
	Bank b6 = new Bank("PNB" , 574561 , 5679053);
	
	ts.add(b1);
	ts.add(b2);
	ts.add(b3);
	ts.add(b4);
	ts.add(b5);
	ts.add(b6);
	
	Iterator<Bank> it = ts.iterator();
	while(it.hasNext()) {
		Bank e = it.next();
		System.out.println("Name is :" +e.name);
		System.out.println("ID is :" +e.pincode);
		System.out.println("salary is :" +e.micr);
	}
	
}
}
