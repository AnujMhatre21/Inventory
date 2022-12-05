package one_to_many_uni;

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

		
		Person person=new Person();
		person.setName("Max");
		person.setEmail("Max@gmail.com");
		person.setCno(9876543l);

		BankAccount bankAccount = new BankAccount();
		bankAccount.setName("SBI");
		bankAccount.setAcc_no(12345678l);
		bankAccount.setIfsc("SBI123");
		bankAccount.setBranch("Panvel");
		
		
		BankAccount bankAccount2 = new BankAccount();
		bankAccount2.setIfsc("BOI123");
		bankAccount2.setAcc_no(12345678l);
		bankAccount2.setName("Bank Of India");
		bankAccount2.setBranch("Motha Khanda");
		
		BankAccount bankAccount3 = new BankAccount();
		bankAccount3.setName("AXIS");
		bankAccount3.setAcc_no(12345678l);
		bankAccount3.setIfsc("AXIS123");
		bankAccount3.setBranch("Chota Khanda");
		
		List<BankAccount> baccounts =new ArrayList();
		baccounts.add(bankAccount);
		baccounts.add(bankAccount2);
		baccounts.add(bankAccount3);
		person.setBaccounts(baccounts);
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(bankAccount);
		entityManager.persist(bankAccount2);
		entityManager.persist(bankAccount3);
		entityTransaction.commit();
		System.err.println("All Good");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
