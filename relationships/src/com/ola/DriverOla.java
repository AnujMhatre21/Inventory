package com.ola;

import java.util.Scanner;

public class DriverOla {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your name");
		String N=sc.nextLine();
		System.out.println("enter your Start");
		String S=sc.nextLine();
		System.out.println("enter your Destination");
		String D=sc.nextLine();
		Ola o = new Ola(N,S,D);
		o.DisplayDetails(); 
	}
}
