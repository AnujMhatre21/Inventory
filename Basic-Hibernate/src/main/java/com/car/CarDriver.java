package com.car;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CarDriver {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Anuj"); // search for
																									// persistence file
		EntityManager entityManager = entityManagerFactory.createEntityManager(); // while return the entityManagertype
																					// object . EntityManager will
																					// perform crud opearations . for
																					// used to find records in the DB.
		EntityTransaction entityTransaction = entityManager.getTransaction(); // start the operations and anything from
																				// the DB

		car c = new car();
		
		c.setBrand("Kia");
		c.setName("Seltos");
		
		entityTransaction.begin();
		entityManager.persist(c);
		entityTransaction.commit(); // save the records
		System.out.println("All Good");

	}
}
