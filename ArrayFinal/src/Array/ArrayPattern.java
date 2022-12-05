package Array;

import java.util.Scanner;

public class ArrayPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of lines");
		int n = sc.nextInt();
		int a[] = new int[n];
		a[0] = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			int prev = 0;
			for (int j = 0; j < i; j++) {
				int temp = a[j];
				a[j] = a[j] + prev;
				prev = temp;

			}
			for (int j = 0; j < a.length; j++) {
				if (a[j] != 0) {
					System.out.print(a[j] + " ");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}

//	   1 
//    1 1 
//   1 2 1 
//  1 3 3 1 
// 1 4 6 4 1 
