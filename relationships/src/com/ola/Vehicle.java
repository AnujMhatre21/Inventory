package com.ola;

public class Vehicle {
	private String CarNo;
	private String DriverName;

	private Ola ola;

	public Vehicle(String Car) {
		this.CarNo = CarNo;
		this.CarNo = CarNo;
	}

	public String getCarNo() {
		return CarNo;
	}

	public void setCarNo(String carNo) {
		CarNo = carNo;
	}

	public String getDriverName() {
		return DriverName;
	}

	public void setDriverName(String driverName) {
		DriverName = driverName;
	}

	public Ola getOla() {
		return ola;
	}

	public void setOla(Ola ola) {
		this.ola = ola;
	}

	public void DisplayDriver() {
		System.out.println("Car no " + CarNo);
		System.out.println("Driver Name " + DriverName);
	}

}
