package com.Strings;

import java.util.Scanner;

public class Programs {
	public static void main(String[] args) {
		String s = InputString.readString();
//		System.out.println(isAnagram(s));
		reptletters1(s);
		}

//	public static void main(String[] args) {
//	inttoString
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
////	String s=Integer.toString(n);  //1st option
//		String s = String.valueOf(n); // 2nd option
//		System.out.println(s);
//	}
	public static void compareTo() {
//		If the first string is lexicographically greater than the second string,
//		it returns a positive number (difference of character value).
//		If the first string is less than the second string lexicographically, it returns a negative number,
//		and if the first string is lexicographically equal to the second string, it returns 0.
		String s1 = "hello";
		String s2 = "hello";
		String s3 = "meklo";
		String s4 = "hemlo";
		String s5 = "flag";
		System.out.println(s1.compareTo(s2));// 0 because both are equal
		System.out.println(s1.compareTo(s3));// -5 because "h" is 5 times lower than "m"
		System.out.println(s1.compareTo(s4));// -1 because "l" is 1 times lower than "m"
		System.out.println(s1.compareTo(s5));// 2 because "h" is 2 times greater than "f"
	}

//==============================================================
//find out the largest and smallest word in an string
	public static void largestsmallestinString(String s) {
		String[] ch = s.split("");
		int max = 0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i].length() > max) {
			}
		}
	}

//==============================================================
	public static void spaceAfterCharacter(String s) {
//	Scanner sc = new Scanner(System.in);
//	String s1=sc.nextLine();
		char[] s2 = s.toCharArray();
		int count = 0;
		for (int i = 0; i < s2.length; i++) {
			count = 1;
			for (int j = i + 1; j < s2.length; j++) {
				if (s2[i] == s2[j] && s2[i] != ' ') {
					count++;
					s2[j] = ' ';
				}
			}
			if (count <= 1 && s2[i] != ' ') {
				System.out.print(s2[i] + " ");
			}
		}
	}

//	Wajp to split word in a sentence
//	i Am an Indian
	public static void split(String s) {
//i
//am
//an
//infian



		String[] s2 = s.split(" ");
		for (int i = 0; i < s2.length; i++) {
			String s3 = s2[i];
			System.out.println(s3);
		}
	}

//		Wajp to print the numbers of repeating letters
	public static void reptletters(String s) {
		int a[] = new int[128];
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ') {
				char c = s.charAt(i);
				a[c]++;
			}
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0) {
				System.out.println((char) i + " is repeated " + a[i]);
			}
		}
	}

//	========================
	public static void reptletters1(String s) {
		Scanner sc = new Scanner(System.in);
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
		sc.close();
		for (int i = 0; i < count.length; i++) {
			if (ch[i] != ' ' && ch[i] != '0') {
				System.out.println(count[i] + " " + ch[i]);
			}
		}
	}

//			==========================================
//			remove common words

	static char c1;

	public static void removecommonwords(String s) {
		System.out.println("type helloboss");
		String s1 = InputString.readString();
		String s2 = "heyloo";
		for (int i = 0; i < s2.length(); i++) {
			char c = s2.charAt(i);
			String k = "" + c;
			s1 = s1.replaceFirst(k, "");
		}
		System.out.println(s1);
	}

//	====================================================================
	public static void first(String s) {
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {

		}
	}

	// ====================================================================
//		WAJP To find the last letter of the string
	public static void lastletter(String s) {
		char c = s.charAt(s.length() - 1);
		System.out.println(c);
	}

//	===============================================================
//	PRint AaBbCcDd....Zz
	public static void printAa() {

		int j = 97;
		String s1 = "";
		for (int i = 65; i <= 90; i++) {
			char c1 = (char) i;
			char c2 = (char) j;
			j++;
			s1 = s1 + c1 + c2 + " ";

		}
		System.out.println(s1);
	}

//		===============================================================
	public static void count(String s) {
//		letter repeating continuously

		int count = 0;
		for (int i = 0; i < s.length() - 1; i++) {
			char c1 = s.charAt(i);
			char c2 = s.charAt(i + 1);
			if (c1 == c2) {
				count++;
			}
		}
		System.out.println(count);
	}

//		==============================================================
//		WAJP to check panagram or not
//	The quick brown fox jumps over the lazy dog
	public static boolean isPanagram(String s) {
		for (char c = 'a'; c <= 'z'; c++) {
			if (s.indexOf(c) == -1) {
				return false;
			}
		}
		return true;
	}
//	=================================

	public static boolean isPanagram1(String s) {
//		contains all letters
		s = s.toLowerCase();
		int[] a = new int[26];
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c >= 97 && c <= 122) {
				a[c - 97]++;
			}
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				return false;
			}
		}
		return true;
	}

	// ==============================================================
// Wajp to check two entered Strings are anagram or not
//race care  SILENT LISTEN

	public static boolean isAnagram(String s) {
		s = s.toLowerCase();
		String s1 = "SILENT";
		s1 = s1.toLowerCase();
		int a[] = new int[26];
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			System.out.println(c);
			a[c - 97]++;
		}
		for (int i = 0; i < s1.length(); i++) {
			char c = s1.charAt(i);
			a[c - 97]--;
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0) {
				return false;
			}
		}
		return true;
	}

//	=============================================================
//	Print number of words
	public static void noofwords(String s) {
		int count = 0;
		if (s.charAt(0) != ' ') {
			count++;
		}
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == ' ' && s.charAt(i + 1) != ' ') {
				count++;
			}
		}
		System.out.println(count);
	}

//	==============================================================
//		convert first letter to capital
	public static void firstcap(String s) {
		char c[] = s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (i == 0 && c[i] != ' ' || c[i] != ' ' && c[i - 1] == ' ') {
				if (c[i] >= 'a' && c[i] <= 'z') {
					c[i] = (char) (c[i] - 32);
				}
			}
			System.out.print(c[i]);
		}
	}

//		=====================================================
//		convert All letter to capital
	public static void allcaptial(String s) {
		char c[] = s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (i == 0 && c[i] != ' ' || c[i] != ' ' && c[i - 1] == ' ') {
				if (c[i] >= 'a' && c[i] <= 'z') {
					c[i] = (char) (c[i] - 32);
				}
			} else {
				if (c[i] >= 'a' && c[i] <= 'z') {
					c[i] = (char) (c[i] - 32);
				}
			}
			System.out.print(c[i]);
		}
	}

//	===================================================================
//	swap first and last letter of the word

	public static void fistlastwrdswap(String s) {
		char c[] = s.toCharArray();
		int j = 0;
		for (int i = 0; i < c.length; i++) {
			if (i == 0 && c[i] != ' ' || c[i] != ' ' && c[i - 1] == ' ') {
				j = i;
			}
			if (i == s.length() - 1 && c[i] != ' ' || c[i] != ' ' && c[i + 1] == ' ') {
				char c1 = c[i];
				c[i] = c[j];
				c[j] = c1;
			}
		}
		System.out.println(new String(c));
	}

//		==========================================================
//		WAJP when find a vowvel insert same capital letter next to it
	public static void vowvel(String s) {
		char c[] = s.toCharArray();
		String k = " ";
		for (int i = 0; i < c.length; i++) {
			if (c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u') {
				k = k + c[i] + (char) (c[i] - 32);
			} else {
				k = k + c[i];
			}
		}
		System.out.println(k);
	}
//		===========================================================

//	wapj to read dd mm and yyyy print day
//	COnvert a string to interger
	public static void String2Int(String s) {
		int n = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			n = n * 10 + (c - 48);
		}
		System.out.println(n);
	}

//======================================================
//	Iprogram to print first character of each
	public static void printfirstch(String s) {
		String[] s1 = s.split(" ");
		for (int i = 0; i < s1.length; i++) {
			System.out.println(s1[i].charAt(0));
		}
	}

//======================================================
//	reseverse the words in an sentance
	public static void reveachword(String s) {
		char c[] = s.toCharArray();
		int j = 0;
		String o = "";
		for (int i = 0; i < c.length; i++) {
			j = i;
			while (i < c.length && c[i] != ' ') {
				i++;
			}
			int k = i - 1;
			while (k >= j) {
				o = o + c[k];
				k--;
			}
			if (i < c.length) {
				o = o + c[i];
			}
		}
		System.out.println(o);
	}

//		==========================================
//		reseverse the words in an sentance
	public static void revwordsold(String s) {
		char c[] = s.toCharArray();
		int j = 0;
		String o = "";
		for (int i = c.length - 1; i >= 0; i--) {
			j = i;
			while (i < c.length && c[i] != ' ') {
				i++;
			}
			int k = i + 1;
			while (k <= j) {
				o = o + c[k];
				k++;
			}
			if (i > c.length) {
				o = o + c[i];
			}
		}
		System.out.println(o);
	}
//		===============================================

//		==============================================
//		Wajp to count the number of days from 01/01/0001

	public static void reverse(String s) {
		String s1 = s;
		String s2 = "";
		for (int i = s1.length() - 1; i >= 0; i--) {
			s2 = s2 + s1.charAt(i);
		}
		System.out.println(s2);

	}

//	===================================================

	public static void revwordsnew(String s) {
		char c[] = s.toCharArray();
		int j = 0;
		String o = "";

		printArray.printArray(c);
		for (int i = c.length - 1; i >= 0; i--) {
			j = i;
			while (i < c.length && c[i] != ' ') {
				i++;
			}
			int k = i + 1;
			while (k <= j) {
				o = o + c[k];
				k++;
			}
			if (i > c.length) {
				o = o + c[i];
			}
		}
		System.out.println(o);
	}

//	==========================================================
	public static void revstr(String s) {
//		i am an indian   i ma na naidni 
		String[] s2 = s.split(" ");
		String rew = "";
		for (int i = 0; i <= s2.length - 1; i++) {
			String s3 = s2[i];
			String rew2 = "";
			for (int j = s3.length() - 1; j >= 0; j--) {
				rew2 = rew2 + s3.charAt(j);
			}
			rew = rew + rew2 + " ";

		}
		System.out.println(rew);
	}

	public static void revestr(String s) {
//		i am an indian		indian an am i 
		String[] s2 = s.split(" ");
		String rew = "";
		for (int i = s2.length - 1; i >= 0; i--) {
			String s3 = s2[i];
			rew = rew + s3 + " ";
		}
		System.out.println(rew);
	}

	public static void doubleQuotes(String s) {
		System.out.println("\"" + s + "\"");// "hie"
	}

	public static void wwaaadd() {
		String str = "aaabbc";
		int n = str.length();
		for (int i = 0; i < n; i++) {

			// Count occurrences of current character
			int count = 1;
			while (i < n - 1 && str.charAt(i) == str.charAt(i + 1)) {
				count++;
				i++;
			}

			// Print character and its count
			System.out.print(str.charAt(i) + "" + count);
		}

	}
}