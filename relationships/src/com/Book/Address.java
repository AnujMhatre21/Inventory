package com.Book;

public class Address {
	private int streetno;
	private String name;
	private String landmark;
	private String city;
	private String state;

	public Address(int streetno, String name, String landmark, String city, String state) {
		this.streetno = streetno;
		this.name = name;
		this.landmark = landmark;
		this.city = city;
		this.state = state;
	}

	public Address() {

	}

	public int getStreetno() {
		return streetno;
	}

	public void setStreetno(int streetno) {
		this.streetno = streetno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void printAddress() {
		System.out.println("======Address=====");
		System.out.println("Street no " + streetno);
		System.out.println("name " + name);
		System.out.println("landmark " + landmark);
		System.out.println("city " + city);
		System.out.println("state " + state);
	}

}
