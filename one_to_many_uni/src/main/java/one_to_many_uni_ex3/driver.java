package one_to_many_uni_ex3;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class driver {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Anuj");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Mobile mobile = new Mobile();
		mobile.setBrand("Iphone");
		mobile.setPrice(70000);
		mobile.setName("Iphone 11");

		Simcard simcard = new Simcard();
		simcard.setService("Vodafone");
		simcard.setServiceType("Prepaid");

		Simcard simcard2 = new Simcard();
		simcard2.setService("Jio");
		simcard2.setServiceType("Postpaid");

		List<Simcard> simcards = new ArrayList<Simcard>();
		simcards.add(simcard);
		simcards.add(simcard2);
		mobile.setSimcard(simcards);

		entityTransaction.begin();
		entityManager.persist(mobile);
		entityManager.persist(simcard);
		entityManager.persist(simcard2);
		entityTransaction.commit();
		System.out.println("All Good");

	}
}
