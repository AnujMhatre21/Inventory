package com.collections;

import java.util.Objects;

public class Pen {
	String name;
	String brand;
	double price;

	Pen(String name, String brand, double price) {
		this.name = name;
		this.brand = brand;
		this.price = price;
	}

	public String toString() {
		return name + " " + brand + " " + price;
	}

	public boolean equals(Object o) {
		Pen p = (Pen) o;
		if (p.name == this.name && p.brand == this.brand && p.price == this.price) {
			System.out.println(p.name);
			return true;
		} else {
			System.out.println(this.name);
			return false;
		}
	}

	public int hashCode() {
		return Objects.hash(name, brand, price);
	}

}