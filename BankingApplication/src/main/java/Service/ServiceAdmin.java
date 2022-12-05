package Service;

import Dao.AdminDao;
import Dto.Admin;

public class ServiceAdmin {

	AdminDao dao = new AdminDao();

	public Admin SaveAdmin(Admin credentials) {
		return dao.SaveAdmin(credentials);
	}

	public Admin UpdateAdmin(Admin Credentials) {
		return dao.UpdateAdmin(Credentials);
	}

	public void DeleteAdmin(int n) {
		dao.DeleteAdmin(n);
	}

	public void GetAllAdmin(Admin admin) {
		dao.GetAllAdmin();
	}

	public void GetbyId(int n) {
		dao.GetbyId(n);
	}
	
	public void ApproveBankmanager(String name,String pass) {
		dao.ApproveBankmanager(name, pass);
	}

	public int ValidateUser(String user) {
		return dao.ValidateUser(user);
	}

	public Admin FetchDetails(int n) {
		return dao.FetchDetails(n);
	}
}