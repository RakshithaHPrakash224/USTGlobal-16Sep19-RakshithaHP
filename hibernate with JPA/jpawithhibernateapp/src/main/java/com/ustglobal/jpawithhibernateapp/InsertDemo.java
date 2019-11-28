package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.dto.Product;

public class InsertDemo {
public static void main(String[] args) {
Product product = new Product();
product.setPid(102);
product.setPname("Ramana");
product.setQuantity(15);

EntityManager entityManager = null;
EntityTransaction entityTransaction = null;
try {

EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
entityManager = entityManagerFactory.createEntityManager();
entityTransaction = entityManager.getTransaction();
entityTransaction.begin();
entityManager.persist(product);
System.out.println("Record saved");
entityTransaction.commit();
}catch (Exception e) {
	e.printStackTrace();
	entityTransaction.rollback();
	// TODO: handle exception
}
entityManager.close();
}//end of main
}// end of class
