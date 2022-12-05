package Resource;

import java.util.Scanner;

public class Date {
	public static void main(String[] args) {

		System.out.println("Please enter valid date");
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		int m = sc.nextInt();
		int y = sc.nextInt();

		System.out.println(countdays(d, m, y));
		System.out.println(days(d, m, y));
		Nextday(d, m, y);
		sc.close();
	}

	public static int countdays(int d, int m, int y) {
		int month[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if (y % 400 == 0 || y % 4 == 0 && y % 100 != 0) {
			month[2] = 29;
		}
		int days = 0;
		int y1 = y - 1;
		days = y1 * 365 + y1 / 400 + y1 / 4 - y1 / 100;
		for (int i = 0; i < m; i++) {
			days = days + month[i];
		}
		days = days + d;
		return days;
	}

	public static String days(int d, int m, int y) {
		String s[] = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thrusday", "Friday", "Saturday" };
		String day = "";
		day = s[(countdays(d, m, y)) % 7];
		return day;
	}

//	Siddhis days in 2022 is on thrusday when is her birthday on next thrusday
	public static void Nextday(int d, int m, int y) {
		String s[] = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thrusday", "Friday", "Saturday" };
		String s1 = days(d, m, y);
		for (int i = y + 1; i < (y + 25); i++) {
			String s2 = days(d, m, i);
			if (s1.equals(s2)) {
				System.out.println(i);
				break;
			}
		}

	}

}
