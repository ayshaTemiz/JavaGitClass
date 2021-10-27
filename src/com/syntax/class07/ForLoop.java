package com.syntax.class07;

public class ForLoop {

	public static void main(String[] args) {

		for (int x = 1; x <= 5; x++) {
			System.out.println("Hello");
		}

       //print numbers from 1 to 20
		for (int i = 1; i <= 20; i++) {
			System.out.print(i + " ");
		}

		// print even numbers from 1 to 50
		for (int y = 1; y <= 50; y++) {
			if (y % 2 == 0) {
				System.out.println(y);
			}
		}

		// 5 ilerler
		for (int b = 1; b <= 20; b += 5) {
			System.out.println(b);
		}

	}

}
