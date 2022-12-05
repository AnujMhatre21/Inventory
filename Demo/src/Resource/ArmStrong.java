package Resource;

public class ArmStrong {

	public static void main(String[] args) {
		int num=153;
		int temp=num;
		int sum=0;
		int power=CountDigit.countDigit(num);
		while (num!=0) {
			int digit=Lastdigit.reminder(num);
			sum+=Power.power(digit,power);
			num=num/10;
		}
		if(sum==temp) {
		System.out.println("Number is a Armstrong "+ sum);

	}

}
}