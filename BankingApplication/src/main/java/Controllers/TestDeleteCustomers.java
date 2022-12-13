package Controllers;

import java.util.Scanner;

import Service.ServiceCustomer;

public class TestDeleteCustomers {
	public static void main(String[] args) {
		ServiceCustomer serviceCustomer = new ServiceCustomer();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Aadhar Number to be Deleted");
		long Aadhar = sc.nextLong();
		int id = serviceCustomer.FetchId(Aadhar);
		serviceCustomer.DeleteCustomer(id);

	}

}
