package com.syntax.class4;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// You are a loan specialist and you need to ask user
		// what is the amount of loan is needed.
		// If loan is less or equal to 200,000 then you would lend the money
		// otherwise you would reject the client.
		
		System.out.println("How much loan do you need?");
		Scanner scan = new Scanner(System.in);
		int loan = scan.nextInt();

		if (loan <= 200000) {
			System.out.println("We can lend you money");
		} else {
			System.out.println("Sorry,you are not eligible for this loan.");
		}

	}

}
