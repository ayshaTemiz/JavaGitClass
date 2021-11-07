package com.syntax.class12;

public class Task2 {
	// Write a method to return whether given number is prime or not?

	void primeNumber(int num) {

//		boolean answer = true;
		
		if (num > 1) {
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					System.out.println(num+" is not a prime number");
					break;
				}else {
					System.out.println(num+" is  a prime number");
					break;
				}
			}
		} else {
			System.out.println(num+" is not a prime number");
		}
	}
	
	
	public static void main(String[]args) {
		Task2  number=new Task2();
		number.primeNumber(2);
	}
}
