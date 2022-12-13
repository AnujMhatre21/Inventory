package Dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private long Pno;
	private long AadharNo;
	private long PanNo;
	private String Status;

	@ManyToOne
	@JoinColumn
	private BankManager bankmanager;

	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
	private List<AccountDetails> bankingservices;
	
	public int getId() {
		return id;
	}

	public List<AccountDetails> getBankingservices() {
		return bankingservices;
	}

	public void setBankingservices(List<AccountDetails> bankingservices) {
		this.bankingservices = bankingservices;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPno() {
		return Pno;
	}

	public void setPno(long name1) {
		Pno = name1;
	}

	public long getAadharNo() {
		return AadharNo;
	}

	public void setAadharNo(long aadharNo) {
		AadharNo = aadharNo;
	}

	public long getPanNo() {
		return PanNo;
	}

	public void setPanNo(long panNo) {
		PanNo = panNo;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public BankManager getBankmanager() {
		return bankmanager;
	}

	public void setBankmanager(BankManager bankmanager) {
		this.bankmanager = bankmanager;
	}

	
}
