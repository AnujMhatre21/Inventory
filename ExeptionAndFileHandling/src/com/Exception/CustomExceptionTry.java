package com.Exception;

public class CustomExceptionTry {
	public static void main(String[] args) {
//	Write a custom exception for age limit below 18 and above 80
		int age = 81;

		try {
//			Custom Exception
			if (age < 18 || age >80) {
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
