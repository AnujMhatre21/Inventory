package com.SuperKey;

public class Redmi extends Mobile {
	String miRemote;
	
	Redmi(){
		
	}
	Redmi(String name, String colour, String brand, double price, String miRemote){
		super(brand, name, colour,price);
		this.miRemote=miRemote;
	}
	public void printMi() {
		System.out.println("===MI===");
		System.out.println(name);
		System.out.println(brand);
		System.out.println(price);
		System.out.println(miRemote);
	}
}
