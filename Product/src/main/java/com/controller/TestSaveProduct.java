package com.controller;

import java.util.Scanner;

import com.dto.Product;
import com.service.Service;

public class TestSaveProduct {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Service service = new Service();
		Product product = new Product();

		System.out.println("Enter the name of the Product");
		String name = sc.nextLine();
		product.setName(name);

		System.out.println("Enter the Brand of the Product");
		String Brand = sc.nextLine();
		product.setBrand(Brand);

		System.out.println("Enter the Type of the Product");
		String Type = sc.nextLine();
		product.setType(Type);

		System.out.println("Enter the Price of the Product");
		float price = sc.nextFloat();
		product.setPrice(price);

		Product product2 = service.saveProduct(product);
		if (product2 != null) {
			System.out.println("Product has Been Inserted");
		} else {
			System.out.println("Not Inserted");
		}
		sc.close();

	}

}
