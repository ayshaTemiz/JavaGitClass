package com.syntax.class07;

import java.util.Scanner;

public class ItemHomework {

	public static void main(String[] args) {

		// Ask user what he/she wants to buy, ask for price and to pay for an item.
		// continue asking to pay until user gets a right amount.
		// conditions:
		// if user gives extra money --> give change
		// if user gives less money --> ask how much more you need
		// The amount has to be accumulated if users add more money
		// Whenever a user is done with payments, tell them “Thank you for shopping!”

		Scanner scan = new Scanner(System.in);
		double itemPrice =100;
		double usersMoney = 0.0;
		String item;

		for (int i = 0; i <= itemPrice; i++) {
			System.out.println("What would you like to buy?");
			item = scan.next();
			System.out.println("How much do you have?");
			usersMoney=scan.nextDouble();
			System.out.println(item+" is  $"+itemPrice);
			
			if (usersMoney >= itemPrice) {
				System.out.println("Here is your change= " + (usersMoney - itemPrice));
				System.out.println("Thank you for shopping!");
				break;
			} else {
				System.out.println("You need to pay=" + (itemPrice - usersMoney));
			}
		}
	}

}
