package pro;

import java.util.InputMismatchException;
import java.util.Scanner;

	public class Showroom
	{
	public static void main(String[] args)
	{
	// Upcasting-Downcasting for Two Wheeler
	Vehicle ref1 = new Two_Wheeler();
	Two_Wheeler ref2 = (Two_Wheeler) ref1;
	System.out.println("Press 1 For Two Wheeler");

	// Upcasting-Downcasting for Three Wheeler
	Vehicle ref3 = new Three_Wheeler();
	Three_Wheeler ref4 = (Three_Wheeler) ref3;
	System.out.println("Press 2 For Three Wheeler");

	// Upcasting-Downcasting for Four Wheeler
	Vehicle ref5 = new Four_Wheeler();
	Four_Wheeler ref6 = (Four_Wheeler) ref5;
	System.out.println("Press 3 For Four Wheeler");


	Scanner sc = new Scanner(System.in);
	int a = 0;

	try {
	a = sc.nextInt();
	} catch (InputMismatchException ie)
	{
	System.out.println("The Enter The Valid Input");
	System.out.println();
	}

	switch (a) {
	case 1:
	System.out.println("You Have Choosen Two Wheeler");
	ref2.TW();
	break;
	case 2:
	System.out.println("You Have Choosen Three Wheeler");
	ref4.ThW();
	break;
	case 3:
	System.out.println("You Have Choosen Four Wheeler");
	ref6.FW();
	break;
	default:
	System.out.println("Invaild Input :)");
	System.out.println();
	main(args);
	break;
	}
	}


	static
	{
	System.out.println("Welcome To Our Showroom <3");
	System.out.println("May I Help U???");
	System.out.println("Which Vehicle Should You Buy??");
	System.out.println("======================================");
	}
}
