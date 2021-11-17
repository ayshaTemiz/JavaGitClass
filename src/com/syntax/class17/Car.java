package com.syntax.class17;

public class Car {

	private String name;
	private String make;
	private String color;
	private int year;
	private String engineCC;
	private int mileage;
	private int maxSpeed;

	
	public Car(String carName,String carMake,String carColor,int carYear, String carEngineCC,int carMileage, int carMaxSPeed){
	name=carName;
	make=carMake;
	color=carColor;
	year=carYear;
	engineCC=carEngineCC;
	mileage=carMileage;
	maxSpeed=carMaxSPeed;	
	}
	
	public Car() {
		
	}
	
	public void display() {
		System.out.println("hello");
	}
	
}
