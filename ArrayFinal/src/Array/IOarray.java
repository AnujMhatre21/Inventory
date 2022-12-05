package Array;

import java.util.Scanner;

public class IOarray {
	public static int[] readArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the array elements");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		return a;
	}

	// for int
	public static void printArrayln(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

	public static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}

	// ==============================================
	// for char
	public static void printArrayln(char[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + " ");
		}

	}

	public static void printArray(char[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}
	// ===============================================

}