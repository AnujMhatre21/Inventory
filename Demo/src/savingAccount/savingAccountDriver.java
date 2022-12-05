package savingAccount;

import java.util.Scanner;

public class savingAccountDriver {
	
	public static void main(String[] args) {
		
		savingAccount s1=new savingAccount(101,"Anuj","mah12", 5000);
		savingAccount s2=new savingAccount(102,"Vicky","mah13",10000);
		s1.displayDetails();
		s2.displayDetails();
		s1.deposit(200);
	
		

		
	}

}
