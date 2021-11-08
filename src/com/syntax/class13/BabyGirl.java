package com.syntax.class13;

import java.util.Scanner;

public class BabyGirl {

	public static void main(String[] args) {
//		Write a program that reads two people's first
//		names and if they expecting boy or girl? 
//	Based on the input suggests a name for a baby:
//	Example Output:
//	Mom’s first name? Mary
//	Dad’s first name? Daniel
//	Boy or Girl? boy
//	Suggested baby name: DANRY
//	Example Output:
//	Mom’s first name? Mary
//	Dad’s first name? Daniel
//	Boy or Girl? girl
//	Suggested baby name: MAIEL

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter moms name");
		String momsName = scan.next();
		System.out.println("Enter dads name");
		String dadsName = scan.next();
		System.out.println("Boy or Girl?");
		String gender = scan.next();
		String cutName1 = dadsName.substring(0, 3);
		String cutName2 = momsName.substring(0, 2);

		if (gender.equalsIgnoreCase("boy")) {
			
			System.out.println("Suggested name is " + cutName1+ cutName2);
			

		}else if (gender.equalsIgnoreCase("girl")){
			
			System.out.println("Suggested name is " + cutName2+ cutName1);
		}

	}

}
