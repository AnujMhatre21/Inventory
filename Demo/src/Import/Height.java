package Import;

import java.util.Scanner;
public class Height {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the height of Suresh in CMS");
		int h1=s.nextInt();
		
		System.out.println("Enter the heigh of Ramesh in CMS");
		int h2=s.nextInt();
		System.out.println(h1>h2? "As the Height if Ramesh is Shorter he should stand in front":
			                      "As the Height if Suresh is Shorter he should stand in front");
		
		

	}

}

