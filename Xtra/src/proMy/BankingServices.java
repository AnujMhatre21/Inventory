package proMy;

import java.util.Scanner;

public class BankingServices extends AccountOpen {
	private int Balance;

//	Deposit
	private void deposit(int Amount) {
		int deposit = getBalance() + Amount;
		setBalance(deposit);
	}

//	WithDraw
	private void withdraw(int Amount) {
		int reamaining = getBalance() - Amount;
		setBalance(reamaining);
	}

//	Check balance

	private void setBalance(int Balance) {
		this.Balance = Balance;
	}

	private int getBalance() {
		return Balance;
	}

	public void Bankingservices(String Name, long PNum, long Adhr) {
		System.out.println("Welcome MR." + Name + " Lets Start With Your Banking Services");
		System.out.println();
		boolean flag = true;
		while (flag) {
			System.out.println("1. Deposit");
			System.out.println();
			System.out.println("2. Withdraw");
			System.out.println();
			System.out.println("3. Check Balance");
			System.out.println();
			System.out.println("4. Back to Main Menu");
			System.out.println();
			Scanner sc = new Scanner(System.in);
			int Input = sc.nextInt();

			switch (Input) {
			case 1: {
				System.out.println("Enter the Amount You Want to Deposit");
				int Amount = sc.nextInt();
				deposit(Amount);
				System.out.println("============= ALERT MESSAGE ================");
				System.out.println("MR." + Name + " Rs." + Amount + " as been Credited " + " to Your Account Number "
						+ PNum + " Your Current Balance is " + getBalance());
				System.out.println("==============================================");
				break;
			}
			case 2: {
				System.out.println("Enter the Amount You Want to Withdraw");
				int Amount = sc.nextInt();
				if (Amount <= Balance) {
					withdraw(Amount);
					System.out.println("============= ALERT MESSAGE ================");
					System.out.println("MR." + Name + " Rs." + Amount + " as been Debited "
							+ " From Your Account Number " + PNum + " Your Current Balance is " + getBalance());
					System.out.println("==============================================");
				} else {
					System.out.println("============= ALERT MESSAGE ================");
					System.out.println("Balance is lesser than entired Amount");
					System.out.println("==============================================");
				}
				break;
			}
			case 3: {
				System.out.println("============= ALERT MESSAGE ================");
				System.out.println("Your Savings Account Balance is " + getBalance());
				System.out.println("==============================================");
				break;
			}
			case 4: {
				flag = false;
//				main(null);
				break;
			}
			default: {
				System.out.println("Invalid Choice");
			}

			}

		}

	}

}
