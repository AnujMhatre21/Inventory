package one_to_many_uni_ex2;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String SubjectName;
	private int Marks_Obtained;
	private int Outof;

	public int getId() {
		return id;
	}

	public String getSubjectName() {
		return SubjectName;
	}

	public void setSubjectName(String subjectName) {
		SubjectName = subjectName;
	}

	public int getMarks_Obtained() {
		return Marks_Obtained;
	}

	public void setMarks_Obtained(int marks_Obtained) {
		Marks_Obtained = marks_Obtained;
	}

	public int getOutof() {
		return Outof;
	}

	public void setOutof(int outof) {
		Outof = outof;
	}

	public void setId(int id) {
		this.id = id;
	}

}