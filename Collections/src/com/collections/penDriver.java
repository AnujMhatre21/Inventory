package com.collections;

public class penDriver {
	public static void main(String[] args) {
		Pen pen1 = new Pen("Fusion", "Cello", 20);
		Pen pen3= new Pen("Fusion","Cello",20);
		
		System.out.println(pen1);
		System.out.println(pen3);
		System.out.println(pen1.equals(pen3));
		System.out.println(pen1.hashCode());
		System.out.println(pen3.hashCode());
	}
}
