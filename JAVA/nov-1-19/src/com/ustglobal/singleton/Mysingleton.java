package com.ustglobal.singleton;

public class Mysingleton {
private static Mysingleton instance = null;
String s1;
private Mysingleton() {
	
}

public static Mysingleton getDbConnection() {
	if(instance == null) {
		instance = new Mysingleton();
		return instance;
	} else 
	{
		return instance;
	}
}
}
