package Resource;

public class StrongNumber {

	public static void main(String[] args) {
		int num=145;
		int temp=num;
		int sum=0;
		while(num!=0) {
		sum=sum+(Factorial.fact(Lastdigit.reminder(num)));
		num=num/10;
	}
	if(sum==temp) {
		System.out.println("Strong number "+sum);
	}

	}
} 