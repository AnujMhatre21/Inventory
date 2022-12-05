package proMy;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Bank {

	public static void main(String[] args) throws InputMismatchException {
		boolean flag = true;
		while (flag) {
			System.out.println("============== Main Menu =================");
			System.out.println("1. If you are an Existing Customer");

			System.out.println("2. No,Open New Account Now.");

			System.out.println("3.Exit");
			System.out.println("=========================================");
			System.out.println();
			System.out.println("   Enter your Choices :");
			Scanner sc = new Scanner(System.in);
			int a = 0;
			try {
				a = sc.nextInt();
			} catch (InputMismatchException ie) {
//			System.out.println("Enter the Valid Input");

			} catch (NoSuchElementException e) {
//			System.out.println("Enter the Valid Input");

				sc.close();
			}
			switch (a) {
			case 1:
				System.out.println("Enter your Account Number");
				Bank p1=new Existing();
				Existing b1=(Existing)p1;
				b1.addedAccount();
				break;

			case 2:
				System.out.println("***Fill the Account Opening Form***");
//		upcasting-downcasting accountopen Class to access from here
				Bank p2 = new AccountOpen();
				AccountOpen b2 = (AccountOpen) p2;
				b2.personalDetails();
				break;
				
			case 3:
				flag = false;
				System.out.println("======================================");
				System.out.println("Thank You, Have a Great Day !!!!");
				System.out.println("======================================");
				break;

			default:
				System.out.println("============================================");
				System.out.println("Please Enter valid Entry !!!!!");
				System.out.println("============================================");
				main(args);
			}

		}

	}
	

	static {
		System.out.println("Welcome to Swiss Bank");
		System.out.println("How may i help you ?");
//		System.out.println("===================================");
	}

}
