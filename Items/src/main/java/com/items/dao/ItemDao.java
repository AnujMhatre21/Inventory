package com.items.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.items.dto.Item;

public class ItemDao {

	public void saveItem(Item item) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Anuj");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.persist(item);
		entityTransaction.commit();
		
		System.out.println("Done");

	}
}
