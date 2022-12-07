package com.Strings;

import java.util.Scanner;

public class practice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char ch[] = s.toCharArray();
		int count[] = new int[s.length()];
		for (int i = 0; i < s.length(); i++) {
			count[i] = 1;
			for (int j = i + 1; j < s.length(); j++) {
				if (ch[i] == ch[j]) {
					count[i]++;
//		 making the counted characters as 0 so that we don't count them again
					ch[j] = '0';
				}
			}
		}
		for (int i = 0; i < count.length; i++) {
			if (ch[i] != ' ' && ch[i] != '0') {
				System.out.println(count[i] + " " + ch[i]);
			}
		}
		sc.close();
	}
}
