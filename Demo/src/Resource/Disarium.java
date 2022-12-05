package Resource;

public class Disarium {

	
		public static int count ( int n) {
			int count =0;
			do
			{
				count++;
				n/=10;
			}
			while(n!=0);
			return count;
		}
		
		public static boolean isDisarium (int n) {
			int sum=0,temp=n,c=count(n);
			do {
				int d=n%10;
				sum=sum+Power.power(d,c);
			}while(n!=0);
			return sum==temp;
		}
		
			public static void main (String[]args) {
				int a=0;
			
		}

	}


