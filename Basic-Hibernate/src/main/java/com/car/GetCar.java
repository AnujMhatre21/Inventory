package com.car;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class GetCar {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Anuj");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction(); // no need because TO make any Changes
																				// Entity Transactiobn is used and in
																				// this case we need only to get the
																				// records so EntitManager is enough.

		car c = entityManager.find(car.class, 2);
		if (c != null) {
			System.out.println(c.getID());
			System.out.println(c.getName());
			System.out.println(c.getBrand());
		} else {
			System.out.println("No car object os found");
		}
	}
}
