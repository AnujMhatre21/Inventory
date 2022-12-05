package Controllers;

import Dto.Customer;
import Service.ServiceCustomer;

public class TestAddCustomer {

	public static void main(String[] args) {
		Customer cust = new Customer();
		ServiceCustomer customer = new ServiceCustomer();
		cust.setName("Ram");
		cust.setPno(123456789);
		cust.setAadharNo(102);
		cust.setPanNo(101);
		cust.setStatus("ACTIVE");

		customer.AddCustomer(cust);
	}
}
