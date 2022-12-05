package com.item.controllers;

import com.item.service.Service;
import com.items.dto.Item;

public class testSaveItem {
	public static void main(String[] args) {
		Item item=new Item();
		Service service=new Service();
//		item.setName("Puma");
		item.setType("Shoes");
		service.SaveItem(item);
	}
}
