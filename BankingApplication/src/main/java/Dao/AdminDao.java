package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import Dto.Admin;
import Dto.BankManager;
import Service.ServiceBM;

public class AdminDao {

//	Admin admin = new Admin();

	public Admin SaveAdmin(Admin credentials) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Anuj");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(credentials);
		entityTransaction.commit();
		return credentials;
	}

	// Use to Update Admin
	public Admin UpdateAdmin(Admin admin) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Anuj");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		if (admin != null) {
			entityTransaction.begin();
			entityManager.merge(admin);
			entityTransaction.commit();
			System.out.println("Updation has been Successfully");
		}
		return admin;
	}

//		Use to Delete Admin
	public void DeleteAdmin(int n) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Anuj");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Admin admin = FetchDetails(n);

		if (admin != null) {
			entityTransaction.begin();
			entityManager.remove(admin);
			entityTransaction.commit();
			System.out.println("Admin with UserName: " + admin.getEmail() + " Has been Deleted SuccessFully");
		}
	}

//		Use to Get All the Details Present in the admin Database
	public void GetAllAdmin() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Anuj");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		int fetchedId = 0;
		String sql = "SELECT p From Admin p";
		Query query = entityManager.createQuery(sql);
		List<Admin> admins = query.getResultList();
		for (Admin p : admins) {
			System.out.println("=====================");
			System.out.println("SrNo: " + p.getId());
			System.out.println("Email: " + p.getEmail());
			System.out.println("Password: " + p.getPassword());
		}
	}

//		Use to Fetch Details wrt ID
	public void GetbyId(int n) {
		Admin admin = FetchDetails(n);
		System.out.println("=====================");
		System.out.println("SrNo: " + admin.getId());
		System.out.println("Email: " + admin.getEmail());
		System.out.println("Password: " + admin.getPassword());
		System.out.println("=====================");

	}

//		use to Validate the User
	public int ValidateUser(String user) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Anuj");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		int fetchedId = 0;
		String sql = "SELECT p From Admin p";
		Query query = entityManager.createQuery(sql);
		List<Admin> admins = query.getResultList();
		for (Admin p : admins) {
			if (p.getEmail().equals(user)) {
				fetchedId = p.getId();
			} else if (p.getName().equals(user)) {
				fetchedId = p.getId();
			}
		}
		return fetchedId;
	}

//		Use to Fetch Details wrt ID
	public Admin FetchDetails(int n) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Anuj");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Admin admin = entityManager.find(Admin.class, n);
		return admin;
	}

	public void ApproveBankmanager(String name, String pass) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Anuj");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		String sql = "SELECT p From BankManager p";
		Query query = entityManager.createQuery(sql);
		List<Admin> admin = query.getResultList();
		for (Admin p : admin) {
//			if (p.getStatus().matches("UnApproved")) {
			if (p.getEmail().matches(name) && p.getPassword().matches(pass)) {
				System.out.println("Admin LoggedIn Successfully");
				System.out.println("Enter the Bank Managers email you want to Approve");
				BankManagerDao.ValidateBM

				p.setStatus("Approved");
//					p.setAdmin(admin);
				entityTransaction.begin();
				entityManager.merge(p);
				entityTransaction.commit();
				System.out.println("BankManager has Been Approved Successfully");

//				}
			}
		}
	}

	public Admin AdminLogin(String name, String pass) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Anuj");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		String sql = "SELECT p From BankManager p";
		Query query = entityManager.createQuery(sql);
		List<Admin> admins = query.getResultList();
		Admin admin = null;
		for (Admin p : admins) {
			admin = p;

		}
		return admin;
	}
}
