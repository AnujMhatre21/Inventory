package com.Controller;

import com.dao.PenDao;
import com.dto.Pen;

public class AddPenController {
	public static void main(String[] args) {
		Pen pen = new Pen();
		pen.setSRNO(3);
		pen.setPName("Parker");
		pen.setColour("Red");
		pen.setBrand("Reynolds");

		PenDao pendao = new PenDao();
		pendao.ViewAllTable(pen);

	}

}
