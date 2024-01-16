package com.onetoonebi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetPersonById2 {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
	Pan pan=entityManager.find(Pan.class, 1);
		
		
		
		
	System.out.println("pan id is : "+pan.getId());
	System.out.println("pan address is : "+ pan.getAddress());
	System.out.println("pan number is : "+pan.getPanNumber());
	System.out.println("========================");
	
	Person person=pan.getPerson();
		
	System.out.println("person name is: "+person.getName());
	System.out.println("person email is: "+person.getEmail());
	System.out.println("person id is: "+person.getId());
	System.out.println("-----------------------");
		
	}

}
