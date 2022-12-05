package Resource;

public class CountDigit {

	public static int countDigit(int num) {
		int digitCount=0;
		while (num!=0) {
			digitCount++;
			num=num/10;
		}
		return digitCount;

	}

}

//Question- WAJP read the input from the user and
//count the number of digits in the number  

//Scanner sc= new Scanner(System.in);
//System.out.println("Count the digits in the numbers");
//int n=sc.nextInt();
//
//int count=0;
//
//do {
//	 count++;
//	 n=n/10;
//}
//while(n>0);
//System.out.println(count);
//} 
//}