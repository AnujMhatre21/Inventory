package com.Sample;

public class SecondClass extends FirstClass  {
	static {
		System.out.println("Second static block");
	}
	 {
		System.out.println("Second Non static block");
	}
	 static int a=20;
	 SecondClass(){
		System.out.println("Second Default Constructor");
	}
	SecondClass(String s) {
		System.out.println("String Second");
	}

	SecondClass(int a) {
		System.out.println("Second int Constructor");
	}
	public void Sclass() {
		System.out.println("Second non static method");
	}
	public static void stclass() {
		System.out.println("Second Static method");
	}
	public static void main(String[] args) {
		System.out.println(a);
		SecondClass sc = new SecondClass(); 
//		sc.Fclass();
		sc.Sclass();
		stclass();
	}

}
