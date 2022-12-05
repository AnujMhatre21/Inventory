package com.Sim;

public class Sim1 {
	private String service_provider;
	private long cno;
	private Mobile mobile;

//	Constructor for current
	public Sim1(String service_provider, long cno) {
		this.service_provider = service_provider;
		this.cno = cno;
	}

	public String getService_provider() {
		return service_provider;
	}

	public void setService_provider(String service_provider) {
		this.service_provider = service_provider;
	}

	public long getCno() {
		return cno;
	}

	public void setCno(long cno) {
		this.cno = cno;
	}

	public void printSim1() {
		System.out.println("==============");
		System.out.println("service provider  " + service_provider);
		System.out.println("number  " + cno);
	}

}
