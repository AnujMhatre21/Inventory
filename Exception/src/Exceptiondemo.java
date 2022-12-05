package ExceptionHandling;

class NoAgeLimit  {
	public static void main(String[] args)throws MyException  {
		int a = 10;
		int b = 0;
		String s = null;
		int age = 17;
		
//			Custom Exception
		if (age < 18) {
			
			throw new MyException();
		}
		
//		System.out.println("End");
	}
}
