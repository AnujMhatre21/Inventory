package Array;

public class practice {
	public static void main(String[] args) {
		int a[] = { 5, 4, 3, 2, 1 };
		for (int i = 0; i < a.length; i++) {
			int index=i;
			for (int j = i + 1; j < a.length; j++) {
			
				if (a[index] > a[j]) {
					index = j;
				}
			}
				int temp = a[i];
				a[i]=a[index];
				a[index] = temp;


		}
		IOarray.printArray(a);
	}
}
