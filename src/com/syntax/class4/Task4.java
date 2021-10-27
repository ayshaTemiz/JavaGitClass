package com.syntax.class4;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
	
		//Create a Java program that will ask user to input city and temperature.
		//Your program should convert Fahrenheit into celsius and 
		//print “The temperature is the city __ is __”
		
		System.out.println("What is your city?");
		Scanner scan=new Scanner(System.in);
		String city=scan.next();
		
		System.out.println("What is the temperature in "+city);
		double temp=scan.nextDouble();
		
		temp=(temp-32)/1.8;
		
		String last = String.format("%.2f", temp);//to format double to 2 decimal places.
		
		System.out.println("The temperature is the "+city+" is "+last);
		
	}

}
