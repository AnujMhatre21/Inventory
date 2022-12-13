package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import Dto.AccountDetails;
import Dto.Customer;

public class AccountDetailsDao {

	public Customer GetCustomer(long aadhar) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Anuj");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Customer c = null;
		String sql = "Select c From Customer c";
		Query query = entityManager.createQuery(sql);
		List<Customer> cust = query.getResultList();
		for (Customer customer : cust) {
			if (customer.getAadharNo() == aadhar) {
				c = customer;
			}
		}
		return c;
	}

	public void deposit(int num, Customer customer) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Anuj");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		AccountDetailsDao bankServicesDao = new AccountDetailsDao();
//		bankServicesDao.

	}

	public void AddCustomerBankDetails(AccountDetails accountDetails) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Anuj");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.persist(accountDetails);
		entityTransaction.commit();
		System.out.println("Details has been added");
	}

	public Customer FetchCustomer(long aadhar) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Anuj");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Customer customer = null;
		String sql = "Select cust From Customer cust";
		Query query = entityManager.createQuery(sql);
		List<Customer> customer1 = query.getResultList();
		for (Customer customer2 : customer1) {
			if (customer2.getAadharNo() == aadhar) {
				customer = customer2;
			}
		}
		return customer;
	}

	public Customer FetchWithAccno(long accno) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Anuj");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Customer customer = null;
		String sql = "Select cust From AccountDetails cust";
		Query query = entityManager.createQuery(sql);
		List<AccountDetails> AccountDetails = query.getResultList();
		for (AccountDetails details : AccountDetails) {
			if (details.getAccountNo() == accno) {
				customer = details.getCustomer();
			}
		}
		return customer;
	}

	public void Deposit(int amount, long accno) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Anuj");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		String sql = "Select cust From AccountDetails cust";
		Query query = entityManager.createQuery(sql);
		List<AccountDetails> AccountDetails = query.getResultList();
		for (AccountDetails details : AccountDetails) {
			if (details.getAccountNo() == accno) {
				int newamount = details.getBalance() + amount;
				details.setBalance(newamount);

				entityTransaction.begin();
				entityManager.merge(details);
				entityTransaction.commit();
				System.out.println("Rs. " + amount + " Has Credited to Your Account Number: " + accno
						+ " and your Balance is " + details.getBalance());
			}
		}
	}

	public void Withdraw(int amount, long accno) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Anuj");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		String sql = "Select cust From AccountDetails cust";
		Query query = entityManager.createQuery(sql);
		List<AccountDetails> AccountDetails = query.getResultList();
		for (AccountDetails details : AccountDetails) {
			if (details.getAccountNo() == accno) {
				if (details.getBalance() > amount) {

					int newamount = details.getBalance() - amount;
					details.setBalance(newamount);

					entityTransaction.begin();
					entityManager.merge(details);
					entityTransaction.commit();
					System.out.println("Rs. " + amount + " Has Debited to Your Account Number: " + accno
							+ " and your Balance is " + details.getBalance());
				} else {
					System.out.println("Your Bank Balance is less than Entered Amount");
				}
			}
		}
	}
}
