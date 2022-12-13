package Controllers;

import java.util.Scanner;

import Dto.AccountDetails;
import Dto.Customer;
import Service.ServiceAccountDetails;

public class TestWithdraw {
	public static void main(String[] args) {
		System.out.println("Enter your Account Number");
		Scanner sc = new Scanner(System.in);
		long accno = sc.nextLong();

		ServiceAccountDetails accountDetails = new ServiceAccountDetails();
		Customer customer = accountDetails.FetchWithAccno(accno);

		AccountDetails accountDetails2 = new AccountDetails();
		accountDetails2.getBalance();

		System.out.println("*******************************************************************");
		System.out.println("_______________Welcome " + customer.getName() + "_______________");
		System.out.println("Enter the Amount to Want to Withdraw");
		int amount = sc.nextInt();
		accountDetails.Withdraw(amount, accno);
	}
}
