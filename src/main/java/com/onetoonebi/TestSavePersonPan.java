package com.onetoonebi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSavePersonPan {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
	Person person=new Person();
	person.setName("chandu");
	person.setEmail("chandu@gmail.com");
	
	Pan pan =new Pan();
	pan.setAddress("bangalore");
	pan.setPanNumber("12qp54");
	
	//person.setPan(pan);
	pan.setPerson(person);
	
	entityTransaction.begin();
	entityManager.persist(pan);
	entityManager.persist(person);
	entityTransaction.commit();
	}

}
