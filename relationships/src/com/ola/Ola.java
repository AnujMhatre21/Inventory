package com.ola;

public class Ola {
	private String Name;
	private String Start;
	private String Destination;
	private Vehicle vehicle;
	
	public Ola(String Name, String Start, String Destination) {
		this.Name=Name;
		this.Start=Start;
		this.Destination=Destination;
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public String getStart() {
		return Start;
	}
	public void setStart(String start) {
		Start = start;
	}
	public String getDestination() {
		return Destination;
	}
	public void setDestination(String destination) {
		Destination = destination;
	}
	
	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public void DisplayDetails() {
		System.out.println("=====================");
		System.out.println("Hie "+Name);
		System.out.println("Your Starting point is "+Start);
		System.out.println("Your Destination is "+Destination);
		if(vehicle!=null) {
			System.out.println();
		}
	}
	
	
}
