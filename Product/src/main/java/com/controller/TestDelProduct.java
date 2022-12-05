package com.controller;

import java.util.Scanner;

import com.dao.Dao;
import com.dto.Product;
import com.service.Service;

public class TestDelProduct {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Service service = new Service();
		Product product = new Product();

		product.getId();
		System.out.println("Enter the Row Id Which want to Delete");
		int id = sc.nextInt();
		service.DelProduct(id);
		sc.close();

	}
}
