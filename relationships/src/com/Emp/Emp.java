package com.Emp;

public class Emp {
	String name;
	String id;
	EmpAdd EmpAdd;
	Emp(){
		
	}
	
	Emp(String name,String id){
		this.name=name;
		this.id=id;
		
	}
	
	public void printemp() {
		System.out.println("name: "+name);
		System.out.println("id: "+id);
//		EmpAdd.printempadd();
	}
}
