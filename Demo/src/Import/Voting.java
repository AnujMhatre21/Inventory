package Import;
import java.util.Scanner;

public class Voting {
	public static void main (String[]args) {
		Scanner s = new Scanner (System.in);
		System.out.println("Enter a age");
		int res=s.nextInt();
		if(res>=18 ) {
		System.out.println("Candidate is eligible for voting");
	}else if(res<=200){
		System.out.println("Please Enter Valid Age");
	}else {
		System.out.println("Candidate is not eligible for voting");
	}

}
}
