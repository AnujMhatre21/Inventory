package Controllers;

import java.util.Scanner;

import Dto.Customer;
import Service.ServiceCustomer;

public class TestAddCustomer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Customer cust = new Customer();
		ServiceCustomer customer = new ServiceCustomer();
		System.out.println("Register new Customer");
		
		System.out.println("Enter the Name of the Customer");
		String name = sc.nextLine();
		cust.setName(name);
		
		System.out.println("Enter the Mobile Number");
		long Pno = sc.nextLong();
		cust.setPno(Pno);
		
		System.out.println("Enter the Aadhar Number");
		long aadhar = sc.nextLong();
		cust.setAadharNo(aadhar);
		
		System.out.println("Enter the Pan Number");
		long pan = sc.nextLong();
		cust.setPanNo(pan);
		
		
		cust.setStatus("ACTIVE");

		customer.AddCustomer(cust);
	}
}
