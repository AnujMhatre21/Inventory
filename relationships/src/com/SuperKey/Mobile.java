package com.SuperKey;

public class Mobile {
	String brand,name,colour;
	double price;
	
	Mobile (){
		
	}

	Mobile (String brand,String name, String colour, double price){
		this.brand=brand;
		this.colour=colour;
		this.name=name;
		this.price=price;
	}
	public void printMobile() {
		System.out.println("===Mobile===");
		System.out.println(name);
		System.out.println(colour);
		System.out.println(brand);
		System.out.println(price);
		}
}
