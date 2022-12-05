package Resource;

import java.util.Scanner;

public class allPrograms {
	public static void main(String[] args) {
		System.out.println(ispallendrium(1221));
	}

//	how many leap with the y year 
	public static void countleap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year");
		int y = sc.nextInt();
		System.out.println(y / 400 + y / 4 - y / 100);

	}

	public static void chkmagic(int num) {
		int sum = 0;
		while (num >= 9) {
			while (num != 0) {
				int digit = num % 10;
				sum += digit;
				num = num / 10;
			}
			num = sum;
		}
		if (num == 1) {
			System.out.println(num + " is a magic number");
		} else {
			System.out.println("not magic number");
		}
	}

	public static void chkdisarium(int num) {
//		digit power of the position
		int count = 0;
		int temp = num;
		while (temp != 0) {
			temp = temp / 10;
			count++;
		}
		temp = num;
		int sum = 0;
		while (temp != 0) {
			int multi = 1;
			int n = temp % 10;
			for (int i = 1; i <= count; i++) {
				multi = multi * n;
			}
			sum += multi;
			count--;
			temp = temp / 10;
		}
		if (num == sum) {
			System.out.println(num + " is a Disarium number");
		} else {
			System.out.println("not a Disarium number");
		}
	}

	public static void chkArmstrong(int num) {
//		length of that number whie be the power of each number and 
//		sum all numbers 
		int sum = 0;
		int temp = num;
		while (num != 0) {
			int d = num % 10;
			sum = sum + (d * d * d);
			num = num / 10;
		}
		System.out.println(sum);
	}

	public static void chkStrong(int num) {
//		additon of factorial of each digit
		int add = 0;
		int temp = num;
		while (num != 0) {
			int digit = num % 10;
			int multi = 1;
			for (int i = digit; i >= 1; i--) {
				multi = multi * i;
			}
			add = add + multi;
			num = num / 10;
		}
		if (temp == add) {
			System.out.println(temp + " is a Strong number");
		}
	}

	public static boolean isPrime(int n) {
//		must be only divisible by 1 and itself
		if (n <= 1) {
			return false;
		}
//		take upto n/2 because any number is always
//		divisible max by its half number
//		and starting the for loop from 2 because
//		1 or not prime;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

//	1. convert decimal to binary
	public static void dec2bin(int n) {
		int a = 0;
		String s = "";
		while (n != 0) {
			a = n % 2;
			s = a + s;
			n = n / 2;
		}
		System.out.println(s + " ");
	}

//	2. convert decimal to hexi decimal
	public static void dec2hexi(int n) {
		String s = "";
		while (n != 0) {
			int a = n % 16;

			if (a < 10) {
				s = a + s;
			} else {
				s = (char) (a + 55) + s;
			}
			n = n / 16;
		}
		System.out.print(s);
	}

//	4.WAJP TO PRINT ALL 3 DIGIT PALANDROM
	public static void palandrom(int n) {
		for (int i = 1; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.println(i + "" + j + i);
			}
		}
	}

	public static boolean ispallendrium(int n) {
		if (n == 0) {
			return true;
		}
		if (n < 0) {
			return false;
		}
		int temp = n;
		int rev = 0;
		while (temp != 0) {
			int rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp / 10;
		}
		if (n == rev) {
			return true;
		} else {
			return false;
		}

	}

//	5. WAJP wheather the number is happy is not?
	public static void happyNumber(int n) {
		while (n > 9) {
			int sum = 0;
			while (n != 0) {
				int d = n % 10;
				sum = sum + (d * d);
				n = n / 10;
			}
			n = sum;
		}
//		System.out.println(n);
		if (n == 1 || n == 7) {
			System.out.println("HAHAHAHA");
		} else {
			System.out.println("-_-");
		}
	}

	public static void happychk(int n) {
		while (n > 9) {
			int sum = 0;
			while (n != 0) {
				int d = n % 10;
				sum = sum + (d * d);
				n = n / 10;
			}
			n = sum;
		}
		if (n == 1 || n == 7) {
			System.out.println("hashah");
		}
	}

//	6.WAJP to print happy number from 1 to 1000

	public static void happyRange(String[] args) {
		for (int i = 1; i <= 1000; i++) {
			if (isHappy(i)) {
				System.out.println(i);
			}
		}
	}

	public static boolean isHappy(int n) {
		while (n > 9) {
			int sum = 0;
			while (n != 0) {
				int d = n % 10;
				sum = sum + (d * d);
				n = n / 10;
			}
			n = sum;
		}
		return n == 1 || n == 7;
	}
//	==========================================

//	7.Write program to find the sum of square of digit?
	public static void squareofDigit(int n) {
		int sum = 0;
		while (n > 0) {
			int d = n % 10;
			sum = sum + (d * d);
			n = n / 10;
		}
		System.out.println(sum);
	}

//	8. Write a program to find the sum of first 2 and last 2 digits if a 4 or greater
//			digit number is given
	public static void ChkFour(int n) {
		int count = 0;
		int sum = 0;
		while (count < 2) {
			int d = n % 10;
			n = n / 10;
			sum = sum + d;
			count++;
		}
		if (n > 99) {
			n = n / 10;
		}
		if (n < 99) {
			while (n != 0) {
				int d = n % 10;
				n = n / 10;
				sum = sum + d;
			}
		}
		System.out.println(sum);
	}

// 1. print perfect Number if
//	negative convert to positive

	public static void negconpos(int n) {
		if (n < 0) {
			n = n * -1;
		}
		System.out.println(n);
	}

	// this code is called as psudo column
//	with no methods

	// 2. largest to three numbers

	public static void largestof3(int n) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		if (n1 > n2 && n1 > n3) {
			System.out.println(n1);
		} else if (n2 > n3) {
			System.out.println(n2);
		} else {
			System.out.println(n3);
		}

	}

	// 3. if (a+b)+(a*b)=ab Special Number

	public static void specialNo(int n1) {
		int a = n1 % 10;
		int b = n1 / 10;

		if ((a + b) + (a * b) == n1) {
			System.out.println(n1 + " is Special number ");
		} else {
			System.out.println("the number is not Special");
		}
	}

// 4. find out leap year or not

	public static void chkLeap(int y) {
		if (y % 400 == 0 || y % 4 == 0 && y % 100 != 0) {
			System.out.println("year is a leap year");
		} else {
			System.out.println("Not a leap year");
		}
	}

// 5. Check whether the entered date is valid or not ?

	class date {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the date in the format DD-MM-YYYY format");
			int date = sc.nextInt();
			int month = sc.nextInt();
			int year = sc.nextInt();
			if (date < 1 || date > 31 || month < 1 || month > 12 || year < 1) {
				System.out.println("Date is Invalid");
			} else if ((month == 4 || month == 6 || month == 9 || month == 11) && date < 30) {
				System.out.println("Date is Invalid");
			} else if (month == 2 && (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) && date > 29) {
				System.out.println("Date is Invalid");
			} else if (month == 2 && date > 28) {
				System.out.println("Date is Invalid");
			} else
				System.out.println("Date is valid");
		}
	}

// 5. enter 3 numbers and find out the middle one
	class middle {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			if (a > b && a < c || a > c && a < b) {
				System.out.println("The Middle Nunber is " + a);
			} else if (b > a && b < c || b > c && b < a) {
				System.out.println("The Middle Number is " + b);
			} else {
				System.out.println("The Middle Number is " + c);
			}
		}
	}
}
