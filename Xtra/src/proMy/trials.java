package proMy;

public class trials {

	public static boolean validateName(String name) {
//		VALIDATE NAME
		String s = name;
		for (int i = 0; i < s.length(); i++) {
			char[] c = s.toCharArray();
			if (c[i] >= 'a' && c[i] <= 'z' || c[i] >= 'A' && c[i] <= 'Z' || c[i] == ' ' && c[i-1]!= ' ') {
				if(i<=s.length()-1) {
				i++;
				}
			} else {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(validateName("Anuj mhatre"));
	}
}
