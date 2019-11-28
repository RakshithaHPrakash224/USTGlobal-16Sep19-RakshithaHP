package com.ustglobal.collectionframework.list;

public class StudentArray {

	public String name; 
	public int roll_no;
	public String branch;
	
	StudentArray(String name, int roll_no, String branch) 
	{ 
		 
		this.name = name;
		this.roll_no = roll_no;
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "Student1 [name=" + name + ", roll_no=" + roll_no + ", branch=" + branch + "]";
	}
	
	
	
} 


