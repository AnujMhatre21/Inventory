package one_to_many_bi_ex2;

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

		Hospital hospital = new Hospital();
		hospital.setName("MGM");
		hospital.setType("Accident");

		Branches branches1 = new Branches();
		branches1.setLocation("Pune");

		Branches branches2 = new Branches();
		branches2.setLocation("Kolhapur");

		List<Branches> branches = new ArrayList<Branches>();
		branches.add(branches1);
		branches.add(branches2);

		branches1.setHospital(hospital);
		branches2.setHospital(hospital);
		hospital.setBranchs(branches);

		entityTransaction.begin();
		entityManager.persist(hospital);
		entityTransaction.commit();
		System.out.println("All Good");

	}

}
