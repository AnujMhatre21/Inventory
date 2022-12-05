package Controllers;

import Service.ServiceBM;

public class TestGetAllBM {
	public static void main(String[] args) {
		ServiceBM service = new ServiceBM();
		service.GetAllBankManagers();
	}
}
