package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.onetoone.Person;
import com.ustglobal.jpawithhibernateapp.onetoone.VoterCard;

public class TestOneToOne {
public static void main(String[] args) {
	
	VoterCard vc = new VoterCard();
	vc.setVid(10);
	vc.setVname("Ram");
	Person p = new Person();
	p.setPid(1);
	p.setPname("Rakshitha");
	p.setVotercard(vc);
	
	EntityManagerFactory entityManagerFactory = null;
	EntityManager entityManager = null;
	EntityTransaction entityTransaction = null;
	try {
		
		entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		VoterCard vCard = entityManager.find(VoterCard.class, 10);
		System.out.println(vCard.getPerson().getPid());
//		entityManager.persist(p);
		System.out.println("Record saved");
		entityTransaction.commit();
		
		
	} catch (Exception e) {
		e.printStackTrace();
	
	}
	entityManager.close();
}
}
