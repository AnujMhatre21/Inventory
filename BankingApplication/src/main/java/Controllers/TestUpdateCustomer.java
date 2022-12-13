package Controllers;

import java.util.Scanner;

import Dto.Admin;
import Dto.Customer;
import Service.ServiceCustomer;

public class TestUpdateCustomer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ServiceCustomer servicecustomer = new ServiceCustomer();

		System.out.println("What do you want to update ?");
		System.out.println("1. Update Name");
		System.out.println("2. Update Aadhar Number");
		System.out.println("3. Update Pancard Number");
		System.out.println("4. Update Phone Number");

		int choice = sc.nextInt();
		sc.nextLine();

		switch (choice) {
		case 1: {
			System.out.println("Enter the Aadhar For which you have to Change the Name");
			long name = sc.nextLong();
			int fetchedId = servicecustomer.FetchId(name);
			if (fetchedId != 0) {
				Customer a1 = servicecustomer.FetchCustomer(fetchedId);
				System.out.println("Enter the New Name");
				sc.nextLine();
				String name1 = sc.nextLine();
				a1.setName(name1);
				servicecustomer.UpdateCustomer(a1);
			} else {
				System.out.println("Invalid Name");
			}
			break;
		}
		case 2: {
			System.out.println("Enter the Pancard Number  For which you have to Change the Aadhar Number");
			long name = sc.nextLong();
			int fetchedId = servicecustomer.FetchId(name);
			if (fetchedId != 0) {
				Customer a1 = servicecustomer.FetchCustomer(fetchedId);
				System.out.println("Enter the New Aadhar Number");
				sc.nextLine();
				long name1 = sc.nextLong();
				a1.setAadharNo(name1);
				servicecustomer.UpdateCustomer(a1);
			} else {
				System.out.println("Invalid Input");
			}
			break;
		}
		case 3: {
			System.out.println("Enter the Aadhar Number For which you have to Change the Pan Number");
			long name = sc.nextLong();
			int fetchedId = servicecustomer.FetchId(name);
			if (fetchedId != 0) {
				Customer a1 = servicecustomer.FetchCustomer(fetchedId);
				System.out.println("Enter the New Pan Number");
				sc.nextLine();
				long name1 = sc.nextLong();
				a1.setPanNo(name1);
				servicecustomer.UpdateCustomer(a1);
			} else {
				System.out.println("Invalid Input");
			}
			break;
		}
		case 4: {
			System.out.println("Enter the Aadhar Number For which you have to Change the Aadhar Number");
			long name = sc.nextLong();
			int fetchedId = servicecustomer.FetchId(name);
			if (fetchedId != 0) {
				Customer a1 = servicecustomer.FetchCustomer(fetchedId);
				System.out.println("Enter the New Phone Number");
				sc.nextLine();
				long name1 = sc.nextLong();
				a1.setPno(name1);
				servicecustomer.UpdateCustomer(a1);
			} else {
				System.out.println("Invalid Input");
			}
			break;

		}
		}
		sc.close();
	}
}
