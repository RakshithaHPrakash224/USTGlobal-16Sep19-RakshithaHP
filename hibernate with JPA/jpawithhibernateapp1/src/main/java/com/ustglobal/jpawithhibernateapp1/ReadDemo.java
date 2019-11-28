package com.ustglobal.jpawithhibernateapp1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp1.dto.EmployeeInfo;

public class ReadDemo {

public static void main(String[] args) {
	
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EmployeeInfo productdetail = entityManager.find(EmployeeInfo.class, 12);
	System.out.println("Id is -->"+productdetail.getId());
	System.out.println("Name is --->"+productdetail.getName());
	System.out.println("Salary is--->"+productdetail.getSal());
	System.out.println("Gender is--->"+productdetail.getGender());
	entityManager.close();
}
}
