package many_to_one_uni;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class driver {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Anuj");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Person person = new Person();
		person.setName("Ashok");
		person.setEmail("Ashok@gmail.com");
		person.setCno(12121212l);

		BankAccount bankAccount = new BankAccount();
		bankAccount.setName("ABC");
		bankAccount.setAcc_no(4545454l);
		bankAccount.setIfsc("ABC5654");
		bankAccount.setBranch("Panvel"); 
		bankAccount.setPerson(person);

		BankAccount bankAccount2 = new BankAccount();
		bankAccount2.setIfsc("BOI123");
		bankAccount2.setAcc_no(12345678l);
		bankAccount2.setName("Bank Of India");
		bankAccount2.setBranch("Kamothe");
		bankAccount2.setPerson(person);

		BankAccount bankAccount3 = new BankAccount();
		bankAccount3.setName("AXIS");
		bankAccount3.setAcc_no(7878787l);
		bankAccount3.setIfsc("AXIS123");
		bankAccount3.setBranch("Belapaur");
		bankAccount3.setPerson(person);

//		List<BankAccount> baccounts =new ArrayList();

//		baccounts.add(bankAccount);
//		baccounts.add(bankAccount2);
//		baccounts.add(bankAccount3);

		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(bankAccount);
		entityManager.persist(bankAccount2);
		entityManager.persist(bankAccount3);
		entityTransaction.commit();
		System.err.println("All Good");
	}

}
