package com.Strings;

import java.util.Scanner;

public class num2words {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = sc.nextInt();
		toWards(n / 10000000, "Crore");
		toWards((n / 100000) % 100, "Lakh");
		toWards((n / 1000) % 100, "Thousand");
		toWards((n / 100) % 10, "Hundred");
		toWards(n % 100, "");
		sc.close();
	}

	public static void toWards(int n, String s) {
		if (n == 0) {
			return;
		}
		String ones[] = { " ", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "Ten", "Eleven",
				"Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen" };
		String tens[] = { " ", "ten", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninty" };
		if (n > 19) {
			System.out.println(tens[n / 10] + " " + ones[n % 10] + " ");
		} else {
			System.out.println(ones[n] + " ");
		}
		System.out.println(s + " ");
	}
	
}
