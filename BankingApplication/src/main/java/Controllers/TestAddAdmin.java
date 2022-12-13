package Controllers;

import java.util.Scanner;

import Dto.Admin;
import Service.ServiceAdmin;

public class TestAddAdmin {
	public static void main(String[] args) {
		Admin admin = new Admin();
		Scanner sc = new Scanner(System.in);

		System.out.println("Register New Admin");
		System.out.println("Enter the Name");
		String name = sc.nextLine();
		admin.setName(name);

		System.out.println("Enter the Email");
		String Email = sc.nextLine();
		admin.setEmail(Email);

		System.out.println("Enter the Password");
		String pass = sc.nextLine();
		admin.setPassword(pass);

		ServiceAdmin service = new ServiceAdmin();
		if (service.SaveAdmin(admin) != null) {
			System.out.println("New Admin Registered");
		} else {
			System.out.println("New Admin Registeration Failed");
		}
		sc.close();
	}

}
