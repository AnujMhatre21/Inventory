package Controllers;

import Service.ServiceCustomer;

public class TestGetAllCustomers {
	public static void main(String[] args) {
		ServiceCustomer customer=new ServiceCustomer();
		customer.PrintAllCustomer();
	}
}
