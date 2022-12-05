package one_to_many_bi_ex2;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Hospital {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String Name;
	private String Type;

	

	@OneToMany(mappedBy = "hospital",cascade = CascadeType.ALL)
	private List<Branches> branches;
	
	
	
	
	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public List<Branches> getBranchs() {
		return branches;
	}

	public void setBranchs(List<Branches> branchs) {
		this.branches = branchs;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
}
