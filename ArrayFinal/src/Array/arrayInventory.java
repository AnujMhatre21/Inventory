package Array;

import java.util.Arrays;

public class arrayInventory {

	public static void main(String[] args) {
		maxorder();
	}

	public static void maxorder() {
		int a[] = { 11, 6, -2, 5, 9, 18, 1 };
		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
//		also used to print the array
		System.out.println(Arrays.toString(a));
//		IOarray.printArray(a);
	}

//			identify the smallest first 
	public static void smallfirst() {
		int[] a = { 11, 6, -2, 5, 9, 18, 1 };
		for (int i = 0; i < a.length; i++) {
			int index = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[index]) {
					System.out.println(index);	
					index = j;
				}
			}
			int temp = a[i];
			a[i] = a[index];
			a[index] = temp;

		}
//		IOarray.printArrayln(a);
	}

//			WAJP to check who many times a element is present 
	public static void repeatednum() {
		int a[] = { 11, 1, -2, 1, 11, 11, 4 };
		boolean[] b = new boolean[a.length];

		for (int i = 0; i < b.length; i++) {
			int count = 1;
			if (b[i] == false) {

				for (int j = i + 1; j < b.length; j++) {
					if (a[i] == a[j]) {
						count++;
						b[j] = true;
					}
				}
				if (count > 1) {
					System.out.println(a[i] + " " + count + " times");
				}
			}
		}
	}

	public static void Dupliinarr() {
		int a[] = { 11, 1, -2, 1, 11, 11, 4 };
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		int[] b = new int[max + 1];
		for (int i = 0; i < a.length; i++) {
			b[a[i]]++;
		}
		for (int i = 0; i < b.length; i++) {
			if (b[i] > 1) {
				System.out.println(i + " is present " + b[i] + " times");
			}
		}
	}

	public static void arrAvg() {
//		Question- WAJP to find average ?
		int a[] = { 1, 12, 35, 54, 9, 6, 9, 54 };
		double sum = 0;
		double average;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		average = sum / a.length;
		System.out.println(average);
	}

//		Question- WAJP to merge two arrays ?
	public static void arrMerge() {
		int a[] = { 1, 2, 3 };
		int b[] = { 4, 5, 6 };
		int c[] = new int[a.length + b.length];

		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}
		for (int j = a.length; j < c.length; j++) {
			c[j] = b[j - a.length];
		}
		IOarray.printArray(c);
	}

//			Method 2 -

//		int k=0;
//		for(int i=0;i<a.length;i++) {
//			c[k]=a[i];
//			k++;
//		}
//		for(int i=0;i<b.length;i++) {
//			c[k]=b[i];
//			k++;
//		}
//		printArray.printArray(c);
//		}
//	  }

//			USING SINGLE LOOP

//			for(int i=0;i<c.length;i++) {
//				if(i<a.length) {
//					c[i]=a[i];
//				}else {
//					c[i]=b[i-a.length];
//				}
//			}
//			printArray.printArray(c);
//			}
//			
//			}

	public static void sumtill3in() {
//			Question- given array {1,3,1,7,9,3,0,3,7,19,8,3,1,2} 
//			add the elements if you find 3 till you find another 3
//			note that both the 3's are inclusive
//		Output=67
		int a[] = { 1, 3, 1, 7, 3, 1, 3, 7, 8, 3 };
		int sum = 0;
		boolean b = false;

		for (int i = 0; i < a.length; i++) {
			if (b = true) {
				sum = sum + a[i];
				if (a[i] == 3) {
					b = false;
				}
			} else if (a[i] == 3) {
				sum = sum + a[i];
				b = true;
			}
		}
		System.out.println(sum);
	}

	public static void sumtill3ex() {
//			Question- given array {1,3,1,7,9,3,0,3,7,19,8,3,1,2} 
//			add the elements one if you find 3 till you find another 3
//			note that both the 3's are exclusive
//		output -51

		int a[] = { 1, 3,  1, 7, 9, 3, 0, 3, 7, 19, 8, 3, 1, 2 };
		int sum = 0;
		boolean b = false;

		for (int i = 0; i < a.length; i++) {
			if (b) {
				sum = sum + a[i];
				if (a[i] == 3) {
					b = false;
					sum = sum - 3;
				}
			} else if (a[i] == 3) {
				// sum=sum+a[i];
				b = true;
			}
		}
		System.out.println(sum);
	}

	public static void Diffevenodd() {
//		Question-WAJP to print difference between the sum of odd numbers and even numbers 

		int a[] = { 1, 6, 66, 7, 17, 5 };
		int even = 0;
		int odd = 0;
		int diff = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				even = even + a[i];
			} else if (a[i] % 2 == 1) {
				odd = odd + a[i];
			}
		}
		diff = even - odd;
		System.out.println(diff);
	}

	public static void revarr() {
//		Question- WAJP to reverse the array 
		int[] a = { 1, 6, 66, 7, 17, 5, 10 };
		for (int i = 0; i < a.length / 2; i++) {
			int temp = a[i];
			a[i] = a[a.length - 1 - i];
			a[a.length - 1 - i] = temp;

		}
		printArray.printArray(a);
	}

	public static void addinend() {
//		Question- WAJP to insert an element in a array in the end
		int newno = 99;
		int a[] = { 1, 6, 66, 7, 17, 5, 10 };
		int b[] = new int[a.length + 1];
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}
		b[b.length - 1] = newno;
		printArray.printArray(b);
	}

	public static void addinfirst() {
//			Question- WAJP to insert an element in a array in the end

		int newno = 99;
		int a[] = { 1, 6, 66, 7, 17, 5, 10 };
		int b[] = new int[a.length + 1];
		for (int i = 1; i < b.length; i++) {
			b[i] = a[i - 1];
		}
		b[0] = newno;
		printArray.printArray(b);
	}

	public static void zigzag() {
//		Question- WAJP to add the array elements in zig zag order

		int a[] = { 1, 2, 3, 4 };
		int b[] = { 5, 6, 7, 8, 9, 10, 11 };
		int c[] = new int[a.length + b.length];
		int j = 0;
		for (int i = 0; i < c.length; i++) {
			if (i < a.length) {
				c[j] = a[i];
				j++;
			}
			if (i < b.length) {
				c[j] = b[i];
				j++;
			}
		}
		printArray.printArray(c);
	}

//		Wajp to print the average of avg of even numbers and avg of odd number 

	public static void avgavgevenodd() {
		int a[] = { 1, 2, 3, 4, 5, 6 };
		int sumev = 0;
		int avg = 0;
		int countev = 0;
		int sumod = 0;
		int countod = 0;
		for (int i = 0; i < a.length; i++) {
			if (i % 2 == 0) {
				countev++;
				sumev = sumev + a[i];
			} else {
				countod++;
				sumod = sumod + a[i];
			}
		}
		int avgev = sumev / countev;
		int avgod = sumod / countod;
		System.out.println(avg = (avgev + avgod) / 2);
	}

	public static void avgev() {
		int a[] = { 1, 2, 3, 4, 5, 6 };
		int sumev = 0;
		int avgev = 0;
		int count = 0;
		for (int i = 0; i <= a.length; i++) {
			if (i % 2 == 0) {
				count++;
				sumev = sumev + i;
			}
			int avgv = sumev / count;
		}
		System.out.println(avgev);

	}

	public static void contlar() {
//Wajp to find the continuous positive largest sum

		int a[] = { 61, 3, -9, 103, 9, 14, -1, 2, 49, 68 };
		int sum = 0;
		int max = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < 0) {
				if (max < sum) {
					max = sum;
				}
				sum = 0;
			} else {
				sum = sum + a[i];
			}
			if (max < sum) {
				max = sum;
			}
		}
		System.out.println(max);
	}

	public static void contlar1() {

		int a[] = { 61, 3, -9, 103, 9, 14, -1, 2, 49, 68 };
		int sum = 0, max = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0) {
				sum = sum + a[i];
				if (sum > max) {
					max = sum;
				}
			} else {
				sum = 0;

			}
		}
		System.out.println(max);
	}
}
