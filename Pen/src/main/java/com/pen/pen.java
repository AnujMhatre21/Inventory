package com.pen;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class pen {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int ID;
	private String NAME;
	private String COLOUR;
	private String COMPANY;

	public String getNAME() {
		return NAME;
	}

	public void setNAME(String nAME) {
		NAME = nAME;
	}

	public String getCOLOUR() {
		return COLOUR;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public void setCOLOUR(String cOLOUR) {
		COLOUR = cOLOUR;
	}

	public String getCOMPANY() {
		return COMPANY;
	}

	public void setCOMPANY(String cOMPANY) {
		COMPANY = cOMPANY;
	}

}
