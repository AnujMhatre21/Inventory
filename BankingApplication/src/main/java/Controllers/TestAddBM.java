package Controllers;

import java.util.Scanner;

import Dto.BankManager;
import Service.ServiceBM;

public class TestAddBM {
	public static void main(String[] args) {
		BankManager bm = new BankManager();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the New BankManagers Name");
		String name = sc.nextLine();
		bm.setName(name);

		System.out.println("Enter the New BankManagers Email");
		String email = sc.nextLine();
		bm.setEmail(email);

		System.out.println("Enter the New BankManagers Password");
		String pass = sc.nextLine();
		bm.setPassword(pass);

		bm.setStatus("Approved");

		ServiceBM service = new ServiceBM();
		if (service.AddBM(bm) != null) {
			System.out.println("New Bank Manager is Registered");
		} else {
			System.out.println("Bank Manager Registration Failed");
		}

	}
}
