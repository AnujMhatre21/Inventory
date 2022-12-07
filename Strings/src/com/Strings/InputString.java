package com.Strings;

import java.util.Scanner;

public class InputString {

	public static String readString() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ");
		String s = sc.nextLine();

		sc.close();
		return s;
	}
}
//encapsulation is used for data validations, data hiding, data security