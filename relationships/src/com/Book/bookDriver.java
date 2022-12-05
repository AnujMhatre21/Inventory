package com.Book;

public class bookDriver {

	public static void main(String[] args) {
		Book b1= new Book ("Intro to JAVA ",5000);
		b1.setAuthor(new Author("James Gosling",50));
		b1.getAuthor().setAddress(new Address(99,"Vashi","Bsel","Navi Mumbai","Maharastra"));
		b1.printBookDetails();
	}

}
