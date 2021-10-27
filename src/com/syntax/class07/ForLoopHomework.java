package com.syntax.class07;

import java.util.Scanner;

public class ForLoopHomework {

	public static void main(String[] args) {

		// Ask user what he/she wants to buy, ask for price and to pay for an item.
		// continue asking to pay until user gets a right amount.
		// conditions:
		// if user gives extra money --> give change
		// if user gives less money --> ask how much more you need
		// The amount has to be accumulated if users add more money
		// Whenever a user is done with payments, tell them “Thank you for shopping!”
		
		Scanner scan=new Scanner(System.in);
		
		do {
			System.out.println("What would you like to buy?");
			String itemName=scan.next();
			System.out.println("How much is it?");
			double price=scan.nextDouble();
			System.out.println("How much will you pay");
			double userMoney=scan.nextDouble();
			if(userMoney>10) {
				System.out.println("Here is your "+itemName+"here is your change="+(price-userMoney));
				break;
			}else {
				System.out.println("You DO NOT have enough money.Please give "+(price-userMoney));
			}	
		}while(true);
	}

}
