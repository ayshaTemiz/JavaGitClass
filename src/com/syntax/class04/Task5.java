package com.syntax.class04;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		// Create a Java program that will ask if user has a credit card or not.
		// If you user does not have a credit card then offer them.
		// If they do have one ask what is balance on the card?
		// If balance of the card is larger than 1000,
		// tell them to pay off immediately,
		// otherwise you can tell them that they can spend more.

		

		System.out.println("Do you have credit card,if so type yes");
		Scanner scan = new Scanner(System.in);
		String condition=scan.nextLine();
		String answer = scan.next();
				
		if (answer.equalsIgnoreCase("yes")) {
			System.out.println("What is balance on the card?");
			int balanceAnswer = scan.nextInt();

			if (balanceAnswer >= 1000) {

				System.out.println("pay off immediately");
			} else {
				System.out.println(" You can spend more");
			}

		} else {
			System.out.println("Would you like to have one?");
		}

	}

}
