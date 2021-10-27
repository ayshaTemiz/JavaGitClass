package com.syntax.class07;

import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {
		// Create a program that will keep asking user to apply
		//for a credit card. As soon you get "yes" from a user program should stop asking
		
		
		
		Scanner scan=new Scanner(System.in);
		String answer=null;
		
		do{
			System.out.println("Do you have a credit card?");
			answer=scan.next();
			
			if(answer.equalsIgnoreCase("yes")) {
				System.out.println("You have a credit card");
				break;
			}else {
				System.out.println("Would you like to apply for a credit card?");
			}
			 
		 }while(answer.equalsIgnoreCase("no")); 	 
	}

}
