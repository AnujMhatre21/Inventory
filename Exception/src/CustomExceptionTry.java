package ExceptionHandling;

public class CustomExceptionTry {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		String s = null;
		int age = 17;

		try {
//			Custom Exception
			if (age < 18) {
				throw new MyException();
			}else {
				System.out.println("Modi Ko Vote do");
				
			}
		}

		catch (MyException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("End");
	}
}
