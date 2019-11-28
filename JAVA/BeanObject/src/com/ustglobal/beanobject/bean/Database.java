package com.ustglobal.beanobject.bean;

public class Database 
{
	void receive(Student s) 
	{
		System.out.println("Id is "+s.getId());
		System.out.println("Name is "+s.getName());
		System.out.println("Rollno is "+s.getRollno());
		System.out.println("=========================");
	}
	
	void save(Employee e)
	{
		System.out.println("========I'm Database========");
		System.out.println("Id is "+e.getId());
		System.out.println("Name is "+e.getName());
		System.out.println("Salary is "+e.getSalary());
	}

}
