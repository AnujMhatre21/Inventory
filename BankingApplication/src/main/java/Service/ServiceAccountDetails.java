package Service;

import Dao.AccountDetailsDao;
import Dto.AccountDetails;
import Dto.Customer;

public class ServiceAccountDetails {

	public Customer GetCustomer(long aadhar) {
		AccountDetailsDao accountDetailsDao = new AccountDetailsDao();
		return accountDetailsDao.GetCustomer(aadhar);
	}

	public void TestAddBankDetails(AccountDetails accountDetails) {
		AccountDetailsDao accountDetailsDao = new AccountDetailsDao();
		accountDetailsDao.AddCustomerBankDetails(accountDetails);

	}

	public Customer FetchCustomer(long aadhar) {
		AccountDetailsDao accountDetailsDao = new AccountDetailsDao();
		return accountDetailsDao.FetchCustomer(aadhar);
	}

	public Customer FetchWithAccno(long accno) {
		AccountDetailsDao accountDetailsDao = new AccountDetailsDao();
		return accountDetailsDao.FetchWithAccno(accno);
	}

	public void Deposit(int amount, long accno) {
		AccountDetailsDao accountDetailsDao = new AccountDetailsDao();
		accountDetailsDao.Deposit(amount, accno);
	}

	public void Withdraw(int amount, long accno) {
		AccountDetailsDao accountDetailsDao = new AccountDetailsDao();
		accountDetailsDao.Withdraw(amount, accno);
	}

}
