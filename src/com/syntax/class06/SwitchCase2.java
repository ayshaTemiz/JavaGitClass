package com.syntax.class06;

import java.util.Scanner;

public class SwitchCase2 {

	public static void main(String[] args) {
	
		System.out.println("Enter your home country!");
		Scanner scan=new Scanner(System.in);
		String country=scan.next();
		String language;
		
		switch(country.toUpperCase()) {
		
		case "Turkey":
			language="Turkish";
			break;
		case "German":
			language="Germany";
			break;
		case "USA":
			language="English";
			break;
		case "China":
			language="Mandarin";
			break;
			
			default:
			language="Unkown language";
			break;
		}
				
	System.out.println("Your home country is "+country+" and your language is "+language);
		
		

	}

}
