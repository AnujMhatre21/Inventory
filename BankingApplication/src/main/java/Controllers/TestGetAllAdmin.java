package Controllers;

import Dto.Admin;
import Service.ServiceAdmin;

public class TestGetAllAdmin {
	public static void main(String[] args) {
		ServiceAdmin service = new ServiceAdmin();
		Admin admin = new Admin();
		service.GetAllAdmin(admin);
	}

}
