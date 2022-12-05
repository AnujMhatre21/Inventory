package Inheritance;

public class Student {
	private String Studentname;
	private String Std;
	private School school;

	public Student(String Studentname, String Std) {
		this.Studentname = Studentname;
		this.Std = Std;
	}

	public String getStudentname() {
		return Studentname;
	}

	public void setStudentname(String Studentname) {
		this.Studentname = Studentname;
	}

	public String getStd() {
		return Studentname;
	}

	public void setStd(String Std) {
		this.Std = Std;
	}
	
	public School getSchool() {
		return school;
	}
	public void setSchool(School school) {
		this.school=school;
	}
	
	public void printStudentInfo() {
		System.out.println(Studentname+"Student Name");
		System.out.println(Std+"Class of Student");
		if(school!=null) {
			school.printSchool();
		}else {
			System.out.println("Please enter the School Details");
		}
	}
}
