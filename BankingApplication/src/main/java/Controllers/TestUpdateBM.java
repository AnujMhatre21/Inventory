package Controllers;

import java.util.Scanner;

import Dto.BankManager;
import Service.ServiceBM;

public class TestUpdateBM {
	public static void main(String[] args) {
		ServiceBM service = new ServiceBM();
		Scanner sc = new Scanner(System.in);
		System.out.println("What do you want to update ?");
		System.out.println("1: Change Name");
		System.out.println("2: Change Password");
		System.out.println("3: Change Email");

		int choice = sc.nextInt();
		sc.nextLine();

		switch (choice) {
		case 1: {
			System.out.println("Enter the Email For which you have to Change the Name");
			String email = sc.nextLine();
			int fetchedId = service.ValidateBM(email);
			if (fetchedId != 0) {
				BankManager b1 = service.FetchDetails(fetchedId);
				System.out.println("Enter the New Name");
				String Name = sc.nextLine();
				b1.setName(Name);
				service.UpdateBM(b1);
			}
			break;
		}
		case 2: {
			System.out.println("Enter the Email/Name For which you have to Change Password");
			String Email = sc.nextLine();
			int fetchedId = service.ValidateBM(Email);
			if (fetchedId != 0) {
				BankManager a1 = service.FetchDetails(fetchedId);
				System.out.println("Enter the New Password");
				String pass = sc.nextLine();
				a1.setPassword(pass);
				service.UpdateBM(a1);
			}
			break;
		}
		case 3: {
			System.out.println("Enter the Name For which you have to Change Email");
			String Name = sc.nextLine();
			int fetchedId = service.ValidateBM(Name);
			if (fetchedId != 0) {
				BankManager a1 = service.FetchDetails(fetchedId);
				System.out.println("Enter the New Email");
				String Email = sc.nextLine();
				a1.setEmail(Email);
				service.UpdateBM(a1);
			}
			break;

		}
		}
		sc.close();
	}

}
