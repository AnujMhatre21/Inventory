	package Resource.Recursion;

import java.util.Scanner;

public class nthFibo {
	public static int fibo(int n) {
		if (n == 1) {
			return 0;
		}
		if (n == 2) {
			return 1;
		}
		return fibo(n - 1) + fibo(n - 2);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Till Which Number you need Series");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			if (i <= n) {
				System.out.print(nthFibo.fibo(i));
			}
			if (i != n) {
				System.out.print(",");
			}

		}
	}
}

//	=====================================================
//	public static void Fibo(int n) {
//		int n1=0;int n2=1;
//		int count=0;
//		while (count<n) {
//			System.out.println(n1);
//			int n3=n1+n2;
//			n1=n2;
//			n2=n3;
//			count++;
//		}
//	}
//
//	public static void main(String[] args) {
//		Fibo(5);
//	}
//}
