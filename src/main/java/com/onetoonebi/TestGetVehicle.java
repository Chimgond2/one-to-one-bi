package com.onetoonebi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetVehicle {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		Vehicle vehicle=entityManager.find(Vehicle.class, 1);
		
		if(vehicle!=null) {
			System.out.println(vehicle.getName());
			System.out.println(vehicle.getCost());
			System.err.println(vehicle.getId());
		}
	}
}
