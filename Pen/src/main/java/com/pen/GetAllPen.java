package com.pen;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GetAllPen {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Anuj");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		String sql = "Select p FROM pen p";
		Query query = entityManager.createQuery(sql);
		List<pen> pens = query.getResultList();

		for (pen p : pens) {
			System.out.println("=====================");
			System.out.println("SRNO: " + p.getID());
			System.out.println("Product name: " + p.getNAME());
			System.out.println("Colour: " + p.getCOLOUR());
			System.out.println("Company Name: " + p.getCOMPANY());
		}
	}
}
