package Array2d;

public class twoDArray {
	public static void main(String[] args) {
		
		
		
//		1 2 3 4
//		4 5 6 7
//		8 9 10 11 
//		12 13 14 15 
	}
//assignment WAJP to display the multiplication of two matrix 

	public static void reverseCol() {
//		wajp to COL wise reverse the matrix
		System.out.println("Enter the first matrix");
		int[][] a = IOMatrix.readMatrix();
		for (int i = 0; i < a.length / 2; i++) {
			for (int j = 0; j < a[i].length; j++) {
				int temp = a[i][j];
				a[i][j] = a[a[i].length - 1 - i][j];
				a[a[i].length - 1 - i][j] = temp;
			}
		}
		IOMatrix.DisplayMatrix(a);
	}

//	public static void merge the matrix

	public static void reverserows() {
//		wajp to row wise reverse the matrix
//		System.out.println("Enter the first matrix");
		int[][] a = IOMatrix.readMatrix();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length / 2; j++) {
				int temp = a[i][j];
				a[i][j] = a[i][a[i].length - 1 - j];
				a[i][a[i].length - 1 - j] = temp;
			}
		}
		IOMatrix.DisplayMatrix(a);
	}

	public static void sumRows() {
//		sum in rows
		int[][] a = IOMatrix.readMatrix();
		int sum[] = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				sum[i] = sum[i] + a[i][j];
			}
		}
		for (int i = 0; i < sum.length; i++) {
			System.out.println(sum[i]);
		}
	}

	public static void maxRows() {
//		find maximun number from coulumns
		System.out.println("Enter the first Matrix");
		int[][] a = IOMatrix.readMatrix();

		for (int i = 0; i < a.length; i++) {
			int max = a[0][0];
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] > max) {
					max = a[i][j];
				}
			}
			System.out.println(max);
		}
	}

	public static void maxCol() {
		int[][] a = IOMatrix.readMatrix();
		for (int i = 0; i < a.length; i++) {
			int max = a[0][0];
			for (int j = 0; j < a[i].length; j++) {
				if (a[j][i] > max) {
					max = a[j][i];
				}
			}
			System.out.println(max);
		}
	}

	public static void addMatrix() {
//	WAJP to print sum of two matrix
		System.out.println("Enter the first Matrix");
		int[][] a = IOMatrix.readMatrix();

		System.out.println("Enter the Second Matrix");
		int[][] b = IOMatrix.readMatrix();

		if (a.length != b.length || a[0].length != b[0].length) {
			System.out.println("Cannot add this matrix");
			return;
		}

		int c[][] = new int[a.length][a[0].length];
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		IOMatrix.DisplayMatrix(c);
	}

//	==============================================================
	public static void transpose() {
		int[][] a = IOMatrix.readMatrix();
		int b[][] = new int[a[0].length][a.length];
		for (int i = 0; i < a[0].length; i++) {
			for (int j = 0; j < a.length; j++) {
				b[j][i] = a[i][j];
			}
		}
		IOMatrix.DisplayMatrix(b);
	}

	public static void reverseCol(int a[][]) {
//		wajp to COL wise reverse the matrix
		System.out.println("Enter the first matrix");
//		int[][] a = InputArray.readMatrix();
		for (int i = 0; i < a.length / 2; i++) {
			for (int j = 0; j < a[i].length; j++) {
				int temp = a[i][j];
				a[i][j] = a[a[i].length - 1 - i][j];
				a[a[i].length - 1 - i][j] = temp;
			}
		}
		reverseCol(a);
	}

	public static void reverserows(int a[][]) {
//		wajp to row wise reverse the matrix
		System.out.println("Enter the first matrix");
//		int[][] a = InputArray.readMatrix();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length / 2; j++) {
				int temp = a[i][j];
				a[i][j] = a[i][a[i].length - 1 - j];
				a[i][a[i].length - 1 - j] = temp;
			}
		}
		IOMatrix.DisplayMatrix(a);
	}
//	=======================================================
//	wajp print the matrix element in spiral order(clockwise)

	public static void spiralsquare() {
		int[][] a = IOMatrix.readMatrix();
		for (int i = 0, j = a.length - 1; i < j; i++, j--) {
			for (int k = i; k < j; k++) {
				System.out.println(a[i][k] + " ");
			}
			for (int k = i; k < j; k++) {
				System.out.println(a[k][j] + " ");
			}
			for (int k = j; k > i; k--) {
				System.out.println(a[j][k] + " ");
			}
			for (int k = j; k > i; k--) {
				System.out.println(a[k][i] + " ");
			}
		}
		if (a.length % 2 == 1) {
			System.out.println(a[a.length / 2][a.length / 2]);
		}
	}

	public static void spiralrectangle() {
		int[][] a = IOMatrix.readMatrix();
		for (int i = 0, j = a.length - 1, b = a[0].length - 1; i < a.length; i++, j--, b--) {
			for (int k = i; k < b; k++) {
				System.out.println(a[i][k] + " ");
			}
			for (int k = i; k < j; k++) {
				System.out.println(a[k][b] + " ");
			}
			for (int k = b; k > i; k--) {
				System.out.println(a[j][k] + " ");
			}
			for (int k = j; k > i; k--) {
				System.out.println(a[k][i] + " ");
			}
		}
	}

	public static void spiralsquarerev() {
		int[][] a = IOMatrix.readMatrix();
		for (int i = 0, j = a.length - 1; i < j; i++, j--) {
			for (int k = i; k < j; k++) {
				System.out.println(a[k][i] + " ");
			}
			for (int k = i; k < j; k++) {
				System.out.println(a[j][k] + " ");
			}
			for (int k = j; k > i; k--) {
				System.out.println(a[k][j] + " ");
			}
			for (int k = j; k > i; k--) {
				System.out.println(a[i][k] + " ");
			}
		}
		if (a.length % 2 == 1) {
			System.out.println(a[a.length / 2][a.length / 2]);
		}
	}

//	==========================================================
//	swap vertical lines in a matrix
	public static void swapdiagonallines() {
		int[][] a = IOMatrix.readMatrix();
		for (int i = 0; i < a.length / 2; i++) {
			for (int j = 0; j < a[0].length; j++) {
				if (i == j) {
					int temp = a[i][j];
					a[i][j] = a[a.length - 1 - i][a[0].length - 1 - j];
					a[a.length - 1 - i][a[0].length - 1 - j] = temp;
				}
				if (i + j == a.length - 1) {
					int temp = a[i][j];
					a[i][j] = a[j][i];
					a[j][i] = temp;
				}
			}
		}
		IOMatrix.DisplayMatrix(a);
	}

	public static void maxmin() {
		int[][] a = IOMatrix.readMatrix();
		int max = a[0][0], min = a[0][0];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] > max) {
					max = a[i][j];
				}
				if (a[i][j] < min) {
					min = a[i][j];
				}
			}
		}
		System.out.println(max);
		System.out.println(min);
	}

	public static void sun() {
		int a[][] = IOMatrix.readMatrix();
		for (int i = 0; i < a.length; i++) {
			int sum = 0;
			for (int j = 0; j < a[i].length; j++) {
				sum = sum + a[i][j];
			}
			System.out.println(sum);
		}
	}

}
