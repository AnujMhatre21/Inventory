package com.pen;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetPen {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Anuj");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		pen p = entityManager.find(pen.class, 1);
		if (p != null) {
			System.out.println(p.getID());
			System.out.println(p.getNAME());
			System.out.println(p.getCOMPANY());
			System.out.println(p.getCOLOUR());
		} else {
			System.out.println("No Object is present");
		}
	}
}
