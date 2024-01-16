package com.onetoonebi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveCompanyGst {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Company company=new Company();
		company.setName("test yantra");
		company.setWebsite("www.test yantra.com");
		
		Gst gst=new Gst();
		gst.setGstNumber("122ho");
		gst.setState("karnatak");
		
		gst.setCompany(company);
		company.setGst(gst);
		
		entityTransaction.begin();
		entityManager.persist(company);
		entityManager.persist(gst);
		entityTransaction.commit();
	}

}
