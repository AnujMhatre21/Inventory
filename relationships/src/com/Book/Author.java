package com.Book;

public class Author {

	private String name;
	private int age;

	private Address address;

	public Author(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;

	}

	public void printAuthor() {
		System.out.println("========Author=========");
		System.out.println("NAME " + name);
		System.out.println("Age " + age);
		if (address != null) {
			
			address.printAddress();
		} else {
			System.out.println("Address not given by the Author	");
		}
	}
}
