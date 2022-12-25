package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import Dto.Students;
import Dto.Teachers;

public class TeacherDao {
	
	public Teachers AddTeachers (Teachers teacher) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Anuj");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.persist(teacher);
		entityTransaction.commit();

		return teacher;

	}

	public void DeleteTeachers(String email) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Anuj");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Teachers teacher = GetId(email);
		int Fetchedid=teacher.getId();
		
		entityTransaction.begin();
		
		entityManager.remove(entityManager.find(Teachers.class, Fetchedid));
		entityTransaction.commit();

	}

	public List<Teachers> GetAllTeachers() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Anuj");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		String sql = "SELECT p From Teachers p";
		Query query = entityManager.createQuery(sql);
		List<Teachers> list = query.getResultList();

		return list;
	}

	public Teachers GetId(String email) {
		Teachers teacher = null;
		List<Teachers> list = GetAllTeachers();
		for (Teachers teachers : list) {
			if (teachers.getEmail().matches(email)) {
				teacher = teachers;
			}
		}
		return teacher;
	}
	
	public Teachers UpdateTeacher(Teachers teacher) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Anuj");
		EntityManager entityManager =entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.merge(teacher);
		entityTransaction.commit();
		
		return teacher;
	}
		
}
