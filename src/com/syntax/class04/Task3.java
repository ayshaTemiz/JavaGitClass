package com.syntax.class04;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		//You are DMV representative and you need to ask customer their age.
		//If they are 18 and older you will issue a driver license to them,
		//otherwise you will offer them to get a learners permit.
		
		System.out.println("How old are you?");
		Scanner scan=new Scanner(System.in);
		int age=scan.nextInt();
		
		if(age>=18) {
			System.out.println("You are eligible to get a driver licence");
		}else {
			System.out.println("You need to apply for a learner permit");
		}
	}

}
