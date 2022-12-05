package com.service;

import com.dao.Dao;
import com.dto.Product;

public class Service {
	public Product saveProduct(Product product) {
		Dao dao = new Dao();
		
		return dao.saveProduct(product);
	}
	
	public Product UpdateProduct(Product product) {
		Dao dao=new Dao();
		return dao.UpdateProduct(product);
	}
	

	public void DelProduct(int n) {
		Dao dao=new Dao();
		 dao.DelProduct(n);
	}
	public void GetAll() {
		Dao dao=new Dao();
		dao.GetAllProduct();
	}
	
}
