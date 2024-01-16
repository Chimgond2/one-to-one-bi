package com.onetoonebi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestSaveGetGstCompany {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		Gst gst=entityManager.find(Gst.class, 1);
		
		System.out.println("gst id is: "+gst.getId());
		System.out.println("gst number is: "+ gst.getGstNumber());
		System.out.println("gst state is: "+gst.getState());
		
		Company company=gst.getCompany();
		System.out.println("company id is: "+company.getId());
		System.out.println("company name is: "+ company.getName());
		System.out.println("company website is: "+company.getWebsite());
		
		
		
		
		
	}
	

}
