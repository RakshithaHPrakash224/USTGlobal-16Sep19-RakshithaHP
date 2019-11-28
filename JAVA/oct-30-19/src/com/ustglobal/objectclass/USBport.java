package com.ustglobal.objectclass;

public class USBport {
public static  void connect(Object obj) {
	
	if(obj instanceof mouse) {
		mouse m =(mouse) obj;
		m.click();
		m.scroll();
	}
	
	else if(obj instanceof pendrive ) {
		pendrive p =  (pendrive) obj;
		p.read();
		p.write();
		
	}
	else
	{
		System.out.println("this is invalid");
	}
}
}
