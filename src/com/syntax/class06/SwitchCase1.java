package com.syntax.class06;

import java.util.Scanner;

public class SwitchCase1 {

	public static void main(String[] args) {
		
		//I want to capture a country from a user ,based on the country
		//we have to define a favorite food
		
		System.out.println("Please enter your home country!");
		Scanner scan=new Scanner(System.in);
		String country=scan.next();
		String favoriteFood;
		
		switch(country) {
		
		case "Turkey":
			favoriteFood="Baklava";
			favoriteFood="bread";
			break;
		case "USA":
			favoriteFood="Fastfood";
			break;
		case "Mexico":
			favoriteFood="Tacos";
			break;
		case "Brazil":
			favoriteFood="Feijoada";
			break;
		case "German":
			favoriteFood="Schnitzel";
			break;
			
			default:
			favoriteFood="Unknown country";
		}
		
		System.out.println("Your country is "+country+" and your favorite food is "+favoriteFood);
	}

}
