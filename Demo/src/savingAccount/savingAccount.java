package savingAccount;
import java.util.Scanner;
public class savingAccount {
	int acno;
	String name;
	String ifsc;
	double balance;
	
//	Constructor
	savingAccount(int acc,String n, String i, double bal){
		acno=acc;
		name=n;
		ifsc=i;
		balance=bal;
	}
//	Display Detail 
	public void displayDetails() {
		System.out.println("====================================");
		System.out.println("Account Number: "+acno);
		System.out.println("Account Holder Name: "+name);
		System.out.println("IFSC Code: "+ifsc);
		System.out.println("Account Balance: "+balance+" Rs");	
		System.out.println("===================================");
	}
//	Deposit
	public void deposit(double amt) {
		balance+=amt;
		System.out.println(amt+" has been credited to your AccNo. "+acno );
		System.out.println("And total balance is: "+balance);
	}
//	Withdraw
	public void withdraw(double amt) {
		if(amt<=balance) {
		balance-=amt;
		System.out.println(amt+" amount has been debited from your AccNo. "+acno);
		System.out.println("And total balance is: "+balance);
	}else {
		System.out.println("Insufficient Balance");
	}
}
}
