package Resource;

public class Power {

	public static int power(int num,int power) {
		int res=1;
		for(int i=1;i<=power;i++) {
			res=res*num;
		}
		return res;

	}

}
