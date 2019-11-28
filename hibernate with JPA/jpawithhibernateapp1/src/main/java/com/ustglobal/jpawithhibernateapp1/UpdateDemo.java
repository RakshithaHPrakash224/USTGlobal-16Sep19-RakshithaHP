package com.ustglobal.jpawithhibernateapp1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp1.dto.EmployeeInfo;


public class UpdateDemo {

public static void main(String[] args) {
	EntityManager entityManager = null;
	EntityTransaction entityTransaction = null;
	try {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
	entityManager = entityManagerFactory.createEntityManager();
	entityTransaction = entityManager.getTransaction();
	entityTransaction.begin();
	EmployeeInfo productInfo = entityManager.find(EmployeeInfo.class,12);
	productInfo.setName("radahana");
	System.out.println("Updated record");
	entityTransaction.commit();
	}catch (Exception e) {
		e.printStackTrace();
		entityTransaction.rollback();
		// TODO: handle exception
	}
	entityManager.close();
}
}
