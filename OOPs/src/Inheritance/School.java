package Inheritance;

public class School {
	private String Sname;

	public School(String Sname) {
		this.Sname = Sname;
	}

	public String getSname() {
		return Sname;
	}

	public void setSname(String Sname) {
		this.Sname = Sname;
	}

	public void printSchool() {
		System.out.println("School Name is : "+Sname);
	}
}
