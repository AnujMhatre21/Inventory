package com.Sample;

public class FirstClass {
	static int a=10;
	static {
		System.out.println("First static block");
	}
	
	FirstClass (){
		System.out.println("First Default Constructor");
	}
	{
		System.out.println("First Non static block");
	}
	public FirstClass(String a) {
		System.out.println("String First constructor");
	}

	public FirstClass(int a) {
		System.out.println("int First constrctor");
	}
	static public  void  Fclass() {
		System.out.println("First method");
	}
}
