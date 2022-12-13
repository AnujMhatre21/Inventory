package Controllers;

import java.util.Scanner;

import Dto.AccountDetails;
import Dto.Customer;
import Service.ServiceAccountDetails;

public class TestAddBankDetails {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		AccountDetails accountDetails=new AccountDetails();
		ServiceAccountDetails details=new ServiceAccountDetails();
		
		System.out.println("Enter Account Number ");
		long accno =sc.nextLong();
		accountDetails.setAccountNo(accno);
		sc.nextLine();
		
		System.out.println("Enter IFSC Number");
		String ifsc=sc.nextLine();
		accountDetails.setIfsc(ifsc);
		
		System.out.println("Enter the Aadhar Number to be linked");
		long aadhar=sc.nextLong();
		Customer customer=details.FetchCustomer(aadhar);		
		accountDetails.setCustomer(customer);
		
		details.TestAddBankDetails(accountDetails);
		
		
	
		
	}
}
