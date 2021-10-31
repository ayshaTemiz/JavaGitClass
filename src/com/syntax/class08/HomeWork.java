package com.syntax.class08;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		// 1.Print numbers from 1 to 50 except those that are divisible by 3

		for (int i = 1; i <= 50; i++) {
			if (i % 3 == 0) {
				continue;
			}
			System.out.println(i);
		}

		// 2. Create a program that will keep asking user to apply for a credit card. As
		// soon you get “yes” from a user program should stop asking.

		Scanner scan = new Scanner(System.in);
		System.out.println("Do you have credit card?");

		String answer = scan.nextLine();

		while (!answer.equalsIgnoreCase("yes")) {

			System.out.println("Would you like to apply a credit card?");
			answer = scan.nextLine();
			if (answer.equalsIgnoreCase("yes")) {
				System.out.println("You already have a credit ");
				break;
			}
		}

		
	}

}
