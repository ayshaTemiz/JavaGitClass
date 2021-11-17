package com.syntax.class17;

public class Dog {

	//field //instsanse variable
	private String name;
	private String color;
	private int age;
	
	
	
	public Dog(String dogName,String dogColor,int dogAge){   //constructor
		System.out.println("Dogs constructor is called");

		name=dogName;
		color=dogColor;
		age=dogAge;
		
		System.out.println(age+" is my age");
	}
	
	
	public void printName() {     //method
		System.out.println(name);
	}
	
	
	
	
	
}
