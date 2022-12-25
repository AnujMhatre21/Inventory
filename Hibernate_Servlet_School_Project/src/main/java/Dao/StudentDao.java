package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import Dto.Students;

public class StudentDao {

	public Students AddStudent(Students student) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Anuj");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();

		return student;

	}

	public void DeleteStudent(String email) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Anuj");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Students student = GetId(email);
		int Fetchedid=student.getId();
		
		entityTransaction.begin();
		
		entityManager.remove(entityManager.find(Students.class, Fetchedid));
		entityTransaction.commit();

	}

	public List<Students> GetAllStudents() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Anuj");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		String sql = "SELECT p From Students p";
		Query query = entityManager.createQuery(sql);
		List<Students> list = query.getResultList();

		return list;
	}

	public Students GetId(String email) {
		Students student1 = null;
		List<Students> list = GetAllStudents();
		for (Students students : list) {
			if (students.getEmail().matches(email)) {
				student1 = students;
			}
		}
		return student1;
	}
	
	public Students UpdateStudent(Students students) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Anuj");
		EntityManager entityManager =entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.merge(students);
		entityTransaction.commit();
		
		return students;
	}

}
