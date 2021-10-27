package com.syntax.class07;

import java.util.Scanner;

public class ItemHomework2 {

	public static void main(String[] args) {

		// Ask user what he/she wants to buy, ask for price and to pay for an item.
		// continue asking to pay until user gets a right amount.
		// conditions:
		// if user gives extra money --> give change
		// if user gives less money --> ask how much more you need
		// The amount has to be accumulated if users add more money
		// Whenever a user is done with payments, tell them “Thank you for shopping!”

		Scanner scan = new Scanner(System.in);
		double itemPrice = 100;
		double usersMoney;
		String item;

		System.out.println("What would you like to buy?");
		item = scan.next();
		System.out.println(item + " is $" + itemPrice + ".Please enter the amount of money you have");

		do {
			usersMoney = scan.nextDouble();
			System.out.println("You need to pay more");
		} while (usersMoney < itemPrice);
		
		System.out.println("Here is your change= " + (itemPrice - usersMoney) + " Thank you for shopping!");
		
	}
}
