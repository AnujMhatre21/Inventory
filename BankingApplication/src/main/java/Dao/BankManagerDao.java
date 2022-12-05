package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import Dto.BankManager;
import Dto.Customer;

public class BankManagerDao {

	public BankManager AddBM(BankManager bankManager) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Anuj");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
//		BankManager bankManager1 = new BankManager();
		bankManager.setStatus("UnApproved");
		entityTransaction.begin();
		entityManager.persist(bankManager);
		entityTransaction.commit();
		return bankManager;
	}

	public BankManager UpdateBM(BankManager bankManager) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Anuj");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		if (bankManager != null) {
			entityTransaction.begin();
			entityManager.merge(bankManager);
			entityTransaction.commit();
			System.out.println("Your Information has been Updated");
		}else {
			System.out.println("Invalid Input");
		}
		return bankManager;
	}

	public void DeleteBM(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Anuj");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		BankManager bankManager = FetchDetails(id);
		entityTransaction.begin();
		entityManager.remove(bankManager);
		entityTransaction.commit();
		System.out.println("Bank Manager has been Deleted");
	}
	
public void ActivateCustomer(String email,String pass) {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Anuj");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
		String sql="Select c From Customer c";
		Query query =entityManager.createQuery(sql);
		List<Customer> Cust=query.getResultList();
		for (Customer customer : Cust) {
			if(customer.getStatus().matches("INACTIVE")) {
//				if(customer.getAadharNo())
			}
		}
	}

	public int ValidateBM(String user) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Anuj");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		int fetchID = 0;
		String sql = "Select bm From BankManager bm";
		Query query = entityManager.createQuery(sql);
		List<BankManager> bm = query.getResultList();
		for (BankManager bankManager2 : bm) {
			if (bankManager2.getEmail().equals(user)) {
				fetchID = bankManager2.getId();
			} else if (bankManager2.getName().equals(user)) {
				fetchID = bankManager2.getId();
			}else {
				System.out.println("Invalid Input");
			}
		}
		return fetchID;
	}

//	public List<BankManager> GetAllUnApproved(String name,String pass) {
//		List<BankManager> umb=new LinkedList<BankManager>();
//		for (BankManager p : bm) {
//			if (p.getStatus().matches("UnApproved")) {
//				System.out.println("=====================");
//				System.out.println("SrNo: " + p.getId());
//				System.out.println("Name: " + p.getName());
//				System.out.println("Email: " + p.getEmail());
//				System.out.println("Approved: " + p.getStatus()
//				System.out.println("Password: " + p.getPassword());
//				umb.add(p);
//			}
//		}
//		return umb;
//	}

	public void GetAllBankManagers() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Anuj");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		int fetchID = 0;
		String sql = "Select bm From BankManager bm";
		Query query = entityManager.createQuery(sql);
		List<BankManager> bm = query.getResultList();
		for (BankManager p : bm) {
			System.out.println("=====================");
			System.out.println("SrNo: " + p.getId());
			System.out.println("Name: " + p.getName());
			System.out.println("Email: " + p.getEmail());
			System.out.println("Password: " + p.getPassword());
			System.out.println("Approved: " + p.getStatus());
		}
	}

	public BankManager FetchDetails(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Anuj");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		BankManager bankManager = entityManager.find(BankManager.class, id);
		
		return bankManager;
	}

}
