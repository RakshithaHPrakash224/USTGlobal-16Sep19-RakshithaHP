package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.dto.Product;

public class GetReference {
public static void main(String[] args) {
	
	EntityTransaction transaction = null;
	EntityManager entityManager = null;
	
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
	entityManager = entityManagerFactory.createEntityManager();
//	Product product = entityManager.getReference(Product.class, 101);
	
	Product productInfo = entityManager.find(Product.class,101);//alone it will print the query
	System.out.println(productInfo.getClass());
//	System.out.println(product.getPid());
//	System.out.println(product.getPname());
//	System.out.println(product.getQuantity());
	entityManager.close();
	
	
}
}
