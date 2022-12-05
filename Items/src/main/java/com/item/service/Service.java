package com.item.service;

import com.items.dao.ItemDao;
import com.items.dto.Item;

public class Service {
	public void SaveItem(Item item) {
		ItemDao dao = new ItemDao();
		dao.saveItem(item);
	}
}
