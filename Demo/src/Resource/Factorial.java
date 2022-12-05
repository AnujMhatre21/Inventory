package Resource;

public class Factorial {

	public static int fact(int num) {
		int fact=1;
		for(int i=num;i>=1;i--) {
			fact=fact*i;
		}
return fact;

	}

}
