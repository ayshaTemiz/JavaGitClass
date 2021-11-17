package com.syntax.class04;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {

		
		System.out.println("Which day is today?");
		Scanner scan = new Scanner(System.in);
		
		String day=scan.nextLine();
		
		if (day.equalsIgnoreCase("Monday")|| day.equalsIgnoreCase("Friday")) {
			System.out.println("No class yuppyyy");
		}else if(day.equalsIgnoreCase("Tuesday")|| day.equalsIgnoreCase("Wednesday")) {
			System.out.println("Manual Class");
		}else if(day.equalsIgnoreCase("Saturday")|| day.equalsIgnoreCase("Sunday")) {
			System.out.println("java Class");
		}else {
			System.out.println("Unknown Day");
		}

	}

}
