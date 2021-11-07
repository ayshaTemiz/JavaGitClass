package com.syntax.class10;

import java.util.Arrays;

public class Task09 {

	public static void main(String[] args) {
		
		// Maximum and minimum number in the array?
		int[] numbers = { 55, -3000, 44, 1080, 30 };
         
		//1st way
		int small = numbers[0];
		int large = 0;
		

		for (int i = 0; i < numbers.length; i++) {

			int n = numbers[i];
			if (n > large) {
				large = n;
			} else {
				small = n;
			}
		}
		;

		System.out.println("Minimum number is " + small);
		System.out.println("Maximum number is " + large);
		System.out.println("----------------------------------------");

		// 2st way
		Arrays.sort(numbers);
		System.out.println("Smallest number = " + numbers[0]);
		System.out.println("Biggest number = " + numbers[numbers.length - 1]);

		System.out.println("------------------------------");

//		

	}

}
