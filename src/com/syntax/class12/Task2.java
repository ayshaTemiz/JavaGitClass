package com.syntax.class12;

public class Task2 {
	// Write a method to return whether given number is prime or not?

	boolean primeNumber (int num) {

		boolean primeNumber = true;
		
		if (num > 1) {
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					primeNumber=false;
					break;
				}
			}
		} else {
			primeNumber=false;
		}
		return primeNumber;
	}
	
	
	public static void main(String[]args) {
		Task2  number=new Task2();
		System.out.println(number.primeNumber(5));
	}
}
