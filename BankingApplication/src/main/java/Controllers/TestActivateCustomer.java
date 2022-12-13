package Controllers;

import java.util.Scanner;

import Service.ServiceBM;

public class TestActivateCustomer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("BankManger Login");

		System.out.println("Enter Email");
		String email = sc.nextLine();

		System.out.println("Enter Password");
		String pass = sc.nextLine();

		ServiceBM bm = new ServiceBM();
		bm.ActivateCustomer(email, pass);
	}

}
