package Array2d;

import java.util.Scanner;

public class IOMatrix {
	

	public static int[][] readMatrix() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows(2digit)");
		int rows = sc.nextInt();
		System.out.println("Enter the number of coloums(2digit)");
		int columns = sc.nextInt();
		int a[][] = new int[rows][columns];
		System.out.println("Enter the matrix elements");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		sc.close();
		return a;
	}

	public static void DisplayMatrix(int a[][]) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}
}