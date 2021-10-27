package com.syntax.class07;

import java.util.Scanner;

public class GuessNumberWhileLoop {

	public static void main(String[] args) {
		// create a secret number (1 to 100)
		// lets ask user to guess my secret number

		Scanner scan = new Scanner(System.in);
		int userNumber;
		int secretNumber = 78;

		System.out.println("Guess my secret number..it is between 1 to 100");
		userNumber = scan.nextInt();

		while (userNumber != secretNumber) {
			System.out.println("This is not my number");
			System.out.println("Guess my secret number..it is between 1 to 100");
			userNumber = scan.nextInt();
		}
		System.out.println("You found my number yeyyyy ");
	}

}
