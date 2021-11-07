package com.syntax.class10;

public class Task02 {

	public static void main(String[] args) {
		// Create a 2D array or integer type where you will store odd and even numbers.
		// Develop a program which will identify/print the even numbers only.

		int num[][] = { { 20, 400, 13, 27, 24 }, { 3, 133, 12, 14, 5 },

		};
		for (int[] n : num) {
			for (int c : n) {
				if (c % 2 == 0) {
					System.out.println(" even number is " + c);

				}

			}

		}

	}

}
