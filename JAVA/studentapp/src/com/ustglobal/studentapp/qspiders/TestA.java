package com.ustglobal.studentapp.qspiders;
import com.ustglobal.studentapp.jspiders.*;
public class TestA {
	public static void main(String[] args) {
		QTP q = new QTP();
		q.teachQTP();
		
		Selenium se = new Selenium();
		se.teachSelenium();
		
		//com.ustglobal.studentapp.jspiders.Angular a = new com.ustglobal.studentapp.jspiders.Angular();
		Angular a = new Angular();
		a.teachAngular();
	}

}	