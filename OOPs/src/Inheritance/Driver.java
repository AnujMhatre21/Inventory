package Inheritance;

public class Driver {
	public static void main(String[] args) {
		Student s1 = new Student("Anuj", "IT");
		s1.setSchool(new School("St.Josephs"));
		s1.printStudentInfo();
	}
}
