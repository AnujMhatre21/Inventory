package one_to_one_uni_vehicle;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class driver {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Anuj");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		
		ChasisNum chasisNum=new ChasisNum();
		chasisNum.setChasisNum("POHGU8745");
		
		Vehicle vehicle=new Vehicle();
		vehicle.setVehicleName("Audi");
		vehicle.setChasisNum(chasisNum);
		
		entityTransaction.begin();
		entityManager.persist(vehicle);
		entityManager.persist(chasisNum);
		entityTransaction.commit();
		System.out.println("All good ");
		
		
		
	}

}
