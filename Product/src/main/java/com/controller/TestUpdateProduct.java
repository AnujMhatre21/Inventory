package com.controller;

import java.util.Scanner;

import com.dao.Dao;
import com.dto.Product;
import com.service.Service;

public class TestUpdateProduct {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Service service = new Service();
		Product product = new Product();
		Dao dao = new Dao();

		System.out.println("Enter the Row Number to want to make Changes in");
		int num = sc.nextInt();


//		switch (num) {
//		case 2:
//			System.out.println("Enter the New Brand Name");
//			String brand = sc.nextLine();
//			Product product1 = dao.GetProduct(product, num);
//			product1.setBrand(brand);
//			break;
//
//		case 3:
//			System.out.println("Enter the New Name");
//			String name = sc.nextLine();
//			Product product2 = dao.GetProduct(product, num);
//			product2.setName(name);
//			break;
//
//		case 4:
//			System.out.println("Enter the New Price");
//			int price = sc.nextInt();
//			Product product3 = dao.GetProduct(product, num);
//			product3.setPrice(price);
//			break;
//
//		case 5:
//			System.out.println("Enter the New Type");
//			String type = sc.nextLine();
//			Product product5 = dao.GetProduct(product, num);
//			product5.setType(type);
//			break;
//		}
		Product product1 = dao.GetProduct(product, num);
		product1.setBrand("Nike");
		service.UpdateProduct(product1);

	}
}
