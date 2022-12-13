package Service;

import Dao.BankManagerDao;
import Dto.BankManager;

public class ServiceBM {
	BankManagerDao dao = new BankManagerDao();

	public BankManager AddBM(BankManager bankManager) {
		return dao.AddBM(bankManager);
	}

	public BankManager UpdateBM(BankManager bankManager) {
		return dao.UpdateBM(bankManager);
	}

	public void DeleteBM(int id) {
		dao.DeleteBM(id);
	}

	public void GetAllBankManagers() {
		dao.GetAllBankManagers();
	}

	public int ValidateBM(String user) {
		return dao.ValidateBM(user);
	}

	public BankManager FetchDetails(int id) {
		return dao.FetchDetails(id);
	}
	
	public void ActivateCustomer(String email,String pass) {
		dao.ActivateCustomer(email, pass);
	}

}
