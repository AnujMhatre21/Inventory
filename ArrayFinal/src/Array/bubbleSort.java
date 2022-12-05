package Array;

public class bubbleSort {

	public static void main(String[] args) {

//		Sort in ascending order

		int a[] = { 3, 0, 1, 8, 9, 19, 2 };

		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = 0; j < a.length - 1 - i; j++) {

				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					count++;
				}
			}
			if (count == 0) {
				break;
			}
		}
		IOarray.printArray(a);
	}
}

//	swaping done =one itration
//	one placed in positon = one pass
