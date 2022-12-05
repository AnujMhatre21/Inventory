package com.pen;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PenDriver {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Anuj");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		pen p = new pen();
		p.setNAME("Cello");
		p.setCOLOUR("Green");
		p.setCOMPANY("Tri");

		entityTransaction.begin();
		entityManager.persist(p);// used to add records in the DB
		entityTransaction.commit();

	}

}
