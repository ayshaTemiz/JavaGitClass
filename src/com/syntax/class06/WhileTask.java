package com.syntax.class06;

public class WhileTask {

	public static void main(String[] args) {
		// Print even numbers from 20 to 100
		int even = 20;

		while (even < 101) {
			if (even % 2 == 0) {
				System.out.println(even);
				
			}
			even++;
		}

		System.out.println("---------------");
		// Print only odd numbers from 100 to 1

		int odd = 100;

		while (odd > 0) {
			if (odd % 2 != 0) {
				System.out.println(odd);
			}
			odd--;
		}
		
	}
}
