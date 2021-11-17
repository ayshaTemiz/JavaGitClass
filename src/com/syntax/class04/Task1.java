package com.syntax.class04;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// Create a Java program to capture 2 numbers from a user
		// and define which number is the largest.

		System.out.println("Please enter first number");
		Scanner scan=new Scanner(System.in);
		int num1=scan.nextInt();
		System.out.println("Please enter second number");
		int num2=scan.nextInt();
		
		
         if(num1>num2) {
        	 System.out.println(num1+" is larger than "+num2);
         }else {
        	 System.out.println(num1+" is less than "+num2);
         }
		
	}

}

