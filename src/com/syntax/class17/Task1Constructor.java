package com.syntax.class17;

public class Task1Constructor {

	
	String name;
	
	
	public Task1Constructor(String name){
		this.name=name;
		System.out.println(name+ " ,this is a consturtor with parameter");
	}
	
	
    public Task1Constructor(){
		System.out.println("Constructor without any parameters");
	}
	
}
