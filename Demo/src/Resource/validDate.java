package Resource;

import java.util.Scanner;

//		Question- WAJP to read three inputs date, month and year 
//		Find out whether date is valid or not

public class validDate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter date in the format dd-mm-yyyy");
		int d = sc.nextInt(), m = sc.nextInt(), y = sc.nextInt();
//		System.out.println(validDate(d, m, y));
		System.out.println(countDays(d,m,y));
		sc.close();
	}

	public static boolean validDate(int d, int m, int y) {
		if (y < 1 || d < 1 || d > 31 || m < 1 || m > 12) {
			return false;
		} else if ((m == 4 || m == 6 || m == 9 || m == 11) && d > 30) {
			return false;
		} else if (m == 2 && (y % 400 == 0 || y % 4 == 0 && y % 100 != 0) && d > 29) {
			return false;
		} else if (m == 2 && d > 28) {
			return false;
		} else {
			return true;
		}
	}

	public static int countDays(int d, int m, int y) {
		int month[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int y1 = y - 1;
		int days = y1 * 365 + y1 / 400 + y1 / 100;
		for (int i = 1; i < m; i++) {
			days = days + month[i];
		}
		days = days + d;
		return days;
	}

}
