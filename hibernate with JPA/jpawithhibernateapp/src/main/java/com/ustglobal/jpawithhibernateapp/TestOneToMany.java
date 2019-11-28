package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.onetomany.Pencil;
import com.ustglobal.jpawithhibernateapp.onetomany.PencilBox;


public class TestOneToMany {
public static void main(String[] args) {
	PencilBox pb = new PencilBox();
	pb.setBid(30);
	pb.setBname("Apsara");
	
	Pencil p = new Pencil();
	p.setPid(5);
	p.setColor("blue");
	p.setPencilbox(pb);
	
	Pencil p1 = new Pencil();
	p1.setPid(4);
	p1.setColor("purple");
	p1.setPencilbox(pb);
	
	
	EntityManagerFactory entityManagerFactory = null;
	EntityManager entityManager = null;
	EntityTransaction entityTransaction = null;
	try {
		
		entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
//		VoterCard vCard = entityManager.find(VoterCard.class, 10);
//		System.out.println(vCard.getPerson().getPid());
		entityManager.persist(p);
		entityManager.persist(p1);
		System.out.println("Record saved");
		entityTransaction.commit();
		
		
	} catch (Exception e) {
		e.printStackTrace();
	
	}
	entityManager.close();
}
}
