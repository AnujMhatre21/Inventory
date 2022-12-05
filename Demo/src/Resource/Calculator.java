package Resource;


public class Calculator {
	public static void square (double n1) {
		double sqr=n1*n1;
		System.out.println("Square of "+n1+"is "+sqr);
	}

	public static void inrtodol(double n2) {
		double dol=n2/79.76;
		System.out.println("inr "+n2+"= $ "+dol );
	}
	
	
	
	
	
	public static void main(String[] args) {
		Calculator.square(24);
		Calculator.square(-3);
		Calculator.square(2.2);
		Calculator.inrtodol(25);
		Calculator.inrtodol(107.5);
		

	}

}
