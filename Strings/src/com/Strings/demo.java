package com.Strings;

import java.util.Scanner;

public class demo {

	public static void main(String[] args) {

		// fint out the kth largest element
//		int[] a = { 1, 2, 3, 4, 5, 6 };
//		int k = 3;
//		for (int i = 0; i < a.length - 1; i++) {
//			for (int j = i + 1; j < a.length; j++) {
//				if (a[i] < a[j]) {
//					int temp = a[i];
//					a[i] = a[j];
//					a[j] = temp;
//				}
//			}
//			if (i == k - 1) {
//				System.out.println(a[i]);

//				break;
//			}
//		}

//		1********1
//		12******21
//		123****321
//		1234**4321
//		1234554321

//		int lines=5;int spaces=(lines*2)-2;
//		for (int i = 1; i <=lines; i++) {
//			for (int j = 1; j <=i; j++) {
//				System.out.print(j);
//			}
//			for (int j = 1; j <=spaces; j++) {
//				System.out.print("*");
//			}
//			for (int j = i; j >= 1; j--) {
//				System.out.print(j);
//			}
//			System.out.println();
//			spaces=spaces-2;
//		}

//		swap the values without using temp variable
//	int a=10;
//	int b=20;
//	int c=30;
//	a=a+b+c;
//	c=a-(b+c);
//	b=a-(b+c);
//	a=a-(b+c);
//	System.out.println(a);
//	System.out.println(b);
//	System.out.println(c);

//		7
//		10
//		8
//		11
//		9
//		12
//		int n=7;
//		while(n!=10) {
//			
//			System.out.println(n);
//			n=n+3;
//			System.out.println(n);
//			n=n-2;
//		}		

//		numeber of 2s repeated in 0 to n

//	public static int count2(int n) {
//		int count = 0;
//		while (n > 0) {
//			if (n % 10 == 2)
//				count++;
//			n = n / 10;
//		}
//		return count;
//	}
//	public static void main(String[] args) {
//		int allcount=0;
//		for (int i = 2; i <=100; i++) {
//			allcount=allcount+count2(i);
//		}
//		System.out.println(allcount);

//		program for two digit number who's sum is 3 time the two digit number. (eg 27 by adding 2+7 =9. 9*3=27)
//		int x = 27;
//		int sum = 0;
//		while (x != 0) {
//			int num = x % 10;
//			sum = sum + 3 * num;
//			x = x / 10;
//
//		}
//		System.out.println(sum);

//		WAJP to Print the First Occurance
//	public static void firstOccurance() {
//		String firstCharStr;
//
//		char ch;
//		int i, flag = 0;
//
//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("\nEnter String to Find First Char Occur =  ");
//		firstCharStr = sc.nextLine();
//
//		System.out.print("\nEnter the Character to Find =  ");
//		ch = sc.next().charAt(0);
//
//		for (i = 0; i < firstCharStr.length(); i++) {
//			if (firstCharStr.charAt(i) == ch) {
//				flag++;
//				break;
//			}
//		}
//		if (flag == 0) {
//			System.out.println("\nSorry! We haven't found the Character ");
//		} else {
//			System.out.format("\nThe First Character Occurrence of %c at %d position", ch, i);
//		}
//
//	}

//		String str = "ava";
//		int flag = 0;
//		for (int i = 1; i < str.length(); i++) {
//			char ch = 'a';
//			if (str.charAt(i) == ch) {
//				flag = i;
//				System.out.println(flag);
//				break;
//			}
//		}
//
	
	String a="He is a very very good boy, isn't he?";
	String [] arr=a.split(" ");
	for (String aa : arr) {
		System.out.println(aa);
	}
	}
}
