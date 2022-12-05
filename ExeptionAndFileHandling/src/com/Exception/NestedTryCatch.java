package com.Exception;

import java.util.Scanner;

public class NestedTryCatch {

	public static void main(String[] args) {
		int[] marks = new int[2];
		marks[0] = 10;
		marks[1] = 20;
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while (flag) {
			System.out.println("Enter ther index number");
			int ind = sc.nextInt();
			try {
				System.out.println("first try entered");
				try {
					System.out.println(marks[ind]);
					flag = false;
				} catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("this index does not exist");
				}
			} catch (ArithmeticException e) {
				System.out.println("Last try Block");
			}
		}

	}

}
