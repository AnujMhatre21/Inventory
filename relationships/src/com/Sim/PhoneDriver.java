package com.Sim;

public class PhoneDriver {
	public static void main(String[] args) {
		Mobile mobile = new Mobile("Apple", "Iphone 13", 70000);

		mobile.setSim1(new Sim1("Airtel", 9870));
//		mobile.setSim2(new Sim2("Jio",533738));
		mobile.printMobileDetails();
	}
}
