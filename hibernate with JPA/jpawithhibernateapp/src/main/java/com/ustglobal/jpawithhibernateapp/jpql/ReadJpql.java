package com.ustglobal.jpawithhibernateapp.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;


import com.ustglobal.jpawithhibernateapp.dto.Product;

public class ReadJpql {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		//	EntityTransaction entityTransaction = null;

		entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		entityManager = entityManagerFactory.createEntityManager();
//		String jpql = "from Product";
		
		String jpql = "select pname from product";
		Query query = entityManager.createQuery(jpql);
		
		
//		List<Product> products = query.getResultList();
//		for(Product product : products) {
//			//System.out.println(product.getPid());
//			System.out.println(product.getPname());
//			//System.out.println(product.getQuantity());
//			System.out.println("-------------------------------");
//		}
		
		List<String> product = query.getResultList();
		for( String products  : product ) {
			//System.out.println(product.getPid());
			System.out.println(products);
			//System.out.println(product.getQuantity());
			System.out.println("-------------------------------");
		}
		
		entityManager.close();
	}
}
