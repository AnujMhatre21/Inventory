package com.Sim;

public class Mobile {
	private String brand;
	private String name;
	private double cost;

	private Sim1 Sim1;
	private Sim2 Sim2;

//	constructor for current 
	public Mobile(String brand, String name, double cost) {
		this.brand = brand;
		this.name = name;
		this.cost = cost;
	}

//	method created for setting sim 1
//		class name & obj ref
	public void setSim1(Sim1 sim1) {
		this.Sim1 = sim1;
	}

//		class name & obj ref
	public void setSim2(Sim2 sim2) {
		this.Sim2 = sim2;
	}

	public void printMobileDetails() {
		System.out.println("=====Mobile======");
		System.out.println("Brand  " + brand);
		System.out.println("Cost  " + cost);
		System.out.println("Name  " + name);
		if (Sim1 != null) {
			Sim1.printSim1();
		} else {
			System.out.println("Sim1 Not available");
		}
		if (Sim2 != null) {
			Sim2.printSim2();
		} else {
			System.out.println("Sim2 Not available");
		}
	}
}
