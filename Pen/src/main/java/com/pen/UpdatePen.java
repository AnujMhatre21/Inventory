package com.pen;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdatePen {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Anuj");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		pen p = entityManager.find(pen.class, 4);
		p.setCOMPANY("Parker");
		if (p != null) {
			entityTransaction.begin();
			entityManager.merge(p);
			entityTransaction.commit();
			System.out.println("Value has been Changed");
		} else {
			System.out.println("Value are not updated");
		}
	}
}
