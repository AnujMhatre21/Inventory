package proMy;

public class Existing extends Bank implements ExistingInter {
	BankingServices bankingservices;
	
	public void addedAccount() {
		System.out.println("entered");
	}

}
