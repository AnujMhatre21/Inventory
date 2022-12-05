package demo1;

public class d1 {
	public static void main(String[] args) {
		System.out.println(bunnyEars2(3));
	}

	public static int bunnyEars2(int bunnies) {

		if (bunnies == 0) {
			return 0;
		} else if (bunnies % 2 == 0) {
			return 2 + bunnyEars2(--bunnies);
		} else if (bunnies % 2 == 1) {

			return 3 + bunnyEars2(--bunnies);
		}
		return bunnies;
	}

}
