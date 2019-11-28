package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.dto.Product;

public class ReadDemo {
public static void main(String[] args) {
	
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	Product productdetail = entityManager.find(Product.class, 101);
	System.out.println("Id is -->"+productdetail.getPid());
	System.out.println("Name is --->"+productdetail.getPname());
	System.out.println("Quantity is--->"+productdetail.getQuantity());
	entityManager.close();
}
}
