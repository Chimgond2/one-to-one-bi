package com.onetoonebi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetPersonById {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
	Person person=entityManager.find(Person.class, 1);
		
		
		System.out.println("person name is: "+person.getName());
		System.out.println("person email is: "+person.getEmail());
		System.out.println("person id is: "+person.getId());
		System.out.println("-----------------------");
		
		//Pan pan=person.getPan();
		//System.out.println("pan id is : "+pan.getId());
		//System.out.println("pan address is : "+ pan.getAddress());
		//System.out.println("pan number is : "+pan.getPanNumber());
		//System.out.println("========================");
		
		
	}

}
