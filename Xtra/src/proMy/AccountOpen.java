package proMy;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class AccountOpen extends Bank {
	private String Name;
	private long PNum;
	private long Adhr;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
		if (!validateName(getName())) {
			System.out.println("Please Enter you Name");
			String Name = sc.nextLine();
			setName(Name);
		}
	}

	private static boolean validateName(String name) {
//		VALIDATE NAME
		String s = name;
		for (int i = 0; i < s.length(); i++) {
			char[] c = s.toCharArray();
			if (c[i] >= 'a' && c[i] <= 'z' || c[i] >= 'A' && c[i] <= 'Z' || c[i] == ' ' && c[i - 1] != ' ') {
				if (i <= s.length() - 1) {
					i++;
				}
			} else {
				return false;
			}
		}
		return true;
	}

	public long getPNum() {
		return PNum;
	}

	public void setPNum(long pNum) throws InputMismatchException {
		if (pNum > 9999999999L || pNum < 1111111111) {
			System.out.println("==================================");
			System.out.println("Sorry,Mobile Number should contain only Number 0-9  ReEnter");
			System.out.println("==================================");
			pNum = sc.nextLong();
			setPNum(pNum);

		} else {
			PNum = pNum;
		}
	}

	public long getAdhr() {
		return Adhr;
	}

	public void setAdhr(long adhr) {
		if (adhr > 999999999999l || adhr < 111111111111l) {
			System.out.println("==================================");
			System.out.println("Sorry,Please Enter Valid 12-digit Aadhar Number");
			System.out.println("==================================");
			adhr = sc.nextLong();
			setAdhr(adhr);
		} else {
			Adhr = adhr;
		}
	}

	Scanner sc = new Scanner(System.in);

	public void personalDetails() {
		System.out.println("Enter you Name");
		String Name = sc.nextLine();
		setName(Name);
//	====================================================================================	
		System.out.println();
		System.out.println("Enter you Phone Number");
		try {
			long PNum = sc.nextLong();
			setPNum(PNum);
		} catch (InputMismatchException e) {
			System.out.println("==================================");
			System.out.println("Sorry,Mobile Number should contain only Number 0-9  ReEnter");
			System.out.println("==================================");
			sc.nextLine();
			PNum = sc.nextLong();
		} finally {
			setPNum(PNum);
		}
//==========================================================================================
		System.out.println();
		System.out.println("Enter you Aadhar Number");
		try {
			long Adhr = sc.nextLong();
			setAdhr(Adhr);
		} catch (InputMismatchException e) {
			System.out.println("==================================");
			System.out.println("Sorry,Aadhar Number should contain only Number 0-9  ReEnter");
			System.out.println("==================================");
			sc.nextLine();
			Adhr = sc.nextLong();
		} finally {
			setAdhr(Adhr);
		}
//		=================================================================================
		System.out.println("==========================================");
		System.out.println("Welcome to Swiss bank !!");
		System.out.println("Your Account Has be Created Successfully");
		System.out.println("==========================================");
		System.out.println();
		System.out.println("1. To view your Details.");
		System.out.println();
		System.out.println("2. Exit.");

		System.out.println("   Enter your Choices :");
		Scanner sc = new Scanner(System.in);
		int a = 0;
		try {
			a = sc.nextInt();
		} catch (InputMismatchException ie) {
			System.out.println("Enter the Valid Input");

		} catch (NoSuchElementException e) {
//			System.out.println("Enter the Valid Input");

			sc.close();
		}
		switch (a) {
		case 1:
			DisplayPersonalDetails();
			break;

		case 2:
			System.out.println("ThankYou for Using Swiss Bank Application!! Have a Nice Day :)");
			break;
		}
//		====================================================================================
//		Upcasting Downcasting BankingServices Class to access from here
		AccountOpen a1 = new BankingServices();
		BankingServices b1 = (BankingServices) a1;
		b1.Bankingservices(Name, PNum, Adhr);

	}

	public void DisplayPersonalDetails() {
		System.out.println("================= ACCOUNT DETAILS ==========================");
		System.out.println("Your Name is: " + Name);
		System.out.println("Your Mobile Number is: " + PNum);
		System.out.println("Your Aadhar Card Number  is: " + Adhr);
		System.out.println("============================================================");
	}

}
