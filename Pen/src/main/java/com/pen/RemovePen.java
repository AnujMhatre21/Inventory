package com.pen;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class RemovePen {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Anuj");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		pen p = entityManager.find(pen.class, 6);
		if (p != null) {
			entityTransaction.begin();
			entityManager.remove(p);
			entityTransaction.commit();
			System.out.println("Object with above id is been removed");
		} else {
			System.out.println("No such ID Found");
		}
	}
}
