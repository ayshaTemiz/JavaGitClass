package com.syntax.class17;

public class StudentAddress {

	String name,address;

	public StudentAddress(String name, String address) {
		
		this.name = name;
		this.address = address;
		displayInfo();
		
		
	}
	
	
	void displayInfo() {
		System.out.println(name+"' s address is  "+ address);
		
	}
	
	
	
}
