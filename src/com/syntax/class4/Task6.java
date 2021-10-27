package com.syntax.class4;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		// Write a program to ask user to enter numbers of worked years
		// and annual salary.
       //If user worked for more or equals to 5 years than user is eligible for the bonus,
		// otherwise he is not. Once user is eligible and salary is
		// larger than 50000 than bonus = 5000, otherwise bonus=3000.

		System.out.println("Please enter numbers of worked years");
		Scanner scan=new Scanner(System.in);
		int year=scan.nextInt();
		
		System.out.println("Please enter your salary");
		int salary=scan.nextInt();
		
		if(year>=5) {
			if(salary>=50000) {
				System.out.println("Your bonus is 5000");
			}else {
				System.out.println("Your bonus is 30005");
			}
		}else {
			System.out.println("You are NOT eligible for  bonus");
		}	
	}

}
