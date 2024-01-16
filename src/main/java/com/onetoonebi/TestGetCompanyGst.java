package com.onetoonebi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetCompanyGst {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		Company company=entityManager.find(Company.class, 1);
		System.out.println("company id is: "+company.getId());
		System.out.println("company name is: "+company.getName());
		System.out.println("company website is: "+company.getWebsite());
		
		Gst gst=company.getGst();
		System.out.println("gst id is: "+gst.getId());
		System.out.println("gst number is: "+gst.getGstNumber());
		System.out.println("gst state is: "+gst.getState());
		
	}

}
