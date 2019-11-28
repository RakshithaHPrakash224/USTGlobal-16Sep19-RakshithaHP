package com.ustglobal.jpawithhibernateapp;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.manytomany.Course;
import com.ustglobal.jpawithhibernateapp.manytomany.Student;
import com.ustglobal.jpawithhibernateapp.onetomany.Pencil;
import com.ustglobal.jpawithhibernateapp.onetomany.PencilBox;

public class TestManyToMany {
public static void main(String[] args) {

	Course c = new Course();
	c.setCid(30);
	c.setCname("java");
	
	Course c1 = new Course();
	c1.setCid(40);
	c1.setCname("sql");
	
	ArrayList<Course> alCourse = new ArrayList<Course>();
	alCourse.add(c);
	alCourse.add(c1);
	
	Student s = new Student();
	s.setSid(2);
	s.setSname("Radha");
	s.setCourses(alCourse);
	
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
		entityManager.persist(s);
//		entityManager.persist(p1);
		System.out.println("Record saved");
		entityTransaction.commit();
		
		
	} catch (Exception e) {
		e.printStackTrace();
	
	}
	entityManager.close();
}
}
