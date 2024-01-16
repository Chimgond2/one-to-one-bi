package com.onetoonebi;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveVehiclecharcy {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Vehicle vehicle=new Vehicle();
		vehicle.setName("pulser");
		vehicle.setCost(25000);
		
		
		Charcy charcy=new Charcy();
		charcy.setCharcyNumber("ka39ma25");
		charcy.setType("onroad");
		
		vehicle.setCharcy(charcy);
		
		entityTransaction.begin();
		entityManager.persist(vehicle);
		entityTransaction.commit();
		
	}

}
