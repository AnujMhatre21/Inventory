package one_to_many_uni_ex2;

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

		Course course = new Course();
		course.setSubjectName("Maths");
		course.setMarks_Obtained(79);
		course.setOutof(100);

		Course course2 = new Course();
		course2.setSubjectName("English");
		course2.setMarks_Obtained(65);
		course2.setOutof(100);

		Course course3 = new Course();
		course3.setSubjectName("Science");
		course3.setMarks_Obtained(64);
		course3.setOutof(100);

		List<Course> c = new ArrayList<Course>();
		c.add(course);
		c.add(course2);
		c.add(course3);

		Student student = new Student();
		student.setName("Gaurav");
		student.setAge(23);
		student.setCourses(c);

		entityTransaction.begin();
		entityManager.persist(student);
		entityManager.persist(course);
		entityManager.persist(course2);
		entityManager.persist(course3);
		entityTransaction.commit();
		System.out.println("All good");

	}
}
