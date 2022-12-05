package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.dto.Product;

public class Dao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Anuj");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Product saveProduct(Product product) {

		entityTransaction.begin();
		entityManager.persist(product);
		entityTransaction.commit();

		return product;

	}

	public Product UpdateProduct(Product product) {
		if (product != null) {
			entityTransaction.begin();
			entityManager.merge(product);
			entityTransaction.commit();
			System.out.println("Values has been Updated");
		} else {
			System.out.println("Value Has not been Updated");
		}
		return product;
	}

	public void DelProduct(int n) {
		Product product1 = entityManager.find(Product.class, n);
		if (product1 != null) {

			entityTransaction.begin();
			entityManager.remove(product1);
			entityTransaction.commit();
			System.out.println("Object with above id is been removed");
		} else {
			System.out.println("No such ID Found");
		}

	}

	public void GetAllProduct() {
		String sql = "SELECT p From Product p";
		Query query = entityManager.createQuery(sql);
		List<Product> products = query.getResultList();
		for (Product p : products) {
			System.out.println("=====================");
			System.out.println("SRNO: " + p.getId());
			System.out.println("Catageory: " + p.getName());
			System.out.println("Brand: " + p.getBrand());
			System.out.println("Type: " + p.getType());
			System.out.println("Price: " + p.getPrice());
		}
		
	}

	public Product GetProduct(Product product, int n) {
		Product product1 = entityManager.find(Product.class, n);
		return product1;
	}
	


}
