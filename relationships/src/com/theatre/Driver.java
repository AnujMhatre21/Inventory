package com.theatre;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Theatre theatre = new Theatre("INOX");
		theatre.setTicket(new Ticket("KGF"));

		Scanner sc = new Scanner(System.in);
		boolean flag = true;

		while (flag) {
			System.out.println("1.Book Ticket  2. Cancel  3. Check Status 4. Exit");
			int n = sc.nextInt();

			switch (n) {
			case 1: {
				System.out.println("Enter the number of tickets to be booked");
				int m = sc.nextInt();
				theatre.bookTicket(m);
			}
				break;
			case 2: {
				System.out.println("Enter the number of tickets to be cancelled");
				int m = sc.nextInt();
				theatre.cancelTicket(m);
			}
				break;
			case 3: {
				theatre.checkSeats();
			}
				break;

			case 4: {
				flag = false;
			}
				break;
			default: {
				System.out.println("Invalid Choice");
			}
			}

		}

	}
}
