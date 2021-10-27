package com.syntax.class4;

import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
		// Write a program for user to enter his/hers birth month.
		//Based on the month define the season.
		//Example: if user is born in June, July or August → season =“Summer”.
		//At the end of the program we should see output as “You were born is season ______“.
		
		System.out.println("Please type your birth month");
		Scanner scan=new Scanner(System.in);
		String month=scan.nextLine();
		
		String season;
	
		
		if(month.equalsIgnoreCase("June")||month.equalsIgnoreCase("July")||month.equalsIgnoreCase("August")) {
			season="Summer";
		}else if(month.equalsIgnoreCase("September")||month.equalsIgnoreCase("October")||month.equalsIgnoreCase("November")) {
			season="Autumn";
		}else if(month.equalsIgnoreCase("December")||month.equalsIgnoreCase("January")||month.equalsIgnoreCase("February"))  {
			season="Winter";
		}else if(month.equalsIgnoreCase("March")||month.equalsIgnoreCase("April")||month.equalsIgnoreCase("May"))  {
			season="Spring";
		}else {
			season="Unknown Season";
		}
		System.out.println("You were born is season "+season);

	}

}
