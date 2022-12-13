package Controllers;

import java.util.Scanner;

import Service.ServiceAdmin;

public class TestApproveBM {
	public static void main(String[] args) {
		ServiceAdmin service = new ServiceAdmin();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Admins Login");

		System.out.println("Enter the Email");
		String email = sc.nextLine();

		System.out.println("Enter the Password");
		String Pass = sc.nextLine();

		service.ApproveBankmanager(email, Pass);
	}
}
