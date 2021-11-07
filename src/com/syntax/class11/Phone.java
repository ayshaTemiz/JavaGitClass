package com.syntax.class11;

public class Phone {
	
	//Create a Class “Phone”. Create 3 Objects of it: 
	//iPhone, Android, Nokia with specific  attributes and behaviors.
	
	String brand;
	int modelYear;
	String color;
	
	
    
	void ring () {
		System.out.println(brand+"rings perfectly");
	}
	
	void call() {
		System.out.println(brand+" "+modelYear +" has no issue on calling");
	}
	

	
	public static void main(String[] args) {
		Phone iPhone=new Phone();
		iPhone.brand="ProMax12";
		iPhone.modelYear=2021;
		iPhone.call();
		
		Phone Android=new Phone();
		Android.brand="OnePlus 8 ";
		Android.modelYear=2022;
		Android.call();
		Android.ring();
		
		Phone Nokia=new Phone();
		Nokia.brand="Nokia SL ";
		Nokia.modelYear=2018;
		Nokia.call();
		Nokia.ring();
	}
	
	
	
	
	
	
}
