package com.pen;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PenDao {
	public void AddElements(pen p) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Anuj");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		p.setNAME("Smoother");
		p.setCOMPANY("Cello");
		p.setCOLOUR("Red");

		entityTransaction.begin();
		entityManager.persist(p);
		entityTransaction.commit();

	}
	
	
	
	

}
