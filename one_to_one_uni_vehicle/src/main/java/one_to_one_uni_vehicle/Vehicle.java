package one_to_one_uni_vehicle;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Vehicle {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int id;
	private String VehicleName;

	@OneToOne
	private ChasisNum chasisNum;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getVehicleName() {
		return VehicleName;
	}

	public void setVehicleName(String vehicleName) {
		VehicleName = vehicleName;
	}

	public ChasisNum getChasisNum() {
		return chasisNum;
	}

	public void setChasisNum(ChasisNum chasisNum) {
		this.chasisNum = chasisNum;
	}

}
