package patternProg;

import java.util.Scanner;

public class patternProg {

	public static void main(String[] args) {

//		1
//		0 1
//		0 1 0
//		1 0 1 0
//		1 0 1 0 1
//		
//		int k = 1;
//		int n = 5;
//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print(k % 2 + " ");
//				k++;
//			}
//			System.out.println();
//		}

//		A 
//		A B 
//		A B C 
//		A B C D 
//		A B C D E 
//		

//		int n=5;
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print((char)(64+j)+" ");
//			}
//			System.out.println();
//		}
//	}
//}

//		A 
//		B B 
//		C C C 
//		D D D D 
//		E E E E E 

//		int n=5;
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print((char)(64+i)+" ");
//			}
//			System.out.println();
//		}
//	}
//}

//		1 
//		2 6 
//		3 7 10 
//		4 8 11 13 
//		5 9 12 14 15 

//		int n=5;
//		for(int i=1;i<=n;i++) {
//			int k=1;
//			for(int j=1;j<=i;j++) {
//				
//				System.out.print(k+" ");
//				k=k+n-j;
//				
//			
//			}
//			System.out.println();
//		}

//		1 
//		2 2 
//		3 3 3 
//		4 4 4 4 
//		5 5 5 5 5 

//		for(int i=1;i<=5;i++){
//			for(int j=1;j<=i;j++) {
//				
//					System.out.print(i+" ");
//			}
//			System.out.println();
//		}
//	}
//}

//		for(int i=1;i<=5;i++){
//			for(int j=1;j<=i;j++) {
//				System.out.print(j);
//			}
//			for(int j=i;j<5;j++) {
//				System.out.print(" ");
//			}
//			System.out.println();	
//			}
//		}
//	}

//		int n=5;
//		for(int i=1;i<=n;i++) {
//			for(int k=1;k<=n-i+1;k++) {
//				System.out.print("  ");
//			}
//			for(int j=1;j<=i;j++) {
//				System.out.print(n-i+j+" ");
//			}
//			System.out.println();
//		}
//	}
//}

//		int n=5;
//		for(int i=1;i<=n;i++) {
//			for(int k=i;k<=n-1;k++) {
//				System.out.print("  ");
//			}
//			for(int j=1;j<=i;j++) {
//				System.out.print(n-i+j+" ");
//			}
//			System.out.println();
//		}
//	}
//}

//		Scanner sc =new Scanner (System.in);
//		int n=sc.nextInt();
//		for(int i=1;i<=n;i++) {
//			for(int j=i;j<=n-1;j++) {
//				System.out.print(" ");
//			}
//			for(int j=1;j<=i;j++) {
//				System.out.print(n-i+j+"");
//								 
////				System.out.println("* ");
//			}
//			System.out.println();
//		}

//		method 2
//        1 
//      1 2 1 
//    1 2 3 2 1 
//  1 2 3 4 3 2 1 
//1 2 3 4 5 4 3 2 1 
//
//		Scanner sc =new Scanner (System.in);
//		System.out.println("Enter number of Lines");
//		int n=sc.nextInt();
//		
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n-i;j++) {
//				System.out.print("  ");
//			}
//			for(int j=1;j<i;j++) {
//				System.out.print(j+" ");
//								 
////				System.out.println("* ");
//			}
//			for(int j=i;j>=1;j--) {
//				System.out.print(j+" ");
//								 
////				System.out.println("* ");
//			}
//			System.out.println();
//		}

//		Scanner sc =new Scanner (System.in);
//		System.out.println("Enter number of Lines");
//		int n=sc.nextInt();
//		
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n-i;j++) {
//				System.out.print("  ");
//			}
//			int k=1;
//			for(int j=1;j<=i*2-1;j++) {
//				System.out.print(k+" ");
//								 
////				System.out.println("* ");
//			if(j<i) {
//				k++;
//			}else k--;
//			}
//			System.out.println();
//		}

//        1 
//      1 * 2 
//    1 * 2 * 3 
//  1 * 2 * 3 * 4 
//1 * 2 * 3 * 4 * 5 

//		can also be solves using odd even 

//		Scanner sc =new Scanner (System.in);
//		System.out.println("Enter number of Lines");
//		int n=sc.nextInt();
//		
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n-i;j++) {
//				System.out.print("  ");
//			}
//			for(int j=1;j<=i;j++) {
//					System.out.print(j+" ");
//			if(j<i) {
//				System.out.print("* ");
//			}
//			}
//			System.out.println();
//		

//	       * 
//	     * * * 
//	   * * * * * 
//	 * * * * * * * 
//	   * * * * * 
//	     * * * 
//	       * 

		int n = 7;
		int st = 1;
		int sp = n / 2; 						// sp=
		for (int i = 1; i <= n; i++) { 			// st=
			for (int j = 1; j <= sp; j++) { 	// i=
				System.out.print("  ");
			}
			for (int j = 1; j <= st; j++) {
				System.out.print("* ");

			}
			System.out.println();
			if (i <= n / 2) {
				st = st + 2;
				sp--;
			} else {
				st = st - 2;
				sp++;
			}	
		}	

//		* * * * * * * 		
//		  * * * * * 
//		    * * * 
//		      * 
//		    * * * 
//		  * * * * * 
//		* * * * * * *

//		int n = 7, st = n, sp = 0;
//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j <= sp; j++) {
//				System.out.print("  ");
//			}
//			for (int j = 1; j <= st; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//			if (i <= n / 2) {
//				st = st - 2;
//				sp++;
//			} else {
//				st = st + 2;
//				sp--;
//			}
//		}

//		*           * 
//		  *       * 
//		    *   * 
//		      * 
//		    *   * 
//		  *       * 
//		*           * 

//		int n = 7, st = n, sp = 0;
//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j <= sp; j++) {
//				System.out.print("  ");
//			}
//			for (int j = 1; j <= st; j++) {
//				if (j == 1 || j == st) {
//					System.out.print("* ");
//				} else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//			if (i <= n / 2) {
//				st = st - 2;
//				sp++;
//			} else {
//				st = st + 2;
//				sp--;
//			}
//		}
//	==============	
//	       *
//	     *   *
//	   *       *kmknm
//	 *           *
//	   *       *
//	     *   *
//	       *
//		====================
//	        1 
//	      1 0 1 
//	    1 0 1 0 1 
//	  1 0 1 0 1 0 1 
//	    1 0 1 0 1 
//	      1 0 1 
//	        1 

//		int n = 7;
//		int st = 1;
//		int sp = n / 2; // sp=
//		for (int i = 1; i <= n; i++) { // st=
//			for (int j = 1; j <= sp; j++) { // i=
//				System.out.print("  ");
//			}
//			for (int j = 1; j <= st; j++) {
//				System.out.print(j % 2 + " ");
//			}
//			System.out.println();
//			if (i <= n / 2) {
//				st = st + 2;
//				sp--;
//			} else {
//				st = st - 2;
//				sp++;
//			}
//		}
//		==========================================
//			  1
//          1 2 1 		
//		  1 2 3 2 1 
//		1 2 3 4 3 2 1
//		  1 2 3 2 1
//		    1 2 1
//		      1

//		int n = 7;
//		int st = 1, sp = n / 2;
//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j <= sp; j++) {
//				System.out.print("  ");
//			}
//			int k = 1;
//			for (int j = 1; j <= st; j++) {
//				System.out.print(k + " ");
//				if (j <= st / 2) {
//					k++;
//				} else {
//					k--;
//				}
//			}
//			if (i <= n / 2) {
//				st += 2;
//				sp--;
//			} else {
//				st -= 2;
//				sp++;
//			}
//			System.out.println();
//
//		}
//	}

//		==============================================
//	   	    1 
//	      2 1 2 
//	    3 2 1 2 3 
//	  4 3 2 1 2 3 4 
//	    3 2 1 2 3 
//	      2 1 2 
//	        1 
//	int n = 7;
//	int st = 1;
//	int sp =n/2;
//	for(int i = 1;i<=n;i++){
//		for (int j = 1; j <= sp; j++) {
//			System.out.print("  ");
//		}
//		int k = st / 2 + 1;
//		for (int j = 1; j <= st; j++) {
//			System.out.print(k + " ");
//			if (j <= st / 2) {
//				k--;
//			} else {
//				k++;
//			}
//		}
//		if (i <= n / 2) {
//			st += 2;
//			sp--;
//		} else {
//			st -= 2;
//			sp++;
//		}
//		System.out.println();
//	}
//		====================================
//		   4 
//	     3 4 3 
//	   2 3 4 3 2 
//	 1 2 3 4 3 2 1 
//	   2 3 4 3 2 
//	     3 4 3 
//	       4 

//		int n = 7;
//		int st = 1, sp = n / 2;
//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j <= sp; j++) {
//				System.out.print("  ");
//			}
//			int k = sp + 1;
//			for (int j = 1; j <= st; j++) {
//				System.out.print(k + " ");
//				if (j <= st / 2) {
//					k++;
//				} else {
//					k--;
//				}
//			}
//			if (i <= n / 2) {
//				st += 2;
//				sp--;
//			} else {
//				st -= 2;
//				sp++;
//			}
//			System.out.println();
//
//		}

	}
}
