package Resource;

public class Xylem {

	public static void main(String[] args) {
		ChkXylem(11235);
	}

//	
	public static void ChkXylem(int n) {
		//sum of last two digits and mean of middle
//		numbers 
		int mean = 0;
//		identify and save the last digit
		int l = n % 10;
//		remove the last digit
		n = n / 10;
		while (n > 9) {
			mean = mean + (n % 10);
			n = n / 10;
		}
		int last = n + l;
		if (mean == last) {
			System.out.println("Xylem");
		}else {
			System.out.println("not");
		}
	}
	
}
