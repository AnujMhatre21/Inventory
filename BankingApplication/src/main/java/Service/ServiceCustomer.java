package Service;

import Dao.CustomerDao;
import Dto.Customer;

public class ServiceCustomer {

	public Customer AddCustomer(Customer customer) {
		CustomerDao customerDao = new CustomerDao();
		return customerDao.AddCustomer(customer);
	}

	public Customer UpdateCustomer(Customer customer) {
		CustomerDao customerDao = new CustomerDao();
		return customerDao.UpdateCustomer(customer);
	}
	
	public void PrintAllCustomer() {
		CustomerDao customerDao=new CustomerDao();
		customerDao.PrintAllCustomer();
	}

	public int FetchId(long name) {
		CustomerDao customerDao = new CustomerDao();
		return customerDao.FetchId(name);
	}
	
	public void PrintCustomer(Customer customer) {
		CustomerDao customerDao=new CustomerDao();
		customerDao.PrintCustomer(customer);
	}

	public Customer FetchCustomer(int fetchedId) {
		CustomerDao customerdao = new CustomerDao();
		return customerdao.FetchCustomer(fetchedId);
	}
	
	public void DeleteCustomer(int id) {
		CustomerDao customerDao=new CustomerDao();
		customerDao.DeleteCustomer(id);
	}
}

